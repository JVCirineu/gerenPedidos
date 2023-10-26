package com.projetoGerPedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoGerPedidos.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
