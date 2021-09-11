package com.devSuperior.ds_vendas.ropositoris;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devSuperior.ds_vendas.dto.SaleSuccessDto;
import com.devSuperior.ds_vendas.dto.SaleSumDto;
import com.devSuperior.ds_vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.devSuperior.ds_vendas.dto.SaleSumDto(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
  List<SaleSumDto> amountGroupBySeller();
	
	@Query("SELECT new com.devSuperior.ds_vendas.dto.SaleSuccessDto(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
  List<SaleSuccessDto> successGroupBySeller();
	
	
	

}
