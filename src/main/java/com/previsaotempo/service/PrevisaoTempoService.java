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

public PrevisaoDTO getPrevisaoPorGeolocalizacao(Double latitude, Double longitude) {
    String url = config.getApiUrl() + "?lat=" + latitude + "&lon=" + longitude + "&appid=" + config.getApiKey();
    try {
        return restTemplate.getForObject(url, PrevisaoDTO.class);
    } catch (Exception e) {
        throw new ApiIntegrationException("Erro ao integrar com a API do OpenWeatherMap");
    }
}