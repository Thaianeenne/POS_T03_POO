package br.com.peopleSystem.cadastroPessoas;

import java.util.Scanner;

import br.com.peopleSystem.composicao.Profissao_;
import br.com.peopleSystem.main.MainCadastroPessoa;

public class Cliente_ extends Pessoa_ {

	// Pessoa_ pessoa1 = new Pessoa_();

	private Profissao_ profissao;
	private int codigo;

	public Cliente_() {
	}

	public void cadastroCliente() {
		

		Scanner leitor = new Scanner(System.in);

		System.out.println("\nDigite a CÓDIGO do Cliente: ");
		this.codigo = leitor.nextInt();
		int X = 0;
		add();

		System.out.println("Selecione a PROFISSÃO do Cliente: ");

		do {
			System.out.println("\n        Selecione um cadastro ");
			System.out.println("--------------------------------------");
			System.out.println("1 - Profissão 1");
			System.out.println("2 - Profissão 2");
			System.out.println("3 - Profissão 3");
			System.out.println("4 - Profissão 4");
			System.out.println("5 - Profissão 5");
			System.out.println("6 - Profissão 6");
			System.out.println("7 - Profissão 7");
			System.out.println("8 - Profissão 8");
			System.out.println("9 - Profissão 9");
			System.out.println("10 - Profissão 10");
			System.out.println("11 - Exit");
			System.out.print("\nSelect a Menu Option: ");

			int choice = leitor.nextInt();

			switch (choice) {
			case 1:
				this.profissao = Profissao_.PROFISSÃO1;
				System.out.println("Profissão 1");
				break;
			case 2:
				this.profissao = Profissao_.PROFISSÃO2;
				System.out.println("Profissão 2");
				break;
			case 3:
				this.profissao = Profissao_.PROFISSÃO3;
				System.out.println("Profissão 3");
				break;
			case 4:
				this.profissao = Profissao_.PROFISSÃO4;
				System.out.println("Profissão 4");
				break;
			case 5:
				this.profissao = Profissao_.PROFISSÃO5;
				System.out.println("Profissão 5");
				break;
			case 6:
				this.profissao = Profissao_.PROFISSÃO6;
				System.out.println("Profissão 6");
				break;
			case 7:
				this.profissao = Profissao_.PROFISSÃO7;
				System.out.println("Profissão 7");
				break;
			case 8:
				this.profissao = Profissao_.PROFISSÃO8;
				System.out.println("Profissão 8");
				break;
			case 9:
				this.profissao = Profissao_.PROFISSÃO9;
				System.out.println("Profissão 9");
				break;
			case 10:
				this.profissao = Profissao_.PROFISSÃO10;
				System.out.println("Profissão 10");
				break;
			case 11:
				System.out.println("Nenhuma profissão registrada");

				break;
			default:
				System.out.println("Invalid option. Please try again.");

			}
			
			
		} while (X == 1);

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
