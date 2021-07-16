package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

    public static void main(String[] args) {

        // Define driver type and driver path
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        // Create a new webdriver object
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Navigate to techno.study website
        driver.get("https://techno.study/");

        // Store an element from website in a WebElement object
        WebElement element = driver.findElement(By.cssSelector("div[class='tatsu-inline-text-inner tatsu-align-center']>h1"));

        // Using getText() method - get the text of the element
        String text = element.getText();
        System.out.println(text);

        // Quit browser
        driver.quit();

    }

}
