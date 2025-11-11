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

"Step 1: Navigate to /sap/bc/ui2/flp#Employee-startLearning&/"

TrueTestScripts.navigate("sap/bc/ui2/flp#Employee-startLearning&")

"Step 2: Click on link back12 -> Navigate to page '/sap/bc/ui2/flp#Shell-home'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC16/Step 2-Click on link back12 - Navigate to page sapbcui2flpShell-home.png')

"Step 3: Click on link searchCourses -> Navigate to page '/sap/bc/ui2/flp#Employee-searchCourses&/?sap-iapp-state--history=*&sap-iapp-state=*'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_searchCourses'))

// WebUI.takeScreenshot(reportLocation + '/TC16/Step 3-Click on link searchCourses - Navigate to page sapbcui2flpEmployee-searchCoursessap-iapp-state--historysap-iapp-state.png')

"Step 4: Click on link back13 -> Navigate to page '/sap/bc/ui2/flp#Shell-home'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC16/Step 4-Click on link back13 - Navigate to page sapbcui2flpShell-home.png')

"Step 5: Click on item workflowTabs (employeeSelfService)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id]))

// WebUI.takeScreenshot(reportLocation + '/TC16/Step 5-Click on item workflowTabs employeeSelfService.png')

"Step 6: Click on item workflowTabs (myApprovalsWorkflow)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC16/Step 6-Click on item workflowTabs myApprovalsWorkflow.png')

"Step 7: Click on link hrPayrollInbox3 -> Navigate to page '/sap/bc/ui2/flp#HRPayrollInbox-update&/empty view'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_hrPayrollInbox3'))

// WebUI.takeScreenshot(reportLocation + '/TC16/Step 7-Click on link hrPayrollInbox3 - Navigate to page sapbcui2flpHRPayrollInbox-updateempty view.png')

"Step 8: Click on link back14 -> Navigate to page '/sap/bc/ui2/flp#Shell-home'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back14'))

// WebUI.takeScreenshot(reportLocation + '/TC16/Step 8-Click on link back14 - Navigate to page sapbcui2flpShell-home.png')

"Step 9: Click on link hrPayrollInbox (reprintNewWindow)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox', ['link_hrPayrollInbox_internalLabel': link_hrPayrollInbox_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC16/Step 9-Click on link hrPayrollInbox reprintNewWindow.png')

"Step 10: Click on div home"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_home'))

// WebUI.takeScreenshot(reportLocation + '/TC16/Step 10-Click on div home.png')

"Step 11: Click on span homePageApps"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_homePageApps'))

// WebUI.takeScreenshot(reportLocation + '/TC16/Step 11-Click on span homePageApps.png')

"Step 12: Click on link navigationHome (navigateHome7)"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_navigationHome'))

// WebUI.takeScreenshot(reportLocation + '/TC16/Step 12-Click on link navigationHome navigateHome7.png')

"Step 13: Click on link navigationHome (navigateHome7)"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_navigationHome'))

// WebUI.takeScreenshot(reportLocation + '/TC16/Step 13-Click on link navigationHome navigateHome7.png')

"Step 14: Click on item workflowTabs (employeeSelfService)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC16/Step 14-Click on item workflowTabs employeeSelfService.png')

"Step 15: Click on link hrPayrollInbox (hrOperationsInbox) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox', ['link_hrPayrollInbox_internalLabel': link_hrPayrollInbox_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC16/Step 15-Click on link hrPayrollInbox hrOperationsInbox - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Access HR Payroll Inbox and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}