package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_JSPrompt {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        Thread.sleep(2000);

        WebElement JSConfirm = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        JSConfirm.click();

        Thread.sleep(2000);

        driver.switchTo().alert().sendKeys("Hello Techno Study");

        Thread.sleep(2000);

        driver.switchTo().alert().accept();

    }

}
