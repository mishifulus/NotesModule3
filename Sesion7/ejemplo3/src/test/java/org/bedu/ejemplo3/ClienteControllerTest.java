package org.bedu.ejemplo3;

import static org.hamcrest.MatcherAssert.assertThat;
import org.bedu.ejemplo3.model.Cliente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.hamcrest.Matchers;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//Pruebas unitarias porque se levanta el servidor y se crea todo el ambiente de prueba
//Mock solo simula el levantamiento
public class ClienteControllerTest {
    
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void obtenerClienteTest() {
        ResponseEntity<Cliente> response = restTemplate.getForEntity("/cliente/1", Cliente.class);

        assertThat(response.getStatusCode(), Matchers.equalTo(HttpStatus.OK));
        assertThat(response.getBody().getId(), Matchers.equalTo(1L));
    }

}
