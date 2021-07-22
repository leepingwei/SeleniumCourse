package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _05_SelectBySelectClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");

        Select select = new Select(driver.findElement(By.cssSelector("select[name=state]")));

        select.selectByVisibleText("Alaska");
//        select.selectByIndex(6);
//        select.selectByValue();

        driver.quit();

    }

}
