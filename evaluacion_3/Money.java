// 2. Money

import java.util.Scanner;

public class Money {
	
	public static void main(String[] args) {
		int num;
		float eur,dol;
		System.out.println("QUE QUIERES HACER?");
		System.out.println("Si quieres pasar de dolar a euro pulsa 1");
		System.out.println("Si quieres pasar de euro a dolar pulsa 2");
		Scanner ent = new Scanner (System.in);
		num = ent.nextInt();
		if (num==1) {
			Scanner ent2 = new Scanner (System.in);
			System.out.println("Cuantos dolares?");
			dol = ent2.nextInt();
			eur = (float) (dol*0.95);
			System.out.print(eur);
		}
		if (num==2) {
			Scanner ent3 = new Scanner (System.in);
			System.out.println("Cuantos euros?");
			eur = ent3.nextInt();
			dol = (float) (eur*1.1);
			System.out.print(dol);
		}
	}
}
