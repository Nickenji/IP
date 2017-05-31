/*	Escreva um programa que determine quanto tempo leva para um corpo cair de determinada
	altura a partir do repouso. Use o método Math.sqrt()1 para obter a raiz.
*/
class Ex7 {
	public static void main(String[] args) {
		final int g = 10; //Valor da gravidade, em m/s².
		double h = 50; //Valor da altura, em metros.
		double t = Math.sqrt((2 * h)/g); //Valor do tempo, em segundos.

		System.out.println("O corpo leva " + t + " segundos para cair de uma altura de " + h + " metros.");
	}
}