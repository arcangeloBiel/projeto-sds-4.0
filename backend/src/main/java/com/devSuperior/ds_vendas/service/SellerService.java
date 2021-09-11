package com.devSuperior.ds_vendas.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devSuperior.ds_vendas.dto.SellerDto;
import com.devSuperior.ds_vendas.entities.Seller;
import com.devSuperior.ds_vendas.ropositoris.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDto> findAll() {
		List<Seller> result =  repository.findAll();
		return result.stream().map(x -> new SellerDto(x)).collect(Collectors.toList());
	}

}
