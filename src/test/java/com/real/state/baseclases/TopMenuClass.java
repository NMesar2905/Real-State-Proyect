package com.real.state.baseclases;


import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.real.state.pageclases.HomePage;
import com.real.state.pageclases.SearchResultPage;


public class TopMenuClass extends BasePage {

	public TopMenuClass(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

}
