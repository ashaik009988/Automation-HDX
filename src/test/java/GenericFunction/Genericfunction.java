package GenericFunction;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.interactions.Actions;

import java.util.*;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Genericfunction {
	public static WebDriver driver;
	public static String parentid1;
	public static String parentid;
	public static String child1;
	public static String child2;
	public static String child3;
	public static HashMap<String, String> hashMap;
	public static String filePath = System.getProperty("user.dir");
	int count = 0;
	public static String timeStamp = getCurrentFormattedTime("dd-MMM-yyyy hh:mm:ss a").replace(" ", "_").replace(":",
			"-");
	public static String passedExcelFolderPath = "";
	static XSSFWorkbook workBook;
	public static String excelPath = "";
	private static final Logger logger = LogManager.getLogger(Genericfunction.class);
	protected static Scenario currentScenario;

	public static String getCurrentFormattedTime(String dateFormatString) {
		DateFormat dateFormat = new SimpleDateFormat(dateFormatString);
		Calendar calendar = Calendar.getInstance();
		return dateFormat.format(calendar.getTime());
	}

	public String getValueFrom_Properties(String PropertyName) throws IOException {
		Properties cofig = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/extent.properties");
		cofig.load(fis);
		return cofig.getProperty(PropertyName);
	}

	public void setValueIn_Properties(String propertyName, String propertyValue) throws IOException {
		Properties cofig = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/extent.properties");
		cofig.load(fis);
		cofig.setProperty(propertyName, propertyValue);
	}

	public WebDriver InitiateDriver() throws IOException {

		System.out.println("In initiate driver");
		System.setProperty("webdriver.chrome.driver", "C://Users//2174112//Downloads//chromedriver-win64/chromedriver-win64//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
//		options.setHeadless(true);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("launching uRL");
		driver.navigate().to(getValueFrom_Properties("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		return driver;
	}

	public WebDriver sftpdriverintilization() throws IOException {

		System.out.println("In initiate driver");
		System.setProperty("webdriver.chrome.driver", "C://Users//2174112//Downloads//chromedriver-win64 (3)//chromedriver-win64/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
//		options.setHeadless(true);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("launching uRL");
		driver.navigate().to(getValueFrom_Properties("sftpurl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		return driver;
	}
	public static void switchframeaddress() throws InterruptedException {
		// driver.switchTo().defaultContent();
		Thread.sleep(500);
		// iframe[@id='WidgVisitDetails']
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='WidgVisitDetails']")));
		Thread.sleep(2000);
	}

	public boolean button_enabled(By bylocator) {
		WebElement en = driver.findElement(bylocator);
		if (en.isEnabled()) {
			return true;
		}
		return false;
	}

	public static void switchframe() throws InterruptedException {
		// driver.switchTo().defaultContent();
		Thread.sleep(2000);
		// iframe[@id='WidgVisitDetails']
		driver.switchTo().frame(0);

	}

	public WebDriver LaunchAndLogin(WebDriver driver) throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//input[@id='txtUserId']")).sendKeys(getValueFrom_Properties("username"));
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(getValueFrom_Properties("password"));
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		return driver;
	}

	public WebDriver sftpLaunchAndLogin(WebDriver driver) throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(getValueFrom_Properties("sftpusername"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(getValueFrom_Properties("sftppassword"));
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		return driver;
	}
	public WebElement findElement(By byLocator) {
		WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(30)))
				.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
		return element;
	}

	public void clickOnElement(By byLocator) {

		try {

			WebElement element = findElement(byLocator);
			element.click();

		} catch (Exception e) {

			Assert.fail("Element not found");

		}
	}

	public String gettext(By byLocator) {

		String text = null;
		try {

			WebElement element = findElement(byLocator);
			text = element.getText();
		} catch (Exception e) {

			Assert.fail("Element not found");

		}
		return text;
	}

	public void childwindow() {
		Set<String> handles = driver.getWindowHandles();
		System.out.println("Set is : " + handles);
		Iterator<String> it = handles.iterator();
		parentid = it.next();
		// System.out.println(parentid);
		String childid = it.next();
		// System.out.println(childid);
		driver.switchTo().window(childid);
	}

	public void minimize() throws AWTException, InterruptedException {
		System.out.println("Minimizing screen");
		Thread.sleep(500);
		Robot robot = new Robot();
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
	}

	public void threewindow() {
		Set<String> handles1 = driver.getWindowHandles();
		System.out.println("three window" + handles1);
		Iterator<String> its = handles1.iterator();
		parentid1 = its.next();
		// System.out.println(parentid1);
		child1 = its.next();
		// System.out.println(child1);
		child2 = its.next();
		driver.switchTo().window(child2);

	}

	public void fourwindow() {
		Set<String> handles1 = driver.getWindowHandles();
		System.out.println("three window" + handles1);
		Iterator<String> its = handles1.iterator();
		parentid1 = its.next();
		// System.out.println(parentid1);
		child1 = its.next();
		// System.out.println(child1);
		child2 = its.next();
		child3 = its.next();
		driver.switchTo().window(child3);

	}

	public void doubleclick(By byLocator) {
		try {
			Actions act = new Actions(driver);
			WebElement element = findElement(byLocator);
			act.doubleClick(element).perform();
		} catch (Exception e) {

			Assert.fail("Element not found");

		}
	}

	public void sendkeys(By byLocator, CharSequence keysToSend) {

		try {
			WebElement element = findElement(byLocator);
			element.sendKeys(keysToSend);
		} catch (Exception e) {

			Assert.fail("Element not found");
		}
	}

	public static String getAlphaNumericString(int n) {

		// choose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

	public void clearField(By byLocator) {

		WebElement element = findElement(byLocator);
		element.clear();
	}

	public String exceldata(String sheetname) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fs = new FileInputStream("src/test/resources/ordercode.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet(sheetname);
		// int rowcount=sheet.getPhysicalNumberOfRows();
		// System.out.println(rowcount);
		String celldata = sheet.getRow(1).getCell(0).getStringCellValue();
		return celldata;
	}

	public List<WebElement> findElements(By bylocator) {
		List<WebElement> element = null;
		try {
			element = driver.findElements(bylocator);
			Assert.assertTrue(!element.isEmpty());
		} catch (Exception e) {
			Assert.fail("Element not found");
		}
		return element;
	}

	public void visit_clicksupplier(String visit) {
		driver.findElement(By.xpath("(//img[contains(@id ,'imgtreeviewVisit" + visit + "')])[1]")).click();
		driver.findElement(By.xpath("(//img[contains(@id ,'imgtreeviewVisit" + visit + "-')])[1]")).click();
		driver.findElement(By.xpath("(//img[contains(@id ,'imgtreeviewVisit" + visit + "-')])[2]")).click();
	}

	public void visit_click(String visit) {
		driver.findElement(By.xpath("//img[contains(@id ,'imgtreeviewVisit" + visit + "')]")).click();
		driver.findElement(By.xpath("//img[contains(@id ,'imgtreeviewVisit" + visit + "-')]")).click();
	}

	public void readData(String workbookName, String sheetName, int rowNumber) throws Exception {
		String filePath = System.getProperty("user.dir");
		String testDataPath = filePath + "\\src\\test\\resources\\TestData\\" + workbookName + ".xlsx";
		FileInputStream data_file = new FileInputStream(testDataPath);
		@SuppressWarnings("resource")
		XSSFWorkbook data_workbook = new XSSFWorkbook(data_file);
		XSSFSheet sheet = data_workbook.getSheet(sheetName);
		hashMap = new HashMap<String, String>();
		Row currentRow = sheet.getRow(rowNumber);

		int lastColoumn = currentRow.getLastCellNum();
		System.out.println("Last Column " + lastColoumn);
		try {
			for (int j = 1; j < lastColoumn; j++) {
//							currentRow.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
				hashMap.put(sheet.getRow(0).getCell(j).getStringCellValue(),
						currentRow.getCell(j).getStringCellValue());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static String getValue(String key) {
		String value = null;
		try {
			value = hashMap.get(key);
		} catch (Exception e) {
			// System.out.println(e.getMessage());
			System.out.println("Key is not present in the map--->" + key);
			// value=" ";
		}
		return value;
	}

	public void isPageLoaded(By byLocator) {
		(new WebDriverWait(driver, Duration.ofSeconds(30)))
				.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("ifMain"));
		WebElement until1 = (new WebDriverWait(driver, Duration.ofSeconds(30)))
				.until(ExpectedConditions.elementToBeClickable(byLocator));
	}

	public void isElementClickable(By byLocator) {
		WebElement until1 = (new WebDriverWait(driver, Duration.ofSeconds(8)))
				.until(ExpectedConditions.elementToBeClickable(byLocator));
		System.out.println("Now Clickable" + byLocator);

		// until1.click();
	}

	public By getByIdentifier(String xpathText, String identifyBy) {
		By identifier;
		if (identifyBy.equalsIgnoreCase("id")) {
			identifier = By.id(xpathText);
		} else {
			identifier = By.xpath(xpathText);
		}
		return identifier;

	}

	public void tearDown() {
		driver.quit();
	}

	public void compareText(String expectedText, String actualText, String elementName) {
		boolean match = expectedText.equals(actualText);
		Assert.assertTrue(elementName + " has expected value", match);

	}
	
	public static void scrollToElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void switchWindow(int windowToSwitch) {
		try {
			Set<String> AllWindowHandles = driver.getWindowHandles();
//			String window1 = (String) AllWindowHandles.toArray()[0];
			System.out.println(AllWindowHandles);
			String window1 = (String) AllWindowHandles.toArray()[windowToSwitch];
			driver.switchTo().window(window1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void write_excel_message_OrderDeletion(String orderID, String status) throws FileNotFoundException {
		try {
//			 String filePath = System.getProperty("user.dir");
//			 excelPath= filePath + "\\src\\test\\resources\\ExcelReport\\Report"+timeStamp+".xlsx";
			File source = new File(excelPath);
			FileInputStream file_lnput = new FileInputStream(source);
			XSSFWorkbook workBook = new XSSFWorkbook(file_lnput);
			if (count == 0) {
				workBook.createSheet("Report");
			}
			XSSFSheet sheet = workBook.getSheetAt(0);

			Row row;
			Cell cell;
			if (count == 0) {
				XSSFCellStyle style = workBook.createCellStyle();
				style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
				style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
				row = sheet.createRow(0);

				row.createCell(0).setCellStyle(style);
				row.getCell(0).setCellValue("S.No");

				row.createCell(1).setCellStyle(style);
				row.getCell(1).setCellValue("Order Number");

				row.createCell(2).setCellStyle(style);
				row.getCell(2).setCellValue("Status");

				/*
				 * row.createCell(3).setCellStyle(style);
				 * row.getCell(3).setCellValue("SpanType");
				 * 
				 * row.createCell(4).setCellStyle(style);
				 * row.getCell(4).setCellValue("Classification");
				 * 
				 * row.createCell(5).setCellStyle(style); row.getCell(5).setCellValue("Brand");
				 * 
				 * row.createCell(6).setCellStyle(style); row.getCell(6).setCellValue("Status");
				 * 
				 * row.createCell(7).setCellStyle(style);
				 * row.getCell(7).setCellValue("ProjectID");
				 */
				count++;
			}
			// System.out.println(sheet.getLastRowNum());
			int row_count = sheet.getLastRowNum();

			// Set Sl.no Column Number
			row = sheet.createRow(row_count + 1);
			cell = row.createCell(0);
			cell.setCellValue(row_count + 1);

			sheet.getRow(row_count + 1).createCell(1).setCellValue(orderID);
//			sheet.getRow(row_count + 1).createCell(2).setCellValue(OrganizationType);
//			sheet.getRow(row_count + 1).createCell(3).setCellValue(SpanType);
//			sheet.getRow(row_count + 1).createCell(4).setCellValue(Classification);
//			sheet.getRow(row_count + 1).createCell(5).setCellValue(brand);
//			sheet.getRow(row_count + 1).createCell(7).setCellValue(projectID);
			XSSFCellStyle style = workBook.createCellStyle();
			if (status.equalsIgnoreCase("Fail")) {
				style.setFillForegroundColor(IndexedColors.ORANGE.getIndex());
				style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
				sheet.getRow(row_count + 1).createCell(2).setCellValue("Order is not deleted due to issue");
				row.getCell(2).setCellStyle(style);
			} else if (status.equalsIgnoreCase("NA")) {
				style.setFillForegroundColor(IndexedColors.ORANGE.getIndex());
				style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
				sheet.getRow(row_count + 1).createCell(2).setCellValue("Order is not found");
				row.getCell(2).setCellStyle(style);
			} else {
				style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
				style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
				sheet.getRow(row_count + 1).createCell(2).setCellValue("Order is deleted");
				row.getCell(2).setCellStyle(style);
			}

			FileOutputStream fout = new FileOutputStream(new File(excelPath));
			workBook.write(fout);
			fout.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void before_write_excel_message() {
		passedExcelFolderPath = filePath + "\\Results\\" + "ExcelReport_" + timeStamp;
		File file = new File(passedExcelFolderPath);
		if (!file.exists()) {
			boolean isDirCreated = file.mkdir();
			// System.out.println(isDirCreated);
		}

		workBook = new XSSFWorkbook();
		FileOutputStream fos = null;
		/*
		 * String O_Country = getValue("Country Selector_MissionCountry_Value"); String
		 * M_Country = getValue("Ocountry");
		 */
		excelPath = passedExcelFolderPath + "\\" + ("Report_" + timeStamp + ".xlsx");

		try {
			fos = new FileOutputStream(new File(excelPath));
			workBook.write(fos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValuesInArrayListHDX(ArrayList<String> expectedValuesList, ArrayList<String> actualValues)
			throws Exception {
		ArrayList<String> diffValues = null;
		Collections.sort(expectedValuesList);
		Collections.sort(actualValues);
		boolean isSame = expectedValuesList.equals(actualValues);
		if (isSame) {
			// currentScenario.write("Expected & Actual are same");
			System.out.println("Expected & Actual  are same");
			logger.info("Expected & Actual  are same");
		} else {
			diffValues = (ArrayList<String>) CollectionUtils.disjunction(expectedValuesList, actualValues);
			if (expectedValuesList.size() == actualValues.size()) {
				Assert.assertTrue("UNMATCHED VALUES-->" + Arrays.toString(diffValues.toArray()), false);
			} else if (expectedValuesList.size() > actualValues.size()) {
				Assert.assertTrue("MISSING VALUES IN APPLICATION-->" + Arrays.toString(diffValues.toArray()), false);
			} else {
				Assert.assertTrue("EXTRA VALUES DISPLAYED IN APPLICATION-->" + Arrays.toString(diffValues.toArray()),
						false);
			}
		}
	}

	public void takeScreenshotAfterStep() {
		// Capture screenshot after each step
		if (driver instanceof TakesScreenshot) {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
			try {
				String screenshotName = "screenshot_" + System.currentTimeMillis() + ".png";
				File destFile = new File("path_to_screenshot_directory" + screenshotName);
				FileUtils.copyFile(srcFile, destFile);
				logger.info("Screenshot captured: " + destFile.getAbsolutePath());
			} catch (IOException e) {
				logger.error("Failed to capture screenshot: " + e.getMessage());
			}
		}
	}

	public static byte[] takeScreenshot(WebDriver driver) {

		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	public String date_formatter(String s) throws ParseException {
		SimpleDateFormat sdfSource = new SimpleDateFormat("dd MMMM yyyy");
		Date date = sdfSource.parse(s);
		SimpleDateFormat sdfDestination = new SimpleDateFormat("dd/MM/yyyy");
		return sdfDestination.format(date);
	}

	public String date_formatter_in_visit(String s) throws ParseException {
		SimpleDateFormat sdfSource = new SimpleDateFormat("dd MMM yyyy");
		Date date = sdfSource.parse(s);
		SimpleDateFormat sdfDestination = new SimpleDateFormat("dd/MM/yyyy");
		return sdfDestination.format(date);
	}

	public String date_formatter_items_to_follow(String s) throws ParseException {
		SimpleDateFormat sdfSource = new SimpleDateFormat("dd MMM yyyy");
		Date date = sdfSource.parse(s);
		SimpleDateFormat sdfDestination = new SimpleDateFormat("dd MMMM yyyy");
		return sdfDestination.format(date);
	}
	
	public String date_formatter_for_workflow(String s) throws ParseException {
		SimpleDateFormat sdfSource = new SimpleDateFormat("dd MMMM yyyy");
		Date date = sdfSource.parse(s);
		SimpleDateFormat sdfDestination = new SimpleDateFormat("dd MMM yyyy");
		return sdfDestination.format(date);
	}

	public String[] Months() {
		String months[] = { null, "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		return months;
	}
	public Boolean csv_value_checker(String Wmscode,String filepath) throws IOException, InterruptedException {
		Scanner sc = new Scanner(new File(filepath));
		int flag=0;
		sc.useDelimiter(",");   //sets the delimiter pattern
		while (sc.hasNext())  //returns a boolean value
		{
			if(sc.next().contains(Wmscode)) {
				System.out.println(Wmscode+" is exists and file is generated");
				flag=1;
				break;
			}
		}
		sc.close();
		if(flag==0){
			return false;
		}
		else{
			return true;
		}
	}

}
