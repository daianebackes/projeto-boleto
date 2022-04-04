package com.backes.desafio.repositories;

import com.backes.desafio.model.BoletoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BoletoRepository extends JpaRepository<BoletoModel, UUID> {
}