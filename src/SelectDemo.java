import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDemo {

		public static String browser = "chrome";
		
		public static WebDriver driver;
		     
		     public static void main(String[] args) throws InterruptedException {
		    	 

		    	  System.setProperty("webdriver.chrome.driver" , "driver/chromedriver.exe");
		    					

		    			ChromeDriver driver = new ChromeDriver();

		    			driver.get("https://www.facebook.com");

		    			Thread.sleep(5000);
		    	 

	}

}
