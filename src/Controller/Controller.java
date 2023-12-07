package Controller;

import Model.*;
import View.EntradaSaida;

import javax.swing.*;
import java.time.LocalDateTime;

public class Controller {
    MaterialDeConstrucao  matConstr = null;
    public void start(){
        this.matConstr = new MaterialDeConstrucao();
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

                                    Material novoMaterial = new Material();
                                    novoMaterial.setDescricao(EntradaSaida.gerarNovaDescricao());
									 int addCodigo = EntradaSaida.gerarNovoCodigo();
									 
									 while (this.matConstr.validaCodigo(addCodigo)) {
										  EntradaSaida.msgGeral("O c�digo digitado já foi cadastrado!", -1 );
										  addCodigo = EntradaSaida.gerarNovoCodigo();
									 }
                                    novoMaterial.setCodigo(addCodigo);
                                    novoMaterial.setPreco(EntradaSaida.gerarNovoPreco());
                                    novoMaterial.setQtdMaterial(EntradaSaida.quantidadeDeProdutos());
                                    novoMaterial.setDataEntrada(LocalDateTime.now());
									 this.matConstr.adicionaMaterial(novoMaterial);

                                    //cadastro de produto<<
                                    break;
                                case 1:

                                    //Entrada de estoque de produto no estoque>>
                                    if (this.matConstr.getListaDeMateriais().isEmpty()) {

                                        EntradaSaida.msgGeral("Sem Produtos em estoque para dar Entrada", JOptionPane.WARNING_MESSAGE);

                                    } else {

                                        int codigoEstoque = EntradaSaida.solicitarCodigo(this.matConstr.gerarListaDeEstoque());
                                        while (!this.matConstr.validaCodigo(codigoEstoque)) {
                                            EntradaSaida.msgGeral("Codigo Inexistente!!!",JOptionPane.WARNING_MESSAGE);
                                            codigoEstoque = EntradaSaida.solicitarCodigo(this.matConstr.gerarListaDeEstoque());
                                        }
                                        int qntdeEstoque = EntradaSaida.solicitarQtdeProdutos();
                                        this.matConstr.retornaEstoque(qntdeEstoque, codigoEstoque);
                                    }
                                    //Entrada de estoque de produto no estoque<<

                                    break;

                                case 2:
                                    //verificar lista do estoque
                                    int escolhaDeLista;
                                    escolhaDeLista = EntradaSaida.solicitaEscolhaDeLista();
                                    if(escolhaDeLista==0){
                                        EntradaSaida.exibirListaDeEstoque(this.matConstr.gerarListaDeEstoque());
                                    } else{
                                       EntradaSaida.exibirListaDeCuponsFiscais(this.matConstr.gerarListaDeNotas());
                                    }

                                    break;
                            }
                            //teste de saida no terminal>>



                            //teste de saida no terminal<<

                        } while (escolha != 3);
                    }else{
                        EntradaSaida.msgGeral("Senha Incorreta!!!", 2);
						
                    }
                    break;
                case 2:
                    //compras
                    if(this.matConstr.getListaDeMateriais().isEmpty()){
                        EntradaSaida.msgGeral("Sem Produtos em estoque para dar Entrada", JOptionPane.WARNING_MESSAGE);
                    }else{
                        int codigo  = EntradaSaida.solicitarCodigo(this.matConstr.gerarListaparaCompra());
                        int qtdParaVender = EntradaSaida.solicitarQtdComprar();
                        Material materialCompra = this.matConstr.retornaProduto(codigo);
                        if(materialCompra.getQtdMaterial() - qtdParaVender < 0){
                            EntradaSaida.msgGeral("Estoque zerado", JOptionPane.WARNING_MESSAGE);
                        }else {
                            this.matConstr.venderProduto(codigo, qtdParaVender);
                            Financeiro nota = new Financeiro();
                            nota.setDataVenda(LocalDateTime.now());
                            nota.setDescricao(materialCompra.getDescricao());
                            nota.setQuantidadeCompra(qtdParaVender);
                            nota.setPreco(materialCompra.getPreco());
                            nota.setValorTotal(materialCompra.getPreco() * qtdParaVender);
                            this.matConstr.gerarCupom(nota);

                        }






                    }
                    break;

            }
        }while(opcao!=2);
        EntradaSaida.msgGeral("Encerrando...", 1);





















    }
}
