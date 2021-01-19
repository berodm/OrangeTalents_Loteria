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

import com.orangeTalents.loteria.model.Cadastro;
import com.orangeTalents.loteria.repository.CadastroRepository;

@RestController
@RequestMapping("/cadastro")
@CrossOrigin("*")
public class CadastroController {
	
	/*anotação e variavel criada para injetar a 
	interface cadastrorepository no controller*/
	@Autowired
	private CadastroRepository repository;
	
	
	@GetMapping
	public ResponseEntity<List<Cadastro>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/cadastro-email/{email}")
	public ResponseEntity<List<Cadastro>>GetByEmail(@PathVariable String email){
		return ResponseEntity.ok(repository.findAllByEmailContainingIgnoreCase(email));
	}

	@PostMapping
	public ResponseEntity<Cadastro> post (@RequestBody Cadastro cadastro){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(cadastro));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
