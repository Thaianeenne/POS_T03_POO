package br.com.peopleSystem.cadastroPessoas_Estrutura_de_dados;

import br.com.peopleSystem.composicao.*;

public class ListaDeTelefoneNaoOrdenado {
	// vetor de telefones
	private TelContato_[] telefones;

	// controle do tamanho
	private int tamanho;

	// capacidade inicial (pode ser alterado depois)
	private static final int CAPACIDADE_PADRAO = 3;

	// LISTAA
	// COnstrutor da LISTA = criar objetos passando insriçoes

	public ListaDeTelefoneNaoOrdenado() {
		this.telefones = new TelContato_[CAPACIDADE_PADRAO];
		this.tamanho = 0;
	}

//	public ListaDeTelefoneNaoOrdenado(TelContato_[] lisTels) {
//		this.telefones = lisTels;
//		this.tamanho = lisTels.length;
//
//	}

	public boolean isEmpty() {
		return this.tamanho == 0;
	}

	// Add tell com restrição de capacidade
	public void addTelContato_(TelContato_ tel) {

		// length ele pega a capacidade atual em tempo de execução
		// Caso CAPACIDADE_PADRAO for alterada

		if (tamanho < CAPACIDADE_PADRAO) {
			// já que o tamanho é "index + 1"
			// podemos utilizar o tamanho para add ao index vazio

			telefones[tamanho] = tel;
			this.tamanho = tamanho + 1;
			// mudar a capacidade -> no futuro
		} else {
			System.out.println("Não há mais espaço");
		}

	}

	private int buscarTelefoneIndex(TelContato_ tele) {
		for (int i = 0; i < tamanho; i++) {

			// validar ser os telefones são iguais
			if (telefones[i].equals(tele)) {
				return i;
			}
		}
		System.out.println("Telefone não encontrado!");
		return -1;
	}

	public void removerTelefones(TelContato_ telef) {
		// pegar o index do telefone na lista que quero remover a informação

		int index = buscarTelefoneIndex(telef);
		if (index != -1) {
			for (int i = index; i < tamanho - 1; i++) {
				telefones[i] = telefones[i + 1];

			}
		}

	}

	public void exibirTelefones() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Telefones da lista: " + telefones[i]);
		}
	}

}
