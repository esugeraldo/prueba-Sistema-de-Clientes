package com.desafio.sistemaDeClientes;

import static org.junit.Assert.assertEquals;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.desafio.sistemaDeClientes.modelo.CategoriaEnum;
import com.desafio.sistemaDeClientes.modelo.Cliente;
import com.desafio.sistemaDeClientes.servicio.ClienteServicio;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClienteServicioTest {
    
	ClienteServicio cs = new ClienteServicio();
	
  @Test
  public void aagregarClienteTest() {
	  Cliente cliente = new Cliente("15.015.025-8", "Pedro", "gonzalez", "5", CategoriaEnum.ACTIVO);
	  cs.agregarCliente(cliente);
    assertEquals("15.015.025-8", cs.getListaClientes().get(0).getRunCliente());
  }
  
  @Test
  public void bagregarClienteNullTest() {
	  Cliente clienteNull = new Cliente(null,null,null,null,null);
	  cs.agregarCliente(clienteNull);
	  assertEquals(null, cs.getListaClientes().get(0).getRunCliente());
  }
  
  
  
}
