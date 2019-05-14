package com.io.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentDetails {
	WebDriver driver;

	public PaymentDetails(WebDriver driver) {
		this.driver = driver;
	}
	
	By cardHolderName=By.name("txtFN");
	By debitCardNumber=By.name("debit");
	By cvvNumber=By.name("cvv");
	By cardExpirationMonth=By.name("month");
	By cardExpirationYear=By.name("year");
	
	public void giveCardHolderName() {
		driver.findElement(cardHolderName).sendKeys("Pallavi");
	}
	
	public void giveDebitCardName() {
		driver.findElement(debitCardNumber).sendKeys("PallaviBuroju");
	}
	
	public void giveCvvNumber() {
		driver.findElement(cvvNumber).sendKeys("111");
	}
	
	public void giveCardExpiryMonth() {
		driver.findElement(cardExpirationMonth).sendKeys("April");
	}
	
	public void giveCardExpiryYear() {
		driver.findElement(cardExpirationYear).sendKeys("2021");
	}
	
	public void clickNext() throws Exception {
		driver.findElement(By.id("btnPayment")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
}
