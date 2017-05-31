/*	Qual é a saída dos seguintes códigos?
	int soma = 33;
	int cont = 1;
	while (cont < 12) {
	soma = soma + cont;
	cont = cont + 2;
	}	
	System.out.println("Os números são: " + cont + " e " + soma);
*/
class Ex1a {
	public static void main(String[] args) {

		int soma = 33;
		int cont = 1;

			while (cont < 12) { // Condição será falsa apenas quando cont < 12, ou seja, até 11.
			soma = soma + cont; // 34, 37, 42, 49, 58, 69.
			cont = cont + 2; //1, 3, 5, 7, 9, 11, 13.
			}
			System.out.println("Os numeros sao: " + cont + "  e " + soma); // cont = 13 e soma = 69.
	}
}