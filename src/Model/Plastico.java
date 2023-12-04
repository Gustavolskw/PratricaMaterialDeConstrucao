package Model;

public class Plastico  extends Materiais{
    protected  String []descricao = {"boa resistência a intempéries, boa resistência química, isolamento elétrico, boa resistência mecânica e atoxidade, além de ser autoextinguível. "};
    protected String [] opcoes = {"PVC"};

    protected double[] precos= {16};
    protected int[] codigos = {87771};

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
