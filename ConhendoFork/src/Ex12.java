/*Verificação de Números Primos: Leia números do usuário até que ele insira 
 * um número negativo e informe se cada número é primo ou não.
 */
//Desenvolvido por Diogo e Giovanna.

import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean primo = true;
		int numero;
		
		while(true) {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();
			
			if (numero <= 1) {
				primo = false;
			}else {
				for(int i = 2; i < numero; i++) {
					if(numero % i == 0) {
						primo = false;
						break;
					}
				}
			}
			if(primo) {
				System.out.println("O " + numero + " é primo");
			}else {
				primo = true;
				System.out.println("O " + numero + " não é primo");
			}
		}	
	}
}