package HW_05May24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath.php");

        WebElement userName = driver.findElement(By.xpath("//input[@id='title']"));
        userName.sendKeys("abracadabra");

        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

        WebElement sq1 = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        sq1.sendKeys("Is Ali from batch 14?");

        WebElement text = driver.findElement(By.xpath("//label[contains(text(),'ipsum ')]"));
        System.out.println(text.getText());

        WebElement apiSettings= driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSettings.sendKeys("abracadraa 12344");

        WebElement email1=driver.findElement(By.xpath("(//input[@class='form-control backup'])"));
        email1.sendKeys("bluesky@gmail.com");

        WebElement email2=driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("hello@gmail.com");

        WebElement email3=driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("ciao@gmail.com");

        WebElement field1= driver.findElement(By.xpath("//input[@data-detail='one' or @name='customField1']"));
        field1.sendKeys("Where is everyone?");

        WebElement field2= driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("Hello I am here.");

        WebElement lastField1=driver.findElement(By.xpath("//input[@name='customField1']"));
        lastField1.sendKeys("Almost done.");

        WebElement lastField2=driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='two']"));
        lastField2.sendKeys("Done.");


    }
}
