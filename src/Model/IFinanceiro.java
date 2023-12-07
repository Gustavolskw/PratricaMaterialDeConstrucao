package Model;

import java.time.LocalDateTime;

public interface IFinanceiro {
    public void setDataVenda(LocalDateTime dataVenda);
    public void setQuantidadeCompra(int quantidadeCompra);
    public void setDescricao(String descricao);
    public void setValorTotal(double valorTotal);
    public void setPreco(double preco);


}
