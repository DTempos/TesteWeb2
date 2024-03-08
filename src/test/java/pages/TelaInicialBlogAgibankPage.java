package pages;

import core.BasePage;
import core.BaseTest;

import java.time.Duration;

public class TelaInicialBlogAgibankPage extends BasePage {

	/**
	 * Abrir tela inicial do blog Agibank
	 * 
	 * @throws Exception
	 */
	public void abrirPagina(String url) throws Exception {
		dsl.abrirUrl(url);
	}
	
	/**
	 * Clicar na lupa de pesquisa
	 * @throws Exception
	 */
	public void clicarLupaPesquisa() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@class = 'ast-search-icon']/a/span[2]/*[name() = 'svg']", Duration.ofSeconds(30));
		BaseTest.takeScreenshot("Clicar na lupa de pesquisa");
		dsl.clicarPorXpath("//*[@class = 'ast-search-icon']/a/span[2]/*[name() = 'svg']");
	}

	/**
	 * Informar o assunto a ser pesquisado na barra de pesquisa
	 * @param assunto
	 * @throws Exception
	 */
	public void informarAssuntoParaPesquisa(String assunto) throws Exception {
		dsl.visibilidadeElementoPorId("search-field", Duration.ofSeconds(30));
		dsl.escrevePorId("search-field", assunto);
		BaseTest.takeScreenshot("Informado o assunto a ser pesquisado");
	}

	/**
	 * Posiciona o cursor sobre o menu Produtos no menu principal
	 * @throws Exception
	 */
	public void posicionarCursorMenuProdutos() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@id = 'primary-site-navigation-desktop']/div/ul/li[2]/a", Duration.ofSeconds(30));
		BaseTest.takeScreenshot("Exibir opções do menu Produtos no menu principal");
		dsl.mouseOver("//*[@id = 'primary-site-navigation-desktop']/div/ul/li[2]/a");
	}

	/**
	 * Posiciona o cursor sobre o submenu Empréstimos no menu principal
	 * @throws Exception
	 */
	public void posicionarCursorSubmenuEmprestimos() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@id = 'primary-site-navigation-desktop']/div/ul/li[2]/a/following-sibling::ul/li[1]/a", Duration.ofSeconds(30));
		BaseTest.takeScreenshot("Exibir opções do submenu Empréstimos no menu principal");
		dsl.mouseOver("//*[@id = 'primary-site-navigation-desktop']/div/ul/li[2]/a/following-sibling::ul/li[1]/a");
	}

	/**
	 * CLica no submenu Empréstimo Pessoal no menu principal
	 * @throws Exception
	 */
	public void clicarSubmenuEmprestimoPessoal() throws Exception {
		dsl.visibilidadeElementoPorXpath(
				"//*[@id = 'primary-site-navigation-desktop']/div/ul/li[2]/a/following-sibling::ul/li[1]/a/following-sibling::ul/li[2]/a", Duration.ofSeconds(30));
		BaseTest.takeScreenshot("Clicar submenu Empréstimo Pessoal no menu principal");
		dsl.clicarPorXpath(
				"//*[@id = 'primary-site-navigation-desktop']/div/ul/li[2]/a/following-sibling::ul/li[1]/a/following-sibling::ul/li[2]/a");
	}
}
