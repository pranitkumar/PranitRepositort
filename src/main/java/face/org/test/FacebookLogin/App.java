package face.org.test.FacebookLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      
        
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com");
        
        driver.findElement(By.id("email")).sendKeys("pranitwakhare@gmail.com");
        
        driver.findElement(By.id("pass")).sendKeys("vvbv  ");
        
        
    }
}
