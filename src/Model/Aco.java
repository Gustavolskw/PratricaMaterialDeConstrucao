package Model;

public class Aco extends Materiais {
    protected String []descricao = {"alta resistência à oxidação atmosférica"};
    protected  String [] opcoes = {"Aço Inoxidavel"};
    protected double []precos= {5.30} ;
    protected  int[] codigos = {90001};

    public String[] getDescricao() {
        return descricao;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public int[] getCodigos() {
        return codigos;
    }

    public double[] getPrecos() {
        return precos;

    }
}
