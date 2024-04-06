package br.com.peopleSystem.cadastroPessoas;

import java.util.Scanner;

public class Cliente_ extends Pessoa_{
	
	Pessoa_ pessoa1 = new Pessoa_();
	
	private String cargo, profissao;
	private int codigo;
	
	public Cliente_(){
		
	}
	
	public void cadastroCliente() {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Digite a CÓDIGO do Cliente: ");
		this.codigo = scr.nextInt();
		scr.nextLine();
		
		System.out.println("Digite o NOME do Cliente: ");
		pessoa1.setNome(scr.nextLine());
		
		
		System.out.println("Digite a DATA DE NASCIMENTO do Cliente: ");
		pessoa1.setDataNascimento(scr.nextInt());
		scr.nextLine();
		
		System.out.println("Digite o ENDEREÇO do Cliente: ");
		pessoa1.setEndereco(scr.nextLine());
		
		
		System.out.println("Digite o NUMERO DE CONTATO do Cliente: ");
		pessoa1.setContato(scr.nextInt());
		scr.nextLine();

		
		System.out.println("Digite a PROFISSÃO do Funcionário: ");
		this.profissao = scr.nextLine();
		
		
		scr.close();
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
