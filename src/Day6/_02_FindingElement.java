package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingElement {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/");

        // Finding element by ID
        WebElement closeIcon = driver.findElement(By.id("at-cv-lightbox-close"));

        // Selenium will wait for 2 seconds - forcing Selenium to wait
        Thread.sleep(2000);

        // Click on element
        closeIcon.click();

        // Finding element by ID
        WebElement startButton = driver.findElement(By.id("btn_basic_example"));
        String startButtonText = startButton.getText();
        System.out.println(startButtonText);


        // Finding element by Class name
        WebElement menuListHeader = driver.findElement(By.className("panel-heading"));
        String menuListText = menuListHeader.getText();
        System.out.println(menuListText);


        // Finding element by Link Text (For a tag elements only)
        WebElement inputFormsLink = driver.findElement(By.linkText("Input Forms"));
        String inputFormText = inputFormsLink.getText();
        System.out.println(inputFormText);


        // Finding element by Partial Link Text (For a tag elements only)
        WebElement startPracticeButton = driver.findElement(By.partialLinkText("Start Pra"));
        String startText = startPracticeButton.getText();
        System.out.println(startText);


        // Finding element by Tag Name
        WebElement randomH3 = driver.findElement(By.tagName("h3"));
        String randomText = randomH3.getText();
        System.out.println(randomText);


        // Finding element by CSS Selector
        WebElement startPracticeCss = driver.findElement(By.cssSelector("#btn_basic_example"));
        String startCss = startPracticeCss.getText();
        System.out.println(startCss);


        // Finding element by CSS Selector
        WebElement randomCss = driver.findElement(By.cssSelector(".head")); // div[class=head]
        String randomCssText = randomCss.getText();
        System.out.println(randomCssText);

        driver.quit();

    }

}
