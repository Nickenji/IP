/*	A CBF resolveu cobrar uma multa para os jogadores que no campeonato brasileiro
	receberem cartões amarelos e vermelhos. Dados quatro números inteiros, representando
	o time, o número do jogador, o número de cartões amarelos e vermelhos do jogador,
	calcule o valor da multa, escrevendo a resposta na tela. Considere que a multa por
	cartão amarelo é de R$1000,20 e por cartão vermelho é de R$4523,75.
*/

class Ex9 {
	public static void main(String[] args) {
		int numtime = 3; // Numero do time.
		int numjogador = 10; // Numero do do jogador.
		int numamarelo = 2; // Numero de cartoes amarelos.
		int numvermelho = 1; // Numero de cartoes vermelhos.
		final double amarelo = 1000.20; // Valor da multa do cartao amarelo.
		final double vermelho = 4523.75; // Valor da multa do cartao vermelho.
		double multa = (numamarelo * amarelo) + (numvermelho * vermelho); // Valor total da multa.

		System.out.println("O jogador do time " + numtime + " de camisa numero " + numjogador + " recebeu uma multa no valor de: " + multa + " reais.");
	}
}
		

		