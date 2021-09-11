package com.devSuperior.ds_vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devSuperior.ds_vendas.dto.SaleDto;
import com.devSuperior.ds_vendas.entities.Sale;
import com.devSuperior.ds_vendas.ropositoris.SaleRepository;
import com.devSuperior.ds_vendas.ropositoris.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDto> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result =  repository.findAll(pageable);
		return result.map(x -> new SaleDto(x));
	}

}
