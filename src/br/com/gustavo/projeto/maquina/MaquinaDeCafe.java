package br.com.gustavo.projeto.maquina;

import br.com.gustavo.projeto.pagamento.Caixa;
import br.com.gustavo.projeto.maquina.ReservatorioDeAgua;
import br.com.gustavo.projeto.quantidadeDeAcuca.QuantiaDeAcucar;
import br.com.gustavo.projeto.maquina.PedidoDoCliente;
import br.com.gustavo.projeto.maquina.PreparoDaBebidaDoCliente;
import br.com.gustavo.projeto.armazenamento.Armazenagem;

public class MaquinaDeCafe {

	public static void main(String[] args) {

		System.out.println("Qual bebida voce deseja ?");

		System.out.println("1 - Café - R$0,50");
		System.out.println("2 - Café Com Leite - R$1,00");
		System.out.println("3 - Capuccino - R$1,50");
		System.out.println("4 - Chá De Limao - R$1,00");

		System.out.println("QUAL PEDIDO O SR(A) DESEJA ?");

		PedidoDoCliente bebidaEscolhidaPeloCliente = new PedidoDoCliente();
		bebidaEscolhidaPeloCliente.pedidoDoCliente(3);
		System.out.println("PREPARACAO DA BEBIDA !");
		PreparoDaBebidaDoCliente preparo = new PreparoDaBebidaDoCliente();
		preparo.PreparacaoDaBebida(1);

		System.out.println("QUAL NIVEL DE AÇUCAR O SR(A) DESEJA ?");
		QuantiaDeAcucar nivelDeAcucar = new QuantiaDeAcucar();
		nivelDeAcucar.quantidadeDeAcucar(4);

		System.out.println("RESERVATORIO DE CADA BEBIDA !");
		ReservatorioDeAgua reservatorio = new ReservatorioDeAgua();
		reservatorio.litrosDeAguaDoReservatorio(1000);

		System.out.println("CAIXA !");

		Caixa pagamento = new Caixa();
		pagamento.deposita(1.50);
		pagamento.Compra(1.00);

	}

}
