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

"Step 2: Click on list hrPayrollSystem"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/list_hrPayrollSystem'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on list hrPayrollSystem.png')

"Step 3: Click on list hrPayrollSystem"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/list_hrPayrollSystem'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on list hrPayrollSystem.png')

"Step 4: Click on list hrPayrollSystem"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/list_hrPayrollSystem'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on list hrPayrollSystem.png')

"Step 5: Click on div productionGroup"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_productionGroup'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on div productionGroup.png')

"Step 6: Click on item workflowTabs (reportsTab2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id]))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on item workflowTabs reportsTab2.png')

"Step 7: Click on link humanCapitalManagement (hcmAnalyticsDashboard) -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement', ['link_humanCapitalManagement_id': link_humanCapitalManagement_id]))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on link humanCapitalManagement hcmAnalyticsDashboard - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 8: Click on div interactiveLineChart3 -> Navigate to page '/sap/bc/ui2/flp#Headcount-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on div interactiveLineChart3 - Navigate to page sapbcui2flpHeadcount-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 9: Click on button menuActions (openMenu)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_menuActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_menuActions', ['button_menuActions_internalLabel': button_menuActions_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on button menuActions openMenu.png')

"Step 10: Click on item exportAs"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/item_exportAs'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on item exportAs.png')

"Step 11: Click on div splitCellsCheckbox"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_splitCellsCheckbox'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Click on div splitCellsCheckbox.png')

"Step 12: Click on input fileName"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_fileName'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on input fileName.png')

"Step 13: Enter input value in input fileName"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_fileName'), input_fileName)

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Enter input value in input fileName.png')

"Step 14: Press key Enter on input fileName"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_fileName'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Press key Enter on input fileName.png')

"Step 15: Click on button export -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_export'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Click on button export - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Export Data from Human Capital Management and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}