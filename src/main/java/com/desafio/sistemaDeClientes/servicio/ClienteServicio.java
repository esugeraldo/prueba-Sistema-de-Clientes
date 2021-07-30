package com.desafio.sistemaDeClientes.servicio;

import java.util.ArrayList;
import java.util.List;
import com.desafio.sistemaDeClientes.modelo.Cliente;

public class ClienteServicio {

	private List<Cliente> listaClientes;
	
	public ClienteServicio() {
		this.listaClientes = new ArrayList<Cliente>();
	}
	
	//constructor
	/*public ClienteServicio(List<Cliente> listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}*/
	
	//getter and setter
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}
	
	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	@Override
	public String toString() {
		return "ClienteServicio [listaClientes=" + listaClientes + "]";
	}
	
	
	public void listarClientes() {
		for(Cliente cliente : listaClientes) {
			System.out.println("-------------Datos del Cliente-------------");
			System.out.println("");
			System.out.println(cliente.toString());
			System.out.println("");
			System.out.println("---------------------------------------");
	
		}
		
	}
	
	public void agregarCliente(Cliente cliente) {
		if(cliente != null) {
			listaClientes.add(cliente);
		}
	}
	
	public void editarCliente(int numero, String dato) {
		
		System.out.println("-------------Editar Cliente-------------"
				+ "Seleccione qué desea hacer:\r\n"
				+ "1.-Cambiar el estado del Cliente\r\n"
				+ "2.-Editar los datos ingresados del Cliente\r\n");
		switch(numero) {
		case 1:
			//buscarCliente(dato).setRunCliente(dato);
		}
	}


}
