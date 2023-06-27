package br.cefet.sisblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cefet.sisblog.entities.Autor;

public interface AutorRepository extends JpaRepository <Autor, Long> {

}
