package pom;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class homePage {
	static WebDriver driver1;

	public void ovrir_navigateur() {
		WebDriverManager.edgedriver().setup();
		driver1 = new EdgeDriver();
		driver1.get("http://automationpractice.com/index.php");
		driver1.manage().window().maximize();

	}

	public int calcul_nombre_article() {
		int size = driver1.findElements(By.xpath("//*[@class='product-container']")).size();
		return size;

	}

	public WebDriver getWebDriver() {
		return driver1;

	}
}
