package Model;

import java.util.Random;

public class Financeiro {
	protected int qtdSaidas = 0;
	 public void gerarNotaFiscal(){
		  Random nota = new Random();
		  int notaFiscal = nota.nextInt();

	 }

	public int getQtdSaidas() {
		return qtdSaidas;
	}

	public void setQtdSaidas(int qtdSaidas) {
		this.qtdSaidas = qtdSaidas;
	}
}
