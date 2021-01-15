package a2;
import java.util.Scanner;

public class MainPersona {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Persona persona1 = new Persona();
		System.out.println("Escribe tu nombre:");
		persona1.nombre = in.nextLine();
		
		System.out.println("Escribe tus apellidos:");
		persona1.apellidos = in.nextLine();
		
		System.out.println("Escribe tu DNI:");
		persona1.DNI = in.nextLine();
		
		System.out.println("Introduce tu edad:");
		persona1.edad = in.nextInt();
		
		
	}
}
