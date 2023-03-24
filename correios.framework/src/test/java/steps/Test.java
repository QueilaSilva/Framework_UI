package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Test {
	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();

	@Given("que entre no site {string}")
	public void que_entre_no_site(String string) {
		metodos.abrirBrowser(string);
	}

	@When("digito avenida")
	public void digito_avenida() {
		metodos.validarPopUp(elemento.btnCookie, 3);

	}

	@When("clico na lupa")
	public void clico_na_lupa() {
		metodos.scrollPage(0, 200);
		metodos.escrever(elemento.menuBuscarAv, "Avenida dos autonomistas");
		metodos.clicar(elemento.btnLupaBuscarAv);
	}

	@Then("resultados validos")
	public void resultados_validos() throws IOException {
		metodos.screenshot("CT01");
		metodos.fecharNavegador(null);
	}

	@Given("que esteja no site  {string}")
	public void que_esteja_no_site(String string) {
		metodos.abrirBrowser(string);

	}

	@Given("digito cep enexistente")
	public void digito_cep_enexistente() {
		metodos.validarPopUp(elemento.btnCookie, 3);
		metodos.scrollPage(0, 200);
		metodos.escrever(elemento.menuBuscarAv, "1546464654");
	}

	@When("clicar na lupa")
	public void clicar_na_lupa() {
		metodos.clicar(elemento.btnLupaBuscarAv);
	}

	@Then("mensagem informa dados nao encontrados")
	public void mensagem_informa_dados_nao_encontrados() throws IOException {
		metodos.screenshot("CT02");
		metodos.fecharNavegador(null);

	}
}