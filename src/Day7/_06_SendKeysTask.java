package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class _06_SendKeysTask {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        Thread.sleep(3000);

        driver.findElement(By.id("at-cv-lightbox-close")).click();

        WebElement input1 = driver.findElement(By.id("sum1"));

        WebElement input2 = driver.findElement(By.id("sum2"));

        WebElement getTotalButton = driver.findElement(By.cssSelector("button[onclick='return total()']"));

        WebElement sumResult = driver.findElement(By.id("displayvalue"));

        input1.sendKeys(num1);
        input2.sendKeys(num2);

        getTotalButton.click();

        Integer element1 = Integer.parseInt(num1);
        Integer element2 = Integer.parseInt(num2);
        Integer sum = element1+element2;

        String result = sum.toString();
        String resultOnPage = sumResult.getText();

        if (result.equals(resultOnPage)){
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }

        driver.quit();

    }

}
