package com.keyu.testng;

import org.openqa.selenium.WebElement;

public class WaitForLoad {

	public static void WaitForElement(WebElement Element, int timeOut, int numberOfWait){
	    for (int i = 0; i < numberOfWait; i++){
		    try {
		    	if (Element.isDisplayed()){
		    		break;
		    	}
		        Thread.sleep(timeOut);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
	    }
	}
}
