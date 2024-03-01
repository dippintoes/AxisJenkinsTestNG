package QA.JenkinsTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class jobFormFilling {
 @Test
 public void login() {
	 
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
     
     // click on jobTab tab
     WebElement jobTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Job')]")));
     jobTab.click(); 
     
     // click on jobTabView tab
     WebElement jobTabView = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-date-input']")));
     assert jobTabView.isDisplayed() : "Successfully viewed job view.";

//     WebElement joinedDate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-date-input']")));
//     joinedDate.sendKeys("2024-05-09");
//     
//     WebElement jobTitle = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'HR Manager')]")));
//     jobTitle.sendKeys("Software Developer");
     
 }
}
