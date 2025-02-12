package com.previsaotempo.integration;

import com.previsaotempo.dto.PrevisaoDTO;
import com.previsaotempo.exception.ApiIntegrationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenWeatherMapIntegration {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OpenWeatherMapConfig config;

    public PrevisaoDTO getPrevisao(String cidade) {
        String url = config.getApiUrl() + "?q=" + cidade + "&appid=" + config.getApiKey();
        try {
            return restTemplate.getForObject(url, PrevisaoDTO.class);
        } catch (Exception e) {
            throw new ApiIntegrationException("Erro ao integrar com a API do OpenWeatherMap");
        }
    }
}