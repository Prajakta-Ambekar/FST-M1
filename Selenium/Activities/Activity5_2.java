import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		//Get the page title and print it to the console.
				System.out.println("The Page Title is: "+driver.getTitle());
				
				//Use findElement() to find the checkbox input element.
				WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
				//Use the isSelected() method to check if the checkbox is selected.
				System.out.println("The checkbox Input is selected: " + checkboxInput.isSelected());
				
				//Click the checkbox to select it.
				checkboxInput.click();
				
				
				//Use the isSelected() method again and print the result.
				System.out.println("The checkbox Input is Selected: " + checkboxInput.isSelected());
				
				driver.quit();
				

	}

}
