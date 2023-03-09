package men;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest extends BaseClass{

	@Test
	public void add() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kalkifashion.com/");
	}
}
