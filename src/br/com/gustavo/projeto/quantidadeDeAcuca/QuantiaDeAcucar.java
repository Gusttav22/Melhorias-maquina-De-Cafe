package br.com.gustavo.projeto.quantidadeDeAcuca;

import br.com.gustavo.projeto.armazenamento.Armazenagem;

public class QuantiaDeAcucar extends Armazenagem {

	@Override
	public void quantidadeDeAcucar(int acucar) {
		if (acucar <= 5) {
			System.out.println("Boa escolha ! Nivel = " + acucar + " de a�ucar");
			return;
		} else {
			System.out.println("N�o recomendo vai ficar muito doce ");
		}
	}

}
