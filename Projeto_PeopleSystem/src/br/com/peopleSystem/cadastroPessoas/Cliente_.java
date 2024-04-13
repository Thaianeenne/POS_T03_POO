package br.com.peopleSystem.cadastroPessoas;

import java.util.Scanner;

import br.com.peopleSystem.composicao.Profissao_;
import br.com.peopleSystem.main.MainCadastroPessoa;

public class Cliente_ extends Pessoa_ {

	//Pessoa_ pessoa1 = new Pessoa_();
	
	private Profissao_ profissao;
	private int codigo;
	
	public Cliente_() {	
	}

	public void cadastroCliente() {
		
		Scanner leitor = new Scanner(System.in);
		

		System.out.println("Digite a CÓDIGO do Cliente: ");
		this.codigo = leitor.nextInt();
		

		add();

		System.out.println("Selecione a PROFISSÃO do Cliente: ");
		
		do {
			System.out.println("\n        Selecione um cadastro ");
			System.out.println("--------------------------------------");
			System.out.println("1 - Profissão 1");
			System.out.println("2 - ihbiyhboiyn");
			System.out.println("3 - Exit");
			System.out.print("\nSelect a Menu Option: ");
			
			int choice = leitor.nextInt();

			switch (choice) {
			case 1:
				this.profissao = Profissao_.PROFISSÃO1;
				System.out.println("Profissão 1");
				MainCadastroPessoa.getInput();
				break;
			case 2:
				this.profissao = Profissao_.PROFISSÃO2;
				break;
			case 3:
				this.profissao = Profissao_.PROFISSÃO3;
				break;
			case 4:
				this.profissao = Profissao_.PROFISSÃO4;
				break;
			case 5:
				this.profissao = Profissao_.PROFISSÃO3;
				break;
			case 6:
				this.profissao = Profissao_.PROFISSÃO3;
				break;
			case 7:
				this.profissao = Profissao_.PROFISSÃO3;
				break;
			case 8:
				this.profissao = Profissao_.PROFISSÃO3;
				break;
			case 9:
				this.profissao = Profissao_.PROFISSÃO3;
				break;
			case 10:
				this.profissao = Profissao_.PROFISSÃO3;
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		} while (true); 

		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Profissao_ getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao_ profissao) {
		this.profissao = profissao;
	}

}
