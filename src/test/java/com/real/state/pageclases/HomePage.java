package com.real.state.pageclases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.real.state.baseclases.BasePage;
import com.real.state.baseclases.TopMenuClass;

public class HomePage extends BasePage {

	TopMenuClass topMenu;

	public HomePage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		topMenu = new TopMenuClass(driver, logger);
		PageFactory.initElements(driver, topMenu);
	}

	public TopMenuClass getTopMenu() {
		return topMenu;
	}

	@FindBy(xpath = "//ul[contains(@class,'browse-results-list')]/li//div[@class='card-header']/a")
	public List<WebElement> listResults;

	public void primerResultado() {
		driver.findElement(By.xpath("//*[text()='Acepto']")).click();
		System.out.println("Click en Acepto");
		
		for (WebElement houseResult : listResults) {
			//Click Result
			houseResult.click();
			System.out.println("Click en resultado");

			//Change to new Tab
			String mainTab = driver.getWindowHandle();
			System.out.println("Main Tab: " + mainTab);
			for (String tab : driver.getWindowHandles()) {
				if (!tab.equals(mainTab)) {
					driver.switchTo().window(tab);
					break;
				}
			}
			System.out.println("Cambiar pestaña 1");
			
			//New instance of Result Page to extract information
			ResultPage resultPage = new ResultPage(driver, logger);
			PageFactory.initElements(driver, resultPage);
			resultPage.getTitle();
			
			resultPage.characteristics();
			
			
			
			waitLoad(3);
			
			resultPage.closeWindow(mainTab);
		}

	}

}
