package controller;

import java.util.ArrayList;

import model.BookingMeal;
import model.Cliente;
import model.Restaurante;
import controller.gereCliente;
import controller.gereRestaurante;

public class gereBookingMeal 
{
	ArrayList<BookingMeal> arReserva;
	gereCliente c = new gereCliente();
	gereRestaurante r = new gereRestaurante();
	
	public gereBookingMeal()
	{
		arReserva = new ArrayList<>();
		
		addReserva(null, null);
		consultaReserva();
	}
	
	public void addReserva(ArrayList<Restaurante> restaurante, ArrayList<Cliente> clientes)
	{
		BookingMeal reserva = new BookingMeal(r.arRestaurante, c.arCliente);
		
		int novoID = arReserva.size();
		
		reserva.setId(novoID);
		
		arReserva.add(reserva);
	}
	
	public void consultaReserva()
	{
		for(int i = 0; i < arReserva.size(); i++)
		{
			System.out.printf("ID de reserva: %d\n", arReserva.get(i).getId() + 1);
			System.out.println("Dados do cliente: ");
			System.out.println(arReserva.get(i).getClientes().get(i).getNome());
			System.out.println(arReserva.get(i).getClientes().get(i).getMorada());
			System.out.println(arReserva.get(i).getClientes().get(i).getEmail());
			System.out.println(arReserva.get(i).getClientes().get(i).getTelefone());
			System.out.println("Dados do restaurante: ");
			System.out.println(arReserva.get(i).getRestaurante().get(i).getNome());
			System.out.println(arReserva.get(i).getRestaurante().get(i).getMorada());
			System.out.println(arReserva.get(i).getRestaurante().get(i).getContacto());
			System.out.println(arReserva.get(i).getRestaurante().get(i).getEspecialidade());
		}
	}
}
