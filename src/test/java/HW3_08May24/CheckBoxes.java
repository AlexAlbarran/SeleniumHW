package HW3_08May24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        WebElement singleBox= driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        singleBox.click();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for(WebElement checkBox:checkBoxes){
            String value = checkBox.getAttribute("value");

            if(value.equalsIgnoreCase("Option-2")){
                checkBox.click();
            }
        }

        //WebElement showBtn= driver.findElement(By.xpath("//button[text()='Show Checkboxes']"));
        //showBtn.click();

        WebElement enableBtn= driver.findElement(By.xpath("//button[text()='Enable Checkboxes']"));
        enableBtn.click();

        //WebElement hideBtn= driver.findElement(By.xpath("//button[text()='Hide Checkboxes']"));
        //hideBtn.click();

        WebElement box4= driver.findElement(By.xpath("//input[@value='Checkbox-4']"));
        box4.click();


    }
}
