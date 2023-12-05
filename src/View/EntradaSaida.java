package View;

import javax.swing.*;

public class EntradaSaida {
    public static int solicitaEscolha() {
        String []opcoes = {"Cadastrar Novo Produto", "Entrada de produto", "Verificar Estoque", "Sair"};
        JComboBox<String>menu = new JComboBox<>(opcoes);
        JOptionPane.showConfirmDialog(null,menu,  "Escolha a opcao que deseja executar", JOptionPane.DEFAULT_OPTION );
        return menu.getSelectedIndex();
    }
    public static String solicitaEscolhaDeProduto(){
        String []opcoes = {"Aço","Cimento","Madeira", "Plastico", "Tijolo", "Vidro"};
        JComboBox<String>menu = new JComboBox<>(opcoes);
      JOptionPane.showConfirmDialog(null,menu,  "Entrada De produto", JOptionPane.DEFAULT_OPTION );
       if(menu.getSelectedIndex()==0){
           return "Aço";
        }else if(menu.getSelectedIndex()==1){
           return "Cimento";
       } else if (menu.getSelectedIndex()==2) {
           return "Madeira";
       }else if(menu.getSelectedIndex()==3){
           return "Plastico";
       } else if (menu.getSelectedIndex()==4) {
           return "Tijolo";
       }else {
           return "vidro";
       }
    }
    public static void exibirListaInventario(){

    }
    public static void exibirListaCadastrados(){

    }
    public static void exibirListaDeEntrada(){

    }
    public static String gerarNovoProduto(){
        return JOptionPane.showInputDialog(null,"Novo Produto");
    }
    public static int gerarNovoCodigo(){
        return Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o codigo do produto cadastrado"));
    }
    public static float gerarNovoPreco() {
        return Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o preço Unitario do produto cadastrado"));
    }
    public static String gerarNovaDescricao(){
        return JOptionPane.showInputDialog(null,"Digite a descriçao do produto");
    }
    public static int quantidadeDeProdutos(){
        return Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantdade para adicionar ao estoque"));
    }















}
