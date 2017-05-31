/*	Determine o que as instruções a seguir irão fazer:
	int a = 3;
	int b = 5;
	int c = 8;
	int d = a * (b + c * 3) - 7;
	int e = a - b - c;
	System.out.println(a+" "+b+" "+c+" "+d+" "+e);
	a = a + 1;
	b = (4 * a + 1) / 10;
	c = (4 * a + 1) % 10;
	System.out.println(a+" "+b+" "+c+" "+d+" "+e);
*/
class Ex5 {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 8;
		int d = a * (b + c * 3) - 7; // d = 80
		int e = a - b - c; // e = -10
		System.out.println(a+" "+b+" "+c+" "+d+" "+e); // Vai imprimir "3 5 8 80 -10"
		a = a + 1; // a = 4
		b = (4 * a + 1) / 10; // b = 1
		c = (4 * a + 1) % 10; // c = 7
		System.out.println(a+" "+b+" "+c+" "+d+" "+e); // Vai imprimir "4 1 7 80 -10"
	}
}