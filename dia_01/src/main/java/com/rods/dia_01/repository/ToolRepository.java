package com.rods.dia_01.repository;

import com.rods.dia_01.entity.Tool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ToolRepository extends JpaRepository<Tool, Long> {

    List<Tool> findByTags(String tags);
}
