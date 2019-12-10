package com.bookish.dictionary;
import java.util.Arrays;
import java.lang.Object;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bookish.dictionary.VocabWord1TO7;
import com.bookish.dictionary.VocabWord8To14;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.common.collect.ObjectArrays;

@Controller
public class AndroidDIctionary
{
	@GetMapping("/get-all-word-count")
	@ResponseBody
	public int getOverallWordCount()
	{
		String[] both = ObjectArrays.concat(VocabWord1TO7.wordGroup, VocabWord8To14.wordGroup,String.class);
		return both.length;
	}
	
	@GetMapping("/get-all-words")
	@ResponseBody
	public String getAllWord() throws JsonProcessingException
	{
		ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String[] both = ObjectArrays.concat(VocabWord1TO7.wordGroup, VocabWord8To14.wordGroup,String.class); 
		return objectWriter.writeValueAsString(both);
	}
	
}
