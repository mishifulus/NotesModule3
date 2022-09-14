package org.bedu.ejemplo1.persistance;

import org.springframework.stereotype.Component;

//simula que se lee un valor constante de una base de datos
@Component
public interface CalculadoraDao {
    int findValorConstante();
    
    int findValorConstanteDos(int valorInicial);
}
