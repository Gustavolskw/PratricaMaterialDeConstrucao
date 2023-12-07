package Model;

import View.EntradaSaida;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class MaterialDeConstrucao {
	private String produto;
	private String usuario;
	private String senha = "mat0123";
	private ArrayList<Material> listaDeMateriais= new ArrayList<Material>();
	private ArrayList<Financeiro> listaDeNotasFiscais = new ArrayList<Financeiro>();
	DecimalFormat df = new DecimalFormat("#0.00");

	//metodos de operaçao


	public void adicionaMaterial(Material mat){
		listaDeMateriais.add(mat);
	}

	public Material retornaProduto(int codigo) {

		Material materialSolicitado = null;

		for (int i = 0; i<listaDeMateriais.size(); i++){

			Material materialProcurado = listaDeMateriais.get(i);

			if(materialProcurado .getCodigo() == codigo){
				materialSolicitado = materialProcurado;
			}
		}
		return materialSolicitado;
	}

	public void venderProduto(int codigo, int quantidadeVend ){
		boolean produtoVendido = false;

		for (int i = 0; i<listaDeMateriais.size(); i++){
			Material produto = listaDeMateriais.get(i);
			if(produto.getCodigo() == codigo){
				produtoVendido = true;
				EntradaSaida.exibirVendaProduto(quantidadeVend, produto);
				int qntd = produto.getQtdMaterial() - quantidadeVend;
				produto.setQtdMaterial(qntd);

			}
		}
		if (!produtoVendido){
			EntradaSaida.msgGeral("Produto Não Esncontrado ", JOptionPane.WARNING_MESSAGE);
		}

	}
	public boolean validaCodigo(int addCodigo) {

		for (int i = 0; i < listaDeMateriais.size(); i++) {

			Material material = listaDeMateriais.get(i);

			if (material.getCodigo() == addCodigo) {

				return true;

			}
		}

		return false;
	}
	public void gerarCupom(Financeiro notaFiscal) {

		listaDeNotasFiscais.add(notaFiscal);
	}

	public String gerarListaDeEstoque() {
		String info = "Lista de Estoque";
		for(Material material : listaDeMateriais){
			info+="Descriçao - "+material.getDescricao()+" | Codigo - "+material.getCodigo()+" | Valor - R$"+df.format(material.getPreco())+" Und | Quantidade Em estoque"+material.getQtdMaterial()+" | Data de Entrada - "+material.getDataEntrada();
		}
		return info;
	}
	public String gerarListaparaCompra() {
		String info = "Lista de Estoque";
		for(Material material : listaDeMateriais){
			info+="Descriçao - "+material.getDescricao()+" | Codigo - "+material.getCodigo()+" | Valor - R$"+df.format(material.getPreco());
		}
		return info;
	}
	public void retornaEstoque(int qntdeEstoque, int codigoEstoque) {
		for (int i = 0; i < listaDeMateriais.size(); i++) {

			Material produto = listaDeMateriais.get(i);

			if (produto.getCodigo() == codigoEstoque) {
				produto.setQtdMaterial(produto.getQtdMaterial() + qntdeEstoque);
				EntradaSaida.msgGeral("Item(ns) Adicionado ao estoque", JOptionPane.INFORMATION_MESSAGE);

			}
		}
	}
	public String gerarListaDeNotas() {
		String info = "Notas Fiscais";
		for(Financeiro notaFiscal : listaDeNotasFiscais){
			info+="Descriçao - "+ notaFiscal.getDescricao()+" || quantidade Comprada - "+notaFiscal.getQuantidadeCompra()+" || Preço Unitario - R$"+notaFiscal.getPreco()+"\n Valor Total: R$"+notaFiscal.getValorTotal()+"\n\n";
		}
		return info;
	}





























	//getters e setters de variaveis

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	//getters e seetters de listas


	public ArrayList<Material> getListaDeMateriais() {
		return listaDeMateriais;
	}

	public void setListaDeMateriais(ArrayList<Material> listaDeMateriais) {
		this.listaDeMateriais = listaDeMateriais;
	}


	public ArrayList<Financeiro> getListaDeNotasFiscais() {
		return listaDeNotasFiscais;
	}

	public void setListaDeNotasFiscais(ArrayList<Financeiro> listaDeNotasFiscais) {
		this.listaDeNotasFiscais = listaDeNotasFiscais;
	}
}
