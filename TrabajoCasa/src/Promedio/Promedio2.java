package Promedio;

import java.util.Scanner;

public class Promedio2 {
	public static void main(String[] args) {
		float acum = 1;
		float notas = 0;
		Scanner r = new Scanner(System.in);
		System.out.println(" Ingrese la cantidad de notas a promediar");
		float cantidadnotas = r.nextFloat();

		while (acum < cantidadnotas) {
			System.out.println(" Ingrese numero: " + acum);
			float n = r.nextFloat();
			notas += n;
			acum++;
		}
		float promedio = notas / cantidadnotas;
		System.out.println("El promedio es: " + promedio);

	}

}
