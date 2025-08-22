package com.playwrite;

import java.nio.file.Paths;
import java.util.Base64;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Screenshots {

	public static void main(String[] args) {
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        
        page.navigate("https://facebook.com/");
        
        //simple screenshot
        page.screenshot(new Page.ScreenshotOptions().
        		setPath(Paths.get("./Screenshots/screenshot.png")));
        
        //Full page screenshot
        page.screenshot(new Page.ScreenshotOptions()
        		.setPath(Paths.get("./Screenshots/fullscreenshot.png")).setFullPage(true));

        //Element or Locator Screenshot
        Locator username=page.getByTestId("royal-email");
         username.screenshot(new Locator.ScreenshotOptions()
        		.setPath(Paths.get("./Screenshots/elementScreenshot.png")));
        
         //Capture into buffer
        byte[] buffer=page.screenshot();
        System.out.println(Base64.getEncoder().encodeToString(buffer));
        
        
        System.out.println(page.title()+page.url());
        System.out.println("Screenshots taken");
        
        
        page.close();
        browser.close();
        
	}

}
