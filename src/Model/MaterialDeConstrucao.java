package Model;

import View.EntradaSaida;

import java.util.ArrayList;

public class MaterialDeConstrucao {
    private String produto;
    private String usuario;
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
