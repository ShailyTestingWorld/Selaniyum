package com.flipcart.utility;

import org.testng.annotations.Test;

public class TestReader {
	
	@Test
	public void read() {
	String	save=PropertyReader.getConfigProperty("pass");
	    System.out.println(save);
	}

}
