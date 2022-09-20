import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		
		//Open a browser with https://www.training-support.net/selenium/simple-form
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		//Get the title of the page using driver.getTitle() and print out the title.
		
		System.out.println("Title of the page: " +driver.getTitle());
		
		//Use findElement() with xpath() to find all the input fields on the page.
		
		WebElement FN= driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement LN= driver.findElement(By.xpath("//input[@id='lastName']"));
		
		//Fill in the details in the fields using the sendKeys() method.
		
		FN.sendKeys("Prajkta");
		LN.sendKeys("Ambekar");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@mail.com");
		driver.findElement(By.xpath("//*[@id='number']")).sendKeys("6516381379");
		
        //Click Submit
		driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
		//driver.findElement(By.xpath("//input[@value='submit']")).click();
		Thread.sleep(40);
		
		driver.quit();
		}
}
