package GenericFunction;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.Scenario;

public class ScreenshotUtils extends Genericfunction{

	static Scenario scenario;

	public ScreenshotUtils(Scenario sc) {
		scenario = sc;
	}
	
	public static String takeSnapshot()
	{		
			TakesScreenshot ts=(TakesScreenshot) driver;
			byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
			String screenshotName = "screenshot_"+ new Random().nextInt(10000);
			File  screenshotFile=ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshotFile, new File ("target/cucumberscreenshot"+screenshotName+".png"));
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			scenario.attach(screenshot, "image/png", screenshotName+".png");
			return screenshotName;
					
	}
	
	public static void logswithscreenshot(String s) {
		scenario.log(s);
		takeSnapshot();
	}
	
	
	public static void logswithoutscreenshot(String s) {
		scenario.log(s);
	}
}
