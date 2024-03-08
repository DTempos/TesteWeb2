package Functions;

import core.BaseTest;
import managers.FileReaderManager;
import pages.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestesBlogAgibankFunctions {

	TelaInicialBlogAgibankPage telaInicialBlogAgibankPage = new TelaInicialBlogAgibankPage();
	TelaDePesquisaBlogPage telaDePesquisaBlogPage = new TelaDePesquisaBlogPage();
	TelaEmprestimoPessoalBlogAgibankPage telaEmprestimoPessoalBlogAgibankPage = new TelaEmprestimoPessoalBlogAgibankPage();


	public void abrirTelaInicialBlogAgibank() throws Exception {
		String url = FileReaderManager.getInstance().getConfigReader().getURLAutomation();
		telaInicialBlogAgibankPage.abrirPagina(url);
	}

	public void realizarPesquisaSobre(String assunto) throws Exception {
		telaInicialBlogAgibankPage.clicarLupaPesquisa();
		telaInicialBlogAgibankPage.informarAssuntoParaPesquisa(assunto);
		telaInicialBlogAgibankPage.clicarLupaPesquisa();
	}

	public void validarMensagemPedidoConfirmado(String assunto) throws Exception {
		String assuntoPesquisado = telaDePesquisaBlogPage.getAssuntoPesquisado();
		assertEquals(assunto, assuntoPesquisado);
		BaseTest.takeScreenshot("Resultados encontrados para a pesquisa " + assunto);
	}

	public void acessarSubmenuEmprestimoPessoal() throws Exception {
		telaInicialBlogAgibankPage.posicionarCursorMenuProdutos();
		telaInicialBlogAgibankPage.posicionarCursorSubmenuEmprestimos();
		telaInicialBlogAgibankPage.clicarSubmenuEmprestimoPessoal();
	}

	public void validarAcessoComSucessoTelaEmprestimoPessoal() throws Exception {
		String emprestimoPessoal = "Empréstimo Pessoal";
		String tituloTela = telaEmprestimoPessoalBlogAgibankPage.getTituloDaTela();
		assertEquals(emprestimoPessoal, tituloTela);
	}

	public void acessarConteudoSobreEmprestimoPessoal() throws Exception {
		telaEmprestimoPessoalBlogAgibankPage.clicarPrimeiroConteudoSobreEmprestimoPessoal();
	}

	public void validarAcessoAoConteudoSobreEmprestimoPessoal() throws Exception {
		String autor = "Redação Agibank";
		String autorConteudoTela = telaEmprestimoPessoalBlogAgibankPage.getAutorConteudo();
		assertTrue(autorConteudoTela.contains(autor));
		BaseTest.takeScreenshot("Conteúdo sobre Empréstimo Pessoal exibido na tela");
	}
}
