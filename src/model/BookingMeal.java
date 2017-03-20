package model;

import java.util.ArrayList;

public class BookingMeal
{
	ArrayList<Restaurante> restaurante;
	ArrayList<Cliente> clientes;
	
	
	public BookingMeal(ArrayList<Restaurante> restaurante, ArrayList<Cliente> clientes) 
	{
		super();
		this.restaurante = restaurante;
		this.clientes = clientes;
	}
	
	public ArrayList<Restaurante> getRestaurante() 
	{
		return restaurante;
	}
	public void setRestaurante(ArrayList<Restaurante> restaurante) 
	{
		this.restaurante = restaurante;
	}
	public ArrayList<Cliente> getClientes() 
	{
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) 
	{
		this.clientes = clientes;
	}
	
	
}
