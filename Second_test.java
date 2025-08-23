package First;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Second_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Playwright pw = Playwright.create(); 
         BrowserType browsertype = pw.chromium();
         
		 
		 
		LaunchOptions option= new LaunchOptions();
		option.setChannel("chrome");
		option.setHeadless(false);
		
		Browser browser= browsertype.launch(option);
		
		Page page=browser.newPage();
		page.navigate("http://www.gmail.com");
		System.out.println(page.title());
			

	}

}
