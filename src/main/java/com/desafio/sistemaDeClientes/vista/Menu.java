package com.desafio.sistemaDeClientes.vista;

import com.desafio.sistemaDeClientes.modelo.CategoriaEnum;
import com.desafio.sistemaDeClientes.modelo.Cliente;
import com.desafio.sistemaDeClientes.servicio.ClienteServicio;
import com.desafio.sistemaDeClientes.servicio.ExportadorCsv;
import com.desafio.sistemaDeClientes.servicio.ExportadorTxt;
import com.desafio.sistemaDeClientes.utilidades.Util;

public class Menu extends MenuTemplate{
	private ClienteServicio cs = new ClienteServicio();
	// private ArchivoServicio as = new ArchivoServicio;
	private ExportadorCsv ecsv = new ExportadorCsv();
	private ExportadorTxt etxt = new ExportadorTxt();
	String fileName = "Clientes";
	String fileName1 = "DBclientes.csv";
	
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
		System.out.println("-------------Editar Cliente-------------");
		System.out.println("Ingrese RUN del Cliente a editar o cambiar de estado:");
		String run = sc.nextLine();
		for (Cliente cliente : cs.getListaClientes()) {
			if (cliente.getRunCliente().equals(run)) {
				cs.editarCliente(cliente);

			}else {
				System.out.println("El cliente no existe");
			}
		}
	}

	@Override
	public void importarDatos() {
		
		
	}

	@Override
	public void exportarDatos() {
		System.out.println("---------Exportar Datos-----------");
		System.out.println("Seleccione el formato a exportar:");
		System.out.println("1.-Formato csv");
		System.out.println("2.-Formato txt\n");
		System.out.println("Ingrese una opción para exportar:");
		System.out.println("----------------------------------");
		String eleccion = sc.nextLine();
		
		switch(eleccion) {
		case"1":
			System.out.println("---------Exportar Datos en Windows---------------");
			System.out.println("Ingresa la ruta en donde desea exportar el archivo clientes.csv:");
			String ruta = sc.nextLine();
			ecsv.exportar(ruta, cs.getListaClientes());
			System.out.println("-----------------------------------------------");
			System.out.println("Datos de clientes exportados correctamente en formato csv.");
			break;
		case"2":
			System.out.println("---------Exportar Datos en Windows---------------");
			System.out.println("Ingresa la ruta en donde desea exportar el archivo clientes.txt:");
			ruta = sc.nextLine();
			etxt.exportar(ruta, cs.getListaClientes());
			System.out.println("-----------------------------------------------");
			System.out.println("Datos de clientes exportados correctamente en formato txt.");
			break;
		default:
			System.out.println("la opcion no es valida");
			break;
		}
	}

	@Override
	public void terminarPrograma() {
		Util.limpiarPantalla();
		System.out.println("Saliendo del sistema, hasta pronto");
		System.exit(0);
	}



	

}
