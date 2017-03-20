package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Restaurante;

public class gereRestaurante 
{	
	ArrayList<Restaurante> arRestaurante;

	public gereRestaurante() 
	{
		arRestaurante = new ArrayList<>();
		
		addRestaurante(null, null, null, null);
	}
	
	public void addRestaurante(String nome, String morada, String contacto, String especialidade)
	{
		Scanner sc = new Scanner(System.in);
	
		try
		{
			System.out.println("Introduza o nome do Restaurante: ");
			nome = sc.nextLine();
			System.out.println("Introduza a morada do Restaurante: ");
			morada = sc.nextLine();
			System.out.println("Introduza o contacto: ");
			contacto = sc.nextLine();
			System.out.println("Introduza a especialidade: ");
			especialidade = sc.nextLine();
		}
		finally
		{
			sc.close();
		}
		
		Restaurante rest = new Restaurante(nome, morada, contacto, especialidade);
		
		int novoID = arRestaurante.size();
		
		rest.setId(novoID);
		
		arRestaurante.add(rest);
	}
	
	
}
