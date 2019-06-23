package br.gov.sp.etec.erp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "entrada_nf")
public class EntradaNF implements Serializable {
	
	private static final long serialVersionUID = -3952053683870310569L;

	private Long id_entrada;
	private String nota_fiscal;
	private String data_entrada;
	private String ordem_compra;
	private String valor_total;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId_entrada()
	{
		return id_entrada;
	}
	public void setId_entrada(Long id_entrada) {
		this.id_entrada = id_entrada;
	}
	@Column(name = "nota_fiscal", nullable = false)
	public String getNota_fiscal() {
		return nota_fiscal;
	}
	public void setNota_fiscal(String nota_fiscal) {
		this.nota_fiscal = nota_fiscal;
	}
	@Column(name = "data_entrada", nullable = false)
	public String getData_entrada() {
		return data_entrada;
	}
	public void setData_entrada(String data_entrada) {
		this.data_entrada = data_entrada;
	}
	@Column(name = "ordem_compra", nullable = false)
	public String getOrdem_compra() {
		return ordem_compra;
	}
	public void setOrdem_compra(String ordem_compra) {
		this.ordem_compra = ordem_compra;
	}
	@Column(name = "valor_total", nullable = false)
	public String getValor_total() {
		return valor_total;
	}
	public void setValor_total(String valor_total) {
		this.valor_total = valor_total;
	}
	@Override
	public String toString() {
		return "Entrada_nf [id_entrada=" + id_entrada + ", nota_fiscal=" + nota_fiscal + ", data_entrada="
				+ data_entrada + ", ordem_compra=" + ordem_compra + ", valor_total=" + valor_total + "]";
	}
	
	
}
