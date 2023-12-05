package Model;

public class Tijolos  extends Materiais{
    protected String descricao = "feitos de argila e cozidos a altas temperaturas para torná-los resistentes à água e ao fogo.";
    protected String opcao = "Tijolo Comum";
    protected double preco= 0.45;
    protected int codigo = 89001;

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
