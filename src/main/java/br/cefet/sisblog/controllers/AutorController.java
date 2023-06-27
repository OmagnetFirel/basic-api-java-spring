package br.cefet.sisblog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cefet.sisblog.entities.Autor;
import br.cefet.sisblog.repositories.AutorRepository;

@RestController
@RequestMapping(value = "/autores")
public class AutorController {

	@Autowired
	private AutorRepository repository;

	@GetMapping
	public List<Autor> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Autor findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}

	@PostMapping
	public Autor insert(@RequestBody Autor autor) {
		return repository.save(autor);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

	@PutMapping("/")
	public void update(@RequestBody Autor autor) {
		repository.save(autor);
	}

}
