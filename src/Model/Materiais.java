package Model;

public class Materiais implements IMateriais{
    protected int quantidade;
    protected String produtoNovo;
    protected float  precoNovo;
    protected int codigoNovo;
    protected String descricaoNovo;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getProdutoNovo() {
        return produtoNovo;
    }

    public void setProdutoNovo(String produtoNovo) {
        this.produtoNovo = produtoNovo;
    }

    public float getPrecoNovo() {
        return precoNovo;
    }

    public void setPrecoNovo(float precoNovo) {
        this.precoNovo = precoNovo;
    }

    public int getCodigoNovo() {
        return codigoNovo;
    }

    public void setCodigoNovo(int codigoNovo) {
        this.codigoNovo = codigoNovo;
    }

    public String getDescricaoNovo() {
        return descricaoNovo;
    }

    public void setDescricaoNovo(String descricaoNovo) {
        this.descricaoNovo = descricaoNovo;
    }
}
