package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("regularramesh@gmail.com");
		
		WebElement Append=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		Append.sendKeys("Text");
		
		WebElement Text=driver.findElement(By.name("username"));
		String name=Text.getAttribute("value");
		System.out.println(name);
		
		WebElement Clear=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		Clear.clear();
		
		WebElement DisableBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean Disable=DisableBox.isEnabled();
		System.out.println(Disable);
	}

}
