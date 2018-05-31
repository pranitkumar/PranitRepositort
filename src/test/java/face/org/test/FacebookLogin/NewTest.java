package face.org.test.FacebookLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  System.out.println( "Hello World!" );
      
      System.out.println("Welcome Pranit");
      

      System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
      
      WebDriver driver = new ChromeDriver();
      
      driver.get("http://www.seleniumhq.org/download/");
      
     // driver.get("https://mvnrepository.com/");
      Thread.sleep(5000);
      
      driver.close();
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
