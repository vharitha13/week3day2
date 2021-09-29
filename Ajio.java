package week3Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		WebElement noOfItems = driver.findElement(By.xpath("//div[contains(@class,'length')]"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(noOfItems));
		String text = noOfItems.getText();
		System.out.println("There are:"+text+"under Mens->Fashion Bags");
		driver.findElement(By.xpath("//span[contains(text(),'brands')]")).click();
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='preview']/div[2]/div[@class='brand']"));
		int size2 = brands.size();
		System.out.println("The total number of brands for Fashion Bags under Mens are: "+size2);
		for (int i = 0; i < size2; i++) {
			String brand = brands.get(i).getText();
			System.out.println("Brands" + brand);
		} 	
		driver.close();
	}
}
