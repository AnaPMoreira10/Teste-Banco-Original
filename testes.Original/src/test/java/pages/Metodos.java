package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import elementos.Elementos;

public class Metodos {

	Elementos element = new Elementos();
	 WebDriver driver;

	public void abrirNavegador(String urlApp) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(urlApp);
		driver.manage().window().maximize();

	}

	public void preencher(By elemento, String texto) throws InterruptedException {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) throws InterruptedException {

		driver.findElement(elemento).click();

	}

	public void esperar(int tempo) throws InterruptedException {

		Thread.sleep(tempo);
	}

	public void fecharBrowser() throws InterruptedException {
		driver.quit();
	}

	public void validarTexto(By elemento, String txtEsperado) {

		String texto = driver.findElement(elemento).getText();
		System.out.println("Texto apresentado na tela: " + texto);
		assertEquals(txtEsperado, texto);

	}

	public void validarElementExists(By elemento, String txtEsperado) {

		String texto = driver.findElement(elemento).getText();
		Assert.assertTrue(texto.contains(txtEsperado));
	}

	public void screenShot(String nome) throws IOException {

		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}

}
