package br.com.banco;

import javax.swing.JOptionPane;

public class Conta {
	private String numero;
	private double saldo;

	public Conta() {
		this.setNumero("111");
		this.creditar(0);
	}

	public Conta(String numero, double valor) {
		this.setNumero(numero);
		this.creditar(valor);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public String debitar(double valor) {
		if (this.getSaldo() < valor || this.getSaldo() <= 0) {
			return "Opss!!, Ocorreu um erro na transação, saldo insuficiente";
		} else {
			this.saldo -= valor;
			return "Voce sacou da sua conta " + getNumero() + " o valor de "
					+ valor;
		}
	}

	public void creditar(double valor) {
		this.saldo += valor;
	}

	public String toString() {
		return "Numero da conta: " + this.getNumero() + " \n saldo na conta "
				+ this.getSaldo();
	}

}
