package Day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_GetTitleAndPageSource {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        String pageSource = driver.getPageSource();
        System.out.println("Page Source: " + pageSource);

        driver.quit();

    }

}
