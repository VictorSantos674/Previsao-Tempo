package com.previsaotempo.controller;

import com.previsaotempo.dto.PrevisaoDTO;
import com.previsaotempo.service.PrevisaoTempoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/previsao")
public class PrevisaoTempoController {

    @Autowired
    private PrevisaoTempoService previsaoTempoService;

    @GetMapping("/{cidade}")
    public ResponseEntity<PrevisaoDTO> getPrevisao(@PathVariable String cidade) {
        PrevisaoDTO previsao = previsaoTempoService.getPrevisao(cidade);
        return ResponseEntity.ok(previsao);
    }
}