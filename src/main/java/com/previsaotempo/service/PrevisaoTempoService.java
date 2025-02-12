package com.previsaotempo.service;

import com.previsaotempo.dto.PrevisaoDTO;
import com.previsaotempo.integration.OpenWeatherMapIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrevisaoTempoService {

    @Autowired
    private OpenWeatherMapIntegration openWeatherMapIntegration;

    public PrevisaoDTO getPrevisao(String cidade) {
        return openWeatherMapIntegration.getPrevisao(cidade);
    }
}