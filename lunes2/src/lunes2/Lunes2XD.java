package lunes2;

import java.util.Scanner;

public class Lunes2XD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ingrese numero uno: ");
		int a = new Scanner(System.in).nextInt();
		System.out.print("ingrese numero dos: ");
		int b = new Scanner(System.in).nextInt();
		System.out.print("ingrese numero tres: ");
		int c = new Scanner(System.in).nextInt();
		double x = Math.pow(b, 2)-(4*a*c);
		if (a != 0) {
			double x1 = (-b + Math.sqrt(x))/(2*a);
			double x2 = (-b - Math.sqrt(x))/(2*a);
			System.out.println("el resultado de x1 es: "+x1);
			System.out.println("el resultado de x2 es: "+x2);
		}else {
			System.out.println("la regla no se cumple");
		}
	}

}
