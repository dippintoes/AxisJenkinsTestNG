package QA.JenkinsTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class addImmigration {
	@Test
	public void immigration() {
		 
		 System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://opensource-demo.orangehrmlive.com");
	     System.out.println("InvokeChrome");
	     driver.manage().window().maximize();
	     
	     // Use WebDriverWait for elements to be present before interacting
	     WebDriverWait wait = new WebDriverWait(driver, 20);
	     
	     // Wait for the username field to be present
	     WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
	     usernameField.sendKeys("Admin");
	     
	     // Wait for the password field to be present
	     WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='password']")));
	     passwordField.sendKeys("admin123");
	     
	     // Wait for the login button to be present and clickable
	     WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
	     loginButton.click();
	     
	     WebElement dashboardElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='oxd-userdropdown']")));
	     assert dashboardElement.isDisplayed() : "Login unsuccessful.";
	     
	     // click on infotab tab
	     WebElement infoTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[6]")));
	     infoTab.click();
	     
	     // click on immiTab tab
	     WebElement immiTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Immigration')]")));
	     immiTab.click(); 
	     
	     // click on jobTabView tab
	     WebElement immiTabView = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")));
	     assert immiTabView.isDisplayed() : "Successfully viewed immigration  view.";
	     
	     // click on immiTab tab
	     WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")));
	     add.click(); 
	     
	     WebElement numbe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")));
	     numbe.sendKeys("182909381234");
	     
	     WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")));
	     btn.click();
	     
	     WebElement dashboardElement1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")));
	     assert dashboardElement1.isDisplayed() : "adding immigration record unsuccessful.";
	 }
}
