package br.com.banco;

import java.util.List;

import javax.swing.JOptionPane;

public class TestaBanco {


	public static void main(String args[]) {
		String nome[] = { "Alyson Rodrigo", "Evethon Pedro", "Maria Lucia" };
		String cpf[] = { "086703134-48", "086705134-12", "086705134-13" };
		Cliente clientes = null;
		Conta contas = null;
		Banco banco = new Banco();

		String numeroConta[] = { "1111-1", "2222-2", "3333-3", "4444-4",
				"5555-5" };
		double valores[] = {100.0, 200.0, 300.0, 400.0, 500.0};

		for (int i = 0; i <= 2; i++) {
			clientes = new Cliente(cpf[i], nome[i]);
			contas = new Conta(numeroConta[i], valores[i]);
			// System.out.println("Inserindo os valores");
			banco.inserir(contas, clientes);
			// System.out.println("Inseriu os valores");
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Operação nas contas");
		System.out.println("Buscando Conta");
		Conta b = banco.buscarConta("4444-4");

		System.out.println(b.toString());

		b.debitar(300);
		System.out.println("Seu novo saldo da conta " + b.getNumero()
				+ " contem no caixa " + b.getSaldo());

		System.out.println("Fim da operação nas contas");

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Operação nos clientes");
		System.out.println("Buscando Clientes");
		Cliente c = banco.buscarCliente("086705134-12");
		
		System.out.println("Valor do objeto Cliente "+c);

		if (c != null) {
			System.out.println(c.toString());
		} else
			JOptionPane.showMessageDialog(null,
					"Nao encontramos nenhum usuario com o CPF informado", null,
					JOptionPane.ERROR_MESSAGE);

		System.out.println("Fim da operação nos clientes");

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Operação de busca de contas de usuario");

		List<Conta> cont = banco.buscaContasDeUmCliente("086705134-12");

		if (cont != null) {
			if (!cont.isEmpty()) {
				for (Conta a : cont) {
					System.out.println("As contas do usuario são "
							+ a.toString());
				}
			}
		} else
			System.out.println("Nao existe nenhum usuario com essa conta");

	}
}
