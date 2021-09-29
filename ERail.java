package week3Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ERail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MS", Keys.ENTER);
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU", Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement> trainNumbers = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[1]"));
		int size = trainNumbers.size();
		System.out.println("Total number of trains:" + size);
		for (int i = 0; i < size; i++) {
			String trainNum = trainNumbers.get(i).getText();
			System.out.println("Train Number:" + trainNum);
		}
		for (WebElement webElement : trainNumbers) {
			System.out.println("Train num:" + webElement.getText());
		}
		driver.close();
	}

}
