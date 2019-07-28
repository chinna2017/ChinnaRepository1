package sampleArtifactId;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Development/chromedriver.exe");
      //  WebDriverManager.chromedriver().setup();
      //  WebDriverManager.firefoxdriver().setup();
     //   WebDriver driver1 = new  FirefoxDriver();     .exe
       WebDriver driver = new ChromeDriver();
        driver.get("https://www.usbank.com/");
        Thread.sleep(5000);
       driver.findElement(By.xpath("//input[contains(@placeholder,'Personal ID')]")).sendKeys("test");
       driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("test");
       driver.findElement(By.xpath("//button[@id='aw-log-in']")).click();
     String s1 = driver.findElement(By.xpath("//p[contains(text(),'Please enter your personal ID and password to log')]")).getText();
     //   Set<String> windowhand = driver1.getWindowHandles();
     
      System.out.println("Error message is " + s1);
      driver.findElement(By.xpath("//span[contains(@class,'searchAddon')]")).click();
      driver.findElement(By.xpath("//input[@id='srch-term']")).sendKeys("Credit Cards");
      driver.findElement(By.xpath("//button[@id='searchIcon']//i[contains(@class,'glyphicon glyphicon-search')]")).click();
    //    driver1.findElement(By.cssSelector("input#aw-personal-id")).sendKeys("mahentest");#aw-personal-id
     //   driver1.findElement(By.cssSelector("input#aw-password")).sendKeys("mahentest");
      //  driver1.findElement(By.cssSelector("input[id=#aw-log-in]")).click();
        
        
        //   driver1.switchTo().newWindow(windowhand);
   //     System.out.println(windowhand);
     //   9030739066 - Vasu-
       
	}

}
