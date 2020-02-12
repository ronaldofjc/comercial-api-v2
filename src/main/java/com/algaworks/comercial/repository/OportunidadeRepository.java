package com.algaworks.comercial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.comercial.model.Oportunidade;

import java.util.Optional;

public interface OportunidadeRepository extends JpaRepository<Oportunidade, Long> {

    Optional<Oportunidade> findByDescricaoAndNomeProspecto(String descricao, String nomeProspecto);
}
