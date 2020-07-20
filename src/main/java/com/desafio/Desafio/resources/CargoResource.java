package com.desafio.Desafio.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.Desafio.model.Cargo;

@RestController
@RequestMapping(value = "/cargos")
public class CargoResource {
	
	@GetMapping
	public ResponseEntity<Cargo> findAllCargos(){
		Cargo cg = new Cargo("teste");
		return ResponseEntity.ok().body(cg);
	}
}
