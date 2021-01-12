// 3. Dia de la semana

import java.util.Scanner;

public class DiaDeLaSemana {

	public static void main(String[] args) {
		String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		int num;
		Scanner ent = new Scanner (System.in);
		System.out.print("Dime el numero de la semana: ");
		num = ent.nextInt();
		System.out.print("El dia es: " + dias[num-1]);
	}

}
