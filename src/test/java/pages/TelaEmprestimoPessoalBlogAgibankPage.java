package pages;

import core.BasePage;
import core.BaseTest;

import java.time.Duration;

public class TelaEmprestimoPessoalBlogAgibankPage extends BasePage {

	/**
	 * Obtém o título exibido na tela
	 * @return
	 * @throws Exception
	 */
	public String getTituloDaTela() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@id = 'primary']/section/h1", Duration.ofSeconds(15));

		return dsl.obterTextoPorXpath("//*[@id = 'primary']/section/h1");
	}

	/**
	 * Clicar no primeiro conteúdo sobre Empréstimo Pessoal
	 * @throws Exception
	 */
	public void clicarPrimeiroConteudoSobreEmprestimoPessoal() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@id = 'main']/div/article/div/div/h2/a[1]", Duration.ofSeconds(30));
		BaseTest.takeScreenshot("Clicar no primeiro conteúdo sobre Empréstimo Pessoal");
		dsl.clicarPorXpath("//*[@id = 'main']/div/article/div/div/h2/a[1]");
	}

	public String getAutorConteudo() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@class = 'entry-header ']/div[2]/span[2]/a/span", Duration.ofSeconds(30));

		return dsl.obterTextoPorXpath("//*[@class = 'entry-header ']/div[2]/span[2]/a/span");
	}
}
