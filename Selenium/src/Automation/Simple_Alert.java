package Automation;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class Simple_Alert {
		

		
		public void alert() {
		
			System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/Alert.html");
			
			WebElement check=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
			check.click();
			
			Alert a=driver.switchTo().alert();
			
			a.accept();
			}
		
		public void confirmAlert() {
			System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/Alert.html");
			
			WebElement check=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
			check.click();
			
			Alert a=driver.switchTo().alert();
			a.dismiss();
		}
			
		public void prompt() {
			System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/Alert.html");
			
			WebElement check=driver.findElement(By.xpath("//*[@id='contentblock\']/section/div[3]/div/div/button"));
			check.click();
			
			Alert a=driver.switchTo().alert();
			a.sendKeys("regular");
			a.accept();
			
		}
		
		public static void main(String[] args) {
			Simple_Alert sa=new Simple_Alert();
			sa.prompt();
		}
	}


