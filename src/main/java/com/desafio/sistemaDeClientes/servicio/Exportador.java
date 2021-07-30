package com.desafio.sistemaDeClientes.servicio;

import java.util.List;

import com.desafio.sistemaDeClientes.modelo.Cliente;

public abstract class Exportador {

	public abstract void exportar(String fileName, List<Cliente>listaClientes);
}
