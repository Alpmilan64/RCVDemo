import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		       System.setProperty(" webdriver.edge.driver ", " driver/edgedriver.exe ");
		       
		       EdgeDriver  driver =  new EdgeDriver();
		       
		       driver.get("https://www.amazon.com");
		       
		       Thread.sleep(5000);
		
		       driver.close();
		
		
		
		
		

	}

}
