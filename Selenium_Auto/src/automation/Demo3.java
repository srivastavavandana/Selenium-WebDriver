package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanadanas\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://172.16.1.32/ALiSNJDOH2TESTING11.4.3/LoginNJ.aspx");
		 Actions action = new Actions(driver);
		 action.moveToElement(driver.findElement(By.linkText("Licensing"))).build().perform();
		 Thread.sleep(4000);
		 driver.findElement(By.linkText("Business Entity"));
		 
		 
		 driver.findElement(By.linkText("New")).click();	  
		 Thread.sleep(3000);
		 
		 //for choose one
		 driver.findElement(By.cssSelector("select#ctl00_ContentPlaceHolder2_ucPaperApp_ddlProgramType")).click();
		 //application Type
		 WebElement ddown = driver.findElement(By.cssSelector("select#ctl00_ContentPlaceHolder2_ucPaperApp_ddlApplicationType")).click();
		 select select = new select(ddown);		
		 
		 

	

	}

}
