package br.com.peopleSystem.cadastroPessoas;

import java.util.Scanner;

public class Funcionario_ extends Pessoa_ {
	
	
	//Pessoa_ pessoa1 = new Pessoa_();
	
	public String dataAdmissao, cargo ;
	int matricula, salario;
	
	public Funcionario_() {
		
	}
	
	public void cadastroFuncionario() {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Digite a MATRICULA do Funcionário: ");
		this.matricula = scr.nextInt();
		scr.nextLine();
		
		System.out.println("Digite o CARGO do Funcionário: ");
		this.cargo = scr.nextLine();
		
		
		System.out.println("Digite o SALÁRIO do Funcionário: ");
		this.salario = scr.nextInt();
		scr.nextLine();

		
		System.out.println("Digite a DATA DE ADMISSÃO do Funcionário: ");
		this.dataAdmissao = scr.nextLine();
		
		
		add();
		
		
	}
	
	public void reajustarSalario() {
		
	}
	
	
	
	
	
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
