package br.com.peopleSystem.composicao;

import java.util.Scanner;

public class Endereco_ {
	private String rua;
	private String numero;
	private String cep;
	private String cidade;
	private String estado;
	private String pais;

	public void addEndereco() {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Digite a RUA: ");
		this.rua = scr.nextLine();
		
		System.out.println("Digite o CEP: ");
		this.cep = scr.nextLine();
		
		System.out.println("Digite a CIDADE: ");
		this.cidade = scr.nextLine();
		
		System.out.println("Digite o ESTADO: ");
		this.estado = scr.nextLine();
		
		System.out.println("Digite o PAÍS: ");
		this.pais = scr.nextLine();

	}
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	

}
