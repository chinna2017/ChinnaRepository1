package sampleArtifactId;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chromedrive", "C:/Development/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.spicejet.com/");
driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("Vijayawada");
driver.findElement(By.xpath("//a[contains(text(),'Vijayawada (VGA)')]")).click();
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("Hyderabad");
driver.findElement(By.xpath("//li[contains(@class,'city_selected')]//a[contains(text(),'Hyderabad (HYD)')]")).click();
//driver.close();//li[contains(@class,'city_selected')]//a[contains(text(),'Hyderabad (HYD)')]

driver.findElement(By.xpath("//body/form[@name='aspnetForm']/div[@class='maincontainer']/div[@class='home']/div/div[@class='staticHomeContentFullpage position-relative']/div/div[@class='home_flight_search']/div/div[@class='book']/div/div[@class='picker-first2']/button[1]")).click();
		
	}

}
