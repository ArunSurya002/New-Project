import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10P8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Day10\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtsearch=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        txtsearch.sendKeys("iphone 8",Keys.ENTER);
        Thread.sleep(2000);
        WebElement link=driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone XR (64GB) (Product) RED')]"));
        link.click();
        Set<String> all = driver.getWindowHandles();
        LinkedList<String> li = new LinkedList<String>();
        li.addAll(all);
        driver.switchTo().window(li.get(1));
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']")).click();
        
	}
}
