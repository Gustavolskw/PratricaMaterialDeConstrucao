package Model;

public class Tijolos {
    String []descricao = {"feitos de argila e cozidos a altas temperaturas para torná-los resistentes à água e ao fogo.",
    "são feitos de materiais especiais que suportam altas temperaturas e são usados em fornos e chaminés.",
   "feitos de vidro triturado e são usados principalmente em aplicações decorativas."};
    String [] opcoes = {"Tijolos comuns", "Tijolos refratários","Tijolos de vidros"};
    double[] precos= {0.45, 7.20, 20 };

    int[] codigos = {89001, 89002, 89003};

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
