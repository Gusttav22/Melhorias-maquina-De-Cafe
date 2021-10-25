package br.com.gustavo.projeto.maquina;

public class PedidoDoCliente extends PreparoDaBebidaDoCliente {

	public void pedidoDoCliente(int pedido) {
		if (pedido <= 4) {
			System.out.println("Pedido nº = " + pedido);
			return;
		}
	}

}
