package com.anamenezes.lemeviagens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anamenezes.lemeviagens.domain.CidadeDestino;

@Repository
public interface CidadeDestinoRepository extends JpaRepository<CidadeDestino, Integer> {

}
