public class Portas {
	public static void main(String args[]){
		int quant = 0;
		boolean[] portas = new boolean[10001];
		for(int i = 1; i < portas.length; i++){
			for(int j = i; j < portas.length; j+=i){
				portas[j] = !portas[j];
			}
		}
		for(int i = 1; i < portas.length; i++){
			if(portas[i]){
				System.out.println("porta "+ i + " esta aberta");
				quant = quant + 1;
			}
		}
		System.out.println(quant);
	}
}
