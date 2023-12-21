package com.livariaSol.Livrariasol.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livariaSol.Livrariasol.entidade.Pedido;
import com.livariaSol.Livrariasol.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepo;
	
	public List<Pedido> findAll() {
		return pedidoRepo.findAll();
	}
	
	public Pedido newOrder( Pedido pd) {
		return pedidoRepo.save(pd);
	}

}
