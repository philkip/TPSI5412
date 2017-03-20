package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;

public class gereCliente 
{
	ArrayList<Cliente> arCliente;

	public gereCliente() 
	{
		arCliente = new ArrayList<>();
		
		addCliente(null, null, null, null);
		//consultaCliente(); //Chama Listagem de Clientes
	}
	
	public void addCliente(String nome, String morada, String email, String telefone)
	{
		Scanner sc = new Scanner(System.in);
		
		/*try
		{*/
			System.out.println("Introduza o nome do cliente: ");
			nome = sc.nextLine();
			System.out.println("Introduza a morada: ");
			morada = sc.nextLine();
			System.out.println("Introduza o email: ");
			email = sc.nextLine();
			System.out.println("Introduza o numero de telefone: ");
			telefone = sc.nextLine();
		/*}
		finally
		{
			sc.close();
		}*/
		
		Cliente cli = new Cliente(nome, morada, email, telefone);
		
		int novoID = arCliente.size();
		
		cli.setId(novoID);
		
		arCliente.add(cli);		
	}
	
	/*public void consultaCliente()			//Listagem de Clientes
	{
		for(int i = 0; i < arCliente.size(); i++)
		{
			System.out.println(arCliente.get(i).getId());
			System.out.println(arCliente.get(i).getNome());
			System.out.println(arCliente.get(i).getMorada());
			System.out.println(arCliente.get(i).getEmail());
			System.out.println(arCliente.get(i).getTelefone());
		}
	}*/
}
