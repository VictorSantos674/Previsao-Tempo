package com.previsaotempo.controller;

import com.previsaotempo.model.HistoricoPrevisao;
import com.previsaotempo.service.HistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historico")
public class HistoricoController {

    @Autowired
    private HistoricoService historicoService;

    @GetMapping("/{cidade}")
    public ResponseEntity<List<HistoricoPrevisao>> getHistorico(@PathVariable String cidade) {
        List<HistoricoPrevisao> historico = historicoService.getHistorico(cidade);
        return ResponseEntity.ok(historico);
    }
}