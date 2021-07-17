package Day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_GetCurrentURL {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl);
        driver.quit();

    }



}
