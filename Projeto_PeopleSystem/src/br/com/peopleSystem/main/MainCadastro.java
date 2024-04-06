package br.com.peopleSystem.main;

//import java.util.Scanner;
//import br.com.peopleSystem.cadastroPessoas.Pessoa_;
import br.com.peopleSystem.cadastroPessoas.Funcionario_;
import br.com.peopleSystem.cadastroPessoas.Cliente_;

public class MainCadastro {
	public static void main(String[] args) {

		Funcionario_ funcionario1 = new Funcionario_();
		Cliente_ cliente1 = new Cliente_();

		funcionario1.cadastroFuncionario();
		cliente1.cadastroCliente();

	}

}
