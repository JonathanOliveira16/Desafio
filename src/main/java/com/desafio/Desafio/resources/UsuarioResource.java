package com.desafio.Desafio.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.desafio.Desafio.model.Usuario;
import com.desafio.Desafio.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
		@Autowired
		private UsuarioService service;
	
		@GetMapping
		public ResponseEntity<List<Usuario>> findAll(){
			List<Usuario> list = service.findAll();
			return ResponseEntity.ok().body(list);
		} 
		
		@GetMapping(value = "/{id}")
		public ResponseEntity<Usuario> findById(@PathVariable Long id){
			Usuario obj = service.findById(id);
			return ResponseEntity.ok().body(obj);
		}
		
		@PostMapping
		public ResponseEntity<Usuario> insert(@RequestBody Usuario obj){
			obj = service.insert(obj);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getCpf()).toUri();
			return ResponseEntity.created(uri).body(obj);
		}
}
