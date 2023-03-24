package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Metodos extends Browser {
	public void validarPopUp(By elemento, int qtdClicks) {
		WebElement popUp = driver.findElement(elemento);
		do {
			clicar(elemento);
			qtdClicks--;
		} while (popUp.isDisplayed() && qtdClicks > 0);
	}

	public void escrever(By elemento, String texto) {

		adriver().findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	

	public void screenshot(String nomeSrc) throws IOException {

		TakesScreenshot srcShot = ((TakesScreenshot) adriver());
		java.io.File scrFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Evidencias/" + nomeSrc + ".png");
		FileUtils.copyFile(scrFile, destFile);

		
	}
	 public void scrollPage(int n1, int n2) { 
         JavascriptExecutor jsscroll = (JavascriptExecutor) driver; 
         jsscroll.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");
	 
	 }
	 
}