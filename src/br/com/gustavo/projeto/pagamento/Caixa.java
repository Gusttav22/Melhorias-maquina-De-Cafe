package br.com.gustavo.projeto.pagamento;

public class Caixa {
	private double saldo;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean Compra(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			double valorDaCompra = valor + saldo;
			System.out.println("Compra Feita com Sucesso ! R$" + valorDaCompra);
			return true;
		} else {
			double valorFaltante = valor - saldo;
			System.out.println("Ainda esta faltando ! R$" + valorFaltante);
			return false;
		}
	}
}
