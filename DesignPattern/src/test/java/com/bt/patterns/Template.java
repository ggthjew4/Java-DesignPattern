package com.bt.patterns;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bt.bluetechnology.patterns.template.ConfigParser;
import com.bt.bluetechnology.patterns.template.FileConfigParser;
import com.bt.bluetechnology.patterns.template.PersonData;


public class Template {

	@Test
	public void test() {
		ConfigParser parse = new FileConfigParser("c:\\file.txt");
		PersonData returnData =  parse.doParse(); 
		assertEquals("Kerrigan", returnData.getName());
	}

}
