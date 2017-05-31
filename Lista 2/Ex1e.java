/*	O que os códigos a seguir fazem?
	int a = 3;
	int b = 4;
	boolean continua = true && ((a + b) < (2 * a));
	if (continua) System.out.println("alto");
	else System.out.println("baixo");
*/
class Ex1e {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		boolean continua = true && ((a + b) < (2 * a)); // True E False --> False.
		if (continua) System.out.println("alto"); // Nao ira imprimir alto, pois a condicao e falsa.
		else System.out.println("baixo");	 // Ira imprimir baixo, pois a condicao e falsa.
	}
}