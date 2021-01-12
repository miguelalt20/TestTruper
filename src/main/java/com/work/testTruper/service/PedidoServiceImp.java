package com.work.testTruper.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.testTruper.modelo.Pedido;
import com.work.testTruper.repository.PedidoRepository;

@Service
public class PedidoServiceImp implements PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Override
	public List<Pedido> obtenPedidos() {
		List<Pedido> lPedido =  new ArrayList<>();
		pedidoRepository.findAll().iterator().forEachRemaining(lPedido::add);
		return lPedido;
	}

	@Override
	public Pedido guardaPedido(Pedido pedido) {
		pedido.setFechaVenta(new Date());
		return pedidoRepository.save(pedido);
	}

	
}
