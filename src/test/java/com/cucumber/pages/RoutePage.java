package com.cucumber.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;

//import junit.framework.Assert;
import org.junit.Assert;

public class RoutePage extends Genericfunction {
	String baseloc;
	WebElement visit;
	String randomtext = null;
	String randomint = null;

	public String verify_User_isOn_VisitBreakDown_page() throws Throwable {
		Thread.sleep(2000);
		Assert.assertEquals("Visit Breakdown:", findElement(WebElements.visit).getText());
		driver.findElement(By.xpath("//body[1]/form[1]/div[18]/a[7]/span[1]")).click();
		driver.switchTo().frame("WidgVisitDetails");
		baseloc = driver.findElement(By.xpath("//li[6]//span[2]")).getText();
		System.out.println(baseloc);
		return baseloc;
	}

	public void user_able_click_on_transport_from_main_menu_bar() throws Throwable {
		driver.switchTo().defaultContent();
		WebElement ele = findElement(WebElements.transport);
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		// driver.findElement(By.xpath("//div[normalize-space()='Route
		// Planning']")).click();
	}

	public void user_is_then_able_to_see_the_sub_drop_down_of_transport() throws Throwable {
		Assert.assertEquals("Resource Monitor", findElement(WebElements.resource).getText());
		// System.out.println(driver.findElement(By.xpath("//div[normalize-space()='Resource
		// Monitor']")).getText());
		// System.out.println("done");
	}

	public void user_is_on_transport_tab() throws Throwable {
		Assert.assertEquals("Route Planning", findElement(WebElements.routeplanning).getText());
	}

	public void user_is_presented_with_the_route_planning_page() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl().toString(), getValueFrom_Properties("urlroute"));
		// System.out.println("routeplanning");
	}

	public void user_able_to_select_the_date_from_the_calendar() throws Throwable {
		Thread.sleep(4000);
		driver.switchTo().frame("ifMain");
		clickOnElement(WebElements.caldenderbox);
		driver.switchTo().frame("testcalendar");
		String output = "5 aug 2023";
		String[] splited = output.split(" ");
		String xpa = "//td[normalize-space()='" + splited[0] + "']";
		for (int i = 0; i < 3; i++) {
			String month = gettext(WebElements.monthyear);
			String[] spliteds = month.split(" ");
			String calcmonth = spliteds[0].toLowerCase();
			System.out.println(month);
			if (calcmonth.contains(splited[1])) {
				System.out.println("done");
				Thread.sleep(3000);
				driver.findElement(By.xpath(xpa)).click();
				break;
			}
			// driver.findElement(By.xpath("//td[contains(text(),'▶')]")).click();
			clickOnElement(WebElements.nextmonth);
			// System.out.println("one time");
		}
		Thread.sleep(3000);

	}

	public void user_able_to_click_on_search_button() throws Throwable {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("ifMain");
		// driver.findElement(By.xpath("//button[@id='btnSearch']")).click();
		clickOnElement(WebElements.calendersearch);
	}

	public void user_should_presented_with_Outbase_and_the_visit_count() throws Throwable {
		// List<WebElement>
		// outbase=driver.findElements(By.xpath("//li[@class='RoutePlanning
		// RoutePlanningGroup']/div[@class='RoutePlanningGroupName']"));
		List<WebElement> outbase = findElements(WebElements.outbase);
		for (WebElement i : outbase) {
			System.out.println(i.getText());
			if (i.getText().contains(baseloc)) {
				visit = i;
			}
		}
	}

	public void user_able_to_select_the_date_for_maual_routing(String loc,String date) throws Throwable {
	//	String date = "14 Feb 2024";
		Thread.sleep(4000);
		String loca = loc;
		// String loc = "Northampton HDC";

		childwindow();
		System.out.println("Location " + loca);		
		findElement(WebElements.caldenderinput).clear();
		sendkeys(WebElements.caldenderinput, date);

		String baseloc = "//select[@id='selOutbase']/option[contains(text(),'" + loca + "')]";
		clickOnElement(getByIdentifier(baseloc, "xpath"));

		clickOnElement(WebElements.searchButtoninrouting);

		Thread.sleep(2000);
		System.out.println("Date selected successfully");

	}

	public void user_able_to_select_the_unrouted_drops() throws Throwable {
		
		clickOnElement(WebElements.unrouteddrop);
		clickOnElement(WebElements.createroute);
		threewindow();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		System.out.println("Providing Name and Number");

		randomtext = RandomStringGenerator();
		randomint = RandomIntegerGenerator();

		sendkeys(WebElements.routename, randomtext);
		sendkeys(WebElements.routenumber, randomint);
		clickOnElement(WebElements.finalizeroute);
		System.out.println("Name : " + randomtext);
		System.out.println("Num : " + randomint);
	//	driver.switchTo().window(child1);
		System.out.println(child1+"child1 id ");
		childwindow();
		
	}
	
public void user_able_to_select_the_unrouted_drops_with_specified_route_number(String route_number) throws Throwable {
		
		clickOnElement(WebElements.unrouteddrop);
		clickOnElement(WebElements.createroute);
		threewindow();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		System.out.println("Providing Name and Number");

		randomtext = route_number+"Route";
		randomint = route_number;

		sendkeys(WebElements.routename, randomtext);
		sendkeys(WebElements.routenumber, randomint);
		clickOnElement(WebElements.finalizeroute);
		System.out.println("Name : " + randomtext);
		System.out.println("Num : " + randomint);
	//	driver.switchTo().window(child1);
		System.out.println(child1+"child1 id ");
		childwindow();
		
	}

	public void user_able_to_select_the_routed_drops() throws Throwable {
		Thread.sleep(3000);
        System.out.println("random tex is : "+ randomtext);
		String time = "//td[contains(text(),'" + randomtext + "')]/following::input[3]";
		findElement(getByIdentifier(time, "xpath")).clear();
		Thread.sleep(2000);
		sendkeys(getByIdentifier(time, "xpath"), "12:10");
		String checkbox = "//td[contains(text(),'" + randomtext + "')]/following::input[1]";		
		clickOnElement(getByIdentifier(checkbox, "xpath"));
		Thread.sleep(2000);
		String xpath = "//td[contains(text(),'" + randomtext + "')]/preceding::td[contains(text(),'TBC')]";
		clickOnElement(getByIdentifier(xpath, "xpath"));
		Thread.sleep(2000);
		clickOnElement(WebElements.confirmchanges);

		try {
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
		}

		catch (Exception e) {
			System.out.println("No Alert");
		}
		try {
			Thread.sleep(3000);
			driver.findElement(WebElements.okpopup).click();
			}
			catch(Exception e) {
				System.out.println("No OK POPUP");
			}
		Thread.sleep(2000);
		clickOnElement(getByIdentifier(checkbox, "xpath"));
		Thread.sleep(2000);
		String xpathnumber = "//td[text()='" + randomint + "']";
		System.out.println("xpath"+xpathnumber);
		System.out.println("randomint"+randomint);
		clickOnElement(getByIdentifier(xpathnumber, "xpath"));
		Thread.sleep(2000);
		clickOnElement(WebElements.finalroute);
		Thread.sleep(2000);
		clickOnElement(WebElements.confirmchanges);

		try {
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
		}

		catch (Exception e) {
			System.out.println("No Alert");
		}
		
		try {
		Thread.sleep(3000);
		driver.findElement(WebElements.okpopup).click();
		}
		catch(Exception e) {
			System.out.println("No OK POPUP");
		}
	
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentid1);
		Thread.sleep(2000);
	}
	
	public String getDate() {
	//	driver.switchTo().frame("ifMain");
		List<WebElement> col1 = driver.findElements(WebElements.tablesize);
		List<WebElement> out = findElements(
				By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
		String output = out.get(1).getText();
		System.out.println("Here is the actual get : "+ output);
		return output;
	}

	public static String RandomStringGenerator() {

		String characters = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();

		Random random = new Random();

		for (int i = 0; i < 4; i++) {
			int randomindex = random.nextInt(characters.length());
			sb.append(characters.charAt(randomindex));
		}

		String randomString = sb.toString();

		return randomString;
	}

	public static String RandomIntegerGenerator() {

		Random random = new Random();
		int randomInteger = random.nextInt(900) + 100;

		String randomIntString = String.valueOf(randomInteger);

		return randomIntString;
	}
}
