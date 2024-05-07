package HW2_05May24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");

        WebElement book1 = driver.findElement(By.xpath("//input[@id='favourite-book']"));
        book1.sendKeys("The Hobbit");

        WebElement book2 = driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        book2.sendKeys("Lord of the Rings");

        WebElement book3 = driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        book3.sendKeys("War and Peace");

        // this is for box 1
        WebElement reverseB1= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        reverseB1.sendKeys("War and Peace");

        // this is for box 2
        WebElement reverseB2= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        reverseB2.sendKeys("Lord of the Rings");

        // this is for box 3
        WebElement reverseB3= driver.findElement(By.xpath("//input[@id='least-favorite']"));
        reverseB3.sendKeys("The Hobbit");

        // this is for box 1
        WebElement grandParent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandParent.sendKeys("GrandParent");

        // this is for box 2
        WebElement parent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("Parent");

        // this is for box 3
        WebElement child= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("Child");



    }
}
