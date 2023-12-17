package com.educacionit;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese la temperatura: ");
		double temperatura = scanner.nextDouble();
		
		System.out.println("Ingrese el tiempo (Soleado, Lluvia, Nieve: ");
		String tiempo = scanner.next().toLowerCase();
		
		if (temperatura > 25 && tiempo.equals("soleado")) {
			System.out.println("Puede salir a caminar y tomar sol");
		}
		else if (temperatura >= 15 && tiempo.equals("soleado")) {
			System.out.println("Puede salir a caminar");
		}
		else if (temperatura <= 15 && tiempo.equals("soleado")) {
			System.out.println("Puede salir a caminar con campera");
		}
		else if (temperatura < 10 && tiempo.equals("lluvia")) {
			System.out.println("Puede quedarse en casa o salir con paraguas y campera");
		}
		else if (temperatura < 10 && tiempo.equals("nieve")) {
			System.out.println("Puede salir a esquiar");
		}
		else {
			System.out.println("No hay sugerencia definida para la situacion indicada");
		}
	}

}
