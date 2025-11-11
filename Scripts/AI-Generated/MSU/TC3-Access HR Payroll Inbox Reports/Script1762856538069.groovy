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

"Step 2: Click on button moreGroups"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_moreGroups'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on button moreGroups.png')

"Step 3: Click on div actionsReports (actions)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_actionsReports"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_actionsReports', ['div_actionsReports_id': div_actionsReports_id]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on div actionsReports actions.png')

"Step 4: Click on link hrPayrollInbox (editBusinessAddress) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox', ['link_hrPayrollInbox_internalLabel': link_hrPayrollInbox_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on link hrPayrollInbox editBusinessAddress - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Access HR Payroll Inbox Reports_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}