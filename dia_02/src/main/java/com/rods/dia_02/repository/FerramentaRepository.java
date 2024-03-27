package com.rods.dia_02.repository;

import com.rods.dia_02.entity.Ferramenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FerramentaRepository extends JpaRepository<Ferramenta, Long> {


    @Query("SELECT f FROM Ferramenta f")
    public List<Ferramenta> listarFerramentas();

    public List<Ferramenta> findFerramentaByTags(String tag);
}
