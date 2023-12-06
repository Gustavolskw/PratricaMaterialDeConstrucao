package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Financeiro {
	 protected int quantidadeCompra;
	protected int qtdSaidas = 0;
	 
	 LocalDateTime dataVenda = LocalDateTime.now();
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
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
	 public int getQuantidadeCompra() {
		  return quantidadeCompra;
	 }
	 
	 public void setQuantidadeCompra(int quantidadeCompra) {
		  this.quantidadeCompra = quantidadeCompra;
	 }
	 
	 public String getDataVenda() {
		  return dataVenda.format(formatter);
	 }
	 
	 public void setDataVenda(LocalDateTime dataVenda) {
		  this.dataVenda = dataVenda;
	 }
	 
	 
}
