package com.previsaotempo.service;

import com.previsaotempo.dto.PrevisaoDTO;
import com.previsaotempo.integration.OpenWeatherMapIntegration;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PrevisaoTempoServiceTest {

    @Mock
    private OpenWeatherMapIntegration openWeatherMapIntegration;

    @InjectMocks
    private PrevisaoTempoService previsaoTempoService;

    @Test
    public void testGetPrevisao() {
        PrevisaoDTO mockPrevisao = new PrevisaoDTO();
        mockPrevisao.setCidade("São Paulo");
        mockPrevisao.setTemperatura(25.0);

        when(openWeatherMapIntegration.getPrevisao("São Paulo")).thenReturn(mockPrevisao);

        PrevisaoDTO previsao = previsaoTempoService.getPrevisao("São Paulo");
        assertEquals("São Paulo", previsao.getCidade());
        assertEquals(25.0, previsao.getTemperatura());
    }
}