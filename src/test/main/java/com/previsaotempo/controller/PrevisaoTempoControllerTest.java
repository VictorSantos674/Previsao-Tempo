package com.previsaotempo.controller;

import com.previsaotempo.dto.PrevisaoDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PrevisaoTempoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetPrevisao() throws Exception {
        mockMvc.perform(get("/previsao/Recife"))
                .andExpect(status().isOk());
    }
}