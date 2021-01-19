package com.orangeTalents.loteria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orangeTalents.loteria.model.Aposta;

@Repository
public interface ApostaRepository extends JpaRepository <Aposta, Long>{
	public List<Aposta> findAllById(long id);
}
