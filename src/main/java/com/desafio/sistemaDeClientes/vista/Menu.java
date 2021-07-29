package com.desafio.sistemaDeClientes.vista;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.desafio.sistemaDeClientes.modelo.CategoriaEnum;
import com.desafio.sistemaDeClientes.modelo.Cliente;

public class Menu {
	// ClienteServicio cs = new ClienteServicio;
	// ArchivoServicio as = new ArchivoServicio;
	// ExportadorCsv ecsv = new ExportadorCsv;
	// ExportarTxt extxt = new ExportarTxt
	// String fileName = Clientes
	// Strign fileName1 = DBclientes.csv
	Scanner sc = new Scanner(System.in);

	public final void iniciarMenu() {

		int opcion;

		System.out.println("1. Listar Clientes\r\n" + "2. Agregar Cliente\r\n" + "3. Editar Cliente\r\n"
				+ "4. Cargar Datos\r\n" + "5. Exportar Datos\r\n" + "6. Salir\r\n" + "Ingrese una opción: ");
		
		try {
	
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:
				System.out.println("Gracias por su visita");
				
				break;
			default:
				System.out.println("Solo números entre 1 y 6");
			}
		} catch (InputMismatchException e) {
			System.out.println("Debe insertar un número");

		}
	}

	public void agregarCliente() {
		System.out.println("-------------Crear Cliente-------------");
		System.out.println("Ingresa RUN del Cliente:");
		runCliente = sc.nextLine();
		System.out.println("Ingresa Nombre del Cliente:");
		nombreCliente = sc.nextLine();
		System.out.println("Ingresa Apellido del Cliente:");
		apellidoCliente = sc.nextLine();
		System.out.println("Ingresa años como Cliente:");
		aniosCliente = sc.nextLine();
		CategoriaEnum ac = CategoriaEnum.ACTIVO;
		cliente = new Cliente(runCliente, nombreCliente, apellidoCliente, aniosCliente, ac);
	}
	
	public void listarClientes() {
		
	}
	
	public void editarCliente() {
		
	}
	
	public void importarDatos() {
		
	}
	
	public void exportarDatos() {
		
	}
	
	public void terminarPrograma() {
		
	}
}
