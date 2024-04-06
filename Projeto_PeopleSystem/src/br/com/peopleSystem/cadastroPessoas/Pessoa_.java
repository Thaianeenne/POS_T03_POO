package br.com.peopleSystem.cadastroPessoas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import br.com.peopleSystem.composicao.Endereco_;
import br.com.peopleSystem.composicao.TelContato_;

public class Pessoa_ {

	private String nome;
	private Endereco_ endereco;
	private TelContato_ contato;
	private LocalDate dataNascimento;

	Scanner scr = new Scanner(System.in);

	public Pessoa_() {

	}

	public void add(String nome, int dataNascimento, String endereco, int contato) {
		System.out.print("Digite o nome da pessoa: ");
		this.nome = scr.nextLine();
		System.out.print("Digite o nome da Rua: ");
		this.endereco = scr.nextLine();
		System.out.print("Digite a Data de Nascimento: ");
		this.nome = scr.nextLine();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getContato() {
		return contato;
	}

	public void setContato(int celContato) {
		this.contato = celContato;
	}

	public void cadastrar() {
		this.nome = scr.nextLine();
		scr.close();
	}

	public int obterIdade() {
		int idade = 0;
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(this.dataNascimento, dataAtual);
		idade = periodo.getYears();
		return idade;
	}

	public Pessoa_(String nome, Endereco_ endereco, TelContato_ contato, LocalDate dataNascimento, Scanner scr) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.contato = contato;
		this.dataNascimento = dataNascimento;
		this.scr = scr;
	}

}
