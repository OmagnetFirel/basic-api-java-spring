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

import br.cefet.sisblog.entities.Postagem;
import br.cefet.sisblog.repositories.PostagemRepository;

@RestController
@RequestMapping(value = "/postagens")
public class PostagemController {

	@Autowired
	private PostagemRepository repository;

	@GetMapping
	public List<Postagem> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Postagem findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}

	@PostMapping
	public Postagem insert(@RequestBody Postagem post) {
		return repository.save(post);
	} 

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

	@PutMapping("/")
	public void update(@RequestBody Postagem post) {
		repository.save(post);
	}

}
