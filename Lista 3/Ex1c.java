/*	
	int dest1 = 15;
	int dest2 = 27;
	int local1 = 20;
	int local2 = 20;
	boolean chegou1 = false;
	boolean chegou2 = false;
	while ((!chegou1) && (!chegou2)) {
	local1 = local1 - 1;
	local2 = local2 + 2;
	chegou1 = (local1 <= dest1);
	chegou2 = (local2 >= dest2);
	System.out.println("Os viajantes estão em "+local1" e "+local2);
	}
	System.out.println("As posições finais dos viajantes são "+local1" e "
	+local2);
*/
class Ex1c {
	public static void main(String[] args) {
		
		int dest1 = 15;
		int dest2 = 27;
		int local1 = 20;
		int local2 = 20;
		boolean chegou1 = false;
		boolean chegou2 = false;

			while ((!chegou1) && (!chegou2)) { // true e true, irá parar de executar os comandos quando uma das condições for false.
			local1 = local1 - 1;
			local2 = local2 + 2;
			chegou1 = (local1 <= dest1); // Quando a condição for true, atribui true a chegou1 e !chegou1 vira false.
			chegou2 = (local2 >= dest2); // Quando a condição for true, atribui true a chegou2 e !chegou2 vira false.
			System.out.println("Os viajantes estao em " + local1 + " e " + local2); // local1 = 19,18,17,16 e local2 = 22,24,26,28.
			}
			System.out.println("As posicoes finais dos viajantes sao " + local1 +" e " + local2); // 16 e 28.
	}
}