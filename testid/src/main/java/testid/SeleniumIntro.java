package testid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		

		
		/*System.setProperty("webdriver.firefox.driver", "C:\\Users\\Admin\\Desktop\\geckodriver.exe");
        WebDriver browser = new FirefoxDriver();*/
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
        WebDriver browser = new ChromeDriver(options);
        
        browser.get("https://www.google.com/");
		System.out.println(browser.getTitle());
		System.out.println(browser.getCurrentUrl());
		browser.quit();

	}

}

