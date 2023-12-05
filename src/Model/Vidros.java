package Model;

public class Vidros  extends Materiais{
    protected String descricao = "esse tipo de vidro passa por um processo de tratamento térmico para torná-lo mais resistente à quebra, sendo ótima solução para janelas e portas. ";
    protected  String  opcao = "Vidro temperado";
    protected double preco = 290;
    protected int codigo  = 62001;
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
