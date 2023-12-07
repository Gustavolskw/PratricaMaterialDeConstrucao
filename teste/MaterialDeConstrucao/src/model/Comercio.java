package model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import view.EntradaSaida;

public class Comercio {

	private ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
	private ArrayList<Cupom> listaDeCupons = new ArrayList<Cupom>();
	DecimalFormat df = new DecimalFormat("#0.00");

	public ArrayList<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}

	public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}

	public ArrayList<Cupom> getListaDeCupons() {
		return listaDeCupons;
	}

	public void setListaDeCupons(ArrayList<Cupom> listaDeCupons) {
		this.listaDeCupons = listaDeCupons;
	}

	public void cadastrarProduto(Produto produto, int addCodigo) {
		listaDeProdutos.add(produto);
		EntradaSaida.exibirCadastroProduto();

	}

	public void venderProduto(int codigo, int qntdeVendida) {

		boolean verificaRemocao = false;

		for (int i = 0; i < listaDeProdutos.size(); i++) {

			Produto produto = listaDeProdutos.get(i);

			if (produto.getCodigo() == codigo) {
				verificaRemocao = true;
				EntradaSaida.exibirVendaProduto(qntdeVendida, produto);
				int qntde = produto.getQntde() - qntdeVendida;
				produto.setQntde(qntde);

			}
		}

		if (verificaRemocao == false) {
			EntradaSaida.exibeMsgVenderProduto();
		}

	}

	public Produto retornaProduto(int codigo) {

		Produto recebeProduto = null;

		for (int i = 0; i < listaDeProdutos.size(); i++) {

			Produto produto = listaDeProdutos.get(i);

			if (produto.getCodigo() == codigo) {

				recebeProduto = produto;

			}
		}

		return recebeProduto;

	}

	public void gerarCupom(Cupom cupom) {

		listaDeCupons.add(cupom);
	}

	public String verCuponsGerados() {

		String informacoes = "";

		for (Cupom cupom : this.listaDeCupons) {

			informacoes += "Data da venda: " + cupom.getDataVenda() + "\n" + "Produto vendido: " + cupom.getDescricao()
					+ "\n" + "Valor do produto: R$" + cupom.getPreco() + "\n" + "Quantidade vendida: " + cupom.getQntde()
					+ " unid" + "\n" + "Valor total: R$" + df.format(cupom.getValorTotal()) + "\n" + "\n";

		}

		return informacoes;

	}

	public String verProdutosCadastrados() {

		String informacoes = "";

		for (Produto produto : this.listaDeProdutos) {

			informacoes += "Código: " + produto.getCodigo() + "\n" + "Descrição: " + produto.getDescricao() + "\n"
					+ "Preço: R$" + df.format(produto.getPreco()) + "\n" + "\n";

		}

		return informacoes;
	}

	public void retornaEstoque(int qntdeEstoque, int codigoEstoque) {

		for (int i = 0; i < listaDeProdutos.size(); i++) {

			Produto produto = listaDeProdutos.get(i);

			if (produto.getCodigo() == codigoEstoque) {
				produto.setQntde(produto.getQntde() + qntdeEstoque);
				EntradaSaida.exibirCadastroEstoque();

			}
		}

	}

	public String verProdutosEstoque() {

		String infoEstoque = "";

		for (Produto produto : this.listaDeProdutos) {

			infoEstoque += "Código: " + produto.getCodigo() + "\n" + "Descrição: " + produto.getDescricao() + "\n"
					+ "Quantidade em estoque: " + produto.getQntde() + "\n" + "\n";

		}

		if (infoEstoque == "") {

			String cadastroVazio = "Você não possui produtos cadastrados no estoque";

			return cadastroVazio;

		} else {

			return infoEstoque;
		}

	}

	public String calcularValorTotalCupons() {

		String informacoes = "";
		double valorTotal = 0;

		for (Cupom cupom : this.listaDeCupons) {

			valorTotal += cupom.getValorTotal();

		}

		informacoes += "Valor total de cupons gerados: R$" + df.format(valorTotal);

		return informacoes;
	}

	public boolean validaCodigo(int addCodigo) {

		for (int i = 0; i < listaDeProdutos.size(); i++) {

			Produto produto = listaDeProdutos.get(i);

			if (produto.getCodigo() == addCodigo) {

				return true;

			}
		}

		return false;
	}
}