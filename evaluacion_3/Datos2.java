import javax.swing.JOptionPane;

public class Datos2 {

	public static void main(String[] args) {
		String palabra;
		int numero;
		char letra;
		
		palabra = JOptionPane.showInputDialog("Dime una palabra: ");
		System.out.print(palabra);
		numero = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero: "));

	}

}
