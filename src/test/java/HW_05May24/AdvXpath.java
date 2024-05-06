package HW_05May24;

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

        // to reverse text
        String textbook3 = book3.getAttribute("value"); // Get the original text
        String reversedText3 = new StringBuilder(textbook3).reverse().toString(); // Reverse the text
        // this is for box 1
        WebElement reverseB3 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        reverseB3.sendKeys(reversedText3); // Insert the reversed text into reverseB2


        // to reverse text
        String textbook1 = book1.getAttribute("value"); // Get the original text
        String reversedText2 = new StringBuilder(textbook1).reverse().toString(); // Reverse the text
        // this is for box 2
        WebElement reverseB2 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        reverseB2.sendKeys(reversedText2); // Insert the reversed text into reverseB2


        // to reverse text
        String textbook2 = book2.getAttribute("value"); // Get the original text
        String reversedText1 = new StringBuilder(textbook2).reverse().toString(); // Reverse the text
        // this is for box 3
        WebElement reverseB1 = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        reverseB1.sendKeys(reversedText1); // Insert the reversed text into reverseB1


        // this is for box 1
        WebElement grParent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grParent.sendKeys("GrandParent");

        // this is for box 2
        WebElement parent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("Parent");

        // this is for box 3
        WebElement child= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("Child");



    }
}
