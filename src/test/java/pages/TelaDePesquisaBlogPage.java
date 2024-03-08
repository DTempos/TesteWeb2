package pages;

import core.BasePage;

import java.time.Duration;

public class TelaDePesquisaBlogPage extends BasePage {

	/**
	 * Assunto pesquisado na barra de pesquisa
	 * @return
	 * @throws Exception
	 */
	public String getAssuntoPesquisado() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@id = 'primary']/section/h1/span", Duration.ofSeconds(15));

		return dsl.obterTextoPorXpath("//*[@id = 'primary']/section/h1/span");
	}
}
