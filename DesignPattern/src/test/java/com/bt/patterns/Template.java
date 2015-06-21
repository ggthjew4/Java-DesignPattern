package com.bt.patterns;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bt.bluetechnology.patterns.Template.ConfigParser;
import com.bt.bluetechnology.patterns.Template.FileConfigParser;
import com.bt.bluetechnology.patterns.Template.PersonData;

public class Template {

	@Test
	public void test() {
		ConfigParser parse = new FileConfigParser("c:\\file.txt");
		PersonData returnData =  parse.doParse(); 
		assertEquals("Kerrigan", returnData.getName());
	}

}
