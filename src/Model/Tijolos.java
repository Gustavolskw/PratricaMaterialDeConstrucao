package Model;

public class Tijolos  extends Materiais{
    protected String []descricao = {"feitos de argila e cozidos a altas temperaturas para torná-los resistentes à água e ao fogo.",
    "são feitos de materiais especiais que suportam altas temperaturas e são usados em fornos e chaminés.",
   "feitos de vidro triturado e são usados principalmente em aplicações decorativas."};
    protected String [] opcoes = {"Tijolos comuns", "Tijolos refratários","Tijolos de vidros"};
    protected double[] precos= {0.45, 7.20, 20 };

    protected int[] codigos = {89001, 89002, 89003};

    public String[] getDescricao() {
        return descricao;
    }

    public void setDescricao(String[] descricao) {
        this.descricao = descricao;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }

    public double[] getPrecos() {
        return precos;
    }

    public void setPrecos(double[] precos) {
        this.precos = precos;
    }

    public int[] getCodigos() {
        return codigos;
    }

    public void setCodigos(int[] codigos) {
        this.codigos = codigos;
    }
}
