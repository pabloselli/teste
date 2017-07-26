package utils;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setup {

	protected static WebDriver driver;

	@Before
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "/Users/pabloselli/Desktop/Projetos/eclipse_workspace/CWI-Teste/libs/drivers/chromedriverMac");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-fullscreen");
		driver = new ChromeDriver(options);
		driver.get("https://www.cwi.com.br");
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}
}
