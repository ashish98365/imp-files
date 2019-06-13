package dict;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import com.google.common.collect.ObjectArrays;

public class WordApi
{
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
	{

		System.out.println(System.getProperty("user.dir")+"/words.txt");
		PrintWriter writer = new PrintWriter(System.getProperty("user.dir")+"/words.txt", "UTF-8");
		String a[] = (String[])ObjectArrays.concat(Words1To7.wordGroup, Words8to14.wordGroup, String.class);
		System.out.println(a.length);
		int temp = 5;
		writer.write("{");
		for(int i=0; i< 1798; i++)
		{
			if(i != 0)
			{
				temp =temp+ 6;
			}
			//writer.write("\"{\\\""+a[temp-2]+"\\\":\\\""+a[temp-1]+"\\\"}\",\n");
			writer.write("\"{\\\""+a[temp-2]+"\\\":{sentence: \\\""+a[temp-3]+"\\\", meaning: \\\""+a[temp-3]+"\\\", group: \\\""+a[temp-3]+"\\\"}\n");
		}
		writer.write("}");
		writer.close();
	
	}
}
