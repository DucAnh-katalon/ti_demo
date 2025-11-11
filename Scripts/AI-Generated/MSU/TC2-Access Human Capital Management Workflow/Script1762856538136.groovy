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

"Step 2: Click on item workflowTabs (reportsTab)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on item workflowTabs reportsTab.png')

"Step 3: Click on link humanCapitalManagement (humanCapitalManagementAnalytics) -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement', ['link_humanCapitalManagement_id': link_humanCapitalManagement_id]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link humanCapitalManagement humanCapitalManagementAnalytics - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 4: Click on div interactiveLineCharts (interactiveLineChart) -> Navigate to page ''"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_interactiveLineCharts"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_interactiveLineCharts', ['div_interactiveLineCharts_id': div_interactiveLineCharts_id, 'div_interactiveLineCharts_internalLabel': div_interactiveLineCharts_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on div interactiveLineCharts interactiveLineChart - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Access Human Capital Management Workflow_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}