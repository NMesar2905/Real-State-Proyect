package com.real.state.pageclases;

import com.real.state.*;

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
import com.real.state.utilities.DateUtils;

public class HomePage extends BasePage {

	TopMenuClass topMenu;

	static InmubeleExtractor extractor = new InmubeleExtractor();

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

	@FindBy(xpath = "//*[@class = 'page-item'][8]")
	public WebElement numResutltPages;

	@FindBy(xpath = "//*[@class = 'item-icon-next page-item']")
	public WebElement nextPageButton;

	public void startScraping() {
		driver.findElement(By.xpath("//*[text()='Acepto']")).click();
		System.out.println("Click en Acepto");

		// Number of Pages
		int numPages = Integer.parseInt(numResutltPages.getText());
		for (int i = 0; i < numPages; i++) {

			System.out.println("-------------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Página Numero: " + (i + 1));
			extractPropertyInfo();
			nextPageButton.click();

			HomePage homePage = new HomePage(driver, logger);
			PageFactory.initElements(driver, homePage);

		}
		
		generateCSV(extractor.getInmuebles(), System.getProperty("user.dir") + "/cvs-files/"+ DateUtils.getTimeStamp()+".csv");

	}

	private void extractPropertyInfo() {

		int property = 1;
		for (WebElement houseResult : listResults) {
			// Click Result
			houseResult.click();
//			System.out.println("Click en resultado");

			// Change to new Tab
			String mainTab = driver.getWindowHandle();
//			System.out.println("Main Tab: " + mainTab);
			for (String tab : driver.getWindowHandles()) {
				if (!tab.equals(mainTab)) {
					driver.switchTo().window(tab);
					break;
				}
			}
//			System.out.println("Cambiar pestaña 1");

			// New instance of Result Page to extract information
			ResultPage resultPage = new ResultPage(driver, logger);
			PageFactory.initElements(driver, resultPage);
//			resultPage.getTitle();

			extractor.addInmueble(resultPage.characteristics());
			System.out.println("Propiedad número: " + property);

			waitLoad(1);

			resultPage.closeWindow(mainTab);
			property++;
		}

	}
	
	public void generateCSV(List<Inmueble> inmuebles, String filePath) {
		CVSExporter exporter = new CVSExporter();
		exporter.exportToCSV(inmuebles, filePath);
	}

}
