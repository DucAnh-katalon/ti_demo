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

"Step 2: Click on item workflowTabs (myApprovalsWorkflow)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on item workflowTabs myApprovalsWorkflow.png')

"Step 3: Click on link hrPayrollInbox (navigateToHrpayrollInbox) -> Navigate to page '/sap/bc/ui2/flp#HRPayrollInbox-update&/detail/LOCAL BWF/*/TaskCollection(*)'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox', ['link_hrPayrollInbox_internalLabel': link_hrPayrollInbox_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link hrPayrollInbox navigateToHrpayrollInbox - Navigate to page sapbcui2flpHRPayrollInbox-updatedetailLOCAL BWFTaskCollection.png')

"Step 4: Click on button taskActions (openTask)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_taskActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_taskActions', ['button_taskActions_id': button_taskActions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on button taskActions openTask.png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Perform Task Actions in HR Payroll Inbox_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}