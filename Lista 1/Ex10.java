/*	Escreva um método que receba um inteiro de 3 dígitos como parâmetro, retornando seu
	inverso. Por exemplo, inv(332) = 233.
*/
class Ex10 {
	static int inverter(int valor) {
		int centena = valor/100; 
		int dezena = (valor%100)/10;
		int unidade =((valor%100)%10);
		int inv = (unidade * 100) + (dezena * 10) + centena;
		return inv;
	}
	public static void main(String[] args) {
		System.out.println("O inverso do numero digitado corresponde a " + inverter(123));
	}
}