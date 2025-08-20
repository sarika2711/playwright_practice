package com.playwrite;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class locator {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		
		page.navigate("https://www.facebook.com/");
		
		System.out.println(page.title());
		System.out.println(page.url());
		
		page.locator("#email").fill("sarika@123");
		page.locator("#pass").fill("abc@123");
		//page.locator("//*[@name=\"login\"]").click();
		
		
		Locator links=page.locator("//a");
		System.out.println(links.count());  //count for how many anchor tags
		
		
		Locator link = page.locator("//a[contains(text(),'Privacy')]"); //to check how many tag contain 'privacy' 
		System.out.println(link.count());
		link.first().click();
		
		System.out.println(page.title());
		System.out.println(page.url());
		
		
		
		
		
	}

}
