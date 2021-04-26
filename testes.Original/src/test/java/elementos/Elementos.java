package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By btnAbrirConta = By.cssSelector(
			"body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");
	
	
	public By btnLogoOriginal = By.cssSelector(
			"#logo-original");
	
	public By btnSaberMais = By.cssSelector(
			"#section-2 > div.align > div.info-only-desk > p:nth-child(4)");
	
	public By btnNovaConta = By.id("bt1");
	public By  btnItensPorTexto = By.cssSelector(
			"#box > form > h4");
	
	public By nome = By.id("nome");
	public By telefone = By.id("telefone");
	public By email = By.id("email");
	public By cpf = By.id("cpf");
	public By btnEnviar = By.id("btnEnviar");

}
