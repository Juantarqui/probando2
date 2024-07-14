package lunes;

import java.util.Scanner;

public class LunesEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A;
		System.out.println("ingrese numero X: ");
		float X = new Scanner(System.in).nextFloat();
		System.out.println("ingrese numero Y: ");
		float Y = new Scanner(System.in).nextFloat();
		if(Y != 0) {
			A = Math.pow(X, 2)/Y + (2* 3.14);
			System.out.println("el resultado es: "+A);
		}else {
			System.out.println("error");
		}
	}

}
