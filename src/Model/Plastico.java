package Model;

public class Plastico  extends Materiais{
    protected  String descricao = "boa resistência a intempéries, boa resistência química, isolamento elétrico, boa resistência mecânica e atoxidade, além de ser autoextinguível. ";
    protected String opcao = "PVC";
    protected double preco =16;
    protected int codigo = 87771;
    public String getDescricao() {
        return descricao;
    }

    public String getOpcao() {
        return opcao;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigo() {
        return codigo;
    }


}
