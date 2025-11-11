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

"Step 2: Click on item workflowTabs (reportsTab2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id]))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on item workflowTabs reportsTab2.png')

"Step 3: Click on link humanCapitalManagement (humanCapitalManagement) -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on link humanCapitalManagement humanCapitalManagement - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 4: Click on div interactiveStackedColumnChart3 -> Navigate to page '/sap/bc/ui2/flp#Turnover-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveStackedColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on div interactiveStackedColumnChart3 - Navigate to page sapbcui2flpTurnover-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 5: Click on div headerEnd"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_headerEnd'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on div headerEnd.png')

"Step 6: Click on input organizationalUnit"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on input organizationalUnit.png')

"Step 7: Enter input value in input organizationalUnit"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit'), input_organizationalUnit)

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Enter input value in input organizationalUnit.png')

"Step 8: Click on button go"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on button go.png')

"Step 9: Click on span employeeDetails (namePhone)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails', ['span_employeeDetails_id': span_employeeDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on span employeeDetails namePhone.png')

"Step 10: Click on div analyticalTable3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable3'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on div analyticalTable3.png')

"Step 11: Click on div object"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on div object.png')

"Step 12: Click on button adaptFilters"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_adaptFilters'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on button adaptFilters.png')

"Step 13: Click on button cancelActions (cancel6)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_cancelActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_cancelActions', ['button_cancelActions_id': button_cancelActions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Click on button cancelActions cancel6.png')

"Step 14: Click on button cancelActions (cancel6) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_cancelActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_cancelActions', ['button_cancelActions_id': button_cancelActions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 14-Click on button cancelActions cancel6 - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Filter Employee Details in Human Capital Management and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}