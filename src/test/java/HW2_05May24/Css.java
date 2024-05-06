package HW2_05May24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");

        WebElement profileId= driver.findElement(By.cssSelector("input#profileID"));
        profileId.sendKeys("Alex123");

        WebElement profileBox= driver.findElement(By.cssSelector("input#profileBox"));
        profileBox.sendKeys("Alex Albarran");

        WebElement feedbackJ= driver.findElement(By.cssSelector("input[class$='Box1']"));
        feedbackJ.sendKeys("Are we having lunch today??");

        WebElement feedbackR= driver.findElement(By.cssSelector("input[class$='Box2']"));
        feedbackR.sendKeys("Good morning, how are you?");

        WebElement email= driver.findElement(By.cssSelector("input[name='email'][class='form-control']"));
        email.sendKeys("alex123@gmail.com");

        WebElement courseT= driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseT.sendKeys("Java");

        WebElement intro= driver.findElement(By.cssSelector("input[data-starts^='intro']"));
        intro.sendKeys("Advanced CSS Selectors");

        WebElement conclusion= driver.findElement(By.cssSelector("input[data-ends*='lusion']"));
        conclusion.sendKeys("Selenium is easier than Java");

    }
}
