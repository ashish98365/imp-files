package dict;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import com.google.common.collect.ObjectArrays;

public class WordGroupApi {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
	{
		System.out.println(System.getProperty("user.dir")+"/words-group.txt");
		PrintWriter writer = new PrintWriter(System.getProperty("user.dir")+"/words-group.txt", "UTF-8");
		ArrayList<String> wordGroup = new ArrayList<String>();
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
			if(wordGroup.contains(a[temp-1]))
			{
				continue;
			}
			wordGroup.add(a[temp-1]);
			writer.write("\"{\\\""+a[temp-1]+"\\\":\\\""+a[temp]+"\\\"}\",\n");
			System.out.println(""+temp);
		}
		writer.write("}");
		writer.close();
	}

}
