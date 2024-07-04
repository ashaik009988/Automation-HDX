package com.cucumber.stepdefinitions;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import GenericFunction.Genericfunction;
import io.cucumber.java.*;

public class Hooks extends Genericfunction{
	@Before
    public void beforeScenario(){
       
    }
	
	
	
	
	@After
    public void afterScenario(){
		
//        System.out.println("This will run after the Scenario");
  //       tearDown();
    }
	
	
   
	public void takeScreenshot(Scenario scenario)
	{		
			TakesScreenshot ts=(TakesScreenshot) driver;
			byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
			
//			if(scenario.isFailed()) {
//				tearDown();
//			}
		
	}
	

//	public static void takeSnapshot(Scenario scenario)
//	{
//			TakesScreenshot ts=(TakesScreenshot) driver;
//			byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
//			String screenshotName = "screenshot_"+ new Random().nextInt(10000);
//			File  screenshotFile=ts.getScreenshotAs(OutputType.FILE);
//			try {
//				FileUtils.copyFile(screenshotFile, new File ("target/cucumberscreenshot"+screenshotName+".png"));
//			}
//			catch(IOException e) {
//				e.printStackTrace();
//			}
//			scenario.attach(screenshot, "image/png", screenshotName+".png");
//		//	return screenshotName;
//
//	}
}


