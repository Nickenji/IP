/*	Qual é a saída dos seguintes códigos?
	int num = 0;
	while (num <= 5) {
	num = num + 1;
	System.out.println(num);
	}
*/
class Ex1b {
	public static void main(String[] args) {

		int num = 0;

		while (num <= 5) { // Condição será falsa apenas quando num <= 5, ou seja, até 5.
		num = num + 1;
		System.out.println(num); // 1, 2, 3 ,4 , 5, 6.
		}
	}
}