import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10P2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Day10\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement txtsearch=driver.findElement(By.xpath("//input[@id='inputValEnter']"));
        txtsearch.sendKeys("iphone 7",Keys.ENTER);
        Thread.sleep(2000);
        WebElement link=driver.findElement(By.xpath("//p[contains(text(),'Apple iPhone 7 Plus Printed Cover By Case king')]"));
        link.click();
        Set<String> all = driver.getWindowHandles();
        LinkedList<String> li = new LinkedList<String>();
        li.addAll(all);
        driver.switchTo().window(li.get(1));
        driver.findElement(By.xpath("//div[@id='add-cart-button-id']")).click();
        driver.findElement(By.xpath("//a[@class='btn marR5']")).click();
        

}
}