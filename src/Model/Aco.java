package Model;

public class Aco extends Materiais {
    protected String []descricao = {"alta resistência à oxidação atmosférica"};
    protected  String [] opcoes = {"Aço Inoxidavel"};
    protected double []precos= {5.30} ;
    protected  int[] codigos = {90001};

    public String[] getDescricao() {
        return descricao;
    }

    public void setDescricao(String[] descricao) {
        this.descricao = descricao;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }

    public double[] getPrecos() {
        return precos;
    }

    public void setPrecos(double[] precos) {
        this.precos = precos;
    }

    public int[] getCodigos() {
        return codigos;
    }

    public void setCodigos(int[] codigos) {
        this.codigos = codigos;
    }
}
