package Controller;

import Model.*;
import View.EntradaSaida;

import javax.accessibility.AccessibleAction;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Controller {
    MaterialDeConstrucao  matConstr = null;
    public void start(){
        this.matConstr = new MaterialDeConstrucao();
        Aco cadasAco = new Aco();
        Cimento cadasCimento = new Cimento();
        Madeira cadasMadeira = new Madeira();
        Plastico cadasPlastico = new Plastico();
        Tijolos cadasTijolos = new Tijolos();
        Vidros cadasVidros = new Vidros();
        boolean codigoExistente = false;
        int escolha;
        int opcao;
        int entradaMaterial = 0;
        String login;

        do {
            opcao = EntradaSaida.solicitaUsarioOuComprador();
            switch (opcao) {
                case 0:

                    //check de senha do usuario do sistema

                    System.out.println(this.matConstr.getSenha());
                    login = EntradaSaida.loginDeEntrada();
                    if(login.equalsIgnoreCase(this.matConstr.getSenha())) {

                        do {
                            escolha = EntradaSaida.solicitaEscolha();
                            switch (escolha) {
                                case 0:

                                    //cadastro de produto>>

                                    ProdutoNovo novoMaterial = new ProdutoNovo();
                                    novoMaterial.setProdutoNovo(EntradaSaida.gerarNovoProduto());
                                    novoMaterial.setDescricaoNovo(EntradaSaida.gerarNovaDescricao());
                                    novoMaterial.setCodigoNovo(EntradaSaida.gerarNovoCodigo());
                                    novoMaterial.setPrecoNovo(EntradaSaida.gerarNovoPreco());
                                    novoMaterial.setQuantidade(EntradaSaida.quantidadeDeProdutos());
                                    this.matConstr.acionaCadastrado(novoMaterial);
									 this.matConstr.adicionaMaterial(novoMaterial);

                                    //cadastro de produto<<
                                    break;
                                case 1:

                                    //Entrada de estoque de produto no estoque>>

                                    String produto = EntradaSaida.solicitaEscolhaDeProduto();
                                    if (produto.equalsIgnoreCase("Aço")) {


                                        EntradaSaida.materialDeEntrada(cadasAco.getOpcao(), cadasAco.getDescricao(),cadasAco.getCodigo(), cadasAco.getPreco());
                                        entradaMaterial =  EntradaSaida.quantidadeDeProdutos();
                                        cadasAco.setQuantidade(this.matConstr.adicaoNoEstoque(cadasAco.getQuantidade(), entradaMaterial));
                                        if (!this.matConstr.getListaDeMateriais().contains(cadasAco)){
											 this.matConstr.adicionaMaterial(cadasAco);
                                        }

                                        cadasAco.setEntradaQtd(entradaMaterial);
										 this.matConstr.acionaEntrada(cadasAco);


                                    } else if (produto.equalsIgnoreCase("Cimento")) {


                                        EntradaSaida.materialDeEntrada(cadasCimento.getOpcao(), cadasCimento.getDescricao(),cadasCimento.getCodigo(), cadasCimento.getPreco());
                                        entradaMaterial =  EntradaSaida.quantidadeDeProdutos();
                                        cadasCimento.setQuantidade(this.matConstr.adicaoNoEstoque(cadasCimento.getQuantidade(), entradaMaterial));
                                        if (!this.matConstr.getListaDeMateriais().contains(cadasCimento)){
                                            this.matConstr.adicionaMaterial(cadasCimento);
                                        }

                                        cadasCimento.setEntradaQtd(entradaMaterial);
										 this.matConstr.acionaEntrada(cadasCimento);

                                    } else if (produto.equalsIgnoreCase("Madeira")) {

                                        EntradaSaida.materialDeEntrada(cadasMadeira.getOpcao(), cadasMadeira.getDescricao(),cadasMadeira.getCodigo(), cadasMadeira.getPreco());
                                        entradaMaterial =  EntradaSaida.quantidadeDeProdutos();
                                        cadasMadeira.setQuantidade(this.matConstr.adicaoNoEstoque(cadasMadeira.getQuantidade(), entradaMaterial));
                                        if (!this.matConstr.getListaDeMateriais().contains(cadasMadeira)){
											 this.matConstr.adicionaMaterial(cadasMadeira);
                                        }

                                        cadasMadeira.setEntradaQtd(entradaMaterial);
										 this.matConstr.acionaEntrada(cadasMadeira);

                                    } else if (produto.equalsIgnoreCase("Plastico")) {


                                        EntradaSaida.materialDeEntrada(cadasPlastico.getOpcao(), cadasPlastico.getDescricao(),cadasPlastico.getCodigo(), cadasPlastico.getPreco());
                                        entradaMaterial =  EntradaSaida.quantidadeDeProdutos();
                                        cadasPlastico.setQuantidade(this.matConstr.adicaoNoEstoque(cadasPlastico.getQuantidade(), entradaMaterial));
                                        if (!this.matConstr.getListaDeMateriais().contains(cadasPlastico)){
											 this.matConstr.adicionaMaterial(cadasPlastico);
                                        }

                                        cadasPlastico.setEntradaQtd(entradaMaterial);
										 this.matConstr.acionaEntrada(cadasPlastico);

                                    } else if (produto.equalsIgnoreCase("Tijolo")) {

                                        EntradaSaida.materialDeEntrada(cadasTijolos.getOpcao(), cadasTijolos.getDescricao(),cadasTijolos.getCodigo(), cadasTijolos.getPreco());
                                        entradaMaterial =  EntradaSaida.quantidadeDeProdutos();
                                        cadasTijolos.setQuantidade(this.matConstr.adicaoNoEstoque(cadasTijolos.getQuantidade(), entradaMaterial));
                                        if (!this.matConstr.getListaDeMateriais().contains(cadasTijolos)){
											 this.matConstr.adicionaMaterial(cadasTijolos);
                                        }

                                        cadasTijolos.setEntradaQtd(entradaMaterial);
										 this.matConstr.acionaEntrada(cadasTijolos);
                                    } else {
                                        //vidro


                                        EntradaSaida.materialDeEntrada(cadasVidros.getOpcao(), cadasVidros.getDescricao(),cadasVidros.getCodigo(), cadasVidros.getPreco());
                                        entradaMaterial =  EntradaSaida.quantidadeDeProdutos();
                                        cadasVidros.setQuantidade(this.matConstr.adicaoNoEstoque(cadasVidros.getQuantidade(), entradaMaterial));
                                        if (!this.matConstr.getListaDeMateriais().contains(cadasVidros)){
											 this.matConstr.adicionaMaterial(cadasVidros);
                                        }

                                        cadasVidros.setEntradaQtd(entradaMaterial);
										 this.matConstr.acionaEntrada(cadasVidros);

                                    }

                                    //Entrada de estoque de produto no estoque<<

                                    break;

                                case 2:
                                    //verificar lista do estoque
                                    int escolhaDeLista;
                                    escolhaDeLista = EntradaSaida.solicitaEscolhaDeLista();
                                    if(escolhaDeLista==0){
                                        this.matConstr.gerarListaDeEstoque();
                                    } else if (escolhaDeLista==1) {
                                       // EntradaSaida.exibirListaDeEstoque(this.matConstr.gerarListaDeEntrada());
                                    }else{
                                       // EntradaSaida.exibirListaDeEstoque(this.matConstr.gerarListaDeEstoque());
                                    }

                                    break;
                            }
                            //teste de saida no terminal>>
							 String retornoDeInfo = this.matConstr.gerarListaDeEstoque();
                            EntradaSaida.exibirListaDeEstoque(retornoDeInfo);
							 //EntradaSaida.exibeNoterminal(listaDeMateriais);

                            //teste de saida no terminal<<

                        } while (escolha != 3);
                    }else{
                        EntradaSaida.msgGeral("Senha Incorreta!!!", 2);
						
                    }
                    break;
                case 2:
                    //compras
                    break;

            }
        }while(opcao!=2);
        EntradaSaida.msgGeral("Encerrando...", 1);





















    }
}
