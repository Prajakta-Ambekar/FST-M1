import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println("Title of the page: "+driver.getTitle());
		Thread.sleep(20);
		WebElement textInput = driver.findElement(By.xpath("//input[@id='input-text']"));
		//Use the isEnabled() method to check if the checkbox is Enabled.
		System.out.println("The Textbox is Enabled: " + textInput.isEnabled());
		
		//Click the checkbox to select it.
		driver.findElement(By.id("toggleInput")).click();
		
		
		//Use the isEnabled() method again and print the result.
		System.out.println("The Textbox is Enabled: " + textInput.isEnabled());
		
		driver.quit();
		

	}

}
