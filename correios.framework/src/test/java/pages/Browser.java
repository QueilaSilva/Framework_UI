package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver driver;

	public static WebDriver adriver() {
		return driver;
	}

	public void abrirBrowser(String site) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	public void fecharNavegador(String fecharNavegador) {
		driver.quit();
	}
}
