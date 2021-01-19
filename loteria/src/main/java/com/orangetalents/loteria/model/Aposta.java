package com.orangeTalents.loteria.model;

import java.util.Date;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="apostas")
public class Aposta {
	
	Random random = new Random();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());
	
	@NotNull
	@Size(min =5, max=15)
	private String descricao;
	
	@NotNull
	private int numero1 = random.nextInt(99);
	
	@NotNull
	private int numero2 = random.nextInt(99);
	
	@NotNull
	private int numero3 = random.nextInt(99);
	
	@NotNull
	private int numero4 = random.nextInt(99);
	
	@NotNull
	private int numero5 = random.nextInt(99);
	
	@ManyToOne
	@JsonIgnoreProperties("aposta")
	private Cadastro cadastro;
	
	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getNumero3() {
		return numero3;
	}

	public void setNumero3(int numero3) {
		this.numero3 = numero3;
	}

	public int getNumero4() {
		return numero4;
	}

	public void setNumero4(int numero4) {
		this.numero4 = numero4;
	}

	public int getNumero5() {
		return numero5;
	}

	public void setNumero5(int numero5) {
		this.numero5 = numero5;
	}


}
