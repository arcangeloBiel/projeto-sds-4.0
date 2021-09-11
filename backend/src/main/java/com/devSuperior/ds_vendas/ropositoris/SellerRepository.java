package com.devSuperior.ds_vendas.ropositoris;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.ds_vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

	List<Seller> findAll();

}
