package browser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Course
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter location where you want to save file(Don't provide file name): ");
		String path = reader.readLine();
		if(path.contains("\\"))
		{
			path = path.replace("\\", "/");
		}
		
		System.out.println("Enter total no of section ");
		int noOfSection = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter location where chromedriver.exe is saved(Don't provide file name): ");
		String chromePath = reader.readLine();
		if(chromePath.contains("\\"))
		{
			chromePath = chromePath.replace("\\", "/");
		}
		
		PrintWriter writer = new PrintWriter(path+"/link.html", "UTF-8");
		
		System.setProperty("webdriver.chrome.driver", chromePath+"/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://www.udemy.com/");
	    Thread.sleep(2000);
	    
	    
	    WebElement loginPopup = driver.findElement(By.cssSelector("button[class='btn btn-quaternary']"));
	    loginPopup.click();
	    Thread.sleep(2000);
	    
	    WebElement email = driver.findElement(By.name("email"));
	    WebElement password = driver.findElement(By.name("password"));
	    
	    email.sendKeys("ashish98365@gmail.com");
	    password.sendKeys("9836512074");
	    
	    WebElement login = driver.findElement(By.name("submit"));
	    login.click();
	    
	    driver.navigate().to("https://www.udemy.com/complete-react-native-bootcamp/learn/lecture/13981304#overview");
	    
	    for(int i=0; i<= noOfSection; i++)
	    {
	    	WebElement sectionDiv = driver.findElement(By.cssSelector("div[data-purpose='section-panel-"+i+"']"));
	    	sectionDiv.click();
	    }
    }
}
