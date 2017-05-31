/* 	Desenvolva um programa que calcule a soma dos 10 primeiros números inteiros pares
	positivos.
*/
class Ex5 {
	public static void main(String[] args) {

		int soma = 0;
		int n = 0;

		while(n < 20) {
			n += 2;
			soma += n;
		}

		System.out.println("A soma dos 10 primeiros numeros inteiros pares positivos vale: " + soma);
	}
}