package co.testing;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Practice_1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KING\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);

        // Navigate to a website
        driver.get("https://stage.wobb.ai/home");
//        //register the user
//        driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
//        
//        driver.findElement(By.name("email")).sendKeys("sharmashagun9983@gmail.com");
//        
//        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("0123456789");
//        
//        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Shagun@123");
//        
//        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/*[1]")).click();
//        
//        driver.findElement(By.name("fullName")).sendKeys("Shagun Sharma");
//        
//        driver.findElement(By.name("brandName")).sendKeys("ss4");
//        
//        driver.findElement(By.name("brandWebsite")).sendKeys("https://www.guru99.com/selenium-tutorial.html");
//        
//        driver.findElement(By.xpath("//span[contains(text(),'Agree & Join')]")).click();
//        
        //login the registered user
        
		driver.findElement(By.xpath("//a[contains(text(),'Log In')]")).click();
		
		WebElement w = driver.findElement(By.xpath("//input[@id='']"));
		
		w.sendKeys("sharmashagun9983@gmail.com");
		w.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("Shagun@123");
		WebElement w1 = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
		w1.click();
        
		Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/img[1]")).click();
        
        Thread.sleep(3000);
        
       driver.findElement(By.xpath("//button[@id='headlessui-disclosure-button-1']")).click();
       
      WebElement w3= driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]"));
       
       w3.click();
       

       Thread.sleep(1000);
       // Simulate arrow key presses to navigate to the desired option
       Actions actions = new Actions(driver);
//       actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
       
       actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
       
       
      driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")).click();
      
      Actions actions1 = new Actions(driver);
//    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    
    actions1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    
    driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/button[1]")).click();

    driver.findElement(By.xpath("//body/div[@id='headlessui-portal-root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
    
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//body/div[@id='headlessui-portal-root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")).click();
    
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//button[contains(text(),'Send Invite')]")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]/div[1]/div[1]")).click();
    
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")).click();
        
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")).click();
        
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        
    driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();

    Thread.sleep(2000);
    
//    JavascriptExecutor js = (JavascriptExecutor)driver;  
//	js.executeScript("scrollBy(0, 300)"); 
	
	
    driver.findElement(By.xpath("//div[contains(text(),'Youtube')]")).click();
    
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")).click();
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")).click();
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    
    
    driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
