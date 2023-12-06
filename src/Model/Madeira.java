package Model;

public class Madeira extends Materiais {
    protected String descricao = " é opção mais resistente em comparação com outros tipos de madeira. ";
    protected String opcao = "Madeira Maciça";
    protected double preco= 399;
    protected int codigo  = 8801;

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
