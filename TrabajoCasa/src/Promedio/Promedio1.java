package Promedio;

import java.util.Scanner;

public class Promedio1 {
	private String promedio;
	public static void main(String[] args) {
		System.out.println(" Ingrese un valor 1");
		 Scanner ingreso = new Scanner(System.in);
		 int valor1 = ingreso.nextInt();
		 System.out.println(" Ingrese un valor 2");
		 int valor2 = ingreso.nextInt();
		 System.out.println(" Ingrese un valor 3");
		 int valor3 = ingreso.nextInt();
		 int promedio = (valor1+valor2+valor3)/3;
		 
		 System.out.println("promedio es: "+promedio);
		  
	}

}
