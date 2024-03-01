package QA.JenkinsTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class login {

    @Test
    public void loginhrm() {
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
        
    }
}