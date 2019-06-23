/*
 * package br.gov.sp.etec.erp.entity;
 * 
 * import java.io.Serializable;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.Table; import
 * javax.xml.crypto.Data;
 * 
 * @Entity
 * 
 * @Table(name = "pedidovenda") public class PedidoVenda implements Serializable
 * {
 * 
 * private static final long serialVersionUID = 4013382901622092528L;
 * 
 * 
 * 
 * private long idpedidovenda; private Data datadopedido; private String cnpj;
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO)
 * 
 * public void setDatadopedido(Data datadopedido) { this.datadopedido =
 * datadopedido; }
 * 
 * public long getIdpedidovenda() { return idpedidovenda; }
 * 
 * public void setIdpedidovenda(long idpedidovenda) { this.idpedidovenda =
 * idpedidovenda; }
 * 
 * @Column(name = "datadopedido", nullable = false) public Data
 * getDatadopedido() { return datadopedido; }
 * 
 * @Column(name = "cnpj", nullable = false) public String getCnpj() { return
 * cnpj; }
 * 
 * public void setCnpj(String cnpj) { this.cnpj = cnpj; }
 * 
 * 
 * 
 * @Override public String toString() { return "Pedido [getClass()=" +
 * getClass() + ", hashCode()=" + hashCode() + ", toString()=" +
 * super.toString() + "]"; }
 * 
 * public void setId(long id) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */