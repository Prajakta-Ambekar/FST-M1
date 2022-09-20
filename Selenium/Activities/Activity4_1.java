import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title=driver.getTitle();
		System.out.println("Page Title is: "+title);
		Thread.sleep(40);
		
        //Find the "Get Started!" link and click it
		driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
		//driver.findElement(By.xpath("//a[@id='about-link']")).click();
		
		//Print title of new page
		System.out.println("Heading is: " + driver.getTitle());
		/*String title1=driver.getTitle();
		System.out.println(title1);*/
		
		driver.quit();

	}

}
