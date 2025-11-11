import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
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

"Step 2: Click on item workflowTabs (reports2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id]))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 2-Click on item workflowTabs reports2.png')

"Step 3: Click on link humanCapitalManagement (humanCapitalManagementAnalytics3) -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement', ['link_humanCapitalManagement_id': link_humanCapitalManagement_id]))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 3-Click on link humanCapitalManagement humanCapitalManagementAnalytics3 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 4: Click on span employeeTypeFilters (selectOptions5)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeTypeFilters"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeTypeFilters', ['span_employeeTypeFilters_divTitle': span_employeeTypeFilters_divTitle, 'span_employeeTypeFilters_id': span_employeeTypeFilters_id]))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on span employeeTypeFilters selectOptions5.png')

"Step 5: Click on span employeeTypeFilters (employeeTypeFilter)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeTypeFilters"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeTypeFilters', ['span_employeeTypeFilters_divTitle': span_employeeTypeFilters_divTitle_1, 'span_employeeTypeFilters_id': span_employeeTypeFilters_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 5-Click on span employeeTypeFilters employeeTypeFilter.png')

"Step 6: Click on div itemSelection -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics&/?sap-iapp-state=*'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_itemSelection'))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 6-Click on div itemSelection - Navigate to page sapbcui2flpHcmanalyticreport-analyticssap-iapp-state.png')

"Step 7: Click on div itemSelections (itemSelection2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections', ['div_itemSelections_id': div_itemSelections_id]))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 7-Click on div itemSelections itemSelection2.png')

"Step 8: Click on div itemSelectionActions (itemSelection3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelectionActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelectionActions', ['div_itemSelectionActions_id': div_itemSelectionActions_id, 'div_itemSelectionActions_internalLabel': div_itemSelectionActions_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 8-Click on div itemSelectionActions itemSelection3.png')

"Step 9: Click on div itemSelection4"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_itemSelection4'))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 9-Click on div itemSelection4.png')

"Step 10: Click on div itemSelections (itemSelection5)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections', ['div_itemSelections_id': div_itemSelections_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 10-Click on div itemSelections itemSelection5.png')

"Step 11: Click on div itemSelectionActions (itemSelection6) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelectionActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelectionActions', ['div_itemSelectionActions_id': div_itemSelectionActions_id_1, 'div_itemSelectionActions_internalLabel': div_itemSelectionActions_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 11-Click on div itemSelectionActions itemSelection6 - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Navigate to Human Capital Management and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}