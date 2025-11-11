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

"Step 2: Click on item workflowTabs (reportsTab3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id]))

// WebUI.takeScreenshot(reportLocation + '/TC17/Step 2-Click on item workflowTabs reportsTab3.png')

"Step 3: Click on item workflowTabs (advancedHrtools)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC17/Step 3-Click on item workflowTabs advancedHrtools.png')

"Step 4: Click on link probationTrialLinks (probationTrialPeriods) -> Navigate to page '/sap/bc/ui2/flp#Probationtrial-read'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_probationTrialLinks'))

// WebUI.takeScreenshot(reportLocation + '/TC17/Step 4-Click on link probationTrialLinks probationTrialPeriods - Navigate to page sapbcui2flpProbationtrial-read.png')

"Step 5: Click on input personnelSubarea"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_personnelSubarea'))

// WebUI.takeScreenshot(reportLocation + '/TC17/Step 5-Click on input personnelSubarea.png')

"Step 6: Click on span showValueHelp5"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_showValueHelp5'))

// WebUI.takeScreenshot(reportLocation + '/TC17/Step 6-Click on span showValueHelp5.png')

"Step 7: Click on div object4 -> Navigate to page '/sap/bc/ui2/flp#Probationtrial-read&/?sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_object4'))

// WebUI.takeScreenshot(reportLocation + '/TC17/Step 7-Click on div object4 - Navigate to page sapbcui2flpProbationtrial-readsap-iapp-state.png')

"Step 8: Click on button go8 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go8'))

// WebUI.takeScreenshot(reportLocation + '/TC17/Step 8-Click on button go8 - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC17-Navigate to Workflow Tabs and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}