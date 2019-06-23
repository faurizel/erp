package br.gov.sp.etec.erp.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ordem_compras")
public class OrdemDeCompras implements Serializable {
	
	private static final long serialVersionUID = -3952053683870310569L;
	
	private Long id;
	private Long numeroCotacao;
	private int codigoProduto;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "id_numero_cotacao", nullable = false)
	public Long getNumero_cotacao() {
		return numeroCotacao;
	}
	public void setNumero_cotacao(Long numero_cotacao) {
		this.numeroCotacao = numero_cotacao;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "OrdemDeCompras [id=" + id + ", numero_cotacao=" + numeroCotacao + ", getId()=" + getId()
				+ ", getNumero_cotacao()=" + getNumero_cotacao() + "]";
	}
	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	

	
	
}
