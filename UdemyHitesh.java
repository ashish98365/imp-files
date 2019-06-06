package browser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyHitesh
{
	public static void main(String[] args) throws InterruptedException, Exception
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
		
		System.out.println("Enter total no of video ");
		int noOfVideo = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter location where chromedriver.exe is saved(Don't provide file name): ");
		String chromePath = reader.readLine();
		if(chromePath.contains("\\"))
		{
			chromePath = chromePath.replace("\\", "/");
		}
		
		PrintWriter writer = null;
		
		System.setProperty("webdriver.chrome.driver", chromePath+"/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.udemy.com/");
        
        WebElement loginPopup = driver.findElement(By.cssSelector("button[class='btn btn-quaternary']"));
        loginPopup.click();
        
        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("password"));
        
        email.sendKeys("ashish98365@gmail.com");
        password.sendKeys("ashish98365");
        
        WebElement login = driver.findElement(By.name("submit"));
        login.click();
        
        driver.navigate().to("https://www.udemy.com/complete-react-native-bootcamp/learn/lecture/13981304#overview");
        
        int tempNoOfSection = 0;
        for(int i=1; i<= noOfVideo; i++)
        {
        	if(!(tempNoOfSection < noOfVideo))
        	{
        		break;
        	}
        	
        	WebElement sectionDiv = driver.findElement(By.cssSelector("div[data-purpose='section-panel-'"+tempNoOfSection+"]"));
        	sectionDiv.click();
        }
	}
}
