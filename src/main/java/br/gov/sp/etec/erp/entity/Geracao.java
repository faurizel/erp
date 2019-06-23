package br.gov.sp.etec.erp.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Geracao implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8443465860066532714L;
	private long idnotafiscal;
	private Date emissaonf;
	private int numerodooedido;
	private String naturezadeoperacao;
	private int quantprodnf;
	private int valortotal;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	public int getNumerodooedido() {
		return numerodooedido;
	}

	public long getIdnotafiscal() {
		return idnotafiscal;
	}

	public void setIdnotafiscal(long idnotafiscal) {
		this.idnotafiscal = idnotafiscal;
	}

	public Date getEmissaonf() {
		return emissaonf;
	}

	public void setEmissaonf(Date emissaonf) {
		this.emissaonf = emissaonf;
	}

	public void setNumerodooedido(int numerodooedido) {
		this.numerodooedido = numerodooedido;
	}

	public String getNaturezadeoperacao() {
		return naturezadeoperacao;
	}

	public void setNaturezadeoperacao(String naturezadeoperacao) {
		this.naturezadeoperacao = naturezadeoperacao;
	}

	public int getQuantprodnf() {
		return quantprodnf;
	}

	public void setQuantprodnf(int quantprodnf) {
		this.quantprodnf = quantprodnf;
	}

	public int getValortotal() {
		return valortotal;
	}

	public void setValortotal(int valortotal) {
		this.valortotal = valortotal;
	}

	@Override
	public String toString() {
		return "Geracao [idnotafiscal=" + idnotafiscal + ", emissaonf=" + emissaonf + ", numerodooedido="
				+ numerodooedido + ", naturezadeoperacao=" + naturezadeoperacao + ", quantprodnf=" + quantprodnf
				+ ", valortotal=" + valortotal + ", getNumerodooedido()=" + getNumerodooedido() + ", getIdnotafiscal()="
				+ getIdnotafiscal() + ", getEmissaonf()=" + getEmissaonf() + ", getNaturezadeoperacao()="
				+ getNaturezadeoperacao() + ", getQuantprodnf()=" + getQuantprodnf() + ", getValortotal()="
				+ getValortotal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public void setId(long id) {
		// TODO Auto-generated method stub

	}

}
