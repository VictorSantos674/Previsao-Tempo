package com.previsaotempo.controller;

import com.previsaotempo.dto.AlertaDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class AlertaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testEnviarAlerta() throws Exception {
        AlertaDTO alerta = new AlertaDTO();
        alerta.setTipo("Tempestade");
        alerta.setMensagem("Alerta de tempestade na região.");
        alerta.setDestinatario("usuario@example.com");

        mockMvc.perform(post("/alertas")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"tipo\":\"Tempestade\",\"mensagem\":\"Alerta de tempestade na região.\",\"destinatario\":\"usuario@example.com\"}"))
                .andExpect(status().isOk());
    }
}