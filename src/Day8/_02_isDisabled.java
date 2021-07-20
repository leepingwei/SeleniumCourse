package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_isDisabled {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement input = driver.findElement(By.cssSelector("#input-example>input"));

        boolean beforeEnabling = input.isEnabled();

        WebElement enableButton = driver.findElement(By.cssSelector("#input-example>button"));

        enableButton.click();

        Thread.sleep(3000);

        boolean afterEnabling = input.isEnabled();

        System.out.println("Before Enabling: " + beforeEnabling);
        System.out.println("After Enabling: " + afterEnabling);

        driver.quit();
    }

}
