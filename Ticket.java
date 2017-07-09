package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Ticket {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj manu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");
		driver.findElement(By.xpath(".//*[@id='tab-flight-tab-hp']")).click();
		driver.findElement(By.xpath(".//*[@id='flight-type-one-way-label-hp-flight']")).click();
		driver.findElement(By.xpath(".//*[@id='flight-origin-hp-flight']")).sendKeys("Kansas city,Mo");
		driver.findElement(By.xpath(".//*[@id='flight-destination-hp-flight']")).sendKeys("Newyork,NY");
		driver.findElement(By.xpath(".//*[@id='flight-departing-wrapper-single-hp-flight']/label/span[2]")).click();
		driver.findElement(By.xpath(".//*[@id='flight-departing-wrapper-single-hp-flight']/div/div/div[2]/table/tbody/tr[4]/td[5]/button")).click();
		driver.findElement(By.xpath(".//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button")).click();
		Thread.sleep(5000L);
		driver.findElement(By.xpath(".//*[@id='leg0-morning-departure']")).click();

	}

}
