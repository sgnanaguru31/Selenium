package Edureka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Assert;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\GGuru\\DevOps Edureka\\Projects\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        // Create an instance of the driver
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Navigate to a web page
        driver.get("http://localhost:3001");

        driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[1]/div[2]/input")).sendKeys("username");
        driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[1]/div[4]/input")).sendKeys("password");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[1]/div[6]/input")).click();

        String message = driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[2]")).getText();

        Assert.assertEquals (message, "Login Failed!");

        Thread.sleep(5000);

        // Conclude a test
        driver.quit();

    }
}