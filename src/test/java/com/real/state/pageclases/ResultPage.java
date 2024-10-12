package com.real.state.pageclases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.real.state.baseclases.BasePage;
import com.real.state.baseclases.TopMenuClass;

public class ResultPage extends BasePage {

	TopMenuClass topMenu;

	public ResultPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		topMenu = new TopMenuClass(driver, logger);
		PageFactory.initElements(driver, topMenu);
	}

	@FindBy(xpath = "(//*[text()='Habitaciones']/../..//h2)[2]")
	public WebElement habitaciones;

	@FindBy(xpath = "(//*[text()='Baños']/../..//h2)[2]")
	public WebElement banos;

	@FindBy(xpath = "(//*[text()='Estrato']/../..//h2)[2]")
	public WebElement estrato;

	@FindBy(xpath = "//h3[contains(text(),'inmueble')]/../p")
	public WebElement codigoInmueble;

	@FindBy(xpath = "//h3[contains(text(),'Barrio')]/../p")
	public WebElement barrioComun;

	@FindBy(xpath = "//h3[contains(text(),'Precio')]/../p")
	public WebElement precio;

	@FindBy(xpath = "//h3[contains(text(),'Antigüedad')]/../p")
	public WebElement antiguedad;

	@FindBy(xpath = "//h3[contains(text(),'construida')]/../p")
	public WebElement areaConstruida;

	@FindBy(xpath = "//h3[contains(text(),'privada')]/../p")
	public WebElement areaPrivada;

	@FindBy(xpath = "//h3[contains(text(),'Valor')]/../p")
	public WebElement valorAdministracion;

	@FindBy(xpath = "//h3[contains(text(),'Parqueaderos')]/../p")
	public WebElement parqueaderos;

	public void getTitle() {
		System.out.println("Título de la nueva Ventana: " + driver.getTitle());
	}

	public void characteristics() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		System.out.println("---------------------------------------------");

		try {
			if (habitaciones.isDisplayed()) {
				System.out.println("Habitaciones: " + habitaciones.getText().replaceAll("[^0-9]", ""));
			}
		} catch (Exception e) {
			System.out.println("Valor: Habitaciones - no encontrado");
		}

		try {
			if (banos.isDisplayed()) {
				System.out.println("Baños: " + banos.getText().replaceAll("[^0-9]", ""));
			}
		} catch (Exception e) {
			System.out.println("Valor: Baños - no encontrado");
		}

		try {
			if (estrato.isDisplayed()) {
				System.out.println("Estrato: " + estrato.getText().replaceAll("[^0-9]", ""));
			}
		} catch (Exception e) {
			System.out.println("Valor: Estrato - no encontrado");
		}

		try {
			if (codigoInmueble.isDisplayed()) {
				System.out.println("Código inmueble: " + codigoInmueble.getText());
			}
		} catch (Exception e) {
			System.out.println("Valor: Código inmueble - no encontrado");
		}

		try {
			if (barrioComun.isDisplayed()) {
				System.out.println("Barrio común: " + barrioComun.getText());
			}
		} catch (Exception e) {
			System.out.println("Valor: Barrio común - no encontrado");
		}

		try {
			if (precio.isDisplayed()) {
				System.out.println("Precio: " + precio.getText());
			}
		} catch (Exception e) {
			System.out.println("Valor: Precio - no encontrado");
		}

		try {
			if (antiguedad.isDisplayed()) {
				System.out.println("Antigüedad: " + antiguedad.getText());
			}
		} catch (Exception e) {
			System.out.println("Valor: Antigüedad - no encontrado");
		}

		try {
			if (areaConstruida.isDisplayed()) {
				System.out.println("Área construida: " + areaConstruida.getText());
			}
		} catch (Exception e) {
			System.out.println("Valor: Área construida - no encontrado");
		}

		try {
			if (areaPrivada.isDisplayed()) {
				System.out.println("Área privada: " + areaPrivada.getText());
			}
		} catch (Exception e) {
			System.out.println("Valor: Área privada - no encontrado");
		}

		try {
			if (valorAdministracion.isDisplayed()) {
				System.out.println("Valor administración: " + valorAdministracion.getText());
			}
		} catch (Exception e) {
			System.out.println("Valor: Valor administración - no encontrado");
		}

		try {
			if (parqueaderos.isDisplayed()) {
				System.out.println("Parqueaderos: " + parqueaderos.getText());
			}
		} catch (Exception e) {
			System.out.println("Valor: Parqueaderos - no encontrado");
		}

		System.out.println("---------------------------------------------");

	}

	public void closeWindow(String mainTab) {
		driver.close();
		driver.switchTo().window(mainTab);
	}

}
