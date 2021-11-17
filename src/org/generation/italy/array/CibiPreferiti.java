package org.generation.italy.array;

public class CibiPreferiti {
	
	public static void main(String[] args) {
		
		//Array
		String[] cibiPreferiti = {"Pizza", "Pasta", "Funghi", "Mele", "Ribes", "Gelato"};
		
		//Conta degli elemente nell'Array
		int totaleCibi = cibiPreferiti.length;
		
		//Stampa a schermo
		System.out.println("Totale dei miei cibi preferiti in classifica: " + totaleCibi);
		System.out.println("Primo cibo  preferito: " + cibiPreferiti [0]);
		System.out.println("Terzo cibo  preferito: " + cibiPreferiti [2]);
		System.out.println("Sesto cibo  preferito: " + cibiPreferiti [5]);
		
	}

}
