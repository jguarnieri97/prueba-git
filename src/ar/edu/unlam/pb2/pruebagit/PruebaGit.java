package ar.edu.unlam.pb2.pruebagit;

import ar.edu.unlam.pb2.pruebagit.calculador.Calculador;

public class PruebaGit {
	
	

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Calculador calculador = new Calculador(10, 15);
		
		System.out.println("El resultado es: " + calculador.getResult());
	}

}
