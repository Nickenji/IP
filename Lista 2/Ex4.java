/*	Calcule o valor a ser pago por um aluno de uma academia de ginástica, sabendo-se que
	ele terá desconto de 7% se pagar antecipado. O método deve receber como entrada qual
	opção pretendida (pagamento normal ou antecipado), o número de horas/aula e o valor
	da hora/aula, retornando então o cálculo
*/
class Ex4 {
	// O metodo calcula o valor do pagamento.
	// Opcao 1: pagamento normal e Opcao 2: pagamento antecipado.
	static double pagamento(int opcao, double duracao, double preco) {

		if(duracao < 0 || preco < 0)
			return -1;
		
		switch(opcao) {
			case 1: return (1 * duracao * preco); 
			case 2: return (0.93 * duracao * preco);
			default: return -1;
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Preco total a pagar: " + pagamento(2, 2, 100));
	}
}