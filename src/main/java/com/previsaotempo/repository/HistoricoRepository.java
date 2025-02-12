package com.previsaotempo.repository;

import com.previsaotempo.model.HistoricoPrevisao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoricoRepository extends JpaRepository<HistoricoPrevisao, Long> {
    List<HistoricoPrevisao> findByCidade(String cidade);
}