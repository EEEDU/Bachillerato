// 4. Mes del año

import java.util.Scanner;

public class MesDelAño {

	public static void main(String[] args) {
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septimbre", "Octubre", "Noviembre", "Diciembre"};
		int num;
		Scanner ent = new Scanner (System.in);
		System.out.print("Dime el numero del mes: ");
		num = ent.nextInt();
		System.out.print("El mes es: " + meses[num-1]);
	}

}
