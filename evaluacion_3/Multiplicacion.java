// 1. MULTIPLICACION

import java.util.Scanner;

public class Multiplicacion {

	public static void main(String[] args) {
		Scanner e1 = new Scanner (System.in);
		Scanner e2 = new Scanner (System.in);
		Scanner e3 = new Scanner (System.in);
		Scanner e4 = new Scanner (System.in);
		int num1, num2, num3, num4, mul=0;
		System.out.print("Dime el numero 1: ");
		num1 = e1.nextInt();
		System.out.print("Dime el numero 2: ");
		num2 = e2.nextInt();
		System.out.print("Dime el numero 3: ");
		num3 = e3.nextInt();
		System.out.print("Dime el numero 4: ");
		num4 = e4.nextInt();
		if (num1==0 || num2==0 || num3==0 || num4==0) {
			System.out.println("ERROR, PRUEBA CON OTROS NUMEROS");
		}
		else {
			mul = num1*num2*num3*num4;
		}
		System.out.println("La multiplicacion es: " + mul);
	}

}
