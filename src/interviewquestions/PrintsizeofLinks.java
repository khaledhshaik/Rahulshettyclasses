package interviewquestions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintsizeofLinks {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//1.To print total links in a webpage
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	//driver.get("https://www.walgreensbootsalliance.com/");
	System.out.println(driver.findElements(By.tagName("a")).size());
	driver.manage().window().maximize();
	
	//2.To print footer links count
	WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
	System.out.println(footerdriver.findElements(By.tagName("a")).size());
	
	WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(columndriver.findElements(By.tagName("a")).size());
	
	for(int i=0;i<columndriver.findElements(By.tagName("a")).size();i++)
	{
		String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		Thread.sleep(5000);
	}
	
	Set<String> abc=driver.getWindowHandles();
	Iterator<String> it=abc.iterator();
	
	while(it.hasNext()) 
	{
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	driver.quit();;
	}
}
