// 5. Fecha

import java.util.Scanner;

public class Fecha {

	public static void main(String[] args) {
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septimbre", "Octubre", "Noviembre", "Diciembre"};
		int ndia, nmes, naño;
		Scanner ent1 = new Scanner (System.in);
		System.out.print("Dime el numero del dia: ");
		ndia = ent1.nextInt();
		Scanner ent2 = new Scanner (System.in);
		System.out.print("Dime el numero del mes: ");
		nmes = ent2.nextInt();
		Scanner ent3 = new Scanner (System.in);
		System.out.print("Dime el numero del año: ");
		naño = ent3.nextInt();
		System.out.print(ndia + " de " + meses[nmes-1] + " de " + naño);
	}

}
