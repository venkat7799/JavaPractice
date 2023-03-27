package javapjctpr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class java {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C://Users//hai//Downloads//edgedriver_win64//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		Actions act = new Actions(driver);
		driver.get("https://www.parasoft.com/");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='hs-eu-confirmation-button']")).click();
		
		
		
		WebElement solutions =	driver.findElement(By.xpath("//a[text()='Solutions']"));
		
		act.moveToElement(solutions).build().perform();
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//a[text()='API Security Testing']")).click();
		WebElement DownloadGuide =driver.findElement(By.xpath("//a[text()='Download Guide']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(900,900)");
		Thread.sleep(3000);
		driver.close();
	}

}
