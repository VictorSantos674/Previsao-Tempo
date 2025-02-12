package com.previsaotempo.dto;

import lombok.Data;

@Data
public class PrevisaoDTO {
    private String cidade;
    private Double temperatura;
    private Double umidade;
    private String condicao;
}