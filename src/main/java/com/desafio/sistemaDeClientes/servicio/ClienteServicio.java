package com.desafio.sistemaDeClientes.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.desafio.sistemaDeClientes.modelo.CategoriaEnum;
import com.desafio.sistemaDeClientes.modelo.Cliente;

public class ClienteServicio {
	Scanner sc = new Scanner(System.in);
	private List<Cliente> listaClientes;
	
	public ClienteServicio() {
		this.listaClientes = new ArrayList<Cliente>();
	}
	
	//constructor
	public ClienteServicio(List<Cliente> listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}
	
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
	
	
	public void buscarClientes(String run) {
		listaClientes.stream().filter(cliente -> cliente.getRunCliente().equals(run));
	}
	
	public void editarCliente(Cliente cliente) {
		System.out.println("-------------Editar Cliente-------------");
		System.out.println("Seleccione qué desea hacer: ");
		System.out.println("1.-Cambiar el estado del Cliente");
		System.out.println("2.-Editar los datos ingresados del Cliente");
		System.out.println("");
		System.out.println("Ingrese opcion: ");
		System.out.println("----------------------------------------");
		String numero = sc.nextLine();
		
		switch(numero) {
		case "1":
			System.out.println("-----Actualizando estado del Cliente----");
			System.out.println("El estado actual es: " + cliente.getNombreCategoria());
			System.out.println("1.-Si desea cambiar el estado del Cliente a Inactivo");
			System.out.println("2.-Si desea mantener el estado del cliente Activo\n");
			System.out.println("Ingrese opcion: ");
			System.out.println("----------------------------------------");
			
			String seleccion = sc.nextLine();
			switch(seleccion) {
			case"1":
				cliente.setNombreCategoria(CategoriaEnum.INACTIVO);
				System.out.println("El estado del cliente a cambiado a Inactivo");
				break;
			case"2":
				cliente.setNombreCategoria(CategoriaEnum.ACTIVO);
				System.out.println("El estado del cliente a cambiado a Activo");
				break;
			default:
				System.out.println("Opcion no valida");
			}
			break;
		case"2":
		System.out.println("----Actualizando datos del Cliente-----\n");
		System.out.println("1.-El RUN del Cliente es: " + cliente.getRunCliente());
		System.out.println("2.-El Nombre del Cliente es: " + cliente.getNombreCliente());
		System.out.println("3.-El Apellido del Cliente es: " + cliente.getApellidoCliente());
		System.out.println("4.-Los años como Cliente son: " + cliente.getAniosCliente());
		System.out.println("");
		System.out.println("Ingrese opcion a editar de los datos del cliente: ");

		seleccion=sc.nextLine();
			switch(seleccion) {
			case"1":
				System.out.println("1.-Ingrese nuevo RUN del Cliente:");
				cliente.setRunCliente(sc.nextLine());
				System.out.println("----------------------------------------");
				System.out.println("Datos cambiados con éxito");
				break;
			case"2":
				System.out.println("1.-Ingrese nuevo Nombre del Cliente:");
				cliente.setNombreCliente(sc.nextLine());
				System.out.println("----------------------------------------");
				System.out.println("Datos cambiados con éxito");
				break;
			case"3":
				System.out.println("1.-Ingrese nuevo Apellido del Cliente:");
				cliente.setApellidoCliente(sc.nextLine());
				System.out.println("----------------------------------------");
				System.out.println("Datos cambiados con éxito");
				break;
			case"4":
				System.out.println("1.-Ingrese los nuevo años como Cliente:");
				cliente.setAniosCliente(sc.nextLine());
				System.out.println("----------------------------------------");
				System.out.println("Datos cambiados con éxito");
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}
		}
	}


}
