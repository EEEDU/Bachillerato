// 6. Operacion

import java.util.Scanner;

public class Operacion {

	public static void main(String[] args) {
		int num1, num2;
		char let;
		Scanner ent1 = new Scanner (System.in);
		System.out.print("Dime el primero numero: ");
		num1 = ent1.nextInt();
		Scanner ent2 = new Scanner (System.in);
		System.out.print("Dime el segundo numero: ");
		num2 = ent2.nextInt();
		Scanner ent3 = new Scanner (System.in);
		System.out.print("Que quieres hacer? (S/R/M/D)");
		let = (char) ent3.nextInt();
		if(let == 'S' || let == 's') {
			System.out.print(num1+num2);
		}
		if(let == 'R' || let == 'r') {
			System.out.print(num1-num2);
		}
		if(let == 'M' || let == 'm') {
			System.out.print(num1*num2);
		}
		if(let == 'D' || let == 'd') {
			System.out.print(num1/num2);
		}
	}
}