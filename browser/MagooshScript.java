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

public class MagooshScript {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.out.println("Enter word group:\n 1: Common word \n 2: Basic word \n 3: Advance word ");
		StringBuffer wordMeaning = new StringBuffer();
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		String wordGroup = reader.readLine();
		
		System.out.println("Enter word group no: ");
		wordMeaning = new StringBuffer();
		reader =  new BufferedReader(new InputStreamReader(System.in));
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
		
		PrintWriter writer = new PrintWriter(path+"/"+wordGroup+"words-list-"+listNo+".html", "UTF-8");
		
		System.setProperty("webdriver.chrome.driver", chromePath+"/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        if("1".equals(wordGroup) && "1".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/high-frequency-words");
        }
        else if("1".equals(wordGroup) && "2".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/common-words-2");        	
        }
        else if("1".equals(wordGroup) && "3".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/common-words-3");        	
        }
        else if("1".equals(wordGroup) && "4".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/common-words-4");        	
        }
        else if("1".equals(wordGroup) && "5".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/common-words-5");        	
        }
        else if("1".equals(wordGroup) && "6".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/common-words-6");        	
        }
        else if("2".equals(wordGroup) && "1".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/basic-words-i");        	
        }
        else if("2".equals(wordGroup) && "2".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/basic-words-ii");        	
        }
        else if("2".equals(wordGroup) && "3".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/basic-words-3");        	
        }
        else if("2".equals(wordGroup) && "4".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/basic-words-4");        	
        }
        else if("2".equals(wordGroup) && "5".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/basic-words-5");        	
        }else if("2".equals(wordGroup) && "6".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/basic-words-6");        	
        }
        else if("2".equals(wordGroup) && "7".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/basic-words-7");        	
        }
        else if("3".equals(wordGroup) && "1".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/advanced-words-i");        	
        }
        else if("3".equals(wordGroup) && "2".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/advanced-words-ii");        	
        }
        else if("3".equals(wordGroup) && "3".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/advanced-words-3");        	
        }
        else if("3".equals(wordGroup) && "4".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/advanced-words-4");        	
        }
        else if("3".equals(wordGroup) && "5".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/advanced-words-5");        	
        }
        else if("3".equals(wordGroup) && "6".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/advanced-words-6");        	
        }
        else if("3".equals(wordGroup) && "7".equals(listNo))
        {
        	driver.navigate().to("https://gre.magoosh.com/flashcards/vocabulary/decks/advanced-words-7");        	
        }
        
        for(int i=1; i< 53; i++)
        {
        	Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("a[class='card-footer text-center']")).click();
			
			WebElement word = driver.findElement(By.cssSelector("h3[class='flashcard-word']"));
			WebElement meaning = driver.findElement(By.cssSelector("div[class='flashcard-text']"));
			WebElement sentence = driver.findElement(By.cssSelector("em[class='flashcard-example']"));
			
			wordMeaning.append("<li class='col-lg-4 col-xs-6' word-group='word-list-"+listNo+"-"+i+"'><div class='boxed'>");
			wordMeaning.append("<a class=\"btn btn-green\" data-toggle=\"modal\" onclick=\"preparePopup('"+word.getText()+"', '"+meaning.getText()+"', '"+sentence.getText()+"')\" data-target=\"#myModal\"><span class='word'>"+word.getText()+"</span></a></div></li>");
			
			driver.findElement(By.cssSelector("a[class='card-footer card-footer-success text-center']")).click();
        }
        
		String htmlContent = HtmlMagooshDesign.getHtmlContent().replace("<!-- WORD MEANING -->", wordMeaning.toString());
		writer.write(htmlContent);
        writer.flush();
        writer.close();
        System.out.println("-------------------End--------------");
		
	}

}
