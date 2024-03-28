package com.rods.dia_03.repository;

import com.rods.dia_03.entity.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {

    public List<Investimento> findInvestimentoByInvestidor(String nome);
}
