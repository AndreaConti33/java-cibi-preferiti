package org.generation.italy.array;

public class CibiPreferiti {
	
	public static void main(String[] args) {
		
		//Array
		String[] cibiPreferiti = {"Pizza", "Pasta", "Funghi", "Tacos", "Mele", "Ribes", "Gelato"};
		
		//Conta degli elementi nell'Array
		int totaleCibi = cibiPreferiti.length;
		
		//Stampa a schermo
		
		//Totale cibi in classifica
		System.out.println("Totale dei miei cibi preferiti in classifica: " + totaleCibi);
		
		int mediana;
		
		if(totaleCibi % 2 == 0) {
			mediana = totaleCibi / 2;
		} else {
			mediana = (totaleCibi +1) /2;
		}
		
		//Primo cibo
				System.out.println("Primo cibo  preferito: " + cibiPreferiti [0]);
				//Cibo di mezzo
				System.out.println("Cibo di mezzo preferit: " + cibiPreferiti [mediana -1]);
				//Ultimo cibo
				System.out.println("Ultimo cibo  preferito: " + cibiPreferiti[cibiPreferiti.length -1]);
		
	}

}