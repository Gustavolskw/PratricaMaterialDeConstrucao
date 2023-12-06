package Model;

public class ProdutoNovo extends Materiais{
    protected String produtoNovo;
    protected float  precoNovo;
    protected int codigoNovo;
    protected String descricaoNovo;
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
