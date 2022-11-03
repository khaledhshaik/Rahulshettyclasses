package interviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingcalender {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//1.To print total links in a webpage
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
	
	while(!driver.findElement(By.cssSelector("[class='monthTitle']")).getText().contains("Dec"))
     {
    	 driver.findElement(By.cssSelector("[class='next']")).click();
     }

	List<WebElement> dates=driver.findElements(By.className("day"));
	int count=driver.findElements(By.className("day")).size();
	
	for(int i=0;i<count;i++)
	{
		String text=driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("29"))
		{
			driver.findElements(By.className("day")).get(i).click();
			break;
		}
	}
	
		driver.close();
	}
}
