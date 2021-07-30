package com.desafio.sistemaDeClientes.vista;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.desafio.sistemaDeClientes.utilidades.Util;

public abstract class MenuTemplate {

	protected Scanner sc = new Scanner(System.in);
	
	public abstract void listarClientes();
	
	public abstract void agregarCliente();
	
	public abstract void editarCliente();
	
	public abstract void importarDatos();
	
	public abstract void exportarDatos();
	
	public abstract void terminarPrograma();
	
	public final void iniciarMenu() {
		System.out.println("1. Listar Clientes\r\n" + "2. Agregar Cliente\r\n" + "3. Editar Cliente\r\n"
				+ "4. Cargar Datos\r\n" + "5. Exportar Datos\r\n" + "6. Salir\r\n" + "Ingrese una opción: ");
		int opcion;
		try {
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1:
				listarClientes();
				break;
			case 2:
				agregarCliente();
				break;
			case 3:
				editarCliente();
				break;
			case 4:
				importarDatos();
				break;
			case 5:
				exportarDatos();
				break;
			case 6:
				terminarPrograma();
				System.out.println("Gracias por su visita");
				break;
			default:
				System.out.println("Solo números entre 1 y 6");
			}
		} catch (InputMismatchException e) {
			System.out.println("Debe insertar un número");
		}
			Util.limpiarPantalla();
			iniciarMenu();
	}
}
