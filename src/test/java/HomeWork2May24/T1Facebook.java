package HomeWork2May24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1Facebook {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.facebook.com/");

        WebElement createButton= driver.findElement(By.linkText("Create new account"));
        createButton.click();

        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Alejandro");

        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Albarran");

        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("AlexA@gmail.com");

        WebElement newPassword= driver.findElement(By.name("reg_passwd__"));
        newPassword.sendKeys("0123456789");

        WebElement birthMonth= driver.findElement(By.name("birthday_month"));
        birthMonth.sendKeys("7");

        WebElement birthDay= driver.findElement(By.name("birthday_day"));
        birthDay.sendKeys("25");

        WebElement birthYear= driver.findElement(By.name("birthday_year"));
        birthYear.sendKeys("2003");

        WebElement sex= driver.findElement(By.name("sex"));
        sex.sendKeys("2");

        WebElement button= driver.findElement(By.className("websubmit"));
        button.click();


            }
}
