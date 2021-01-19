package com.orangeTalents.loteria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orangeTalents.loteria.model.Cadastro;


@Repository
public interface CadastroRepository extends JpaRepository <Cadastro, Long> {
	public List<Cadastro> findAllByEmailContainingIgnoreCase (String email);
}
