package com.orangeTalents.loteria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orangeTalents.loteria.repository.CadastroRepository;

@Service
public class CadastroService {
	
	@Autowired
	private CadastroRepository repository;

}
