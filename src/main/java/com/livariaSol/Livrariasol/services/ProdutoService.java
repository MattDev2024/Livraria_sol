package com.livariaSol.Livrariasol.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livariaSol.Livrariasol.entidade.Produto;
import com.livariaSol.Livrariasol.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepo;
	
	public List<Produto> findAll(){
		return produtoRepo.findAll();
	}
	
	public Produto findById(Long id) {
		Optional<Produto> prod = produtoRepo.findById(id);
		return prod.get();
	}
	
	public Produto addNew(Produto prod) {
		return produtoRepo.save(prod);
	}

}
