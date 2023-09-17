package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.partialLinkText("CRM")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("VINOTH");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KUMAR");
        WebElement select = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select option = new Select(select);
        (option).selectByIndex(4);
        WebElement select1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select option1 = new Select(select1);
        (option1).selectByVisibleText("Automobile");
        WebElement select2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select option2 = new Select(select2);
        (option2).selectByValue("OWN_CCORP");
        driver.findElement(By.className("smallSubmit")).click();
         
    }
	}

