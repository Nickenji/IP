/* 	Escreva um programa que, a partir dos coeficientes de uma equação do segundo grau,
	calcule suas raízes, escrevendo a resposta na tela.
*/
class Ex8 {
	public static void main(String[] args) {
		int a = 1; // Coeficiente a da equacao de segundo grau.
		int b = -10; // Coeficiente b da equacao de segundo grau.
		int c = 24; // Coeficiente c da equacao de segundo grau.
		double delta = Math.pow(b,2) - 4*a*c; // Valor do delta.
		double x1 = (-b + Math.sqrt(delta))/2*a; // Valor da primeira raiz.
		double x2 = (-b - Math.sqrt(delta))/2*a; // Valor da segunda raiz.
		
		System.out.println("As raizes da equacao: " + a + "x^2" + b + "x+" + c + " valem: " + x1 + " e " + x2);
	}
}
		
		
		
		
		