package UniaoDeConjuntos;

import java.util.Scanner;

public class Uniao {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Informe to tamanho do conjunto");
		int tamanho = sc.nextInt();
		
		int[] conjunto1 = new int[tamanho];
		
		
		for (int i = 0;i<tamanho;i++) {
			
			System.out.println("Conjunto1 "+i+" posição");
			conjunto1[i] = sc.nextInt();
			
		}
		System.out.println("Informe o tamanho do conjunto2");
		tamanho = sc.nextInt();
		int[] conjunto2 = new int[tamanho];
		for (int j = 0;j<tamanho;j++) {
			System.out.println("Conjunto2 "+j+" na posição");
			conjunto2[j] = sc.nextInt();
		}
		System.out.println("Conjunto1");
		ImprimeConjuntos.impressao(conjunto1);
		System.out.println();
		System.out.println("Conjunto2");
		ImprimeConjuntos.impressao(conjunto2);
		System.out.println();
		System.out.println("Uniao");
		ImprimeConjuntos.impressao(CalcUniao.calculaUniao(conjunto1, conjunto2));
		System.out.println();
		System.out.println("interseccao");
		ImprimeConjuntos.impressao(CalcInterseccao.calculaInterseccao(conjunto1, conjunto2));

	}
}

