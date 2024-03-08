package stepsDefinition;

import Functions.TestesBlogAgibankFunctions;
import core.BaseTest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class TestesBlogAgibankSteps extends BaseTest {

	static TestesBlogAgibankFunctions testesBlogAgibankFunctions = new TestesBlogAgibankFunctions();

	@Dado("que acesso a tela inicial do blog Agibank")
	public void queAcessoATelaInicialDoBlogAgibank() throws Throwable {
		testesBlogAgibankFunctions.abrirTelaInicialBlogAgibank();
	}

	@Quando("realizar pesquisa sobre {string}")
	public void realizarPesquisaSobreStr(String assunto) throws Throwable {
		testesBlogAgibankFunctions.realizarPesquisaSobre(assunto);
	}

	@Entao("validar que pesquisou com sucesso sobre {string}")
	public void validarQuePesquisouComSucessoSobreStr(String assunto) throws Throwable {
		testesBlogAgibankFunctions.validarMensagemPedidoConfirmado(assunto);
	}

	@Quando("acessar o submenu sobre Empréstimo Pessoal no menu de Produtos da tela principal")
	public void acessarOSubmenuSobreEmprestimoPessoalNoMenuDeProdutosDaTelaPrincipal() throws Throwable {
		testesBlogAgibankFunctions.acessarSubmenuEmprestimoPessoal();
		testesBlogAgibankFunctions.validarAcessoComSucessoTelaEmprestimoPessoal();
	}

	@Quando("acessar conteúdo sobre Empréstimo Pessoal")
	public void acessarConteudoSobreEmprestimoPessoal() throws Throwable {
		testesBlogAgibankFunctions.acessarConteudoSobreEmprestimoPessoal();
	}

	@Entao("validar acesso com sucesso ao conteúdo sobre Empréstimo Pessoal")
	public void validarQuePesquisouComSucessoSobreStr() throws Throwable {
		testesBlogAgibankFunctions.validarAcessoAoConteudoSobreEmprestimoPessoal();
	}
}
