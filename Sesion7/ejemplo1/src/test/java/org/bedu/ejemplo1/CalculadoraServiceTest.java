package org.bedu.ejemplo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.bedu.ejemplo1.persistance.CalculadoraDao;
import org.bedu.ejemplo1.services.CalculadoraService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.AdditionalMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) //Indica que se utilizara mockitopara hacer pruebas
public class CalculadoraServiceTest {

    @Mock(lenient = true) //Como el AUTOWIRED para las pruebas
    CalculadoraDao calculadoraDao;

    @InjectMocks //Para indicar que en esta clase se deben inyectar los mocks
    private CalculadoraService calculadora;

    //se ejecuta antes de cada método de prueba
    //dentro de este configura la respuesta que regresara el mock 
    //de tipo CalculadoraDao cuando se haga una llamada 
    //al método findValorConstante. En este caso la respuesta será el valor 3
    //eso quiere decir que a todas las operaciones realizads se les sumará el valor 3.
    @BeforeEach
    void setUp()
    {
        BDDMockito.given(calculadoraDao.findValorConstanteDos(AdditionalMatchers.gt(6)))
        .willReturn(2); //Dame el valor del mock > 5 -> 2
        BDDMockito.given(calculadoraDao.findValorConstanteDos(AdditionalMatchers.lt(5)))
        .willReturn(1); //Dame el valor del mock <= 5 -> 1
    }

    @Test
    @DisplayName("Prueba suma")
    void sumaTest()
    {
        int esperado = 6;
        int constante = 1;
        assertEquals(esperado, calculadora.suma(3, 2, constante));
    }

    @Test
    @DisplayName("Prueba resta")
    void restaTest() {
        int esperado = 1;
        int constante = 5;
        assertEquals(esperado, calculadora.resta(3, 2, constante));
    }

    @Test
    @DisplayName("Prueba multiplicación")
    void multiplicaTest() {
        int esperado = 8;
        int constante = 15;
        assertEquals(esperado, calculadora.multiplica(3, 2, constante));
    }
    
}
