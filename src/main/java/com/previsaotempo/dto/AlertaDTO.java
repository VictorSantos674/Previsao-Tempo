package com.previsaotempo.dto;

import lombok.Data;

@Data
public class AlertaDTO {
    private String tipo;
    private String mensagem;
    private String destinatario;
}