package br.gov.sp.etec.erp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 6764149546600123732L;
	private long idcliente;
	private String cep;
	private String razaosocial;
	private String cnpj;
	private String telcliente;
	private String rua;
	private String estado;
	private String cidade;
	private String cpf;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getIdcliente() {
		return idcliente;
	}
	
	public void setIdcliente(long idcliente) {
		this.idcliente = idcliente;
	}

	@Column(name = "cep_cliente" ,  nullable = false)
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Column(name = "nome_cliente" ,  nullable = false)
	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}
	@Column(name = "cnpj_cliente" ,  nullable = false)
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Column(name = "telefone_fornecedor" ,  nullable = false)
	public String getTelcliente() {
		return telcliente;
	}

	public void setTelcliente(String telcliente) {
		this.telcliente = telcliente;
	}
	@Column(name = "endereco_cliente" ,  nullable = false)
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	@Column(name = "uf_cliente" ,  nullable = false)
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Column(name = "cidade_cliente" ,  nullable = false)
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Column(name = "cpf_cliente" ,  nullable = false)
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
