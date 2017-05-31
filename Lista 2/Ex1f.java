/*	O que os códigos a seguir fazem?
	public static void main(String[] args) {
	int a = 5;
	int b = 3;
	int c = 9;
	int aux;
	if (a>b) {
	aux = a;
	a = b;
	b = aux;
	}
	1
	if (b>c) {
	aux = b;
	b = c;
	c = aux;
	}
	if (a>b) {
	aux = a;
	a = b;
	b = aux;
	}
	System.out.println(c+" "+b+" "+a);
	}
	}
*/
class Ex1f {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 9;
		int aux;
		
		if (a>b) { // Condicao verdadeira.
		aux = a; // aux recebe o valor de a(5).
		a = b; // a recebe o valor de b(3).
		b = aux; // b receve o valor de aux(5).
		}
			if (b>c) { // Condicao falsa, nao executa o comando.
			aux = b;
			b = c;
			c = aux;
			}
				if (a>b) { // Condicao falsa, nao executao comando.
				aux = a;
				a = b;
				b = aux;
				}

		System.out.println(c+" "+b+" "+a); // Imprime 9 5 3.
	}
}