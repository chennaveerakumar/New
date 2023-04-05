import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcases {
	@Test
  public void test1() {
	  System.out.println("From test1");
  }
	//@Test(retryAnalyzer = genericlibrary.RetryAnalyser.class)
  public void test2() throws Throwable {
	  //int count=0;
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 Thread.sleep(3000);
//	  for(int i=0;i<2;i++) {
//		 if(i==1) {
//			  driver.get("https://www.google.com/");
//			  System.out.println("Success at "+i+" Time ");
//		 }else
//			 System.out.println("Failed at "+i+" Time ");
//		 driver.close();
//		 }
  }
	//@Test
   public void test3() {
		  System.out.println("From test3");
		  
		  
		  
		  
  }
}
