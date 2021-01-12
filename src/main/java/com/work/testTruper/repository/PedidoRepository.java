package com.work.testTruper.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.work.testTruper.modelo.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer>{

}
