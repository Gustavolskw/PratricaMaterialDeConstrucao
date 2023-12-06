package Model;

public class Plastico  extends Materiais{
    protected  String descricao = "boa resistência a intempéries, isolamento elétrico e autoextinguível. ";
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
