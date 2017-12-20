import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Redbus {
	@Test
	public static void test() throws Exception {
		//public static void main(String[] args) throws IOException, Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/Ebay/eclipse-workspace/Invoice/chromedriver 4");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Properties prop;
		prop=new Properties();
		File f= new File("/Users/Ebay/eclipse-workspace/Redbus/src/Property/Test1.properties");	
		FileReader obj=new FileReader(f);	
		prop.load(obj);
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys(prop.getProperty("FromCity"));
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id='search']/div/div[1]/div/ul/li[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys(prop.getProperty("ToCity"));
		Thread.sleep(5000);
//		WebElement Cal=driver.findElement(By.xpath("//*[@id='onward_cal']"));
//				Cal.click();
	Actions actions = new Actions(driver);
    actions.sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr[@class='rb-monthHeader']/td[3]")).click();	
		Thread.sleep(3000);
		List<WebElement> dates =driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']//td"));

		int total_ele=dates.size();

		for (int i=0;i<total_ele;i++)
		{
			String date=dates.get(i).getText();
			if (date.equalsIgnoreCase("1"))
			{
				dates.get(i).click();
				break;
			}

		}
		
		driver.findElement(By.id("search_btn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		List<WebElement> BusName = driver.findElements(By.xpath("//div[@class='fl w-25']/div[@class='service-name']"));
		List<WebElement> Starttime = driver.findElements(By.xpath("//div[@class='fl depart']"));
		List<WebElement> Seats = driver.findElements(By.xpath("//div[@class='fl seats']"));
		List<WebElement> Prices = driver.findElements(By.xpath("//div[@class='fare']"));
		if(BusName.size() > 0) {
			for(int j=0;j<=4;j++)
			{
				String Name=BusName.get(j).getText();
				String Time=Starttime.get(j).getText();
				String Seat=Seats.get(j).getText();
				String Price=Prices.get(j).getText();


				Reporter.log( "Name is:" +Name +", Price: "+Price +",Start Time: "+Time +", Seat: " +Seat);
			}
		}
		driver.quit();
	}
	
}





