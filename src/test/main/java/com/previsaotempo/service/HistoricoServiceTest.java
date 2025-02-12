package com.previsaotempo.service;

import com.previsaotempo.model.HistoricoPrevisao;
import com.previsaotempo.repository.HistoricoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class HistoricoServiceTest {

    @Mock
    private HistoricoRepository historicoRepository;

    @InjectMocks
    private HistoricoService historicoService;

    @Test
    public void testGetHistorico() {
        HistoricoPrevisao historico1 = new HistoricoPrevisao();
        historico1.setCidade("São Paulo");
        historico1.setTemperatura(25.0);

        HistoricoPrevisao historico2 = new HistoricoPrevisao();
        historico2.setCidade("São Paulo");
        historico2.setTemperatura(26.0);

        List<HistoricoPrevisao> historicos = Arrays.asList(historico1, historico2);

        when(historicoRepository.findByCidade("São Paulo")).thenReturn(historicos);

        List<HistoricoPrevisao> resultado = historicoService.getHistorico("São Paulo");
        assertEquals(2, resultado.size());
        assertEquals("São Paulo", resultado.get(0).getCidade());
    }
}