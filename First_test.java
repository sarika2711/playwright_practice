package First;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class First_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Playwright pw = Playwright.create(); 
            BrowserType browsertype = pw.chromium();
            
            Browser browser=browsertype.launch(new BrowserType.LaunchOptions().setHeadless(true));
            Page page = browser.newPage();
            
            
            page.navigate("https://www.facebook.com/");
            
            String title=page.title();
            System.out.println("Facebook Title : "+ title);
            
            String url=page.url();
            System.out.println("Facebook url : "+ url); 
		

	}

}
