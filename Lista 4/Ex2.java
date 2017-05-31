/* 	Dado um arranjo de n inteiros, passado por parâmetro, escrever um método que apresente
	na tela todos os múltiplos de 7 contidos em tal arranjo.
*/
class Ex2 {
	static int[] numeros = {7,14,21,1,2,3,4,5,6,49,185,158};

	static void multiplos(int[] arranjo) {

		for(int x = 0; x < arranjo.length; x++) {

			if(arranjo[x] % 7 == 0)
				System.out.println(arranjo[x] + " e multiplo de 7.");
		}
	}
	public static void main(String[] args) {
		multiplos(numeros);
	}
}