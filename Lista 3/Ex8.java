/*	Faça um programa que escreve uma tabela com os 15 primeiros inteiros positivos, seus
	quadrados e cubos. Cada linha deve se referir a um inteiro.
*/
class Ex8 {
	public static void main(String[] args) {
		
		System.out.println("Valor: \tSeu quadrado: \t Seu cubo: ");

		for(int n = 1; n <= 15; n++){
			System.out.println(n + "\t" + Math.pow(n,2) + "\t\t " + Math.pow(n,3));
		}
	}
}