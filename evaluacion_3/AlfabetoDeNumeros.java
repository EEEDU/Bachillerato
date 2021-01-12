import java.util.Scanner;

public class AlfabetoDeNumeros {

	private static Scanner entrada;

	public static void main(String[] args) {
		int i,j,k;
		long numero1=0;
		int[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};
		char[] letras2 = {'A', 'B','C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		boolean condicionLetras = false;

		entrada = new Scanner (System.in);
		System.out.print("Dime el numero "+letras2[0]+": ");
		letras[0] = entrada.nextInt();
		
		int numero = letras[0];
		
		//boolean resultado = true;
		for (i=0;condicionLetras==false;i++) {
			if (i==numero) {
				condicionLetras = true;
			}
			else {
				letras[i+1]=i;
				System.out.println("El numero "+letras2[i+1]+": "+letras[i+1]);
			}
		}
		for(j=i;j<(letras.length-1);j++) {
			letras[j+1]=j;
			System.out.println("El numero "+letras2[j]+": "+letras[j+1]);
		}
	
		for(k=0;k<=(letras.length-1);k++) {
			numero1 = numero1 + (letras[k])*(10)^(9-k);

		}
		System.out.print("El primer numero es: "+numero1);
	}

}
