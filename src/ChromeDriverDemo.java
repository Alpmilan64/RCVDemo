import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) throws InterruptedException   {   


  System.setProperty("webdriver.chrome.driver" , "driver/chromedriver.exe");
				

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		Thread.sleep(5000);

		//  i need to create Browser Drivers to connect Actual Browser.

	}

}
