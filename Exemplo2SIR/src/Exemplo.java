import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		int[] v = new int[5]; //variável local
		preencher(v); //argumento do método --> variavel que será enviada
		int maior = maiorValor(v);
		int menor = menorValor(v);
		System.out.println("Maior valor = " + maior);
		System.out.println("Menor valor = " + menor);
	}
	
	public static int maiorValor(int[] v) {
		int aux = v[0]; //primeiro valor do vetor
		for(int i = 1; i < v.length; i++) {
			if(v[i] > aux) {
				aux = v[i];
			}
		}
		return aux;
	}
	
	public static int menorValor(int[] v) {
		int aux = v[0]; //primeiro valor do vetor
		for(int i = 1; i < v.length; i++) {
			if(v[i] < aux) {
				aux = v[i];
			}
		}
		return aux;
	}
	
	public static void preencher(int[] v) { // v é um parÂmetro do método --> o que vai receber
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < v.length; i++) {
			System.out.print("Valor: ");
			v[i] = teclado.nextInt();
		}
		teclado.close();
		
	}

}
