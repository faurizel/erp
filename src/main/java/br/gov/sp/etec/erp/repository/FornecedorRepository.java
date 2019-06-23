package br.gov.sp.etec.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.etec.erp.entity.Fornecedor;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor	, Long>{
	
	Fornecedor findById(long id);
	
	Fornecedor findByCnpj(String cnpj);
	
	Fornecedor findByRazaoSocial(String razaoSocial);

}
