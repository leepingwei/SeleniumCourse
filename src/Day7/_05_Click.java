package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_Click {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        Thread.sleep(3000);

        driver.findElement(By.id("at-cv-lightbox-close")).click();

        WebElement inputForms = driver.findElement(By.cssSelector("#treemenu ul>li:first-child"));
        inputForms.click();

        WebElement simpleForm = driver.findElement(By.cssSelector("#treemenu ul>li:first-child>ul>li:first-child"));
        simpleForm.click();

        driver.quit();

    }

}
