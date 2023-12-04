package Model;

import java.util.ArrayList;

public class MaterialDeConstrucao {
    private String produto;
    private String usuario;
    private ArrayList<Materiais> listaMadeira= new ArrayList<Materiais>();
    private ArrayList<Materiais> listaAco= new ArrayList<Materiais>();
    private ArrayList<Materiais> listaTijolo= new ArrayList<Materiais>();
    private ArrayList<Materiais> listaPlastico= new ArrayList<Materiais>();
    private ArrayList<Materiais> listaCimento= new ArrayList<Materiais>();
    private ArrayList<Materiais> listaVidros= new ArrayList<Materiais>();
    private ArrayList<Materiais> listaDeMateriais= new ArrayList<Materiais>();

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


    public ArrayList<Materiais> getListaMadeira() {
        return listaMadeira;
    }

    public void setListaMadeira(ArrayList<Materiais> listaMadeira) {
        this.listaMadeira = listaMadeira;
    }

    public ArrayList<Materiais> getListaAco() {
        return listaAco;
    }

    public void setListaAco(ArrayList<Materiais> listaAco) {
        this.listaAco = listaAco;
    }

    public ArrayList<Materiais> getListaTijolo() {
        return listaTijolo;
    }

    public void setListaTijolo(ArrayList<Materiais> listaTijolo) {
        this.listaTijolo = listaTijolo;
    }

    public ArrayList<Materiais> getListaPlastico() {
        return listaPlastico;
    }

    public void setListaPlastico(ArrayList<Materiais> listaPlastico) {
        this.listaPlastico = listaPlastico;
    }

    public ArrayList<Materiais> getListaCimento() {
        return listaCimento;
    }

    public void setListaCimento(ArrayList<Materiais> listaCimento) {
        this.listaCimento = listaCimento;
    }

    public ArrayList<Materiais> getListaVidros() {
        return listaVidros;
    }

    public void setListaVidros(ArrayList<Materiais> listaVidros) {
        this.listaVidros = listaVidros;
    }

    public ArrayList<Materiais> getListaDeMateriais() {
        return listaDeMateriais;
    }

    public void setListaDeMateriais(ArrayList<Materiais> listaDeMateriais) {
        this.listaDeMateriais = listaDeMateriais;
    }
}
