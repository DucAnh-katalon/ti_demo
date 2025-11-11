import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.MSU.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /sap/bc/ui2/flp#Shell-home"

TrueTestScripts.navigate("sap/bc/ui2/flp#Shell-home")

"Step 2: Click on item workflowTabs (reportsTab2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id]))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on item workflowTabs reportsTab2.png')

"Step 3: Click on link humanCapitalManagement (hcmAnalyticsDashboard2) -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on link humanCapitalManagement hcmAnalyticsDashboard2 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 4: Click on div interactiveLineChart4 -> Navigate to page '/sap/bc/ui2/flp#Headcount-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart4'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on div interactiveLineChart4 - Navigate to page sapbcui2flpHeadcount-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-state.png')

"Step 5: Click on div interactiveLineChart5 -> Navigate to page '/sap/bc/ui2/flp#Headcount-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart4'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on div interactiveLineChart5 - Navigate to page sapbcui2flpHeadcount-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 6: Click on div activeEmployees"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_activeEmployees'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on div activeEmployees.png')

"Step 7: Click on link back4 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on link back4 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 8: Click on div interactiveLineChart4 -> Navigate to page '/sap/bc/ui2/flp#Headcount-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart4'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on div interactiveLineChart4 - Navigate to page sapbcui2flpHeadcount-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 9: Click on link back4 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on link back4 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 10: Click on div interactiveChart3 -> Navigate to page '/sap/bc/ui2/flp#Retention-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on div interactiveChart3 - Navigate to page sapbcui2flpRetention-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 11: Click on div retainedStatus2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_retainedStatus2'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on div retainedStatus2.png')

"Step 12: Click on div employeeDetails"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on div employeeDetails.png')

"Step 13: Click on link back5 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on link back5 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 14: Click on div interactiveChart3 -> Navigate to page '/sap/bc/ui2/flp#Retention-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on div interactiveChart3 - Navigate to page sapbcui2flpRetention-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 15: Click on div retainedStatus2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_retainedStatus2'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Click on div retainedStatus2.png')

"Step 16: Click on div employeeDetails2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on div employeeDetails2.png')

"Step 17: Click on link back5 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on link back5 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 18: Click on div interactiveLineChart6 -> Navigate to page '/sap/bc/ui2/flp#Retirementage-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart6'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Click on div interactiveLineChart6 - Navigate to page sapbcui2flpRetirementage-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 19: Click on div employeeStatus"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeStatus'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 19-Click on div employeeStatus.png')

"Step 20: Click on div employeeDetails3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeDetails3'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 20-Click on div employeeDetails3.png')

"Step 21: Click on div employeeStatus"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeStatus'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 21-Click on div employeeStatus.png')

"Step 22: Click on div employeeDetails3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeDetails3'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 22-Click on div employeeDetails3.png')

"Step 23: Click on div employeeStatus"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeStatus'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 23-Click on div employeeStatus.png')

"Step 24: Click on div employeeDetails3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeDetails3'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 24-Click on div employeeDetails3.png')

"Step 25: Click on link back6 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 25-Click on link back6 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 26: Click on input organizationalDetails (organizationalUnit2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_organizationalDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_organizationalDetails', ['input_organizationalDetails_internalLabel': input_organizationalDetails_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 26-Click on input organizationalDetails organizationalUnit2.png')

"Step 27: Enter input value in input organizationalDetails (organizationalUnit2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_organizationalDetails"
WebUI.setText(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_organizationalDetails', ['input_organizationalDetails_internalLabel': input_organizationalDetails_internalLabel_1]), input_organizationalDetails)

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 27-Enter input value in input organizationalDetails organizationalUnit2.png')

"Step 28: Press key Enter on input organizationalUnit3 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics&/?sap-iapp-state=*'"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit3'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 28-Press key Enter on input organizationalUnit3 - Navigate to page sapbcui2flpHcmanalyticreport-analyticssap-iapp-state.png')

"Step 29: Click on div interactiveLineChart7 -> Navigate to page '/sap/bc/ui2/flp#Retirementage-alp?orgeh=*&p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart7'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 29-Click on div interactiveLineChart7 - Navigate to page sapbcui2flpRetirementage-alporgehp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 30: Click on div employeesStatus"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeesStatus'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 30-Click on div employeesStatus.png')

"Step 31: Click on div employeeDetails4"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeDetails3'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 31-Click on div employeeDetails4.png')

"Step 32: Click on span showValueHelp"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_showValueHelp'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 32-Click on span showValueHelp.png')

"Step 33: Click on td fiscalYearStart"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/td_fiscalYearStart'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 33-Click on td fiscalYearStart.png')

"Step 34: Click on button go2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go2'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 34-Click on button go2.png')

"Step 35: Click on div employeeStatus2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeStatus2'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 35-Click on div employeeStatus2.png')

"Step 36: Click on div contentFitContainer"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeDetails3'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 36-Click on div contentFitContainer.png')

"Step 37: Click on div interactiveColumnChart3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 37-Click on div interactiveColumnChart3.png')

"Step 38: Click on td employeeName"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/td_employeeName'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 38-Click on td employeeName.png')

"Step 39: Click on link back7 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics&/?sap-iapp-state=*'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 39-Click on link back7 - Navigate to page sapbcui2flpHcmanalyticreport-analyticssap-iapp-state.png')

"Step 40: Click on div interactiveStackedColumnChart4 -> Navigate to page '/sap/bc/ui2/flp#Turnover-alp?orgeh=*&p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveStackedColumnChart4'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 40-Click on div interactiveStackedColumnChart4 - Navigate to page sapbcui2flpTurnover-alporgehp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 41: Click on div tvr"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_tvr'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 41-Click on div tvr.png')

"Step 42: Click on link back8 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics&/?sap-iapp-state=*'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 42-Click on link back8 - Navigate to page sapbcui2flpHcmanalyticreport-analyticssap-iapp-state.png')

"Step 43: Click on div interactiveChart4 -> Navigate to page '/sap/bc/ui2/flp#Retention-alp?orgeh=*&p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveChart4'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 43-Click on div interactiveChart4 - Navigate to page sapbcui2flpRetention-alporgehp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 44: Click on div headerEnd2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_headerEnd'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 44-Click on div headerEnd2.png')

"Step 45: Click on link back9 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics&/?sap-iapp-state=*'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 45-Click on link back9 - Navigate to page sapbcui2flpHcmanalyticreport-analyticssap-iapp-state.png')

"Step 46: Click on div humanResourcesSections (humanResources) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_humanResourcesSections"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_humanResourcesSections', ['div_humanResourcesSections_divTitle': div_humanResourcesSections_divTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 46-Click on div humanResourcesSections humanResources - Navigate to page .png')

"Step 47: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Explore Human Capital Management Interactive Charts and Employee Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}