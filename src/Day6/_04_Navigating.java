package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_Navigating {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Navigate to website and wait until it's load
        driver.get("https://www.seleniumeasy.com/test/");

        driver.get("https://www.google.com/");

        // navigate().to() method is not waiting until the website is load
        // driver.navigate().to("https://www.google.com/");

        // navigate().back() method will navigate previous page
        driver.navigate().back();

        // will navigate forward page
        driver.navigate().forward();

        // will refresh the page
        driver.navigate().refresh();

    }

}
