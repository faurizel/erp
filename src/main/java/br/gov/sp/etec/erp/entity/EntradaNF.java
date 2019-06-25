package br.gov.sp.etec.erp.entity;

import java.io.Serializable;
import java.util.Date;

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
	private Long id_codigo_produto;
	private String nota_fiscal;
	private Date data_entrada;
	private int ordem_compra;
	private double valor_total;
	
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
	public Date getData_entrada() {
		return data_entrada;
	}
	public void setData_entrada(Date data_entrada) {
		this.data_entrada = data_entrada;
	}
	@Column(name = "ordem_compra", nullable = false)
	public int getOrdem_compra() {
		return ordem_compra;
	}
	public void setOrdem_compra(int ordem_compra) {
		this.ordem_compra = ordem_compra;
	}
	@Column(name = "valor_total", nullable = false)
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	
	@Column(name = "id_codigo_produto", nullable = false)
	public Long getId_codigo_produto() {
		return id_codigo_produto;
	}
	public void setId_codigo_produto(Long id_codigo_produto) {
		this.id_codigo_produto = id_codigo_produto;
	}
	
	
	@Override
	public String toString() {
		return "Entrada_nf [id_entrada=" + id_entrada + ", nota_fiscal=" + nota_fiscal + ", data_entrada="
				+ data_entrada + ", ordem_compra=" + ordem_compra + ", valor_total=" + valor_total + "]";
	}
	
	
}
