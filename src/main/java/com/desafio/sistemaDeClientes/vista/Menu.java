package com.desafio.sistemaDeClientes.vista;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.desafio.sistemaDeClientes.modelo.CategoriaEnum;
import com.desafio.sistemaDeClientes.modelo.Cliente;
import com.desafio.sistemaDeClientes.servicio.ClienteServicio;

public class Menu extends MenuTemplate{
	ClienteServicio cs = new ClienteServicio();
	// ArchivoServicio as = new ArchivoServicio;
	// ExportadorCsv ecsv = new ExportadorCsv;
	// ExportarTxt extxt = new ExportarTxt
	
	/*private Util util;
	private ClienteServicio clienteServicio;
	private ArchivoServicio archivoServicio;
	private ExportadorCsv exportadorCsv;
	private ExportarTxt exportarTxt;
	// String fileName = Clientes
	// Strign fileName1 = DBclientes.csv*/
	
	@Override
	public void listarClientes() {
		cs.listarClientes();
		
	}

	@Override
	public void agregarCliente() {
 		//Cliente cliente;
		System.out.println("-------------Crear Cliente-------------");
		System.out.println("Ingresa RUN del Cliente: ");
		String runCliente = sc.nextLine();
		System.out.println("Ingresa Nombre del Cliente:");
		String nombreCliente = sc.nextLine();
		System.out.println("Ingresa Apellido del Cliente:");
		String apellidoCliente = sc.nextLine();
		System.out.println("Ingresa años como Cliente:");
		String aniosCliente = sc.nextLine();
		Cliente cliente = new Cliente(runCliente, nombreCliente, apellidoCliente, aniosCliente, CategoriaEnum.ACTIVO);

		cs.agregarCliente(cliente); 	
		
	}

	@Override
	public void editarCliente() {
		System.out.println();
		
	}

	@Override
	public void importarDatos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exportarDatos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void terminarPrograma() {
		// TODO Auto-generated method stub
		
	}



	

}
