package learnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pranav\\Desktop\\data\\SW_Testing\\Webdriver\\chromedriver.exe");
		 
		// Initialise browser
		 
		WebDriver Driver=new ChromeDriver();
		//WebDriver Driver= new FirefoxDriver();
		//DragDrop(Driver);
		MouseActions(Driver);

		
	}
	public static void DragDrop(WebDriver Driver) throws InterruptedException
	{
		Driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		Actions Act = new Actions(Driver);
		WebElement Drag= Driver.findElement(By.id("draggable"));
		WebElement Drop= Driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		Act.dragAndDrop(Drag, Drop).build().perform();
		
	}
	
	public static void MouseActions(WebDriver Driver) throws InterruptedException
	{
		Driver.get("http://www.naukri.com");
		Actions MouseHandle= new Actions(Driver);
		WebElement MouseOver=Driver.findElement(By.xpath("//span[@class='topIcon jobs Recr']"));
		//MouseHandle.moveToElement(MouseOver).build().perform();
		//Thread.sleep(3000);
		
		MouseHandle.clickAndHold(MouseOver).build().perform();
		Thread.sleep(10000);
		MouseHandle.release(MouseOver).build().perform();
	}

}
