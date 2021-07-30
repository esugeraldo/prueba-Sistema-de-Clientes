package com.desafio.sistemaDeClientes.servicio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.desafio.sistemaDeClientes.modelo.Cliente;

public class ExportadorTxt extends Exportador{

	@Override
	public void exportar(String fileName, List<Cliente> listaClientes) {
		try {
			FileWriter fr = new FileWriter(fileName + "/" + "Clientes.txt");
			BufferedWriter bw = new BufferedWriter(fr);
			for(Cliente cliente : listaClientes) {
				bw.write(cliente.getRunCliente() + "," 
						+ cliente.getNombreCliente() + "," 
						+ cliente.getApellidoCliente() + "," 
						+ cliente.getAniosCliente() + ","
						+ cliente.getNombreCategoria());
				bw.newLine();
			}
			bw.close();
		} catch (Exception e) {
		
		}
	}
}
