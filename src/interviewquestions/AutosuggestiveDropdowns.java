package interviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//1.To print total links in a webpage
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPOR"))
				{
			      i++;
			      driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			       text=(String) js.executeScript(script);
			      System.out.println(text);
			      if(i>8)
			      {
			    	 break;
			      }   
				}
		if(i>8)
		{
			System.out.println("Element not found");
		}
	}
   
}
