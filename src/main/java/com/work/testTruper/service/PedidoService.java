package com.work.testTruper.service;

import java.util.List;

import com.work.testTruper.modelo.Pedido;


public interface PedidoService {

	public List<Pedido> obtenPedidos();
	
	public Pedido guardaPedido(Pedido pedido);
}
