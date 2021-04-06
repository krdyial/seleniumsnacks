package snacks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test01 extends SetUp {

   @Test
    public void try01(){
       driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
       WebElement usernameBox= driver.findElement(By.id("txtUsername"));
       usernameBox.sendKeys("Admin");
       WebElement passwordBox= driver.findElement(By.id("txtPassword"));
       passwordBox.sendKeys("admin123");
       driver.findElement(By.id("btnLogin")).click(); // login button click
   }
}
