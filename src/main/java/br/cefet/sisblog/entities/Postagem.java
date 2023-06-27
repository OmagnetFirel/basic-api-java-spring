package br.cefet.sisblog.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

@Table(name = "postagem")
public class Postagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String conteudo;
	
	@JsonIgnore
	private Date data_publicacao;
	
	@ManyToOne
	@JoinColumn(name = "autor_id")
	private Autor autor;
	
	@PrePersist
    public void prePersist() {
        data_publicacao = new Date();
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getconteudo() {
		return conteudo;
	}
	public void setconteudo(String nome) {
		this.conteudo = nome;
	}
	public Date getDataPublicacao() {
		return data_publicacao;
	}
	public void setDataPublicacao(Date data) {
		this.data_publicacao = data;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}
