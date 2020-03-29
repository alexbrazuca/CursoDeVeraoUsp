package UniaoDeConjuntos;

public class CalcInterseccao {

	static int[] calculaInterseccao(int[]conjunto1,int[]conjunto2) {
		int [] interseccao = new int[conjunto1.length+conjunto2.length];
		for(int i=0; i<conjunto1.length;i++) {
			for(int j=0;j<conjunto2.length;j++) {
				if(conjunto1[i]==conjunto2[j]) {
					interseccao[i]=conjunto1[i];
				}
			}
		}
	return interseccao;	
	}
	
}
