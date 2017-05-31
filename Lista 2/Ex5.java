/*	Numa loja de eletrodomésticos, as compras têm um preço à vista, ou acréscimo de 10%
	para pagamentos em 2 vezes, ou então de 20% para pagamentos em 3 vezes. Escreva um
	método que receba como parâmetros o valor da compra à vista e a opção de compra,
	retornando então o valor final a ser pago.
*/
class Ex5 {
	// O metodo calcula o valor total a ser pago pela compra.
	// Opcao 1: a vista preco sem acrescimo, Opcao 2: 2x com acrescimo de 10% e Opcao 3: 3x com acrescimo de 20%.
	// Quando -1 e retornado e porque ha um erro.
	static double pagamento(int opcao, int valorcompra) {

		if(valorcompra < 0)
			return -1;

		switch(opcao) {
			case 1: return (1 * valorcompra);
			case 2: return (1.1 * valorcompra);
			case 3: return(1.2 * valorcompra);
			default: return -1;
		}
	}
	public static void main(String[] args) {

		System.out.println("Preco total a pagar: " + pagamento(3,100));
	}
}

