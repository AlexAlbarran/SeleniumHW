import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW3_08May24 {
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
        //Thread.sleep(3000);

        //WebElement enableBtn= driver.findElement(By.xpath("//button[text()='Enable Checkboxes']"));
        //enableBtn.click();
        //Thread.sleep(3000);

        WebElement hideBtn= driver.findElement(By.xpath("//button[text()='Hide Checkboxes']"));
        hideBtn.click();


    }
}
