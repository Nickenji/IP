/*	Determine o que as instruções abaixo fazem:
	for (int cont = 1; cont <= 5; cont++) {
	for (int cont2 = 1; cont2 <= 3; cont2++) System.out.print("oba-");
	System.out.print("oba\n");
	}
*/
class Ex9 {
	public static void main(String[] args) {
		
		for (int cont = 1; cont <= 5; cont++) { // Vai repetir o processo 5 vezes.
			for (int cont2 = 1; cont2 <= 3; cont2++) System.out.print("oba-"); // Ira escrever oba- 3 vezes.
			System.out.print("oba\n"); // Ira escrever oba e ira pular uma linha.
		}
	}
}