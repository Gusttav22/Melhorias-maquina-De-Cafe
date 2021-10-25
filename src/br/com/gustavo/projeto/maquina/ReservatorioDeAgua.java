package br.com.gustavo.projeto.maquina;

import br.com.gustavo.projeto.maquina.*;
import br.com.gustavo.projeto.armazenamento.Armazenagem;

public class ReservatorioDeAgua extends Armazenagem {

	@Override
	public void litrosDeAguaDoReservatorio(double agua) {
		if (agua <= 1000) {
			double quantiaNecessariaDeAguaDoReservatorio = agua;
			System.out.println("Ainda tem agua no Reservatorio ! " + quantiaNecessariaDeAguaDoReservatorio);

		} else {
			double estaFaltandoAguaNoReservatorio = agua - 1000;
			System.out.println("Esta faltando agua no Reservatorio " + estaFaltandoAguaNoReservatorio);
		}
	}

	public boolean quantiaDeAguaDasBebidas(double quantidadeDeagua) {
		if (quantidadeDeagua <= 1000) {
			return true;

		} else {
			return false;
		}

	}

}
