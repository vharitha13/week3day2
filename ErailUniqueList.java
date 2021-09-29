package week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUniqueList {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(2000);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement> trainNames = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		List<String> trainList=new ArrayList<String>();
		int size = trainNames.size();
		System.out.println("Total number of trains:" + size);
		for (int i = 0; i < size; i++) {
			String trainName = trainNames.get(i).getText();
			trainList.add(trainName);
		}
		Set<String> uniqueValues=new LinkedHashSet<String>();
		for (String string : trainList) {
			uniqueValues.add(string);
		}
		for (String string : uniqueValues) {
		System.out.println("The unique Train names are:"+string);
		}
		driver.close();

	}

}
