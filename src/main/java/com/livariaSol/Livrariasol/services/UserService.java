package com.livariaSol.Livrariasol.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livariaSol.Livrariasol.entidade.Usuarios;
import com.livariaSol.Livrariasol.repositories.UsuariosRepository;

@Service
public class UserService {
	
	@Autowired
	private UsuariosRepository userRepo;
	
	public List<Usuarios> findAll(){
		return userRepo.findAll();
	}
	
	public Usuarios findById(Long id) {
		Optional<Usuarios> usr = userRepo.findById(id);
		return usr.get();
	}
	
	public void addNew(Usuarios user) {
		return userRepo.save(user);
	}

}
