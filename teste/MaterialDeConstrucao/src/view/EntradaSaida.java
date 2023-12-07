package view;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import model.Produto;

public class EntradaSaida {

	public static int solicitaOpcao() {

		String[] opcoes = { "Cadastrar Produto", "Produtos Cadastrados", "Cadastrar Estoque", "Vender Produto",
				"Produtos em Estoque", "Cupons Gerados", "Valor Total de Cupons", "Sair Programa" };

		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();

	}

	public static int solicitarCodigo() {

		return Integer.parseInt(JOptionPane.showInputDialog("Informe a código do produto"));
	}

	public static String solicitarDescricao() {

		return JOptionPane.showInputDialog("Informe a descrição do produto");
	}

	public static double solicitarPreco() {

		return Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto"));
	}

	public static int solicitarQtdeProdutos() {

		return Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos"));
	}

	public static void exibirProdutosCadastrados(String informacoes) {
		JOptionPane.showMessageDialog(null, informacoes, "Produtos Cadastrados", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void exibirProdutosEstoque(String informacoes) {

		JOptionPane.showMessageDialog(null, informacoes, "Produtos em Estoque", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void exibirCuponsCadastrados(String informacoes) {

		JOptionPane.showMessageDialog(null, informacoes, "Cupons Gerados", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void exibirCuponsCalculados(String informacoes) {
		JOptionPane.showMessageDialog(null, informacoes, "Valor Total de Cupons", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void exibirVendaProduto(int qntdeVendida, Produto produto) {
		JOptionPane.showMessageDialog(null, "Você vendeu " + qntdeVendida + " " + produto.getDescricao());
	}

	public static void exibirCadastroProduto() {
		JOptionPane.showMessageDialog(null, "Produto cadastrado!");
	}

	public static void exibirCadastroEstoque() {
		JOptionPane.showMessageDialog(null, "Estoque cadastrado!");
	}

	public static void exibeValorInvalido() {
		JOptionPane.showMessageDialog(null, "Valor inválido!");
	}

	public static void exibeMsgSemCadastro() {

		JOptionPane.showMessageDialog(null, "Não é possível ver os produtos sem cadastra-los");
	}

	public static void exibeMsgSemCupons() {

		JOptionPane.showMessageDialog(null, "Não é possível ver os cupons sem fazer uma venda");
	}

	public static void exibeMsgSemValorTotal() {

		JOptionPane.showMessageDialog(null, "Você não possui nenhum cupom gerado");
	}

	public static void exibeMsgSemCadastroVenda() {

		JOptionPane.showMessageDialog(null, "Você precisa cadastrar produtos para vende-los");
	}

	public static void exibeMsgSairPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!");
	}

	public static void exibeMsgVenderProduto() {

		JOptionPane.showMessageDialog(null, "Produto não encontrado!");
	}

	public static void exibeMsgCodigoDuplicado() {

		JOptionPane.showMessageDialog(null, "O código digitado já foi cadastrado!");
	}

	public static void exibeMsgCodigoNaoExiste() {

		JOptionPane.showMessageDialog(null, "O código digitado não foi cadastrado ainda");
	}

	public static void exibeMsgSemEstoque() {

		JOptionPane.showMessageDialog(null, "Você não possui produtos cadastrados na sua loja");
	}

	public static void exibeMsgEstoqueZerado() {

		JOptionPane.showMessageDialog(null, "Você não possui essa quantidade de produtos em estoque");
	}

}
