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

"Step 1: Navigate to /sap/bc/ui2/flp#Retirementage-alp"

TrueTestScripts.navigate("sap/bc/ui2/flp#Retirementage-alp")

"Step 2: Click on div kpiContainer"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_kpiContainer'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 2-Click on div kpiContainer.png')

"Step 3: Click on button settingsMaximize (maximize7)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_id': button_settingsMaximize_id, 'button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 3-Click on button settingsMaximize maximize7.png')

"Step 4: Click on button minimize7"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_minimize7'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 4-Click on button minimize7.png')

"Step 5: Click on button maximizeSettings (maximize8)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_maximizeSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_maximizeSettings', ['button_maximizeSettings_id': button_maximizeSettings_id]))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 5-Click on button maximizeSettings maximize8.png')

"Step 6: Click on div employeeName5"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeName5'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 6-Click on div employeeName5.png')

"Step 7: Click on button sortingOptions (sortAscending2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_sortingOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_sortingOptions', ['button_sortingOptions_id': button_sortingOptions_id, 'button_sortingOptions_internalLabel': button_sortingOptions_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 7-Click on button sortingOptions sortAscending2.png')

"Step 8: Click on span facultyAcademicStaff"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_facultyAcademicStaff'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 8-Click on span facultyAcademicStaff.png')

"Step 9: Click on button minimize2 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_minimize2'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 9-Click on button minimize2 - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC24-Adjust KPI Settings and Verify Home Page in SAP Business Client_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}