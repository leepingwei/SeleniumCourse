package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_JSConfirm {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        WebElement JSConfirm = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        JSConfirm.click();

        Thread.sleep(2000);

        String alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();

        Thread.sleep(2000);

        System.out.println(alertMessage);



    }

}
