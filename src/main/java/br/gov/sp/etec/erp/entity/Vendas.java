package br.gov.sp.etec.erp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendas")
public class Vendas implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long pedidodevenda;
	private int geracaodenf;
	private String cadastrodecliente;
	private String observacoes;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	public long getPedidodevenda() {
		return pedidodevenda;
	}

	public void setPedidodevenda(long pedidodevenda) {
		this.pedidodevenda = pedidodevenda;
	}

	@Column(name = "geracaodenf", nullable = false)
	public int getGeracaodenf() {
		return geracaodenf;
	}

	public void setGeracaodenf(int geracaodenf) {
		this.geracaodenf = geracaodenf;
	}

	@Column(name = "cadastrodecliente", nullable = false)
	public String getCadastrodecliente() {
		return cadastrodecliente;
	}

	public void setCadastrodecliente(String cadastrodecliente) {
		this.cadastrodecliente = cadastrodecliente;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	@Override
	public String toString() {
		return "Vendas [pedidodevenda=" + pedidodevenda + ", geracaodenf=" + geracaodenf + ", cadastrodecliente="
				+ cadastrodecliente + ", observacoes=" + observacoes + ", getPedidodevenda()=" + getPedidodevenda()
				+ ", getGeracaodenf()=" + getGeracaodenf() + ", getCadastrodecliente()=" + getCadastrodecliente()
				+ ", getObservacoes()=" + getObservacoes() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public void setId(long id) {
		// TODO Auto-generated method stub

	}

}
