package br.com.peopleSystem.main;

import java.util.Scanner;

import br.com.peopleSystem.cadastroPessoas.*;

public class MainCadastroPessoa {

	public static void main(String[] args) {
		getInput();
		Scanner scr = new Scanner(System.in);

	}

	public static void getInput() {
		Funcionario_ funcionario1 = new Funcionario_();
		Cliente_ cliente1 = new Cliente_();

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("\n        Selecione um cadastro ");
			System.out.println("--------------------------------------");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Cadastrar Funcionario");
			System.out.println("3 - Exit");
			System.out.print("\nSelect a Menu Option: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				cadastroCliente(cliente1);
				break;
			case 2:
				cadastroFuncionario(funcionario1);
				break;
			case 3:
				System.out.println("Nenhuma opção");
				return; // Encerra o método e sai do loop do-while
			default:
				System.out.println("Invalid option. Please try again.");
			}
		} while (true); // O loop continua indefinidamente até que o usuário escolha sair

	}

	private static void cadastroFuncionario(Funcionario_ funcionario1) {
		System.out.println("Tentar por o cadastro aqui FUNCIONARIO");
		funcionario1.cadastroFuncionario();
	}

	private static void cadastroCliente(Cliente_ cliente1) {
		System.out.println("Tentar por o cadastro aqui CLIENTE");
		cliente1.cadastroCliente();
	}

}
