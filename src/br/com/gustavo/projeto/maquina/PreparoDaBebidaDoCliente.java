package br.com.gustavo.projeto.maquina;

public class PreparoDaBebidaDoCliente {

	public void PreparacaoDaBebida(int produto) {
		if (produto == 1) {
			System.out.println("Café = Água Quente + Pó de café + Filtro");
		}
		if (produto == 2) {
			System.out.println("Café com Leite = Água Quente + Pó de café + Leite em Pó + Filtro");
		}

		if (produto == 3) {
			System.out.println("Café com Leite = Água Quente + Pó de café + Leite em Pó + Filtro");
		}
		if (produto == 4) {
			System.out.println("Chá de Limão = Água Quente + Chá em pó + Filtro");
		}
	}
}
