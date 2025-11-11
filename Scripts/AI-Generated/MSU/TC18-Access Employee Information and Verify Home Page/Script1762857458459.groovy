import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.MSU.common.selectEmployeeTypeAndDetails
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

"Step 2: Click on item workflowTabs (reports)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id]))

// WebUI.takeScreenshot(reportLocation + '/TC18/Step 2-Click on item workflowTabs reports.png')

"Step 3: Click on link employeeInformation"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_employeeInformation'))

// WebUI.takeScreenshot(reportLocation + '/TC18/Step 3-Click on link employeeInformation.png')

"Step 4: Select employee type and input relevant employment details."

selectEmployeeTypeAndDetails.execute(div_itemSelections_id, div_itemSelections_id_1, input_employmentDetails_id, span_employeeTypeOptions_id, span_employeeTypeOptions_id_1)

"Step 5: Click on div itemSelections (itemSelection11)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections', ['div_itemSelections_id': div_itemSelections_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC18/Step 5-Click on div itemSelections itemSelection11.png')

"Step 6: Click on button go9"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go9'))

// WebUI.takeScreenshot(reportLocation + '/TC18/Step 6-Click on button go9.png')

"Step 7: Click on td value -> Navigate to page '/sap/bc/ui2/flp#EmployeeInformationApp-read&/ZCDS EE INFO PARAMSet(*)/?sap-iapp-state--history=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/td_value'))

// WebUI.takeScreenshot(reportLocation + '/TC18/Step 7-Click on td value - Navigate to page sapbcui2flpEmployeeInformationApp-readZCDS EE INFO PARAMSetsap-iapp-state--history.png')

"Step 8: Click on td timeAndDate (timeInLevel)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/td_timeAndDate"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/td_timeAndDate', ['td_timeAndDate_id': td_timeAndDate_id]))

// WebUI.takeScreenshot(reportLocation + '/TC18/Step 8-Click on td timeAndDate timeInLevel.png')

"Step 9: Click on td timeAndDate (dateType) -> Navigate to page ''"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/td_timeAndDate"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/td_timeAndDate', ['td_timeAndDate_id': td_timeAndDate_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC18/Step 9-Click on td timeAndDate dateType - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Access Employee Information and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}