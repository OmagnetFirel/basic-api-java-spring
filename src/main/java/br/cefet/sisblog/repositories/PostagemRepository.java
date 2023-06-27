package br.cefet.sisblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cefet.sisblog.entities.Postagem;


public interface PostagemRepository extends JpaRepository <Postagem, Long> {

}
