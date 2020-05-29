import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String nome, nomeMaisAlto = null;
		char sexo, outroAtleta;
		double pesoAtleta, alturaAtleta, atletaMaisAlto, alturaMulheres, pesoTotal;
		int totalHomens, totalMulheres;
		boolean flag = true;
		
		atletaMaisAlto = 0;
		totalHomens = 0;
		totalMulheres = 0;
		atletaMaisAlto = 0;
		alturaMulheres = 0;
		pesoTotal = 0;
		
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
			
			pesoTotal += pesoAtleta;
			
			if (sexo == 'M' || sexo == 'm') {
				totalHomens =+ 1;
			} else {
				totalMulheres += 1;
				alturaMulheres += alturaAtleta;
			}
			
			if (atletaMaisAlto <= alturaAtleta) {
				atletaMaisAlto = alturaAtleta;
				nomeMaisAlto = nome;
			}
			
			
			
			if (outroAtleta == 'N' || outroAtleta == 'n') {
				flag = false;
			}
			
			input.nextLine();
		}
		
		System.out.println("\nRELATÓRIO: ");
		System.out.printf("Peso médio dos atletas: %.2f%n", pesoTotal / (totalHomens + totalMulheres));
		System.out.printf("Atleta mais alto: %s%n", nomeMaisAlto);
		System.out.printf("Porcentagem de homens: %.1f %% %n", (totalHomens * 100.0) / (totalHomens + totalMulheres));
		System.out.printf("Altura média das mulheres: %.2f%n", alturaMulheres / totalMulheres);
		
		System.out.println("\nFIM DO PROGRAMA");
		input.close();

	}

}
