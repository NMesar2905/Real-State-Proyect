package com.real.state.testclases;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.real.state.baseclases.BasePage;
import com.real.state.baseclases.BaseTest;
import com.real.state.baseclases.TopMenuClass;
import com.real.state.pageclases.HomePage;
import com.real.state.pageclases.SearchResultPage;




public class MetroCuadradoTests extends BaseTest {

	TopMenuClass topMenu;

	HomePage homePage;
	
	SearchResultPage searchResultPage;
	
	@Test
	public void realStateScraping() {
		logger = report.createTest("Metro Cuadrado Test");
		invokeBrowser("Chrome");
		BasePage pageBase = new BasePage(driver, logger);
		PageFactory.initElements(driver, pageBase);
		homePage = pageBase.openApplication();
		homePage.primerResultado();
	}
	
	
	

	

}
