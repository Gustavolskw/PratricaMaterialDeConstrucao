package Model;

public class Plastico  extends Materiais{
    String []descricao = {"boa resistência a intempéries, boa resistência química, isolamento elétrico, boa resistência mecânica e atoxidade, além de ser autoextinguível. "};
    String [] opcoes = {"PVC"};

    double[] precos= {16};
    int[] codigos = {87771};

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
