package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sugantha");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priya");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("MS");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("AUTOMATION");
driver.findElement(By.id("createLeadForm_description")).sendKeys("NO COMMENTS");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priya.sugantha16@gmail.com");
WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select option=new Select(state);
option.selectByVisibleText("Alaska");
driver.findElement(By.className("smallSubmit")).click();
Thread.sleep(2000);
driver.close();
	}

}
