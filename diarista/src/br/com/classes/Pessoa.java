package br.com.classes;

import interfaces.Isaldo;

// cliando super classe Pessoa para as classes filhos que terao as mesmas 
// primeiro exemplo de calsse abstract, nunca chamada diretamente no cod princial
public abstract class Pessoa implements Isaldo{
	protected String nome;
	protected String telefone;
	protected String endereco;
	protected double saldo=0;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	//
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	//
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	} 
}
