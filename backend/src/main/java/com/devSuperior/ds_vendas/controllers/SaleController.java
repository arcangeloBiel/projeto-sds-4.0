package com.devSuperior.ds_vendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devSuperior.ds_vendas.dto.SaleDto;
import com.devSuperior.ds_vendas.dto.SaleSuccessDto;
import com.devSuperior.ds_vendas.dto.SaleSumDto;
import com.devSuperior.ds_vendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;

	@GetMapping
	public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable) {
		Page<SaleDto> list = service.findAll(pageable);
		return ResponseEntity.ok(list);

	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDto>>  amountGroupBySeller() {
		List<SaleSumDto> list = service.amountGroupBySeller();
		return ResponseEntity.ok(list);

	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDto>>  successGroupBySeller() {
		List<SaleSuccessDto> list = service.successGroupBySeller();
		return ResponseEntity.ok(list);

	}

}
