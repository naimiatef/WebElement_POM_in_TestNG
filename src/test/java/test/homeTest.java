package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.homePage;

public class homeTest {
	public WebDriver driver;
	homePage hp = new homePage();

	@Test
	public void afficher_nombre_article() {
		int nb = hp.calcul_nombre_article();
		System.out.println(nb);

	}
	
	@BeforeTest
	public void ovrir_site() {
		hp.ovrir_navigateur();
		driver = hp.getWebDriver();

	}
}
