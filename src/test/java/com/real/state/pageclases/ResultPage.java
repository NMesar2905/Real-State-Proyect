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
import com.real.state.Inmueble;
import com.real.state.baseclases.BasePage;
import com.real.state.baseclases.TopMenuClass;

public class ResultPage extends BasePage {

	TopMenuClass topMenu;

	private String habitacionesCSV;
	private String banosCSV;
	private String estratoCSV;
	private String codigoInmuebleCSV;
	private String barrioComunCSV;
	private String precioCSV;
	private String antiguedadCSV;
	private String areaConstruidaCSV;
	private String areaPrivadaCSV;
	private String valorAdministracionCSV;
	private String parqueaderosCSV;

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

	public Inmueble characteristics() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		try {
			if (habitaciones.isDisplayed()) {
//				System.out.println("Habitaciones: " + habitaciones.getText().replaceAll("[^0-9]", ""));
				habitacionesCSV = habitaciones.getText().replaceAll("[^0-9]", "");
			}
		} catch (Exception e) {
//			System.out.println("Valor: Habitaciones - no encontrado");
			habitacionesCSV = "No Encontrado";
		}

		try {
			if (banos.isDisplayed()) {
//				System.out.println("Baños: " + banos.getText().replaceAll("[^0-9]", ""));
				banosCSV = banos.getText().replaceAll("[^0-9]", "");
			}
		} catch (Exception e) {
//			System.out.println("Valor: Baños - no encontrado");
			banosCSV = "No Encontrado";
		}

		try {
			if (estrato.isDisplayed()) {
//				System.out.println("Estrato: " + estrato.getText().replaceAll("[^0-9]", ""));
				estratoCSV = estrato.getText().replaceAll("[^0-9]", "");
			}
		} catch (Exception e) {
//			System.out.println("Valor: Estrato - no encontrado");
			estratoCSV = "No Encontrado";
		}

		try {
			if (codigoInmueble.isDisplayed()) {
//				System.out.println("Código inmueble: " + codigoInmueble.getText());
				codigoInmuebleCSV = codigoInmueble.getText();
			}
		} catch (Exception e) {
//			System.out.println("Valor: Código inmueble - no encontrado");
			codigoInmuebleCSV = "No Encontrado";
		}

		try {
			if (barrioComun.isDisplayed()) {
//				System.out.println("Barrio común: " + barrioComun.getText());
				barrioComunCSV = barrioComun.getText();
			}
		} catch (Exception e) {
//			System.out.println("Valor: Barrio común - no encontrado");
			barrioComunCSV = "No Encontrado";
		}

		try {
			if (precio.isDisplayed()) {
//				System.out.println("Precio: " + precio.getText());
				precioCSV = precio.getText();
			}
		} catch (Exception e) {
//			System.out.println("Valor: Precio - no encontrado");
			precioCSV = "No Encontrado";
		}

		try {
			if (antiguedad.isDisplayed()) {
//				System.out.println("Antigüedad: " + antiguedad.getText());
				antiguedadCSV = antiguedad.getText();
			}
		} catch (Exception e) {
//			System.out.println("Valor: Antigüedad - no encontrado");
			antiguedadCSV = "No Encontrado";
		}

		try {
			if (areaConstruida.isDisplayed()) {
//				System.out.println("Área construida: " + areaConstruida.getText());
				areaConstruidaCSV = areaConstruida.getText();
			}
		} catch (Exception e) {
//			System.out.println("Valor: Área construida - no encontrado");
			areaConstruidaCSV = "No Encontrado";
		}

		try {
			if (areaPrivada.isDisplayed()) {
//				System.out.println("Área privada: " + areaPrivada.getText());
				areaPrivadaCSV = areaPrivada.getText();
			}
		} catch (Exception e) {
//			System.out.println("Valor: Área privada - no encontrado");
			areaPrivadaCSV = "No Encontrado";
		}

		try {
			if (valorAdministracion.isDisplayed()) {
//				System.out.println("Valor administración: " + valorAdministracion.getText());
				valorAdministracionCSV = habitaciones.getText();
			}
		} catch (Exception e) {
//			System.out.println("Valor: Valor administración - no encontrado");
			valorAdministracionCSV = "No Encontrado";
		}

		try {
			if (parqueaderos.isDisplayed()) {
//				System.out.println("Parqueaderos: " + parqueaderos.getText());
				parqueaderosCSV = parqueaderos.getText();
			}
		} catch (Exception e) {
//			System.out.println("Valor: Parqueaderos - no encontrado");
			parqueaderosCSV = "No Encontrado";
		}

		return new Inmueble(codigoInmuebleCSV, habitacionesCSV, banosCSV, estratoCSV, barrioComunCSV, precioCSV,
				antiguedadCSV, areaConstruidaCSV, areaPrivadaCSV, valorAdministracionCSV, parqueaderosCSV);

	}

	public void closeWindow(String mainTab) {
		driver.close();
		driver.switchTo().window(mainTab);
	}

}
