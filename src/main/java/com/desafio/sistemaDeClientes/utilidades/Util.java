package com.desafio.sistemaDeClientes.utilidades;

public class Util {

	public static void limpiarPantalla() {
		for(int i=0; i<20; i++) {
			System.out.println("");
		}
	}
	
	public void printLine(String mensaje) {
		System.out.println(mensaje);
	}
}
