package com.desafio.sistemaDeClientes.servicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.desafio.sistemaDeClientes.modelo.CategoriaEnum;
import com.desafio.sistemaDeClientes.modelo.Cliente;

public class ArchivoServicio extends Exportador {

	@Override
	public void exportar(String fileName, List<Cliente> listaClientes) {
	
		
	}

	public void cargarDatos(String fileName1, List<Cliente> listaClientes) {
		try {
			FileReader fr = new FileReader(fileName1 + "/" +"DBClientes.csv");
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while(linea != null) {
				String[] lineaArreglo = linea.split(",");
				if(lineaArreglo[4].equals("ACTIVO")) {
					Cliente cliente = new Cliente(lineaArreglo[0], lineaArreglo[1], lineaArreglo[2], lineaArreglo[3], CategoriaEnum.ACTIVO);
					listaClientes.add(cliente);
				}else {
					Cliente cliente = new Cliente(lineaArreglo[0], lineaArreglo[1], lineaArreglo[2], lineaArreglo[3], CategoriaEnum.INACTIVO);
					listaClientes.add(cliente);
				}
				linea = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
