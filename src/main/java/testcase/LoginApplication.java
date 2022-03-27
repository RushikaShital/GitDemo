package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import object.RediffLoginpage;

public class LoginApplication {
@Test
public void Sign()
{
	System.setProperty("webdriver.chrome.driver","E:\\Chrome_Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	RediffLoginpage rd=new RediffLoginpage(driver);
	rd.Email().sendKeys("hello");
	rd.Pass().sendKeys("hello");
	rd.Submit().click();
}

}



