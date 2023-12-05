package Controller;

import Model.Materiais;
import Model.MaterialDeConstrucao;
import Model.Tijolos;
import View.EntradaSaida;

import java.util.ArrayList;
import java.util.Arrays;

public class Controller {
    MaterialDeConstrucao  MaterialDeConstrucao = null;
    public void start(){
        this.MaterialDeConstrucao = new MaterialDeConstrucao();
        ArrayList<Materiais> listaDeMateriais= new ArrayList<Materiais>();
        ArrayList<Materiais> listaDeCadastrados= new ArrayList<Materiais>();
        ArrayList<Materiais> listaDeEntrada= new ArrayList<Materiais>();
        boolean codigoExistente = false;


        int escolha = EntradaSaida.solicitaEscolha();


        do {
            switch (escolha){
                case 0 :
                    //cadastro de produto
                    Materiais novoMaterial = new Materiais();
                    novoMaterial.setProdutoNovo(EntradaSaida.gerarNovoProduto());
                    novoMaterial.setDescricaoNovo(EntradaSaida.gerarNovaDescricao());
                    novoMaterial.setCodigoNovo(EntradaSaida.gerarNovoCodigo());
                    novoMaterial.setPrecoNovo(EntradaSaida.gerarNovoPreco());
                    novoMaterial.setQuantidade(EntradaSaida.quantidadeDeProdutos());
					listaDeCadastrados.add(novoMaterial);
                    for(Materiais mat : listaDeCadastrados){
                        System.out.println(mat.getCodigoNovo());
                    }
                    novoMaterial.setCodigoNovo(897652);
                    listaDeCadastrados.set(listaDeCadastrados.indexOf(0), novoMaterial);

                    break;
                case 1:
                    //Entrada de estoque de produto no estoque
                    String produto = EntradaSaida.solicitaEscolhaDeProduto();
                    if(produto.equalsIgnoreCase("Aço")){

                    }else if(produto.equalsIgnoreCase("Cimento")){

                    } else if (produto.equalsIgnoreCase("Madeira")) {

                    } else if (produto.equalsIgnoreCase("Plastico")) {

                    } else if (produto.equalsIgnoreCase("Tijolo")) {

                    }else{
                        //vidro


                    }
                    break;
                case 2:
                    //verificar lista do estoque
                    break;
            }
        }while(escolha!=3);





















    }
}
