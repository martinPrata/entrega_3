package com.educacionit;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, contrasena, usuarioPorTeclado, contrasenaPorTeclado;
        
        usuario = "usuario";
        contrasena = "contrasena";
        
        System.out.println("Ingrese su usuario: ");
        usuarioPorTeclado = scanner.next();
        System.out.println("Usuario ingresado\nIngrese su contrasena: ");
        contrasenaPorTeclado = scanner.next();
        if (usuarioPorTeclado.equals(usuario) && contrasenaPorTeclado.equals(contrasena)) {
        	System.out.println("Bienvenido al sistema");
        }
        else {
        	System.out.println("Credenciales incorrectas");
        }
        
        
	}

}
