package br.com.peopleSystem.cadastroPessoas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import br.com.peopleSystem.cadastroPessoas_Estrutura_de_dados.*;
import br.com.peopleSystem.composicao.*;

public class Pessoa_ {

	private String nome;
	private Endereco_ endereco;
	private ListaDeTelefoneNaoOrdenado contato;
	private LocalDate dataNascimento;

	Scanner scr = new Scanner(System.in);
	
	ListaDeTelefoneNaoOrdenado contatos = new ListaDeTelefoneNaoOrdenado();
	TelContato_ contato1 = new TelContato_();
	Endereco_ endereco1 = new Endereco_();
	public Pessoa_() {
	
	}
	

	public void add() {
		
		System.out.println("Digite o NOME da Pessoa: ");
		this.nome = scr.nextLine();
		
		endereco1.addEndereco();
		contato1.addContato();
		contatos.addTelContato_(contato1);
	


	}

	

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco_ getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco_ endereco) {
		this.endereco = endereco;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public  ListaDeTelefoneNaoOrdenado getContato() {
		return contato;
	}

	public void setContato(ListaDeTelefoneNaoOrdenado celContato) {
		this.contato = celContato;
	}

	public void cadastrar() {
		this.nome = scr.nextLine();

	}

	public int obterIdade() {
		int idade = 0;
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(this.dataNascimento, dataAtual);
		idade = periodo.getYears();
		return idade;
	}

	// public Pessoa_(String nome, Endereco_ endereco, TelContato_ contato,
	// LocalDate dataNascimento, Scanner scr) {
	// super();
	// this.nome = nome;
	// this.endereco = endereco;
	// this.contato = contato;
	// this.dataNascimento = dataNascimento;
	// this.scr = scr;
}
