package Model;

public class Aco extends Materiais {
    String []descricao = {"alta resistência à oxidação atmosférica"};
    String [] opcoes = {"Aço Inoxidavel"};
    double []precos= {5.30} ;
    int[] codigos = {90001};

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
