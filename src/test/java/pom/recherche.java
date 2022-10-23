package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class recherche {
	homePage hp = new homePage();
	@Test
	public void recherche(String mot) {
		
		hp.getWebDriver().findElement(By.id("search_query_top")).sendKeys(mot);
		hp.getWebDriver().findElement(By.name("submit_search")).click();
		 

	}

	public List<WebElement> article_en_stock() {
		
		List<WebElement> liste_articles = hp.getWebDriver().findElements(By.xpath("//*[@class='available-now']"));
		return liste_articles;
	}

}
