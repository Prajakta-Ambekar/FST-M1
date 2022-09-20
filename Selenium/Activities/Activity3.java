import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/simple-form");
		String title= driver.getTitle();
		System.out.println(title);
		
		WebElement FirstName=driver.findElement(By.id("firstName"));
		WebElement LastName=driver.findElement(By.id("lastName"));
		FirstName.sendKeys("Prajkta");
		LastName.sendKeys("Ambekar");
		
		driver.findElement(By.id("email")).sendKeys("abf@mail.com");
		driver.findElement(By.id("number")).sendKeys("9876543210");
		
		driver.findElement(By.cssSelector("input.ui.green.button")).click();
		//driver.findElement(By.xpath("//html/body//div[2]//div//div//div//div[2]//form//div//div[6]//div[1]//input")).click();
		
		Thread.sleep(40);
		
        //Close the browser
		 driver.quit(); 
	}

}

