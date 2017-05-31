/*	Escrever um método, que determine o valor do maior elemento de um arranjo de ints
	dado como parâmetro.
*/
class Ex1 {
	static int[] numeros = {10,99,28,1,13}; // Declarei o arranjo.

	static int maiorvalor(int[] arranjo) {

		int maior = 0; // Assumo a primeira posicao de indice 0 como o maior numero.

		for(int x = 0; x < arranjo.length; x++) { // Percorre cada elemento.

			if(arranjo[x] > arranjo[maior]) // Se achar um numero maior.
				maior = x; // Retorna a posicao, nao o numero.
		}
		return maior;
	}
	public static void main(String[] args) {
		
		System.out.println("O maior valor do arranjo e: " + numeros[maiorvalor(numeros)]); // maiorvalor(numeros) e o metodo que retorna a posicao.
	}																					  // e numeros[maiorvalor(numeros)] vai retornar o numero.
}