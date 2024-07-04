package com.cucumber.pages;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateOrderPage {
	
	public void runCommands() throws InterruptedException
	{
	}	
	public static void main(String args[])
	{
//		String command1 = "cd C:\\Users\\754376\\Downloads\\Wickes\\HDX\\Karate standalone";
		String command2 = "java -jar karate.jar -h";
		String command3 = "java -jar karate.jar createOrder.feature";
		try
		{
//			Runtime rt = Runtime.getRuntime();
//			rt.exec("cmd.exe /c start command", null, new File("C:\\Users\\754376\\Downloads\\Wickes\\HDX\\Karate standalone"));
//			Thread.sleep(1000);
			
			/*Process process = Runtime.getRuntime()
			        .exec("cmd /c dir", null, new File("C:\\Users\\754376\\Downloads\\Wickes\\HDX\\Karate standalone"));
			
			
			 Process process1 = Runtime.getRuntime().exec(command2);
			    Thread.sleep(10000);
			
			    Process process3 = Runtime.getRuntime().exec(command3);
			    Thread.sleep(2000);
			*/
			
			/*Process process = Runtime.getRuntime().exec(
			        new String[]{"cmd", "/c", "dir"},
			        null, 
			        new File("C:\\Users\\754376\\Downloads\\Wickes\\HDX\\Karate standalone"));*/
			
//			Process process = Runtime.getRuntime().exec("cmd /c cmd.exe");
//			 Runtime rt = Runtime.getRuntime();

			 

//			        rt.exec(new String[]{"cmd.exe","/c","start"}); //working
			        
			    	 /* ProcessBuilder builder = new ProcessBuilder(

			    	            "cmd.exe", "/c", "cd \"C:\\Users\\754376\\Downloads\\Wickes\\HDX\\Karate standalone\" && dir");

			    	        builder.redirectErrorStream(true);

			    	        Process p = builder.start();

			    	        p = Runtime.getRuntime().exec(command2);*/
			        
			
//		    Process process = Runtime.getRuntime().exec(command1);
//		    Thread.sleep(1000);
//		    Process process1 = Runtime.getRuntime().exec(command2);
//		    Thread.sleep(10000);
//		    Process process3 = Runtime.getRuntime().exec(command3);
//		    Thread.sleep(2000);
			 Runtime rt = Runtime.getRuntime();
			 rt.exec("cmd.exe /c start cmd /k java -jar karate.jar -h", null, new File("C:\\Users\\754376\\Downloads\\Wickes\\HDX\\Karate standalone"));

			 
			 
		} catch (Exception e)
		{
		    e.printStackTrace();
		}
	}

}
