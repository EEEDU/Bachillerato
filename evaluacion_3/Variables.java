
public class Variables {

	public static void main(String[] args) {
		byte numero;
		//byte => Numeros pequños
		short numero1;
		//short => Numeros medianos
		int numero2;
		//int => Numeros grandes
		long numero3;
		//long => Numeros gigantes
		numero=1;
		numero1=2;
		numero2=3;
		numero3=4;
		float numero_decimal;
		//float => Numeros decimales, hace falta poner una f al final
		double numero_decimal1;
		//double => Numeros decimales, no hace falta poner la f
		numero_decimal=3.25f;
		numero_decimal1=3.24;
		
		char caracter = 'a';
		//char => Caracteres, todo lo que haya en tu teclado
		
		boolean decision=true;
		//boolean => boleanos, true o false
		
		//Variables no primitivas
		
		Integer numero4 = null;
		//integer => igual que el int pero puedes usar null
		
		String palabra = "Edu";
		//string => palabra
		
		System.out.println("El numero pequeño es: "+numero);
		System.out.println("El numero mediano es: "+numero1);
		System.out.println("El numero grande es: "+numero2);
		System.out.println("El numero gigante es: "+numero3);
		System.out.println("El numero decimal es: "+numero_decimal);
		System.out.println("El numero decimal 2 es: "+numero_decimal1);
		System.out.println("El caracter es: "+caracter);
		System.out.println("La palabra es: "+palabra);
		System.out.println("La decision es: "+decision);
		System.out.println("El numero es: "+numero4);
	}

}
