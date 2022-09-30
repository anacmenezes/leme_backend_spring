package com.anamenezes.lemeviagens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anamenezes.lemeviagens.domain.RegiaoDestino;

@Repository
public interface RegiaoDestinoRepository extends JpaRepository<RegiaoDestino, Integer> {

}
