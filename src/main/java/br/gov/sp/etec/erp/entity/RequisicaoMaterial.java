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
@Table(name = "requisicao_material")
public class RequisicaoMaterial implements Serializable  {
	
	private static final long serialVersionUID = -3952053683870310569L;
	
	private Long id;
	private int idCodigo_produto;
	private Date dataRequisicao;
	private String setorRequisitante;
	private String nomeRequisitante;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "data_requisicao", nullable = false)
	public Date getData_requisicao() {
		return dataRequisicao;
	}
	public void setData_requisicao(Date data_requisicao) {
		this.dataRequisicao = data_requisicao;
	}
	@Column(name = "setor_requisitante", nullable = false)
	public String getSetor_requisitante() {
		return setorRequisitante;
	}
	public void setSetor_requisitante(String setor_requisitante) {
		this.setorRequisitante = setor_requisitante;
	}
	@Column(name = "nome_requisitante", nullable = false)
	public String getNome_requisitante() {
		return nomeRequisitante;
	}
	public void setNome_requisitante(String nome_requisitante) {
		this.nomeRequisitante = nome_requisitante;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Column(name = "id_codigo_produto", nullable = false)
	public int getId_codigo_produto() {
		return idCodigo_produto;
	}

	public void setId_codigo_produto(int id_codigo_produto) {
		this.idCodigo_produto = id_codigo_produto;
	}

	@Override
	public String toString() {
		return "RequisicaoMaterial [id=" + id + ", idCodigo_produto=" + idCodigo_produto + ", dataRequisicao="
				+ dataRequisicao + ", setorRequisitante=" + setorRequisitante + ", nomeRequisitante=" + nomeRequisitante
				+ "]";
	}

	
	

	
	
	
}
