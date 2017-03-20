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
		//consultaRestaurante(); //Chama Listagem de Restauratens
	}
	
	public void addRestaurante(String nome, String morada, String contacto, String especialidade)
	{
		Scanner sc = new Scanner(System.in);
	
		/*try
		{*/
			System.out.println("Introduza o nome do Restaurante: ");
			nome = sc.nextLine();
			System.out.println("Introduza a morada do Restaurante: ");
			morada = sc.nextLine();
			System.out.println("Introduza o contacto: ");
			contacto = sc.nextLine();
			System.out.println("Introduza a especialidade: ");
			especialidade = sc.nextLine();
		/*}
		finally
		{
			sc.close();
		}*/
		
		Restaurante rest = new Restaurante(nome, morada, contacto, especialidade);
		
		int novoID = arRestaurante.size();
		
		rest.setId(novoID);
		
		arRestaurante.add(rest);
	}
	
	/*public void consultaRestaurante() 			//Listagem de Restaurantes
	{
		for(int i = 0; i < arRestaurante.size(); i++)
		{
			System.out.println(arRestaurante.get(i).getId());
			System.out.println(arRestaurante.get(i).getNome());
			System.out.println(arRestaurante.get(i).getMorada());
			System.out.println(arRestaurante.get(i).getContacto());
			System.out.println(arRestaurante.get(i).getEspecialidade());
		}
	}*/
}
