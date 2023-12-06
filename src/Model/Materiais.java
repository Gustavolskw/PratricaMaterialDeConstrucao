package Model;

public class Materiais implements IMateriais{
    protected int quantidade;
    protected int entradaQtd;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getEntradaQtd() {
        return entradaQtd;
    }

    public void setEntradaQtd(int entradaQtd) {
        this.entradaQtd = entradaQtd;
    }
}
