/**
 *
 * 3. Lectura de datos desde teclado
 *
 * 4. Escribe un programa que sume, reste, multiplique y divida dos
 *    números introducidos por teclado.
 *
 * @author Luis José Sánchez
 * 
 */

public class S03Ejercicio04 {
	public static void main(String[] args) {
		int x, y;
		String linea;

		System.out.print("Por favor, introduzca el primer número: ");
		linea = System.console().readLine();
		x = Integer.parseInt( linea );
		System.out.print("Introduzca el segundo número: ");
		linea = System.console().readLine();
		y = Integer.parseInt( linea );
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x * y = " + (x * y));
	}
}
