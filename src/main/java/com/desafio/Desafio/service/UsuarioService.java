package com.desafio.Desafio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.Desafio.model.Usuario;
import com.desafio.Desafio.repositories.UsuarioRepository;
import com.desafio.Desafio.service.exception.ResourceNotFoundException;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> findAll(){
		return repository.findAll();
	}
	
	public Usuario findById(Long id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ResourceNotFoundException(id));
	}
	
	public Usuario insert(Usuario obj) {
		return	repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Usuario update(Long id, Usuario obj) {
		Usuario entity = repository.getOne(id);
		updateData(entity,obj);
		return repository.save(entity);
	}

	private void updateData(Usuario entity, Usuario obj) {	
		entity.setNome(obj.getNome());
		entity.setCargo(obj.getCargo());
		entity.setDataNascimento(obj.getDataNascimento());
		entity.setPerfil(obj.getPerfil());
		entity.setSexo(obj.getSexo());
		entity.setStatus(obj.getStatus());
	}
}
