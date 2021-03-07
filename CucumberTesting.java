package learnselenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberTesting {

	public static void main(String[] args) throws IOException {
		 WebDriverManager.chromedriver().setup();
		    ChromeDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		    driver.get("http://www.javatpoint.com");
		    driver.findElementByXPath("(//div[@class='homecontent'])[4]").click();
		    String text = driver.findElementByXPath("//h1[text()='Cucumber Testing Tutorial']").getText();
		    System.out.println(text);
		    File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		    File file = new File ("./snapshot/img.png");
		    FileUtils.copyFile(screenshotAs, file);
		    driver.findElementByXPath("(//a[@class='next'])[1]").click();
		    driver.findElementByXPath("//a[text()='Behavior Driven Development']").click();
		    driver.navigate().back();
		    String title = driver.getTitle();
		    System.out.println(title);

	}

}
