package com.devSuperior.ds_vendas.ropositoris;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.ds_vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	

}
