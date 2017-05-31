/*	O que os códigos a seguir fazem?
	int var1 = 3;
	int var2 = 6;
	if ((var1 + 2) < var2) System.out.println("oba");
	if ((var1 + 4) < var2) System.out.println("abo");
	if ((var1 + 4) > var2) System.out.println("aob");
	System.out.println("ola\n");
*/
class Ex1b {
	public static void main(String[] args) {
		int var1 = 3;
		int var2 = 6;
		if ((var1 + 2) < var2) System.out.println("oba"); // Ira imprimir oba, pois a condicao e verdadeira.
		if ((var1 + 4) < var2) System.out.println("abo"); // Nao ira imprimir abo, pois a condicao e falsa.
		if ((var1 + 4) > var2) System.out.println("aob"); // Ira imprimir aob, pois a condicao e verdadeira.
		System.out.println("ola\n"); // Ira imprimir ola.
	}
}