package test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.homePage;
import pom.recherche;

public class RechercheTest {
	public WebDriver driver;
	homePage hp = new homePage();

	@BeforeTest
	public void ovrir_site() {
		// homePage hp = new homePage();
		hp.ovrir_navigateur();
		driver = hp.getWebDriver();

	}

	@Test
	public void chercher_un_element() {

		recherche RC = new recherche();
		RC.recherche("dress");
		List<WebElement> articles = RC.article_en_stock();
		   
		  
		
		for (int i=0; i<articles.size();i++) {
			 
			System.out.println(articles.get(i).getText());

		}

	}

}
