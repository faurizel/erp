
  package br.gov.sp.etec.erp.repository; import org.springframework.data.jpa.repository.JpaRepository;
import
  org.springframework.stereotype.Repository;

import br.gov.sp.etec.erp.entity.Cliente;
  
  @Repository public interface ClienteRepository extends JpaRepository<Cliente,
  Long> {
  
	/*
	 * Optional<Cliente> findById(long idcliente);
	 * 
	 * Cliente findByCep(int cep);
	 * 
	 * Cliente findBYRazaoSocial(String razaosocial);
	 * 
	 * Cliente findByCnpj(int cnpj);
	 * 
	 * Cliente findByTelCliente(int telcliente);
	 * 
	 * Cliente findByRua(String rua);
	 * 
	 * Cliente findByEstado(String estado);
	 * 
	 * Cliente findByCidade(String cidade);
	 * 
	 * Cliente findByCpf(int cpf);
	 */
  
  }
 