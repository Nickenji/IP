/*	Escreva uma método que converta uma temperatura expressa em graus Celsius em seu
	valor equivalente em graus Fahrenheit (C = 5/9*(F-32)) ou vice-versa de acordo com a
	opção de conversão escolhida em um de seus parâmetros
*/
class Ex7 {
	static double converterTemperatura(double temperatura, int opcao) {

		switch(opcao) {

			case 1: 
					return ((9 * temperatura) / 5) + 32; // Converte Celsius em Fahrenheit.
			case 2:
					return ((temperatura - 32) / 9) * 5; // Converte Fahrenheit em Celsius.
			default: 
					return -1;
		}
	}
	public static void main(String[] args) {
		System.out.println("Convertendo a temperatura temos: " + converterTemperatura(30,1) + " graus.");
	}
}