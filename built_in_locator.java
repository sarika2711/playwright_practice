package com.playwrite;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class built_in_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
         Page page = browser.newPage();
         
         page.navigate("https://www.facebook.com/");
         
         page.getByPlaceholder("Email address or phone number").fill("sarika@gmail.com");
         page.getByPlaceholder("Password").fill("abc@123");
         
         
           Locator logo = page.getByAltText("Facebook");
           System.out.println(logo.isVisible()); 
           System.out.println(logo.textContent());
           logo.click();
           
         //page.getByText("Forgotten password?").click();
         
		//Locator clickbutton = page.getByTestId("royal-login-button");
		//System.out.println(clickbutton.isVisible());
		//clickbutton.click();
		
	}

}
