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
	}
	
	public void addCliente(String nome, String morada, String email, String telefone)
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Introduza o nome do cliente: ");
			nome = sc.nextLine();
			System.out.println("Introduza a morada: ");
			morada = sc.nextLine();
			System.out.println("Introduza o email: ");
			email = sc.nextLine();
			System.out.println("Introduza o numero de telefone: ");
			telefone = sc.nextLine();
		}
		finally
		{
			sc.close();
		}
		
		Cliente cli = new Cliente(nome, morada, email, telefone);
		
		int novoID = arCliente.size();
		
		cli.setId(novoID);
		
		arCliente.add(cli);		
	}
	
	

}
