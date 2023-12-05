package Model;

public class Aco extends Materiais {
    protected String descricao = "alta resistência à oxidação atmosférica";
    protected  String opcao = "Aço Inoxidavel";
    protected double preco= 5.30 ;
    protected  int codigo = 90001;
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
