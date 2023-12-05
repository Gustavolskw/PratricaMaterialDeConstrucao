package Model;

public class Cimento  extends Materiais{
    protected  String descricao = "é o tipo mais comum visto nos canteiros de obras e é usado em uma ampla variedade de aplicações de construção. Ele é feito de materiais como calcário, alumina, sílica, gesso e outros aditivos. ";
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
