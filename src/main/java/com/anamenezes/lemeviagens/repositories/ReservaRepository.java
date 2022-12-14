package com.anamenezes.lemeviagens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anamenezes.lemeviagens.domain.Reserva;

	@Repository
	public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
