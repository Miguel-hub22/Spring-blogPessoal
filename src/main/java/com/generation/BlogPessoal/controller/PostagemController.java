package com.generation.BlogPessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.BlogPessoal.model.Postagem;
import com.generation.BlogPessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/Postagens")
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class PostagemController {
	
	@Autowired
	private  PostagemRepository  Postagemm;
	
	public ResponseEntity<List<Postagem>> getall(){
		return ResponseEntity.ok(Postagemm.findAll());
}

}