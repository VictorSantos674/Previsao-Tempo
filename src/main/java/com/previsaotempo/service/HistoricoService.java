package com.previsaotempo.service;

import com.previsaotempo.model.HistoricoPrevisao;
import com.previsaotempo.repository.HistoricoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoService {

    @Autowired
    private HistoricoRepository historicoRepository;

    public List<HistoricoPrevisao> getHistorico(String cidade) {
        return historicoRepository.findByCidade(cidade);
    }
}