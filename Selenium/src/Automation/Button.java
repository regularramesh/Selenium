package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement GetPosition=driver.findElement(By.id("position"));
		Point point=GetPosition.getLocation();
		int x=point.getX();
		int y=point.getY();
		System.out.println("X value is : "+x+"Y vlaue is : "+y);
		
		WebElement color=driver.findElement(By.id("color"));
		String Color=color.getCssValue("background-color");
		System.out.println(Color);
		
		WebElement size=driver.findElement(By.id("size"));
		int height=size.getSize().getHeight();
		int width=size.getSize().getWidth();
		System.out.println(height+""+width);
		WebElement Home=driver.findElement(By.id("home"));
		Home.click();
	}

}
