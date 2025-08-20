package com.playwrite;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class fetchingText {

	private static final boolean String = false;

	public static void main(String[] args) {
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page=browser.newPage();
        
        page.navigate("http:/facebook.com/");
        
         Locator links = page.locator("//a");
         int totallinks=links.count();
         System.out.println(totallinks);
         
        List<String> linkText=links.allInnerTexts();
         
         
        for(String txt:linkText)
   		{
   			System.out.println(txt);
    		}
         
         
         
        
        
	}

}
