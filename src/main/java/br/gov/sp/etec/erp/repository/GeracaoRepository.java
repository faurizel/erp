/*
 * package br.gov.sp.etec.erp.repository;
 * 
 * import java.util.Date; import java.util.Optional;
 * 
 * import org.springframework.data.jpa.repository.JpaRepository; import
 * org.springframework.stereotype.Repository;
 * 
 * import br.gov.sp.etec.erp.entity.Geracao;
 * 
 * @Repository public interface GeracaoRepository extends JpaRepository<Geracao,
 * Long> {
 * 
 * Optional<Geracao> findByIdnotafiscal(long idnotafiscal);
 * 
 * Geracao findByEmissaoNf(Date emissaonf);
 * 
 * Geracao findByNumeroDoPedido(int numerodopedido);
 * 
 * Geracao findByNaturezaDeOperacao(String naturezadeoperacao);
 * 
 * Geracao findByQuantProdNf(int quantprodnf);
 * 
 * Geracao findByValorTotal(int valortotal);
 * 
 * }
 */