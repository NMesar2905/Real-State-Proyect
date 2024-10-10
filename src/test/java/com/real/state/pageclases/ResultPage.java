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

public class ResultPage extends BasePage{

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
	
	public void getTitle() {
		System.out.println("Título de la nueva Ventana: " + driver.getTitle());
	}
	
	public void characteristics() {
				
		System.out.println("---------------------------------------------");
		System.out.println("Habitaciones: " + habitaciones.getText().replaceAll("[^0-9]", ""));
		System.out.println("Baños: " + banos.getText().replaceAll("[^0-9]", ""));
		System.out.println("Estrato: " + estrato.getText().replaceAll("[^0-9]", ""));
		System.out.println("---------------------------------------------");
		
	}
	
	 public void closeWindow(String mainTab) {
	        driver.close();
	        driver.switchTo().window(mainTab);
	 }
	
	
	

}
