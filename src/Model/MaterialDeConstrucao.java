package Model;

import View.EntradaSaida;

import java.util.ArrayList;

public class MaterialDeConstrucao {
	 private String produto;
	 private String usuario;
	 private String senha = "mat0123";
	 private ArrayList<Materiais> listaDeMateriais= new ArrayList<Materiais>();
	 private ArrayList<Materiais> listaDeCadastrados= new ArrayList<Materiais>();
	 private ArrayList<Materiais> listaDeEntrada= new ArrayList<Materiais>();
	 
	 //metodos de operaçao
	 
	 
	 public void entradaEmEstoqueVazio(){
		
	 }
	 public int  adicaoNoEstoque(int estoque, int entrada){
		  return estoque += entrada;
	 }
	 public int saidaDeEstoque(int estoque, int saida ){
		  return estoque-=saida;
	 }
	 public String gerarListaDeEstoque(){
		  String informacao = "";
		  System.out.println("teste");
		  for (Materiais material : listaDeMateriais) {
			   if(material instanceof Aco acoMat) {
					informacao += "Material - " + acoMat.getOpcao() + " | Descriçao - " + acoMat.getDescricao() + " | Código - " + acoMat.getCodigo() + " | Preço-  R$" + acoMat.getPreco() + " | Quantidade - " + acoMat.getQuantidade() + "\n";
					
			   } else if (material instanceof Cimento cimentoMat) {
					informacao+= "Material - "+cimentoMat.getOpcao() + " | Descriçao - " + cimentoMat.getDescricao() + " | Código - " + cimentoMat.getCodigo() + " | Preço-  R$" + cimentoMat.getPreco() + " | Quantidade - " + cimentoMat.getQuantidade() + "\n";
			   } else if (material instanceof Madeira madeiraMat) {
					informacao+="Material - "+ madeiraMat.getOpcao() + " | Descriçao - " + madeiraMat.getDescricao() + " | Código - " + madeiraMat.getCodigo() + " | Preço-  R$" + madeiraMat.getPreco() + " | Quantidade - " + madeiraMat.getQuantidade() + "\n";
			   } else if (material instanceof Plastico plasMat) {
					informacao+= "Material - "+plasMat.getOpcao() + " | Descriçao - " + plasMat.getDescricao() + " | Código - " + plasMat.getCodigo() + " | Preço-  R$" + plasMat.getPreco() + " | Quantidade - " + plasMat.getQuantidade() + "\n";
			   } else if (material instanceof Tijolos tijoMat) {
					informacao+= "Material - "+tijoMat.getOpcao() + " | Descriçao - " + tijoMat.getDescricao() + " | Código - " + tijoMat.getCodigo() + " | Preço-  R$" + tijoMat.getPreco() + " | Quantidade - " + tijoMat.getQuantidade() + "\n";
			   } else if (material instanceof Vidros vidroMat) {
					informacao+= "Material - "+vidroMat.getOpcao() + " | Descriçao - " + vidroMat.getDescricao() + " | Código - " + vidroMat.getCodigo() + " | Preço-  R$" + vidroMat.getPreco() + " | Quantidade - " + vidroMat.getQuantidade() + "\n";
			   } else if (material instanceof ProdutoNovo prodNovoMat) {
					informacao+= "Material - "+prodNovoMat.getProdutoNovo() + " | Descriçao - " + prodNovoMat.getDescricaoNovo() + " | Código - " + prodNovoMat.getCodigoNovo() + " | Preço-  R$" + prodNovoMat.getPrecoNovo() + " | Quantidade - " + prodNovoMat.getQuantidade() + "\n";
			   }
			   
		  }
		  return informacao;
	 }
	 public String gerarListaDeEntrada (){
		  String informacao = "<<<Lista De Entrada>>>\n";
		  
		  for (Materiais material : listaDeEntrada) {
			   if (material instanceof Aco acoMat) {
					informacao+="Material - "+acoMat.getOpcao() + " | Descriçao - " + acoMat.getDescricao() + " | Código - " + acoMat.getCodigo() + " | Preço-  R$" + acoMat.getPreco() + " | Quantidade - " + acoMat.getEntradaQtd() + "\n";
			   } else if (material instanceof Cimento cimentoMat) {
					informacao+= "Material - "+cimentoMat.getOpcao() + " | Descriçao - " + cimentoMat.getDescricao() + " | Código - " + cimentoMat.getCodigo() + " | Preço-  R$" + cimentoMat.getPreco() + " | Quantidade - " + cimentoMat.getEntradaQtd() + "\n";
			   } else if (material instanceof Madeira madeiraMat) {
					informacao+="Material - "+ madeiraMat.getOpcao() + " | Descriçao - " + madeiraMat.getDescricao() + " | Código - " + madeiraMat.getCodigo() + " | Preço-  R$" + madeiraMat.getPreco() + " | Quantidade - " + madeiraMat.getEntradaQtd() + "\n";
			   } else if (material instanceof Plastico plasMat) {
					informacao+= "Material - "+plasMat.getOpcao() + " | Descriçao - " + plasMat.getDescricao() + " | Código - " + plasMat.getCodigo() + " | Preço-  R$" + plasMat.getPreco() + " | Quantidade - " + plasMat.getEntradaQtd() + "\n";
			   } else if (material instanceof Tijolos tijoMat) {
					informacao+= "Material - "+tijoMat.getOpcao() + " | Descriçao - " + tijoMat.getDescricao() + " | Código - " + tijoMat.getCodigo() + " | Preço-  R$" + tijoMat.getPreco() + " | Quantidade - " + tijoMat.getEntradaQtd() + "\n";
			   } else if (material instanceof Vidros vidroMat) {
					informacao+= "Material - "+vidroMat.getOpcao() + " | Descriçao - " + vidroMat.getDescricao() + " | Código - " + vidroMat.getCodigo() + " | Preço-  R$" + vidroMat.getPreco() + " | Quantidade - " + vidroMat.getEntradaQtd() + "\n";
			   } else if (material instanceof ProdutoNovo prodNovoMat) {
					informacao+= "Material - "+prodNovoMat.getProdutoNovo() + " | Descriçao - " + prodNovoMat.getDescricaoNovo() + " | Código - " + prodNovoMat.getCodigoNovo() + " | Preço-  R$" + prodNovoMat.getPrecoNovo() + " | Quantidade - " + prodNovoMat.getQuantidade() + "\n";
			   }
		  }
		  return informacao;
	 }
	 
	 public void adicionaMaterial(Materiais mat){
		  listaDeMateriais.add(mat);
	 }
	 public void acionaEntrada(Materiais mat){
		  listaDeEntrada.add(mat);
	 }
	 public void acionaCadastrado(Materiais mat){
		  listaDeCadastrados.add(mat);
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
	 
	 
	 public ArrayList<Materiais> getListaDeMateriais() {
		  return listaDeMateriais;
	 }
	 
	 public void setListaDeMateriais(ArrayList<Materiais> listaDeMateriais) {
		  this.listaDeMateriais = listaDeMateriais;
	 }
	 
	 public ArrayList<Materiais> getListaDeCadastrados() {
		  return listaDeCadastrados;
	 }
	 
	 public void setListaDeCadastrados(ArrayList<Materiais> listaDeCadastrados) {
		  this.listaDeCadastrados = listaDeCadastrados;
	 }
	 
	 public ArrayList<Materiais> getListaDeEntrada() {
		  return listaDeEntrada;
	 }
	 
	 public void setListaDeEntrada(ArrayList<Materiais> listaDeEntrada) {
		  this.listaDeEntrada = listaDeEntrada;
	 }
}
