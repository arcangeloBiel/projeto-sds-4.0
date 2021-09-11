package com.devSuperior.ds_vendas.dto;

import java.io.Serializable;

import com.devSuperior.ds_vendas.entities.Seller;

public class SaleSuccessDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String sallerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDto() {
		
	}

	
	public SaleSuccessDto(Seller seller, Long visited, Long deals) {
		sallerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSallerName() {
		return sallerName;
	}

	public void setSallerName(String sallerName) {
		this.sallerName = sallerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	
}
