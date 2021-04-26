package tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementos.Elementos;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	Elementos ma = new Elementos();

	@Given("^que eu acesse \"([^\"]*)\"$")
	public void que_eu_acesse(String arg1) throws Throwable {
		metodos.abrirNavegador(arg1);

	}

	@Given("^clicar no botao abrir conta$")
	public void clicar_no_botao_abrir_conta() throws Throwable {

		metodos.clicar(ma.btnAbrirConta);
		metodos.clicar(ma.btnNovaConta);
		metodos.esperar(4000);

	}

	@When("^preencher os campos obrigatórios$")
	public void preencher_os_campos_obrigatórios() throws Throwable {

		metodos.preencher(ma.nome, "Joao Saulo");
		metodos.preencher(ma.telefone, "(11)878365554");
		metodos.preencher(ma.email, "marcos.ma@gmail.com");
		metodos.preencher(ma.cpf, "76278360691");
		metodos.esperar(4000);
	}

	@Then("^formulário de conta enviado com sucesso$")
	public void formulário_de_conta_enviado_com_sucesso() throws Throwable {
		metodos.validarTexto(ma.btnItensPorTexto, "Seja Original");
		metodos.clicar(ma.btnEnviar);
		metodos.esperar(5000);
		metodos.validarElementExists(ma.btnSaberMais, "Quer saber mais? ");
		metodos.validarElementExists(ma.btnLogoOriginal, "Banco Original");
		metodos.screenShot("AbrirConta");
		metodos.fecharBrowser();
	}

}
