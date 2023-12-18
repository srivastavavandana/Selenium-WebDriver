package automation;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DemoActions2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.Edge.driver", "C:\\Users\\vanadanas\\eclipse-workspace\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("http://172.16.3.2/ALiSNJDOH2TESTING11.3.12.02/LoginNJ.aspx");
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  //For Login Name
		  WebElement txtbx_username = driver.findElement(By.xpath("//input[@id='m_LoginControl_UserName']"));
		  txtbx_username.sendKeys("admin"); 
		  //For Password
		  driver.findElement(By.xpath("//input[@id='m_LoginControl_Password']")).sendKeys("password");
		  //For Button
		  driver.findElement(By.xpath("//ul[@class='buttonsnew']")).click();
		  Actions action = new Actions(driver);
		  // click on Licensing Header
		  action.moveToElement(driver.findElement(By.linkText("Licensing"))).build().perform();
		  Thread.sleep(3000);
		  //click on  Business Entity
		  action.moveToElement(driver.findElement(By.linkText("Business Entity"))).build().perform();
		  //click on New 
		  driver.findElement(By.linkText("New")).click();	  
		  Thread.sleep(3000);
		  // For Dropdown  Business Unit
		  WebElement dropdownBU= driver.findElement(By.name("ctl00$ContentPlaceHolder2$ucPaperApp$ddlProgramType"));
		  Select objSelect =new Select(dropdownBU);
		  objSelect.selectByIndex(2);
	      //    driver.findElement(By.name("ctl00$ContentPlaceHolder2$ucPaperApp$ddlApplicationType")).click();
		  Thread.sleep(5000);
	      //  action.moveToElement(driver.findElement(By.linkText("LicenseType"))).build().perform();
		  driver.findElement(By.cssSelector("a#ctl00_ContentPlaceHolder2_ucPaperApp_lnkCredentialType")).click();
		  Thread.sleep(5000);
		//  driver.switchTo().frame(0);
		  //For Radio Button
		  
		  String MainWindow=driver.getWindowHandle();	
		  Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	
	      WebElement radio1 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucLicenseinformation_rptLicense_ctl01_rdLicense"));
	      WebElement radio2 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucLicenseinformation_rptLicense_ctl02_rdLicense"));
	      //Radio Button1 is selected
	      radio1.click();
	      
	      System.out.println("Radio button option1 is selected");
	       //Radio Button1 is de-selected and Radio Button2 is selected
	      // radio2.click(); 
	      
	      Thread.sleep(4000);
	      System.out.println("Radio Button option2 is selected"); 
	       // Closing the Child Window.
	      // Selecting CheckBox		
	      WebElement CheckBox1 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucLicenseinformation_rptLicense_ctl01_ChkLicenseLine_0"));							

	       // This will Toggle the Check box 		
	       CheckBox1.click();	
	      
	      
	      // Thread.sleep(4000);
	      
	       WebElement CheckBox2 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucLicenseinformation_rptLicense_ctl01_ChkLicenseLine_4"));							

	      // This will Toggle the Check box 		
	      CheckBox2.click();	
	      
	      
	      Thread.sleep(4000);
	      // List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

	       //for (WebElement checkbox : checkboxes) {
	       // if (!checkbox.isSelected()) {
	       //    checkbox.click();
	      
	         // }
	     // }
	      Thread.sleep(4000);
	      //scroll down the page
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	       
	  
	        //This will scroll the web page till end.		
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
           Thread.sleep(4000);
	      
	     WebElement  savebtn = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave")); 
	     savebtn.click();

          //driver.close();		
	      
  }		}		
// Switching to Parent window i.e Main Window.
driver.switchTo().window(MainWindow);
WebElement Commentbox = driver.findElement(By.id("ctl00_ContentPlaceHolder2_ucPaperApp_txtComments"));
Commentbox.sendKeys("Hello ");

// For Laboratory Information


 Thread.sleep(4000);

 driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder2$ucBEInformationAdd$txtFacilityName']")).sendKeys("Laboratory SciLabs");

 Thread.sleep(4000);
driver.findElement(By.xpath("//tr[@id='ctl00_ContentPlaceHolder2_ucBEInformationAdd_trRegisteredNameAndOwnerShip']//input[@id='ctl00_ContentPlaceHolder2_ucBEInformationAdd_txtRegisteredName']")).sendKeys("Laboratory XeroDegree");
Thread.sleep(3000);
 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_ucBEInformationAdd_txtFederalProviderNumber']")).sendKeys("232423434343");
 //for Ownership dropdown 
 Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder2$ucBEInformationAdd$ddlOwnershipType']")));  
 dropdown.selectByIndex(1);
 Thread.sleep(3000);
 //For FirstName
 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_ucBEInformationAdd_txtPrimaryFirstName']")).sendKeys("FirstName");
 Thread.sleep(3000);
 //For lastname
 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_ucBEInformationAdd_txtPrimaryContactPerson']")).sendKeys("LastName");
 Thread.sleep(3000);
 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_ucBEInformationAdd_txtPrimaryEmail']")).sendKeys("vandanas@del.aithent.com");
 Thread.sleep(3000);
 //For MiddleName
 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_ucBEInformationAdd_txtPrimaryMiddleName']")).sendKeys("MiddleName");
 Thread.sleep(3000);
 //For Role Dropdown
 Select Roledropdown = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ucBEInformationAdd_ddlPrimaryContactRole']")));
 Roledropdown.selectByIndex(2);
 Thread.sleep(3000);
 //For PhoneNumber
 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_ucBEInformationAdd_txtPrimaryContactPhone']")).sendKeys("123232224344");
 Thread.sleep(3000);
 //For Mailing Address
 Select countrydropdown = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ucMailingAddressAdd_cmbCountry']")));
 countrydropdown.selectByIndex(0);
 Thread.sleep(3000);
 //For Address
 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_ucMailingAddressAdd_txtStreet1']")).sendKeys("Address xyz Colony Infront of ABC Road");
 Thread.sleep(3000);
 //For city
 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_ucMailingAddressAdd_txtCity']")).sendKeys("City12345");
 Thread.sleep(3000);
 //For State/Province
 //Select SPdropdown = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ucMailingAddressAdd_cmbState']")));
// SPdropdown.selectByIndex(3);                                
 //Thread.sleep(4000);
 // For Suite/Apt/Unit/etc
 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_ucMailingAddressAdd_txtStreet2']")).sendKeys("Apt2flat 109");
 Thread.sleep(4000);
 //For Zipcode
 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_ucMailingAddressAdd_txtZip']")).sendKeys("24342343433");
 
 Thread.sleep(6000);
 // For Alternate Phone # - Ext
 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_ucMailingAddressAdd_txtAltPhone']")).sendKeys("987-978-6768");
 Thread.sleep(4000);
 
 //driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ucMailingAddressAdd_ddlCounty']")).click();
 //For Country
// WebElement Element=driver.findElement(By.xpath("//td[@align='left']//select[@name='ctl00$ContentPlaceHolder2$ucMailingAddressAdd$ddlCounty']"));

 //Select Droupdown = new Select(Element);
 
 //For Mailing Address
 Select countdropdown = new Select(driver.findElement(By.xpath("//td[@align='left']//select[@name='ctl00$ContentPlaceHolder2$ucMailingAddressAdd$ddlCounty']")));
 countdropdown.selectByIndex(3);
 Thread.sleep(4000);

// Thread.sleep(6000);

// Droupdown.selectByVisibleText("Bergen");
 //Select Countydropdown = new Select(driver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder2$ucPhysicalAddressAdd$ddlCounty']")));

// Select Countydropdown = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder2_ucMailingAddressAdd_ddlCounty\"]")));
//Countydropdown.selectByVisibleText("Bergen");

 Thread.sleep(5000);
 //For Primary Phone # - Ext 
 driver.findElement(By.id("ctl00_ContentPlaceHolder2_ucMailingAddressAdd_txtPhone")).sendKeys("987-978-6765");
// driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder2_ucMailingAddressAdd_txtPhone\"]")).sendKeys("987-978-6765");
 Thread.sleep(6000);
 // For Alternate Phone # - Ext
 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_ucMailingAddressAdd_txtAltPhone']")).sendKeys("987-978-6768");
 Thread.sleep(4000);
 //For Fax
 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_ucMailingAddressAdd_txtFax']")).sendKeys("434343545455");
 Thread.sleep(4000);
 //For PrimaryEmail
 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_ucMailingAddressAdd_txtEMail']")).sendKeys("vandanas@del.aithent.com");
 Thread.sleep(4000);
 //For Alternate email
 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_ucMailingAddressAdd_txtAltEmail']")).sendKeys("vandanas@del.aithent.com");
 Thread.sleep(4000);
 //For Physical Address
 //driver.findElement(By.xpath("//select[@name=\"ctl00$ContentPlaceHolder2$ucPhysicalAddressAdd$ddlCopyAddressFrom\"]"));
// Thread.sleep(4000);
 
// Select countdropdown = new Select(driver.findElement(By.xpath("//td[@align='left']//select[@name='ctl00$ContentPlaceHolder2$ucMailingAddressAdd$ddlCounty']")));
// countdropdown.selectByIndex(3);

 Select physicaldropdown = new Select(driver.findElement(By.xpath("//select[@name=\"ctl00$ContentPlaceHolder2$ucPhysicalAddressAdd$ddlCopyAddressFrom\"]")));
 physicaldropdown.selectByIndex(1);
 Thread.sleep(4000);
 //for contact Person
 driver.findElement(By.id("ctl00_ContentPlaceHolder2_ucPhysicalAddressAdd_txtContactPerson")).sendKeys("xyz person");
 Thread.sleep(4000);
 //For Savebtn
 
 WebElement  savebtn = driver.findElement(By.id("ctl00_ContentPlaceHolder2_CommonLinkButton1")); 
 savebtn.click();

 // switch to modify page
 
driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkEdit")).click();
Thread.sleep(4000);
//FOR anchor tag
WebElement anchorTag = driver.findElement(By.xpath("//div[@class='row custom-row ng-star-inserted']//div[3]/span")); // Replace with the appropriate locator
anchorTag.click();
Thread.sleep(4000);

WebElement Add = driver.findElement(By.xpath("//div[@class='section-text']//div[@class='section-text float-right btn-add']"));
Add.click();
Thread.sleep(4000);

WebElement choose = driver.findElement(By.xpath("//input[@name='file']"));
choose.sendKeys("C:\\Users\\vanadanas\\Desktop\\dumy file.txt");
Thread.sleep(4000);
}
}
	    


//div[@class='section-text']//div[@class='section-text float-right btn-add display_none_media']		 
	
//div[@class='section-text float-right btn-add']//div[@class = 'section-text']
	     
		 
	

		 
		 		
		 

	

