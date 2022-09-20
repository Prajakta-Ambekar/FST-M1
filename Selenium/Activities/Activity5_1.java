import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		
		// Launch the web browser and open using the get() method. 
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		//Get the page title and print it to the console.
		System.out.println("The Page Title is: "+driver.getTitle());
		
		//Use findElement() to find the checkbox input element.
		WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
		//Use the isDisplayed() method to check if it is visible on the page.
		System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
		
		driver.findElement(By.id("toggleCheckbox")).click();
		
		System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
		
		driver.quit();
		}

}
