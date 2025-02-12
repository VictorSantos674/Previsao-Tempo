package com.previsaotempo.scheduler;

import com.previsaotempo.service.PrevisaoTempoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AtualizacaoPrevisaoScheduler {

    @Autowired
    private PrevisaoTempoService previsaoTempoService;

    @Scheduled(fixedRate = 3600000) // Atualiza a cada 1 hora
    public void atualizarPrevisoes() {
        // Lógica para atualizar previsões
    }
}