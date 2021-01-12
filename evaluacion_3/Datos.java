import java.util.Scanner;

public class Datos {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Scanner entrada1 = new Scanner (System.in);

		// scanner => para introducir un tipo de datos
		int numero;
		String palabra;
		
		System.out.print("Dime un numero: ");
		numero = entrada.nextInt();
		// .nextInt() => para numeros enteros
		System.out.println("El numero es "+numero);
		
		System.out.print("Dime una palabra: ");
		palabra = entrada1.nextLine();
		// .next => para una palabra
		// .nextLine() =>Para una frase
		System.out.print("La palabra es: "+palabra);
		
		// .next().charAt(0) => para sacar la primera letra (Se utiliza para char)(Si pones 1 sale la segunda letra...)
	}

}