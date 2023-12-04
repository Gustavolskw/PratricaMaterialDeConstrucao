package Model;

public class Vidros  extends Materiais{
    String []descricao = {"esse tipo de vidro passa por um processo de tratamento térmico para torná-lo mais resistente à quebra, sendo ótima solução para janelas e portas. ",
    "é constituído de camadas coladas com algum outro material, como por exemplo, o plástico. Isso serve para dar resistência a possíveis impactos. ",
    "esse vidro também é conhecido comercialmente como vidro espelhado, ele é um material com tratamento em metal que reflete a luz. Sendo ele, ideal para melhorar a privacidade e oferecer controle de calor - já que ele funciona como um isolante térmico. "};
    String [] opcoes = {"Vidro temperado", "Vidro laminado", "Vidro reflexivo"};
    double[] precos= {290, 190, 620};
    int[] codigos = {62001, 62002, 62003};

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
