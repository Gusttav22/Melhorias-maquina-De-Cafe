package br.com.gustavo.projeto.maquina;

public class PreparoDaBebidaDoCliente {

	public void PreparacaoDaBebida(int produto) {
		if (produto == 1) {
			System.out.println("Caf� = �gua Quente + P� de caf� + Filtro");
		}
		if (produto == 2) {
			System.out.println("Caf� com Leite = �gua Quente + P� de caf� + Leite em P� + Filtro");
		}

		if (produto == 3) {
			System.out.println("Caf� com Leite = �gua Quente + P� de caf� + Leite em P� + Filtro");
		}
		if (produto == 4) {
			System.out.println("Ch� de Lim�o = �gua Quente + Ch� em p� + Filtro");
		}
	}
}
