package Model;

public class Cimento  extends Materiais{
    protected  String []descricao = {"é o tipo mais comum visto nos canteiros de obras e é usado em uma ampla variedade de aplicações de construção. Ele é feito de materiais como calcário, alumina, sílica, gesso e outros aditivos. ",
    "é produzido a partir de um processo diferente e é usado principalmente em aplicações de alta resistência, como estrutura de pontes e de edifícios.",
    "esse tipo de cimento endurece em um tempo maior em comparação com o Portland, sendo uma ótima alternativa para aplicações no qual é necessário tempo extra para trabalhar. "};
    protected  String [] opcoes = {"Cimento Portland", "Cimento de alto-forno","Cimento de baixa hidratação"};
    protected double[] precos= {30, 29, 28};
    protected int[] codigos = {73001, 73002, 73003};

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
