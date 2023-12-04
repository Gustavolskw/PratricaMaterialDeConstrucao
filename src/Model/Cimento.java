package Model;

public class Cimento  extends Materiais{
    String []descricao = {"é o tipo mais comum visto nos canteiros de obras e é usado em uma ampla variedade de aplicações de construção. Ele é feito de materiais como calcário, alumina, sílica, gesso e outros aditivos. ",
    "é produzido a partir de um processo diferente e é usado principalmente em aplicações de alta resistência, como estrutura de pontes e de edifícios.",
    "esse tipo de cimento endurece em um tempo maior em comparação com o Portland, sendo uma ótima alternativa para aplicações no qual é necessário tempo extra para trabalhar. "};
    String [] opcoes = {"Cimento Portland", "Cimento de alto-forno","Cimento de baixa hidratação"};
    double[] precos= {30, 29, 28};
    int[] codigos = {73001, 73002, 73003};
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
