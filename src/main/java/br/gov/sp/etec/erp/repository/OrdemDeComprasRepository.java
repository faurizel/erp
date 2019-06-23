package br.gov.sp.etec.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.etec.erp.entity.OrdemDeCompras;

@Repository
public interface OrdemDeComprasRepository extends JpaRepository<OrdemDeCompras, Long> {

}
