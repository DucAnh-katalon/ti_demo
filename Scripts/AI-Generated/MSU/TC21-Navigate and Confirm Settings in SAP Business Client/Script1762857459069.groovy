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

"Step 1: Navigate to /sap/bc/ui2/flp#Headcount-alp"

TrueTestScripts.navigate("sap/bc/ui2/flp#Headcount-alp")

"Step 2: Click on button maximizeSettings (maximize3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_maximizeSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_maximizeSettings', ['button_maximizeSettings_id': button_maximizeSettings_id]))

// WebUI.takeScreenshot(reportLocation + '/TC21/Step 2-Click on button maximizeSettings maximize3.png')

"Step 3: Click on button minimize3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_minimize3'))

// WebUI.takeScreenshot(reportLocation + '/TC21/Step 3-Click on button minimize3.png')

"Step 4: Click on span showValueHelp6"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_showValueHelp6'))

// WebUI.takeScreenshot(reportLocation + '/TC21/Step 4-Click on span showValueHelp6.png')

"Step 5: Click on span dateTime2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_dateTime2'))

// WebUI.takeScreenshot(reportLocation + '/TC21/Step 5-Click on span dateTime2.png')

"Step 6: Click on button go12"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go12'))

// WebUI.takeScreenshot(reportLocation + '/TC21/Step 6-Click on button go12.png')

"Step 7: Click on div object6"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_object6'))

// WebUI.takeScreenshot(reportLocation + '/TC21/Step 7-Click on div object6.png')

"Step 8: Click on button go12"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go12'))

// WebUI.takeScreenshot(reportLocation + '/TC21/Step 8-Click on button go12.png')

"Step 9: Click on button adaptFilters5"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_adaptFilters5'))

// WebUI.takeScreenshot(reportLocation + '/TC21/Step 9-Click on button adaptFilters5.png')

"Step 10: Click on div itemSelection19"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_itemSelection19'))

// WebUI.takeScreenshot(reportLocation + '/TC21/Step 10-Click on div itemSelection19.png')

"Step 11: Click on button confirmationActions (ok16)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC21/Step 11-Click on button confirmationActions ok16.png')

"Step 12: Click on input job"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_job'))

// WebUI.takeScreenshot(reportLocation + '/TC21/Step 12-Click on input job.png')

"Step 13: Enter input value in input job -> Navigate to page '/sap/bc/ui2/flp#Headcount-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_job'), input_job)

// WebUI.takeScreenshot(reportLocation + '/TC21/Step 13-Enter input value in input job - Navigate to page sapbcui2flpHeadcount-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 14: Click on button confirmationActions (close4)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC21/Step 14-Click on button confirmationActions close4.png')

"Step 15: Click on button confirmationActions (close5) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC21/Step 15-Click on button confirmationActions close5 - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC21-Navigate and Confirm Settings in SAP Business Client_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}