package test;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript1 {
	
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize(); 
        
        WebElement 

        driver.getTitle();
	}

}
