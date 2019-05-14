package com.io.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ConferenceRegistration {
	
	WebDriver driver;
	public ConferenceRegistration(WebDriver driver) {
		this.driver=driver;
	}
	
	By firstName=By.name("txtFN");
	By lastName=By.name("txtLN");
	By email=By.name("Email");
	By contactNo=By.name("Phone");
	By noOfPeople=By.name("size");
	By buildingNameAndRoomNo=By.name("Address");
	By areaName=By.name("Address2");
	By city=By.name("city");
	By state=By.name("state");
	By conferenceAccessing=By.name("memberStatus");
	
	public void giveFirstName() {
		System.out.println(driver.getTitle());
		driver.findElement(firstName).sendKeys("Pallavi");
	}
	
	public void giveLastName() {
		driver.findElement(lastName).sendKeys("Buroju");
	}
	
	public void giveEmail() {
		driver.findElement(email).sendKeys("Pal@gmail.com");
	}
	
	public void giveContactNo() {
		driver.findElement(contactNo).sendKeys("9988776655");
	}
	
	public void giveNoOfPeople() {
		//driver.findElement(noOfPeople).sendKeys("");
		Select drpCountry = new Select(driver.findElement(noOfPeople));
		drpCountry.selectByVisibleText("1");
	}
	
	public void giveBuildingName() {
		driver.findElement(buildingNameAndRoomNo).sendKeys("Home Apartments-RoomNo:40");
	}
	
	public void giveAreaName() {
		driver.findElement(areaName).sendKeys("Mehdipatnam");
	}
	
	public void giveCity() {
		Select drpCountry = new Select(driver.findElement(city));
		drpCountry.selectByVisibleText("Hyderabad");
	}
	
	public void giveState() {
		Select drpCountry = new Select(driver.findElement(state));
		drpCountry.selectByVisibleText("Telangana");
	}
	
	public void giveConferenceAccess() {
		WebElement radio1 = driver.findElement(conferenceAccessing);
		radio1.click();
	}
	
	public void clickNext() throws Exception {
		driver.findElement(By.linkText("Next")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
}

