package GenericFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.no.Men;
import junit.framework.Assert;

public class WebElements {
	public static By setHomePageButton = By.xpath("//input[@id='btnSetHomePage']");
	public static By seachbutton = By.name("txtSearch");
	public static By summaryTab = By.xpath("//a[@id='Tab1']/span[contains(text(),'Summary')]");
	public static By visitbreakdown = By.xpath("//body/form[@id='form1']/div[@id='divTabs']/a[@id='Tab5']/span[1]");
	public static By doubleclickelement = By.xpath("//td[@title='830996-8804-V']");
	public static By awatitingdate = By.xpath("//span[@title='Awaiting Date']");
	public static By visitdate = By.xpath("//input[@value='Change Visit Date']");
	public static By greenline = By.xpath("//td[@id='tSlotA_1_20230726_100']");
	public static By save = By.xpath("//input[@id='btnOk']");
	public static By saveinvisit = By.xpath("//input[@id='btnSave']");
	public static By seachbutton1=By.xpath("//input[@id='txtSearch']");
	public static By awatingroute=By.xpath("//span[@title='Awaiting Route Finalisation']");
	public static By tba=By.xpath("//button[@id='btnTBA']");
	public static By ok=By.xpath("//button[normalize-space()='OK']");
	public static By clicksearch=By.xpath("//img[@id='ibSearch']");
	public static By ordercode=By.xpath("//ul[3]//div[1]//ul[1]//li[1]//span[2]");
	public static By yellowline=By.xpath("//td[contains(@class,'DataVisitResourceDataCell ResourceAvailableAmber')]");
	//td[contains(@class,'DataVisitResourceDataCell ResourceAvailableAmber')]
//	public static By greenlinne2=By.xpath("//table/tbody/tr/td[@class='DataVisitResourceDataCell ResourceAvailableGreen']");
	public static By greenlinne2=By.xpath("//td[contains(@class,'DataVisitResourceDataCell ResourceAvailableGreen')]");
	public static By tablesize=By.xpath("//table[@id='tbltreeviewVisit']/thead/tr");
	public static By visit=By.xpath("//span[@id='spnTitleOVB']");
	public static By schudle=By.xpath("//label[@id='lblPageHeading']");
	public static By wickeshdx=By.xpath("//span[@id='lblUserName']");
	public static By visitscreen=By.xpath("//span[normalize-space()='Visit Detail']");
	public static By redline=By.xpath("//table/tbody/tr/td[@class='DataVisitResourceDataCell ResourceFull']");
	public static By cancel=By.xpath("//input[@id='btnCancel']");
//	public static By yellowline=By.xpath("//table/tbody/tr/td[@class='DataVisitResourceDataCell ResourceAvailableAmber']");
	public static By nextweek=By.xpath("//button[@id='btnNextWeek']");
	public static By error=By.xpath("//div[@id='errorContent']");
	public static By calender=By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
	public static By maincalender=By.xpath("//input[@id='resourceStartDate']");
	public static By datecalender=By.xpath("//a[normalize-space()='2']");
	public static By transport=By.xpath("//div[normalize-space()='Transport']");
	public static By resource=By.xpath("//div[normalize-space()='Resource Monitor']");
	public static By routeplanning=By.xpath("//div[normalize-space()='Route Planning']");
	public static By manualrouting=By.xpath("//div[normalize-space()='Manual Routing']");
	public static By calendersearch=By.xpath("//button[@id='btnSearch']");
	public static By nextmonth=By.xpath("//td[contains(text(),'▶')]");
	public static By caldenderbox=By.xpath("//input[@id='axCalTextbox0']");
	
	public static By caldenderinput=By.xpath("//input[@id='txtVisitDate']");
	public static By monthyear=By.xpath("//td[@id='axCalMonthYear0']");
	public static By okay = By.xpath("//input[@id='btnOk']");
	public static By outbase=By.xpath("//li[@class='RoutePlanning RoutePlanningGroup']/div[@class='RoutePlanningGroupName']");
	
//	Suspense Accounts
	public static By toolsMenu=By.xpath("//li/div[text()='Tools']");
	public static By suspenseAccountsOption=By.xpath("//li[@title='Suspense Account']");
	public static By Status_Monitor=By.xpath("//div[contains(text(),'Status Monitor')]");
	public static By orderSearchRB= By.xpath("//input[@id='rdoOrder']");
	public static By orderSearchBox=By.xpath("//input[@id='cphLeftPanel_txtOrderCode']");
	public static By searchButton=By.xpath("//button[@id='btnSearch']");
	public static By searchButtoninrouting=By.xpath("//div[@id='btnSearch']");
	public static By okpopup=By.xpath("//div[contains(text(),'OK')]");
//	public static By orderTree=By.xpath("//tr[@id='L1-0']");
	public static By refresh=By.xpath("//input[@id='btnPageRefresh']");
	public static By finalroute=By.xpath("//span[contains(text(),'Finalise Route(s)')]");
	public static By depotname=By.xpath("//span[contains(text(),'Delivery Depot')]");
	public static By confirmchanges=By.xpath("//span[contains(text(),'confirm changes')]");
	public static By finalizeroute=By.xpath("//div[contains(text(),'Create Route')]");
	public static By routename=By.xpath("//input[@id='txtRouteName']");
	public static By routenumber=By.xpath("//input[@id='txtRouteNumber']");
	public static By createroute=By.xpath("//span[contains(text(),'create route')]");	
	public static By unrouteddrop=By.xpath("//span[contains(text(),'Unrouted Drops')]/following::input[@type='checkbox'][1]");
	public static By orderTree=By.xpath("//tbody[@id='tbodyL1-0']//tr");	
	public static By deleteButton=By.xpath("//input[@id='btnDelete']");
	public static By reasonTextArea=By.xpath("//textarea[@id='txtEntry']");
	public static By reasonOkButton=By.xpath("//input[@id='btnOk']");
	public static String alertMessageText="Order Creation has been sucessfully deleted.";
	public static By suspenseAccountValidationText=By.xpath("//label[@id='lblPageHeading']");
	public static String suspenseAccountText="Suspense Account - 1 of 0";
	public static String suspenseAccountPresentText="Suspense Account - 1 of 1";
	public static By communicatingServer= By.xpath("//label[@id='labelCallbackMessage']");
	public static By itemdetailstext= By.xpath("//span[contains(text(),'Visit:')]");
	public static By visitMain= By.xpath("//span[contains(text() , 'Visit:')]");
	public static By visitaddress= By.xpath("//a/span[contains(text(),'Visit Address')]");
	public static By Changevisitaddress= By.xpath("//input[@value='Change Visit Address']");

//	public static By visitbreakdown= By.xpath("//span[contains(text(),'Visit Breakdown') and @class='StandardSectionHeader']");
	public static By visitdetails= By.xpath("//span[contains(text(),'Visit Details')]");
	public static By overrides= By.xpath("//button[contains(text(),'Overrides')]");
	public static By override_lead_time= By.xpath("//input[@value='Override Stock Lead Time']");
	public static By Override_Resources= By.xpath("//input[@value='Override Resources']");
	public static By Create_Emergency_Visit= By.xpath("//input[@value='Create Emergency Visit']");
	public static By nextbutton= By.xpath("//button[@id='btnNextWeek']");
	public static By getselecteddatetext= By.xpath("//label[@id='lblCurrentSelectedDate']");
	public static By suspend= By.xpath("//input[@value='Suspend']");
	public static By suspendokay= By.xpath("//input[@id='btnOkay']");
	public static By splitvisit= By.xpath("//input[@value='Split Visit']");
//	public static By visitdetails= By.xpath("//span[contains(text(),'Visit Details')]");

	public static By closebutton= By.xpath("//input[@id='btnClose']");
	
	
	public static By substitute= By.xpath("//input[@value='Substitute Item']");
	public static By substitutiontable = By.xpath("//table[@id='tblgvSubstituteOrderLines']/thead/tr");
	public static By otherradiobtn= By.xpath("//input[@id='rdoOther']");
	public static By inputsku= By.xpath("//input[@id='txtFind']");
	public static By skusearch=By.xpath("//input[@value='Search']");
	public static By skuproductselection= By.xpath("//table[@id='tblgvProducts']/thead/tr[last()]");
	public static By okaysku = By.xpath("//input[@value='Ok']");
	public static By closesubstitute= By.xpath("//input[@value='Close']");
	//public static By refresh=By.xpath("//input[@id='btnPageRefresh']");
	public static By spilit_ok_button= By.xpath("");
	public static By ok_button2= By.xpath("//input[@id='btnOK']");
	public static By spilit_close_button= By.xpath("//button[@id='btnClose']");
	public static By spilit_sku_count= By.xpath("//table[@id='tblSplitVisitGridView']/thead/tr/td/input");
	public static By spilit= By.xpath("//div[@id='buttondiv1']/ul/li/input[contains(@value,'Split Visit')]");
	
	public static By visitaddresse = By.xpath("//input[@value='Change Visit Address']");
	public static By address1 = By.xpath("//input[@id='Address1']");
	public static By address2 = By.xpath("//input[@id='Address2']");
	public static By address3 = By.xpath("//input[@id='Address3']");
	public static By address4 = By.xpath("//input[@id='Address4']");
	public static By postalcode = By.xpath("//input[@id='PostCode']");
	
	public static By expandbar = By.xpath("//div[@id='divFunctionOptionsShow']");
	public static By troubleshooter = By.xpath("//input[@value='Troubleshooter']");
	public static By force_debrief = By.xpath("//span[contains(text(),'Force Debrief')]");
	public static By regress_debrief = By.xpath("//span[contains(text(),'Regress Debrief')]");
	public static By debrief_table= By.xpath("//table[@class='tvTreeView']/tbody/tr");
	public static By save_debrief = By.xpath("//input[@id='btnOk']");
//	public static By closebutton= By.xpath("//input[@id='btnClose']");
	
	public static By suspend_button= By.xpath("//div[@id='buttondiv1']/ul/li/input[contains(@value,'Suspend')]");
	public static By suspendoptions= By.xpath("//select[@id='optSuspendReason']/option");
	public static By suspend_ok_button= By.xpath("//input[@id='btnOkay']");
	
	public static By contactmanagementTab = By.xpath("//a[@id='Tab6']/span[contains(text(),'Contact Management')]");
	public static By newthread = By.xpath("//input[@value='New Thread']");
	public static By goodwill_payment = By.xpath("//select[@id='ddlThreadTypes']/option[contains(text(),'Goodwill Payment')]");
	public static By order_option = By.xpath("//select[@id='ddlAttachTo']/option[contains(text(),'Order:')]");
	public static By customer_option= By.xpath("//select[@id='ddlAttachTo']/option[contains(text(),'Customer:')]");
	public static By email = By.xpath("//select[@id='ddlContactMethods']/option[contains(text(),'E-Mail')]");
	public static By thread_summary= By.xpath("//input[@id='tbThreadSummary']");
	
	public static By store_incident = By.xpath("//select[@id='ddlPrimaryReason']/option[contains(text(),'Store Incident')]");
	public static By customer_property = By.xpath("//select[@id='ddlSecondaryReason']/option[contains(text(),'Incident - Customer Property')]");

	public static By core_product = By.xpath("//select[@id='ddlPrimaryReason']/option[contains(text(),'Core Product')]");
	public static By kitchen = By.xpath("//select[@id='ddlSecondaryReason']/option[contains(text(),'Kitchens')]");
	public static By click_ok = By.xpath("//input[@id='btnOk']");
	
	public static By reponsibility_1 = By.xpath("//select[@id='401~1']/option[contains(text(),'K&B Distribution')]");
	public static By payement_type_1= By.xpath("//select[@id='403~1']/option[contains(text(),'a Head Office Cheque')]");
	public static By goodwill_amount_1 = By.xpath("//input[@id='402~3']");
	public static By reponsibility_2 = By.xpath("//select[@id='404~1']/option[contains(text(),'Store')]");
	public static By payement_type_2= By.xpath("//select[@id='406~1']/option[contains(text(),'Gift Tokens')]");
	public static By goodwill_amount_2 = By.xpath("//input[@id='405~3']");	
	public static By store_responsible = By.xpath("//select[@id='110~1']/option[contains(text(),'Barking Extra')]");
	public static By detail = By.xpath("//textarea[@id='taThreadDetail']");
	//public static By click_ok = By.xpath("//input[@id='btnOk']");
	public static By goodwill_doubleclick = By.xpath("//div[contains(text(),'Goodwill Payment ')]");
	
	public static By payement_authorization = By.xpath("//input[@value='Payment Authorisation']");
	public static By accepted_amount= By.xpath("//select[@id='ddlActionPerformed']/option[contains(text(),'Accepted Amount')]");
	public static By rejected = By.xpath("//select[@id='ddlActionPerformed']/option[contains(text(),'Rejected')]");
	public static By order_manager=By.xpath("//div[normalize-space()='Order Manager']");
	public static By workflow =By.xpath("//div[normalize-space()='Workflow']");
	public static By workflow_goodwill_sent=By.xpath("//td[contains(text(),'Goodwill - To be sent')]");
	public static By workflow_goodwill_auth=By.xpath("//td[contains(text(),'Goodwill - To be authorised')]");
	public static By tools=By.xpath("//div[normalize-space()='Tools']");
	public static By product_enquiry =By.xpath("//div[normalize-space()='Product Enquiry']");
	public static By geocode=By.xpath("//div[normalize-space()='GeoCode Search']");
	public static By geocodevalue=By.xpath("//input[@id='txtGeoCode']");
	public static By maintenance=By.xpath("//div[normalize-space()='Maintenance']");
	public static By Out_of_Stock_Management=By.xpath("//div[normalize-space()='Out of Stock Management']");
	public static By upload =By.xpath("//div[normalize-space()='Upload']");

	public static By Manifest_Group =By.xpath("//table[@class='gridTable']/thead/tr/td[2]");
	public static By outbase_values =By.xpath("//table[@class='gridTable']/tbody/tr/td[2]");
	public static By Supplier_Category =By.xpath("//table[@class='gridTable']/thead/tr/td[1]");
	public static By Sub_Category =By.xpath("//table[@class='gridTable']/thead/tr/td[3]");
	public static By workflow_table_final= By.xpath("//table[@class='tvTreeViewNoWidth kiketable-colsizable']/tbody[2]/tr"); 
	public static By resolve_contact = By.xpath("//input[@value='Resolve Contact']");
	public static By due_btn= By.xpath("//span[contains(text(),'Due')]");
//	public static By nxt_btn= By.xpath("//button[@class='tvNextPageButton ItemNavListButtonSmall']"); 
//	public static By net_btn= By.xpath("//button[@class='tvNextPageButton ItemNavListButtonSmall']");

	public static By visit_datebtn = By.xpath("//span[text()='Visit Date']");
//	public static By due_btn= By.xpath("//span[contains(text(),'Due')]");
//	public static By due_btn= By.xpath("//span[contains(text(),'Due')]");
	
	//crate customer
	public static By order_Manager_tab= By.xpath("//div[contains(text(),'Order Manager')]");
	public static By order_enquiry_option= By.xpath("//div[contains (text(),'Order Enquiry')]");
	public static By create_Customer_tab= By.xpath("//div[contains(text(),'Create Customer')]");
	//name part
	public static By title_name= By.xpath("//select[@id='ddlBillingTitle']");
	public static By title_name_option= By.xpath("//select[@id='ddlBillingTitle']/option[2]");

	public static By intial_Name= By.xpath("//input[@id='txtBillingInitial']");
	public static By sur_Name= By.xpath("//input[@id='txtBillingSurname']");

	//address part
	public static By address_line1= By.xpath("//input[@id='txtBillingAddrLine1']");
	public static By address_line3= By.xpath("//input[@id='txtBillingAddrLine3']");
	public static By address_line4= By.xpath("//input[@id='txtBillingAddrLine4']");

	//country part
	public static By country= By.xpath("//input[@id='txtBillingCountry']");
	public static By postcode= By.xpath("//input[@id='txtBillingPostCode']");
	public static By mobile_Number= By.xpath("//input[@id='txtBillingMobileTel']");
	public static By home_Telephone_Number= By.xpath("//input[@id='txtBillingHomeTel']");
	public static By work_Telephone_Number= By.xpath("//input[@id='txtBillingWorkTel']");
	//input[@id='txtBillingHomeTel']
	public static By emailcu= By.xpath("//input[@id='txtBillingEmail']");
	public static By confirm_email= By.xpath("//input[@id='txtBillingConfirmEmail']");

	public static By delivery_email_option= By.xpath("//input[@id='chk11']");
	public static By customer_email_option= By.xpath("//input[@id='chk21']");
	public static By marketing_email_option= By.xpath("//input[@id='chk31']");

	public static By creating_Customer= By.xpath("//input[@id='btnCreateCustomer']");

	
	public static By add_order = By.xpath("//div[normalize-space()='Add Order']");
	public static By store= By.xpath("//select[@id='ddlStore']/option[contains(text(),'8804')]");
	public static By billing_checkbox = By.xpath("//input[@id='chkSameAs']");
	public static By next_btn=By.xpath("//input[@id='btnNext']");
	public static By skubox =By.xpath("//input[@class='AddProductSearchBox' and @tabindex='2']");
	public static By qtybox=By.xpath("//input[@class='AddProductDetailsBox' and @tabindex='6']");	
	
	public static By workflow_page=By.xpath("//select[@class='tvPageNumDropdown ItemNavListSelectSmall']/option[@value=4]");
	public static By short_on_allocation_high_priority = By.xpath("//td[contains(text(),'Short on Allocation – High Priority')]");
	public static By lastpage= By.xpath("//select[@class='tvPageNumDropdown ItemNavListSelectSmall']/option[last()]");
	public static By next_btnn = By.xpath("//button[@class='tvNextPageButton ItemNavListButtonSmall']");	

	public static By creation_date=By.xpath("//span[contains(text(),'Creation Date')]");
	public static By leg_status_history_table = By.xpath("//table[@id='tblgridviewStatusHistory']/thead/tr");
	public static By failed_pick_high_priority=By.xpath("//td[contains(text(),'Failed Pick/Despatch – High Priority')]");
	public static By awaiting_carrier_debrief = By.xpath("//td[contains(text(),'awaiting carrier debrief')]");
	public static By collection_excep_full_failure= By.xpath("//td[contains(text(),'Collection exception - Full failure')]");
	public static By collection_excep_par_failure=By.xpath("//td[contains(text(),'Collection exception - Partial failure')]");
	public static By delivery_excep_par_failure = By.xpath("//td[contains(text(),'Delivery exception - Partial failure')]");	
    public static By delivery_excep_full_failure=By.xpath("//td[contains(text(),'Delivery exception - Full failure')]");	
	public static By awaiting_parcel_pack = By.xpath("//td[contains(text(),'awaiting parcel pack')]");

	//Reporting Web Elements
	
	public static By ordered_date= By.xpath("//li/span[text()='Date Ordered:']/following-sibling::*");
	public static By cust_name= By.xpath("//li/span[text()='Order For:']/following-sibling::*");
	public static By Report_tab = By.xpath("//div[contains(text(),'Reports Wickes')]");
	public static By confirm_Delhivery_Report = By.xpath("//div[contains(text(),'Confirmed Deliveries Report')]");
	public static By TBA_Report = By.xpath("//div[contains(text(),'TBA Report')]");
	public static By Goodwill_Payments_Report = By.xpath("//div[contains(text(),'Goodwill Payments Report')]");
	public static By Substitutions_Report = By.xpath("//div[contains(text(),'Substitutions Report')]");
	public static By Delivery_Information_By_Day = By.xpath("//div[contains(text(),'Delivery Information By Day')]");
	public static By Emergency_Orders_For_Routing_Report = By.xpath("//div[contains(text(),'Emergency Orders For Routing Report')]");
	public static By Items_To_Follow_Report = By.xpath("//div[contains(text(),'Items To Follow')]");
	public static By order_received_report = By.xpath("//div[contains(text(),'Orders Received Report')]");
	public static By Month_year_report = By.xpath("(//div[@class='ui-datepicker-title'])[1]/span");
	public static By Month_year_report2= By.xpath("(//div[@class='ui-datepicker-title'])[2]/span");
	public static By Orders_In_Pipeline_report = By.xpath("//div[contains(text(),'Orders In Pipeline')]");
	public static By Month_year_prev_button = By.xpath("(//a[@title='Prev']/span)[1]");
	public static By Month_year_prev_button2 = By.xpath("(//a[@title='Prev']/span)[2]");
	public static By Units_In_Pipeline_report = By.xpath("//div[contains(text(),'Units In Pipeline')]");
	public static By OrderBook_report = By.xpath("//div[contains(text(),'OrderBook')]");
	public static By New_Remedials_report = By.xpath("//div[contains(text(),'New Remedials Report')]");
	public static By Remedials_report = By.xpath("//div[contains(text(),'Orders To Remedials Report')]");
	public static By DeliveryCollection_report = By.xpath("//div[contains(text(),'Delivery/Collection Report')]");
	public static By Stock_Movement_Manifest_report = By.xpath("//div[contains(text(),'Stock Movement Manifest')]");
	public static By Workflow_Queue_Number= By.xpath("//select[@id='p_inWorkflowQueueNum']");
	public static By outbase4= By.xpath("//select[@id='p_vcOutbase']");
	public static By Workflow_Action_Number= By.xpath("//select[@id='p_inWorkflowActionNum']");
	public static By OrderBookByWeek_report = By.xpath("//div[contains(text(),'OrderBookByWeek')]");
	public static By Customer_Notifications_report = By.xpath("//div[contains(text(),'Customer Notifications')]");
	public static By Line_Walk_Report_report = By.xpath("//div[contains(text(),'Line Walk Report')]");
	public static By SparesReport_report = By.xpath("//div[contains(text(),'Spares Report')]");
	public static By Catch_All_Preview_report = By.xpath("//div[contains(text(),'Catch All Preview')]");
	public static By Workflow_Queue_Contents_Report= By.xpath("//div[contains(text(),'Workflow Queue Contents Report')]");
	public static By Month_year_next_button = By.xpath("(//a[@class='ui-datepicker-next ui-corner-all'])[1]/span");
	public static By Month_year_next_button2 = By.xpath("(//a[@class='ui-datepicker-next ui-corner-all'])[2]/span");
	public static By report_view_button= By.xpath("//button[@id='btnViewReport']");

	public static By outbase2= By.xpath("(//span[@class='Highlight HighlightData'])[5]");
	public static By outbase3= By.xpath("//select[@id='p_inDelOUCode']");
	public static By mobile_no= By.xpath("//li/span[text()='Mobile:']/following-sibling::*");
	public static By work_no= By.xpath("//li/span[text()='Work:']/following-sibling::*");
	public static By home_no= By.xpath("//li/span[text()='Home:']/following-sibling::*");
	public static By customer_name= By.xpath("//li/span[text()='Order For:']/following-sibling::*");
	public static By email_no= By.xpath("//li/span[text()='E-mail:']/following-sibling::*");
	public static By store_no= By.xpath("//li/span[text()='Store:']/following-sibling::*");
	public static By Hdi_order_code= By.xpath("//li/span[text()='HDi Order Code:']/following-sibling::*");
	public static By wms_order_code= By.xpath("//li/span[text()='WMS Order Code:']/following-sibling::*");
	public static By Date_ordered= By.xpath("//li/span[text()='Date Ordered:']/following-sibling::*");
	public static By order_code= By.xpath("//li/span[text()='Order Code:']/following-sibling::*");
	public static By summary_tab= By.xpath("//a[@id='Tab1']");

	public static By prompt_page_verify= By.xpath("//label[@id='lblPageHeading']");
	public static By sumarry_details_text_area= By.xpath("//textarea[@id='tbSummary']");
	public static By contact_management_tab= By.xpath("//span[contains(text(),'Contact Management')]");
	public static By records_count= By.xpath("//div[@class='ContactDetailsRecords']/div");
	public static By back_button= By.xpath("//input[@id='btnPrevious']");
	public static By find_box= By.xpath("//input[@id='tbFind']");
//	public static By Hdi_order_code= By.xpath("//select[@id='ddlSearchType']/option[contains(text(),'SKU')]");
	public static By searchButton5=By.xpath("//button[@id='btnSearch']");
	public static By adavanced=By.xpath("//input[@id='btnAdvancedServiceDetails']");
	public static By skucode=By.xpath("//input[@id='txtSKUCode']");
	public static By sku_table=By.xpath("//table[@id='tblProductEnquiryGridView']/thead/tr[2]");
	public static By notes=By.xpath("//input[@id='txtProdOptDesc1']");
	public static By qty=By.xpath("//input[@id='txtQuantity']");
	public static By search6=By.xpath("//a[@id='anSearch']");
	
	
	public static By tablefound= By.xpath("//table[@id='tblProductEnquiryGridView']//thead//tr");
	public static By tablefound1= By.xpath("//table[@id='tblgrdCoverages']/tbody/tr");
	//remedial WebElements
    public static By Remedial_tab= By.xpath("//input[@value='Create Remedial']");
    public static By Cancel_Remedial_tab= By.xpath("//input[@value='Cancel Remedial']");
    public static By Cancel_Remedial_count= By.xpath("//table[@id='tblgvCancelRemedialOrderLines']/thead/tr[2]");
    public static By Remedial_item_count= By.xpath("//table[@id='tblgvProducts']/tbody/tr");
    public static By Remedial_item_selecting= By.xpath("//table[@id='tblRemedialGridView']/thead/tr");
    public static By Remedial_reason_dropdown= By.id("ddlPrimaryReasonCode");
    public static By Remedial_ok_button= By.xpath("//input[@value='Ok']");
    public static By Remedial_ok_button1= By.xpath("//button[@id='btnOk']");
    public static By Remedial_create_visit= By.xpath("//input[@value='Create Visit']");
    public static By visitMain_plus_click = By.xpath("//span[contains(text() , 'Visit:')]/preceding-sibling::img[2]");

 	public static By date_uploaded= By.xpath("//span[normalize-space()='Date Uploaded']");

	 //ESAPage
	 public static By Maintence_Tab= By.xpath("//ul[@id='mnuMainMenu']/li/div[contains(text(),'Maintenance')]");
	public static By product_Maintence_Tab= By.xpath("//ul[@id='mnuMainMenu']/li[5]/ul/li/div[contains(text(),'Product Maintenance')]");
	 public static By Upload_Tab= By.xpath("//ul[@id='mnuMainMenu']/li[5]/ul/li/div[contains(text(),'Upload')]");
	public static By client_select= By.xpath("//select[@id='cphLeftPanel_ddlClients']");
	public static By File_Type_select= By.xpath("//select[@id='ddlFileTypes']");
	public static By in_select= By.xpath("//select[@id='ddlSearchType']");
	public static By view_button= By.xpath("//button[@id='Button1']");
	public static By sku_select= By.xpath("//table[@id='tblProductEnquiryGridView']/thead/tr[2]");
	public static By stock_Detail_tab2= By.xpath("//span[contains(text(),'Stock Detail')]");

	public static By Exact_Sku_Cont= By.xpath("//table[@id='tbltvStockDetails']/thead/tr[2]/td[3]/span");
	public static By find_search_box= By.xpath("//input[@id='tbFind']");
	public static By Date_select= By.xpath("//span[@id='divDateFrom']");
	public static By button_search= By.xpath("//button[@id='btnSearch']");
	public static By product_next_button= By.xpath("//input[@id='btnNextOption']");
	public static By product_detail_button= By.xpath("//button[contains(text(),'Product Detail')]");
	public static By file_Elements= By.xpath("//div[@id='tvUploads']/table/tbody/tr");

	public static By product_code= By.xpath("//span[contains(text(),'Product Code:')]/following-sibling::*");
	public static By ok_button = By.xpath("//button[@id='btnOk']");
	public static By close_button = By.xpath("//input[@id='btnClose']");
	public static By log_out_tab = By.xpath("//div[contains(text(),'Log Out')]");
	public static By Routing_Performance = By.xpath("//div[contains(text(),'Routing Performance')]");
	public static By Reports = By.xpath("//div[contains(text(),'Reports')]");
	public static By Stock_Manager = By.xpath("//div[contains(text(),'Stock Manager')]");
	public static By Warehouse_Despatch = By.xpath("//div[contains(text(),'Warehouse Despatch')]");
	public static By visit_detail_tab = By.xpath("//*[contains(text(),'Visit Details')]");
	public static By visit_Date_tab = By.xpath("//span[@id='hl_VisitDate']");
	public static By replenishment_days = By.xpath("//label[@id='lblReplenLeadTimeData']");
	public static By stock_avaliable_date = By.xpath("//label[@id='lblStockAvailableDateData']");
	public static By sku_code_Enter = By.xpath("//input[@id ='tbProdCode']");
	public static By sku_code_Enter1 = By.xpath("//input[@id='tbQty']");
	//input[@class='StandardData WidthSixty']
	public static By commenter= By.xpath("//input[@class='StandardData WidthSixty']");

	//vr and vu file generation webelements
	public static By from_HDX = By.xpath("//a[contains(text(),'FromHDX')]");
	public static By enquiry= By.xpath("//label[@id='lblPageHeading']");
	public static By WMS= By.xpath("//a[contains(text(),'WMS')]");
	public static By WMS2= By.xpath("(//tbody[@id='fsw_table_data_body']/tr[3]/td[4])");



//label[@id='lblReplenLeadTimeData']


//	public static By summary_tab= By.xpath("//a[@id='Tab1']");
	
	
//		reason window title  - 	Input Wickes HDX
//
//		Reason - Deleted through automation code

//		Alert message: 
//		Switch to alert
//		click on ok
//
//		Validation

//		1. Switch to main window
//		2. click on search Suspense Account - 1 of 0'  '
//		
//
//		3.clear order search & enter new
//

//		Communicating with server...   xpath
		//label[@id='labelCallbackMessage']

}
