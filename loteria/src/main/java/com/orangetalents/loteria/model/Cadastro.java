package com.orangeTalents.loteria.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="cadastro")
public class Cadastro {
	
	//Essa classe contém as informações do usuário a serem cadastradas no banco de dados. 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());
	
	@NotNull
	@Size(min= 5, max=30)
	private String nome;
	
	@NotNull
	@Size(min= 10, max=30)
	private String email;
	
	@OneToMany(mappedBy = "cadastro", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("cadastro")
	private List<Aposta> aposta; //para mesclar as tabelas
	
	//GETTERS AND SETTERS
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Aposta> getAposta() {
		return aposta;
	}

	public void setAposta(List<Aposta> aposta) {
		this.aposta = aposta;
	}
	
	
}
