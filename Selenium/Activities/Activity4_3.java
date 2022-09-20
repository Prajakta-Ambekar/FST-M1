import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		
		//Open a browser with https://www.training-support.net/selenium/target-practice
		driver.get("https://www.training-support.net/selenium/target-practice");
		
		//Get the title of the page using driver.getTitle() and print out the title.
		String title=driver.getTitle();
		System.out.println("Title of the page: "+title);
		
		//Find the third header on the page.
		String ThirdHeader= driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
		System.out.println("Third Header text is: "+ThirdHeader);
		
		//Find the fifth header on the page and get it's 'colour' CSS Property.
		String fifthHeaderColor=driver.findElement(By.xpath("//h5")).getCssValue("Color");
		System.out.println("Color of Fifth header is: "+fifthHeaderColor);
		
		//Find the violet button on the page and print all the class attribute values.
		String violetButtonClasses=driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("Class");
		System.out.println("Violet button's classes are: " + violetButtonClasses);
		
		//Find the grey button on the page with Absolute XPath.
		String greyButton=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("Gray Button text is: "+greyButton);
		driver.quit();
	}

}
