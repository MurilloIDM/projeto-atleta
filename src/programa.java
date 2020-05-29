import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String nome;
		char sexo, outroAtleta;
		double pesoAtleta, alturaAtleta;
		boolean flag = true;
		
		while (flag) {
			
			System.out.print("Nome: ");
			nome = input.nextLine();
			System.out.print("Sexo (Digite F ou M): ");
			sexo = input.next().charAt(0);
	
			System.out.print("Altura (Digite um valor positivo): ");
			alturaAtleta = input.nextDouble();
			
			while (alturaAtleta <= 0) {
				System.out.print("Tente novamente. Digite uma altura com um valor positivo: ");
				alturaAtleta = input.nextDouble();
			}
			
			System.out.print("Peso: (Digite um valor positivo):");
			pesoAtleta = input.nextDouble();
			
			while (pesoAtleta <= 0) {
				System.out.print("Tente novamente.Digite um peso com um valor positivo: ");
				pesoAtleta = input.nextDouble();
			}
			
			System.out.print("Digitar outro atleta (S/N)? ");
			outroAtleta = input.next().charAt(0);
			
			
			if (outroAtleta == 'N' || outroAtleta == 'n') {
				flag = false;
			}
			
			input.nextLine();
		}
		
		System.out.println("\nFIM DO PROGRAMA");
		input.close();

	}

}
