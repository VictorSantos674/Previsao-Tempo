package com.previsaotempo.controller;

import com.previsaotempo.dto.AlertaDTO;
import com.previsaotempo.service.NotificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alertas")
public class AlertaController {

    @Autowired
    private NotificacaoService notificacaoService;

    @PostMapping
    public ResponseEntity<String> enviarAlerta(@RequestBody AlertaDTO alerta) {
        notificacaoService.enviarAlerta(alerta);
        return ResponseEntity.ok("Alerta enviado com sucesso!");
    }
}