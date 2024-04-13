package br.com.peopleSystem.composicao;

import java.util.Scanner;

public class TelContato_ {
	private String ddd;
	private String numTelefone;
	
	
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumTelefone() {
		return numTelefone;
	}
	public void setNumTelefone(String numTelefone) {
		this.numTelefone = numTelefone;
	}
	
	public void addContato() {

		  Scanner scr = new Scanner(System.in);
	        
	        System.out.println("Digite o DDD: ");
	        this.ddd = scr.nextLine();
	        
	        System.out.println("Digite o número de telefone: ");
	        this.numTelefone = scr.nextLine();
		
	}

}
