package ejerciciofiguras;

import java.util.Scanner;

public class Principal {
// como nos dice el enunciado del ejercicio realizamos dentro del metodo principal que nos imprima los siguientes apartados para introducir los datos
	public static void main(String[] args) {
		System.out.println("FIGURAS PLANAS");
		System.out.println("-------------");
		System.out.println("1. Crear un triangulo");
		System.out.println("2. crear un rectangulo");
	
		// hacemos llamamiento al metodo scanner para poder obtener una variable con el tipo resultado
		Scanner scanner = new Scanner (System.in);
		int resultado = scanner.nextInt();
		
		// realizamos mediante un switch el siguiente proceso para ver si con los datos a introducir (alto,ancho,perimetro,area) obtenemos un rectangulo o triangulo, y que el resultado de este nos diga si es verdadero o falso.
		switch (resultado) {
		case 1: {
			Triangulo miTriangulo = new Triangulo();
			miTriangulo.dime_caracteristicas();
			break;
		}
		case 2: {
			Rectangulo miRectangulo = new Rectangulo();
			System.out.println("Introducir alto:");
			miRectangulo.setAlto(scanner.nextDouble());
			System.out.println("Introducir ancho:");
			miRectangulo.setAncho(scanner.nextDouble());
			System.out.println("Perimetro: " + miRectangulo.getPerimetro());
			System.out.println("Area: " + miRectangulo.getArea());
			System.out.println("El rectangulo es un cuadado: " + miRectangulo.comprobarCuadrado());
			break;
		}
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + resultado);
		}
		
	}
	
	

  
}
