package br.com.banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class Banco {
	public Map<Conta, Cliente> cadastro;

	public Banco() {
		cadastro = new HashMap<Conta, Cliente>();
	}

	public void inserir(Conta conta, Cliente cliente){
		cadastro.put(conta, cliente);
	}
	
	public Conta buscarConta(String numero){
		Iterator<Conta> contas = cadastro.keySet().iterator();
		
		while(contas.hasNext()){
			Conta conta = contas.next();
			
			if(numero.equalsIgnoreCase(conta.getNumero()))
				return conta;		
		}
			
		return null;
	}
	
	public Cliente buscarCliente(String cpf){
		Iterator<Cliente> clientes = cadastro.values().iterator();
		
		while(clientes.hasNext()){
			Cliente cliente = clientes.next();
			
			if(cpf.equalsIgnoreCase(cliente.getCpf()))
				return cliente;
		}
		
		return null;
	}
	
	public List<Conta> buscaContasDeUmCliente(String cpf){
		
		Iterator<Entry<Conta, Cliente>> contasDoCliente = cadastro.entrySet().iterator();
		List<Conta> contaDoCli = new ArrayList<Conta>();
		Entry<Conta, Cliente> entry;
		
		while(contasDoCliente.hasNext()){
			
		    entry = contasDoCliente.next();
			Cliente cli = entry.getValue();
			Conta cont = entry.getKey();
			
			if (cpf.equalsIgnoreCase(cli.getCpf())) {
				System.out.println("Tem");
		
				contaDoCli.add(cont);
				return contaDoCli;
			} else {
				System.out.println("Não tem");
				return null;
			}
			
		}
		
		return null;
	}
}
