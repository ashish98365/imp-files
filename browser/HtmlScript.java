package browser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HtmlScript
{

	public static void main(String [] args) throws InterruptedException, Exception
	{
		
		
		StringBuffer wordSelectOption = new StringBuffer();
		StringBuffer wordMeaning = new StringBuffer();
		
		System.out.println("Enter word list: ");
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		String listNo = reader.readLine();
		
		System.out.println("Enter location where you want to save file(Don't provide file name): ");
		String path = reader.readLine();
		if(path.contains("\\"))
		{
			path = path.replace("\\", "/");
		}
		
		System.out.println("Enter location where chromedriver.exe is saved(Don't provide file name): ");
		String chromePath = reader.readLine();
		if(chromePath.contains("\\"))
		{
			chromePath = chromePath.replace("\\", "/");
		}
		
		PrintWriter writer = new PrintWriter(path+"/words-list-"+listNo+".html", "UTF-8");
		
		
		System.setProperty("webdriver.chrome.driver", chromePath+"/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.jamboreeeducation.com/login");
        
        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("password"));
        
        email.sendKeys("ashish98365@gmail.com");
        password.sendKeys("ashish98365");
        
        WebElement login = driver.findElement(By.className("btn-success"));
        login.click();
        
        driver.navigate().to("https://www.jamboreeeducation.com/vocab");
        driver.navigate().to("https://www.jamboreeeducation.com/vocab/learn");

        Select wordList = new Select(driver.findElement(By.id("vocab-list")));

        wordList.selectByValue(listNo.trim());
        
        WebElement select = driver.findElement(By.id("vocab-groups"));
		Select dropDown = new Select(select);           
		
		Thread.sleep(2000);
		List<WebElement> options = dropDown.getOptions();
        
		for(int i=0; i< options.size(); i++)
		{
			writeTofile(driver, dropDown, options.get(i), wordSelectOption, wordMeaning, i, listNo);
		}
		
		String htmlContent = HtmlDesign.getHtmlContent().replace("<!-- WORD LIST -->", wordSelectOption.toString());
		htmlContent = htmlContent.replace("<!-- WORD MEANING -->", wordMeaning.toString());
		writer.write(htmlContent);
        writer.flush();
        writer.close();
        System.out.println("-------------------End--------------");
	}
	
	private static void writeTofile(WebDriver driver, Select dropDown, WebElement option, StringBuffer wordSelectOption,  StringBuffer wordMeaning, int interationCount, String listNo)
	{
		dropDown.selectByVisibleText(option.getText());
		wordSelectOption.append("<option value='word-list-"+listNo+"-"+interationCount+"'>"+option.getText()+"</option>");
		String wordGroup = "";
		try
		{
			Thread.sleep(2000);
			List<WebElement> anchorElements = driver.findElements(By.cssSelector("a[class='btn btn-green']"));
			for(WebElement anchorElement: anchorElements)
			{
				Thread.sleep(2000);
				anchorElement.click();
				Thread.sleep(1000);
				
				wordGroup = option.getText();
				
				WebElement meaningElement = driver.findElement(By.cssSelector("div[class='bootbox-body'] > p:nth-child(2)"));
				WebElement sentenceElement = driver.findElement(By.cssSelector("div[class='bootbox-body'] > p:nth-child(3)"));
				
				String meaning = meaningElement.getText().replaceAll("'", "\\\\'").replace("Meaning: ", "");
				String sentence = sentenceElement.getText().replaceAll("'", "\\\\'").replace("Example: ", "");
				
				if(meaning == null || "".equals(meaning.trim()) || sentence == null || "".equals(sentence))
				{
					Thread.sleep(6000);
					System.out.println("Before while");
					while(true)
					{
						System.out.println("In while");
						meaning = meaningElement.getText().replaceAll("'", "\\\\'").replace("Meaning: ", "");
						sentence = sentenceElement.getText().replaceAll("'", "\\\\'").replace("Example: ", "");
						if(meaning != null && !"".equals(meaning.trim()) && sentence != null && !"".equals(sentence))
						{
							System.out.println("Problem in ---------------------"+option.getText()+"----------"+anchorElement.getText());
							break;
						}
					}
				}
				
				wordMeaning.append("<li class='col-lg-4 col-xs-6' word-group='word-list-"+listNo+"-"+interationCount+"'><div class='boxed'>");
				wordMeaning.append("<a class=\"btn btn-green\" data-toggle=\"modal\" onclick=\"preparePopup('"+anchorElement.getText()+"', '"+meaning+"', '"+sentence+"')\" data-target=\"#myModal\"><span class='word'>"+anchorElement.getText()+"</span><span class='none group-info'><br/> Word Group: <span class='word-group'>"+wordGroup+"</span><br/>Word List: "+listNo+"</span></a></div></li>");
				driver.findElement(By.cssSelector("button[class='btn btn-sm btn-default']")).click();
			}
		}
		catch(Exception e)
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			driver.findElement(By.cssSelector("button[class='btn btn-sm btn-default']")).click();
		}
	}
	

}
