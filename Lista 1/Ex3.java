/*	Determine o que as instruções a seguir irão fazer:
	System.out.println(10 + 3 * 4);
	System.out.println((10 + 3) * 4);
	System.out.println(10 + (3 * 4));
	System.out.println(23 / 4);
	System.out.println(4 / 23);
	System.out.println(23 % 4);
	System.out.println(4 % 23);
*/
class Ex3 {
	public static void main(String[] args) {
		System.out.println(10 + 3 * 4); // Resultado = 22
		System.out.println((10 + 3) * 4); // Resultado = 52
		System.out.println(10 + (3 * 4)); // Resultado = 22
		System.out.println(23 / 4); // Resultado = 5
		System.out.println(4 / 23); // Resultado = 0
		System.out.println(23 % 4); // Resultado = 3
		System.out.println(4 % 23); // Resultado = 4
	}
}