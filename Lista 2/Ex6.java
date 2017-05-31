//	Escreva um método que, dados três valores inteiros diferentes entre si, apresente o maior de tais valores.
class Ex6 {
	// Metodo que testa três valores e indica qual o maior deles.

	static int maiorvalor(int valor1, int valor2, int valor3) {

		int maiorvalor = valor3;

		if(valor1 > valor3)
			maiorvalor = valor1;

		if(valor2 > valor3 & valor2 > valor1)
			maiorvalor = valor2;

		return maiorvalor;

	}
	public static void main(String[] args) {
		
		System.out.println("O maior valor e de: " + maiorvalor(10,40,125));
	}
}