package com.previsaotempo.repository;

import com.previsaotempo.model.Previsao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrevisaoRepository extends JpaRepository<Previsao, Long> {
}