package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//https://mail.rediff.com/cgi-bin/login.cgi

public class RediffLoginpage {
	
WebDriver driver;
public RediffLoginpage(WebDriver driver)
{
	this.driver=driver;
	
}
By username=By.xpath("//input[@id='login1']");
By password=By.name("passwd");

By signin=By.className("signinbtn");
public WebElement Email()
{
	return driver.findElement(username);
}
public WebElement Pass()
{
	return driver.findElement(password);
}
public WebElement Submit()
{
	return driver.findElement(signin);
}


}           
