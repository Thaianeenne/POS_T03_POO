package br.com.peopleSystem.main;

import java.util.Scanner;
import br.com.peopleSystem.cadastroPessoas.*;

public class MainCadastro {
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		Funcionario_ funcionario1 = new Funcionario_();
		Cliente_ cliente1 = new Cliente_();
		
		funcionario1.cadastroFuncionario();
		cliente1.cadastroCliente();
		
		do {
	        System.out.println("\n\n          Car Sales Menu");
	        System.out.println("--------------------------------------");
	        System.out.println("1 - Sort vehicles by owner's Last Name");
	        System.out.println("2 - Sort vehicles by vehicle Model");
	        System.out.println("3 - Sort vehicles by vehicle Cost\n");
	        System.out.println("4 - List All Vehicles");
	        System.out.println("5 - List All Cars");
	        System.out.println("6 - List American Cars Only (Formal)");
	        System.out.println("7 - List Foreign Cars only (Formal)");
	        System.out.println("8 - List All Trucks");
	        System.out.println("9 - List All Bicycles");
	        System.out.print("\nSelect a Menu Option: ");
	        scr.nextLine(); // Get user input from the keyboard 
	        scr.close();

	    }while(true); 
		
	
	}
}
