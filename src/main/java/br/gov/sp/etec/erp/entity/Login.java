package br.gov.sp.etec.erp.entity;

import java.io.Serializable;

public class Login implements Serializable{
	String login;
	String senha;
	
	
	private static final long serialVersionUID = 6536646864431205397L;


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	

}
