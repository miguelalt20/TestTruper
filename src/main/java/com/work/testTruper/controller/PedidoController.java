package com.work.testTruper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.work.testTruper.modelo.Pedido;
import com.work.testTruper.service.PedidoService;

@RestController
@RequestMapping("testTruper")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping
	public List<Pedido> obtenTodosLosPedidos() {
		return pedidoService.obtenPedidos();
	}
	
	@PostMapping
	public Pedido guardaPedido(@RequestBody final Pedido pedido) {
		pedidoService.guardaPedido(pedido);
		return pedido;
	}
}
