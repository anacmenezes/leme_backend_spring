package com.anamenezes.lemeviagens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anamenezes.lemeviagens.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
