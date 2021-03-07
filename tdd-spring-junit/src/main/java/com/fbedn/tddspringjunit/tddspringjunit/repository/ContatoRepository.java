package com.fbedn.tddspringjunit.tddspringjunit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fbedn.tddspringjunit.tddspringjunit.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {
	
}