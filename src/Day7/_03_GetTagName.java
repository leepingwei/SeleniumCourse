package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_GetTagName {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study");

        WebElement element = driver.findElement(By.cssSelector("#tatsu-header-placeholder"));

        String tagName = element.getTagName();

        System.out.println("Tag Name of Element: " + tagName);

        driver.quit();

    }

}
