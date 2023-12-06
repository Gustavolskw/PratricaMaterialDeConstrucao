package View;

import Model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class EntradaSaida {
    public static int solicitaUsarioOuComprador() {
        String[]opcoes = {"Usuario", "Cliente","Desconectar"};
        return JOptionPane.showOptionDialog(null, "Escolha a opcao de serviços do material de construçao", "Material de Construçao ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
    }
    public static int solicitaEscolha() {
        String []opcoes = {"Cadastrar Novo Produto", "Entrada de produto", "Controle de Estoque", "Sair"};
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

    public static int solicitaEscolhaDeLista(){
        String [] option = {"Estoque", "Entradas", "Saidas"};
        return JOptionPane.showOptionDialog(null,"Escolha a Lista de Controle ", "Material de construção", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null , option, option[0] );

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
        int codigoGerado;
        String[] opcoes = {"Gerar", "Digitar"};
        int  escolha = JOptionPane.showOptionDialog(null, "Opcoes de criação de codigo novo", "Material de Construçao ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if (escolha == 0 ){
            Random random = new Random();
            return codigoGerado = random.nextInt(1000,999999);
        }else{
            codigoGerado= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo do novo Produto"));
            return codigoGerado;
        }
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

    public static String loginDeEntrada(){
        return JOptionPane.showInputDialog(null, "Login : ./User_Material_Construcao ", "Login de acesso de usuario", JOptionPane.QUESTION_MESSAGE);
    }
    public static void msgGeral(String mensagem, int tipoDeMenagem  ){
        JOptionPane.showMessageDialog(null, mensagem, "Material de Construçao", tipoDeMenagem);
    }
    public static void materialDeEntrada(String material, String descricao, int codigo, double preco){
        JOptionPane.showMessageDialog(null, "Material: "+material+"\nDescrição: "+descricao+"\nCódigo: "+codigo+"\nPreço: R$"+preco+"UN");

    }

    public static void exibirListaDeEstoque(String listaDeEstoque) {
        JOptionPane.showMessageDialog(null, listaDeEstoque, "Material de Construção", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void exibeNoterminal(ArrayList<Materiais>listaDeMateriais){
		 String info1 ="";
		 
		 
        for (Materiais material   : listaDeMateriais) {
            if (material instanceof Aco acoMat) {
                info1 += acoMat.getOpcao() + " " + acoMat.getDescricao() + " " + acoMat.getCodigo() + " " + acoMat.getPreco() + " " + acoMat.getQuantidade() + "\n";
            } else if (material instanceof Cimento cimentoMat) {
                info1 += cimentoMat.getOpcao() + " " + cimentoMat.getDescricao() + " " + cimentoMat.getCodigo() + " " + cimentoMat.getPreco() + " " + cimentoMat.getQuantidade() + "\n";
            } else if (material instanceof Madeira madeiraMat) {
                System.out.println(madeiraMat.getOpcao() + " " + madeiraMat.getDescricao() + " " + madeiraMat.getCodigo() + " " + madeiraMat.getPreco() + " " + madeiraMat.getQuantidade() + "\n");
            } else if (material instanceof Plastico plasMat) {
                System.out.println(plasMat.getOpcao() + " " + plasMat.getDescricao() + " " + plasMat.getCodigo() + " " + plasMat.getPreco() + " " + plasMat.getQuantidade() + "\n");
            } else if (material instanceof Tijolos tijoMat) {
                System.out.println(tijoMat.getOpcao() + " " + tijoMat.getDescricao() + " " + tijoMat.getCodigo() + " " + tijoMat.getPreco() + " " + tijoMat.getQuantidade() + "\n");
            } else if (material instanceof Vidros vidroMat) {
                System.out.println(vidroMat.getOpcao() + " " + vidroMat.getDescricao() + " " + vidroMat.getCodigo() + " " + vidroMat.getPreco() + " " + vidroMat.getQuantidade() + "\n");
            } else if (material instanceof ProdutoNovo prodNovoMat) {
                System.out.println(prodNovoMat.getProdutoNovo() + " " + prodNovoMat.getDescricaoNovo() + " " + prodNovoMat.getCodigoNovo() + " " + prodNovoMat.getPrecoNovo() + " " + prodNovoMat.getQuantidade() + "\n");
            }
        }
		JOptionPane.showMessageDialog(null, info1 , "", -1);
    }
}
