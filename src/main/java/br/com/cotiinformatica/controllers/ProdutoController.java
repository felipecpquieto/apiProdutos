package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")

public class ProdutoController {

	@PostMapping("cadastrar")
	public void cadastrar() {
		// todo
		
	}
	
	@PutMapping("atualizar")
	public void atualizar() {
		// todo
	}

	@DeleteMapping("excluir")
	public void excluir() {
		// todo
	}
	
	@GetMapping("consultar")
	public void consultarPorId() {
		// todo
	}
	
	
}

