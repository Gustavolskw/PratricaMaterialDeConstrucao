package Model;

public class Cimento  extends Materiais{
    protected  String descricao = "usado em uma ampla variedade de aplicações de construção.";
    protected  String  opcao = "Cimento Portland";
    protected double preco = 30;
    protected int  codigo = 73001;
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
