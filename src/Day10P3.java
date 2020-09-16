import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day10P3 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Day10\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
        WebElement link=driver.findElement(By.xpath("//a[contains(text(),'COURSES')]"));
        Robot r= new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
        Actions acc=new Actions(driver);
        acc.contextClick(link).perform();
        r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
       
		Thread.sleep(1000);
		 Set<String> all = driver.getWindowHandles();
	        java.util.List<String> li = new LinkedList<String>();
	        li.addAll(all);
	        driver.switchTo().window(li.get(1));
	        TakesScreenshot tk= (TakesScreenshot) driver;
			
			File s=tk.getScreenshotAs(OutputType.FILE);
			
			
			File d=new File("C:\\Users\\user\\Downloads\\org\\out1.png");
			
			FileUtils.copyFile(s, d);
		
			}
		}

