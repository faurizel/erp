package br.gov.sp.etec.erp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8545711073996787418L;
	private long idproduto;
	private String descricao;
	private int quantprodestoque;
	private String unidade;
	private int valorunitario;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(long idproduto) {
		this.idproduto = idproduto;
	}
	
	@Column(name = "descricao" ,  nullable = false)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Column(name = "quantidade" ,  nullable = false)
	public int getQuantprodestoque() {
		return quantprodestoque;
	}

	public void setQuantprodestoque(int quantprodestoque) {
		this.quantprodestoque = quantprodestoque;
	}
	
	@Column(name = "unidade" ,  nullable = false)
	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	@Column(name = "valor" ,  nullable = false)
	public int getValorunitario() {
		return valorunitario;
	}

	public void setValorunitario(int valorunitario) {
		this.valorunitario = valorunitario;
	}

	@Override
	public String toString() {
		return "Produto [idproduto=" + idproduto + ", descricao=" + descricao + ", quantprodestoque=" + quantprodestoque
				+ ", unidade=" + unidade + ", valorunitario=" + valorunitario + ", getIdproduto()=" + getIdproduto()
				+ ", getDescricao()=" + getDescricao() + ", getQuantprodestoque()=" + getQuantprodestoque()
				+ ", getUnidade()=" + getUnidade() + ", getValorunitario()=" + getValorunitario() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void setId(long id) {
		// TODO Auto-generated method stub

	}

}
