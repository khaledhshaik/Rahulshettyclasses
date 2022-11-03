package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com");
		System.out.println(driver.findElements(By.tagName("a")).size());  // links with tagname a in webpage
		
		WebElement footerdriver=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size()); //links with tagname a in the footer page
		
		WebElement rowdriver=footerdriver.findElement(By.xpath("//table/tbody/tr[1]"));
		System.out.println(rowdriver.findElements(By.tagName("a")).size());
		
	
		driver.close();
	}

}
      //*[@id="navFooter"]/div[4]/table/tbody/tr[1]