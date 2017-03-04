package com.taulukko.commons.parsers;

import org.junit.Test
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.taulukko.commons.parsers.jsonParser.JSONParser

@RunWith(JUnit4.class)
class InjectTemplateTest {

	@Test
	void jsonToClass () {
		String json ='{"verbose": true }';
		ConfigBean config = JSONParser.convert(json, ConfigBean.class);
		assert config != null;
		assert config.verbose == true
	}
	
	 
}
