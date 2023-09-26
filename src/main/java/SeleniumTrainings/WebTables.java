package SeleniumTrainings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']//tr"));
		int rowCount = rows.size();
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='courses']//tr/th"));
		int columnCount = columns.size();
		System.out.println(rowCount + " " + columnCount);
		String text = driver.findElement(By.xpath("//table[@name='courses']//tr[2]/td[2]")).getText();
		System.out.println(text);
		System.out.println("Instructor"+" "+"Course"+" "+"Price");
		for(int i=2;i<=rowCount;i++) {
			for(int j=1;j<=columnCount;j++) {
				String data=driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
			
		}
		
			for(int c=1;c<=columnCount;c++) {
			String rowData=driver.findElement(By.xpath("//table[@name='courses']//tr[2]/td["+c+"]")).getText();
			System.out.print(rowData+"\t");
		}
			for(int row=2;row<=rowCount;row++) {
				String colData=driver.findElement(By.xpath("//table[@name='courses']//tr["+row+"]/td[2snipping]")).getText();
				System.out.println(colData);
				
			}

	}
}
