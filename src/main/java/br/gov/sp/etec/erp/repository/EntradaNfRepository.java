package br.gov.sp.etec.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.etec.erp.entity.EntradaNF;

@Repository

public interface EntradaNfRepository extends JpaRepository<EntradaNF	, Long>{
	
	/*
	 * EntradaNfRepository findById_entrada(long id_entrada);
	 * 
	 * EntradaNfRepository findByNota_fiscal(String nota_fiscal);
	 * 
	 * EntradaNfRepository findByData_entrada(String data_entrada);
	 * 
	 * EntradaNfRepository findByOrdem_compra(String ordem_compra);
	 * 
	 * EntradaNfRepository findByValor_total(String valor_total);
	 */

}