package Model;

public class Madeira extends Materiais {
    protected String []descricao = {" é resultado de de uma única peça de madeira, sendo a opção mais resistente em comparação com outros tipos de madeira. ",
    "é formada a partir de camadas de madeira unidas, sendo menos resistente do que a madeira maciça. ",
    "essa opção é ótima para ambientes externos, já que ela é um tipo de madeira tratada quimicamente para aumentar a sua resistência a insetos e a umidade. "};
    protected String [] opcoes = {"Madeira maciça","Madeira laminada","Madeira tratada"};
    protected double[] precos= {399, 78, 80};
    protected int[] codigos = {88001, 88002, 88003};



    public String[] getDescricao() {
        return descricao;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public double[] getPrecos() {
        return precos;
    }
    public int[] getCodigos() {
        return codigos;
    }


}
