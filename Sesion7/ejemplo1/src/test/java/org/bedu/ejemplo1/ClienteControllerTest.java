package org.bedu.ejemplo1;

import static org.mockito.ArgumentMatchers.anyLong;

import java.util.Optional;


import org.bedu.ejemplo1.controllers.ClienteController;
import org.bedu.ejemplo1.model.Cliente;
import org.bedu.ejemplo1.services.ClienteService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(ClienteController.class) //Para indicar que probamos un servicio web en MVC
public class ClienteControllerTest {
    
    @Autowired
    private MockMvc mockMvc; //Inyectamos la depedencia de mockito para servicios REST

    @MockBean //Para indica que se usara com bean 
    private ClienteService clienteService;

    //Configuramos un objeto cliente antes del test
    /*@BeforeEach
    void setUp() {
    BDDMockito.given(
        clienteService.obtenCliente(anyLong()))
        .willReturn(
            Optional.of(Cliente.builder()
                .id(1L)
                .nombre("Beto Bedu")
                .correoContacto("cliente@contacto.com")
                .build()));
                
  }*/


    @Test
  void obtenClienteTest() throws Exception {

    /*BDDMockito.given(
        clienteService.obtenCliente(anyLong()))
        .willReturn(
            Optional.of(Cliente.builder()
                .id(1L)
                .nombre("Beto Bedu")
                .correoContacto("cliente@contacto.com")
                .build()));*/


    mockMvc.perform(
        MockMvcRequestBuilders.get("/cliente/1")
            .content(MediaType.APPLICATION_JSON_VALUE))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
        .andExpect(MockMvcResultMatchers.jsonPath("$.id", Matchers.is(1)))
        .andExpect(MockMvcResultMatchers.jsonPath("$.correoContacto", Matchers.is("cliente@contacto.com")))
        .andExpect(MockMvcResultMatchers.jsonPath("$.nombre", Matchers.is("Beto Bedu")));
  }

  @Test
  public void creaClienteTest() throws Exception
  {
    Cliente clienteParametro = Cliente.builder().id(1L).nombre("Nombre").direccion("Direccion").numeroEmpleados(10).correoContacto("contacto@cliente.com").build();
    Cliente clienteRespuesta = Cliente.builder().id(1L).nombre("Nombre").direccion("Direccion").numeroEmpleados(10).correoContacto("contacto@cliente.com").build();

    BDDMockito.given(clienteService.guardaCliente(clienteParametro)).willReturn(clienteRespuesta);

    mockMvc.perform(MockMvcRequestBuilders.post("/cliente")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(clienteParametro)))
                .andExpect(MockMvcResultMatchers.status().isCreated());
  }

}
