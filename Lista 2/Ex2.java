/*	Escreva uma instrução IF que faça c receber 0 quando a for estritamente maior que 0 e
	estritamente menor que b. Se este não for o caso, não mude c. O modo matemático de
	escrever essa condição é: 0 < a < b.
*/
class Ex2 {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		int c = 3;

		if(0 < a && a < b) {
			c = 0;
		}
	System.out.println(c);
	}
}