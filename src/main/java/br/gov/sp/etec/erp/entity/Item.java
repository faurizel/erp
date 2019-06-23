package br.gov.sp.etec.erp.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Item implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long codigodeproduto;
	private int numerodepedido;
	private int quantidade;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	public long getCodigodeproduto() {
		return codigodeproduto;
	}

	public void setCodigodeproduto(long codigodeproduto) {
		this.codigodeproduto = codigodeproduto;
	}

	public int getNumerodepedido() {
		return numerodepedido;
	}

	public void setNumerodepedido(int numerodepedido) {
		this.numerodepedido = numerodepedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Item [codigodeproduto=" + codigodeproduto + ", numerodepedido=" + numerodepedido + ", quantidade="
				+ quantidade + ", getCodigodeproduto()=" + getCodigodeproduto() + ", getNumerodepedido()="
				+ getNumerodepedido() + ", getQuantidade()=" + getQuantidade() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void setId(long id) {
		// TODO Auto-generated method stub

	}

}
