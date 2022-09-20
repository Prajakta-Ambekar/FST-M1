package LMS_Activity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.findElement(By.linkText("All Courses")).click();
		
		
		List<WebElement> courses=driver.findElements(By.xpath("//div[@id='ld_course_list']/div/div/div/article/div[2]/h3 "));
	
		for(WebElement course: courses) {
		System.out.println(course.getText());
		
		}
		
		List<WebElement>noofcourses=driver.findElements(By.xpath("//div[@id='ld_course_list']/div/div/div"));
		System.out.println("The Number of Courses are "+noofcourses.size());
	
		
		driver.quit();
	}

}
