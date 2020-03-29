package UniaoDeConjuntos;

public class CalcUniao {

static int[] calculaUniao(int[]conjunto1,int[] conjunto2) {
		
		int[] uniao = new int[conjunto1.length + conjunto2.length];
		
		for (int i =0; i<conjunto1.length;i++) {
			
			uniao[i] = conjunto1[i];
		}
		int c = 0;
		for (int i = conjunto1.length;c<conjunto2.length;i++) {
			uniao[i] = conjunto2[c];
			c++;
		}
		for (int i = 0;i<uniao.length;i++) {
			for(int j=i+1;j<uniao.length;j++) {
				if(uniao[i]==uniao[j]) {
					uniao[j]=0;
				}
			}
			
		}
	return uniao;}
}
