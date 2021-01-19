package com.orangeTalents.loteria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orangeTalents.loteria.model.Aposta;
import com.orangeTalents.loteria.repository.ApostaRepository;

@RestController
@CrossOrigin(origins="*", allowedHeaders= "*")
@RequestMapping("/apostas")
public class ApostaController {
	
	@Autowired
	private ApostaRepository repository;
	
	@GetMapping
	public ResponseEntity <List<Aposta>> getAll() {
		return ResponseEntity.ok(repository.findAll()); 
	}
	
	@PostMapping
	public ResponseEntity<Aposta> post (@RequestBody Aposta aposta) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(aposta));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
