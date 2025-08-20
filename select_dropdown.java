package com.playwrite;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class select_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		
		page.navigate("https://facebook.com/");
		
		page.getByText("Sign Up").click();
		
		
	}

}
