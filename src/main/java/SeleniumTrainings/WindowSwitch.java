package SeleniumTrainings;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitch {
	
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[@id='openwindow']")).click();
			Set<String> window_ids = driver.getWindowHandles();
			Iterator<String> it =window_ids.iterator();
			/*String parent = it.next();
			String child = it.next();
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			driver.switchTo().window(parent);
			System.out.println(driver.getTitle());
			driver.quit();*/
			String parent = driver.getWindowHandle();
			//String child = it.next();
			while(it.hasNext()){
				String child = it.next();
				if(!parent.equals(child)) {
					driver.switchTo().window(child);
					System.out.println(driver.getTitle());
					driver.close();
				}
				
			}
			driver.switchTo().window(parent);
			System.out.println(driver.getTitle());
			
			
			
			
		}

}
