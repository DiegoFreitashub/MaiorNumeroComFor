
import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	
		System.out.println ("Digite a quantidade de numeros a serem lidos:");
		int valor= sc.nextInt();
		int maior=0;
		
		for (int contador= 0; contador <valor; contador+=1) {
			System.out.println("Digite o numero " + (contador+1) + ": ");
			int num  = sc.nextInt();
		if (num>maior) {
			maior=num;
			}
			}
		System.out.println ("Maior numero: " +maior);
		
		}
	}



