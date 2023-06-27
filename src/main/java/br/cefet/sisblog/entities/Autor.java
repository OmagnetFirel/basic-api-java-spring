package br.cefet.sisblog.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "autor")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;

	@JsonIgnore
	private Date data_cadastro;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDate(Date data){
		this.data_cadastro = data;
	}

	public Date getDate(){
		return this.data_cadastro;
	}

	@PrePersist
    public void prePersist() {
        data_cadastro = new Date();
    }
}
