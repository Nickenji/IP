/*
	Escreva um comando que escreva "fora" quando var for menor que 4 ou maior que 10.
*/
class Ex3 {
	public static void main(String[] args) {
		int var = 1; // <-- Mude aqui o valor de var.
		if (var < 4 || var > 10) {
			System.out.println("fora");
		}
		else System.out.println("Deu ruim!");
	}
}