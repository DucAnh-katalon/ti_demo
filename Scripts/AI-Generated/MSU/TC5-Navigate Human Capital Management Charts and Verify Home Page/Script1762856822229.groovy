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

"Step 2: Click on item workflowTabs (reports)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on item workflowTabs reports.png')

"Step 3: Click on link humanCapitalManagement (humanCapitalManagementAnalytics2) -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement', ['link_humanCapitalManagement_id': link_humanCapitalManagement_id]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on link humanCapitalManagement humanCapitalManagementAnalytics2 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 4: Click on div interactiveStackedColumnChart -> Navigate to page '/sap/bc/ui2/flp#Turnover-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state=*&sap-iapp-state--history=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveStackedColumnChart'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on div interactiveStackedColumnChart - Navigate to page sapbcui2flpTurnover-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-statesap-iapp-state--history.png')

"Step 5: Click on link back -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on link back - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 6: Click on div interactiveStackedColumnChart2 -> Navigate to page '/sap/bc/ui2/flp#Turnover-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state=*&sap-iapp-state--history=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveStackedColumnChart'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on div interactiveStackedColumnChart2 - Navigate to page sapbcui2flpTurnover-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-statesap-iapp-state--history.png')

"Step 7: Click on link back -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on link back - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 8: Click on div interactiveChart -> Navigate to page '/sap/bc/ui2/flp#Retention-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveChart'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on div interactiveChart - Navigate to page sapbcui2flpRetention-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 9: Click on link back2 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on link back2 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 10: Click on div interactiveLineChart2 -> Navigate to page '/sap/bc/ui2/flp#Retirementage-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart2'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on div interactiveLineChart2 - Navigate to page sapbcui2flpRetirementage-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 11: Click on link back3 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on link back3 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 12: Click on div analyticsContent"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticsContent'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on div analyticsContent.png')

"Step 13: Click on div analyticsContent2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticsContent'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on div analyticsContent2.png')

"Step 14: Click on div interactiveChart2 -> Navigate to page '/sap/bc/ui2/flp#Retention-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveChart'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on div interactiveChart2 - Navigate to page sapbcui2flpRetention-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 15: Click on button settingsMaximize (settings)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_id': button_settingsMaximize_id, 'button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Click on button settingsMaximize settings.png')

"Step 16: Click on button cancelActions (cancel) -> Navigate to page '/sap/bc/ui2/flp#Retention-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state=*&sap-iapp-state--history=*'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_cancelActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_cancelActions', ['button_cancelActions_id': button_cancelActions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on button cancelActions cancel - Navigate to page sapbcui2flpRetention-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-statesap-iapp-state--history.png')

"Step 17: Click on button cancel2 -> Navigate to page '/sap/bc/ui2/flp#Retention-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_cancel2'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on button cancel2 - Navigate to page sapbcui2flpRetention-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 18: Click on button settingsMaximize (settings)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_id': button_settingsMaximize_id_1, 'button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 18-Click on button settingsMaximize settings.png')

"Step 19: Click on button cancelActions (cancel3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_cancelActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_cancelActions', ['button_cancelActions_id': button_cancelActions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 19-Click on button cancelActions cancel3.png')

"Step 20: Click on link back2 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 20-Click on link back2 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 21: Click on div interactiveChart2 -> Navigate to page '/sap/bc/ui2/flp#Retention-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveChart'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 21-Click on div interactiveChart2 - Navigate to page sapbcui2flpRetention-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 22: Click on button settingsMaximize (settings)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_id': button_settingsMaximize_id_2, 'button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 22-Click on button settingsMaximize settings.png')

"Step 23: Click on button cancelActions (cancel)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_cancelActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_cancelActions', ['button_cancelActions_id': button_cancelActions_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 23-Click on button cancelActions cancel.png')

"Step 24: Click on div retainedStatus"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_retainedStatus'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 24-Click on div retainedStatus.png')

"Step 25: Click on div interactiveColumnChart"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 25-Click on div interactiveColumnChart.png')

"Step 26: Click on button maximizeSettings (settings2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_maximizeSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_maximizeSettings', ['button_maximizeSettings_id': button_maximizeSettings_id]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 26-Click on button maximizeSettings settings2.png')

"Step 27: Click on button cancelActions (cancel4) -> Navigate to page '/sap/bc/ui2/flp#Retention-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state=*&sap-iapp-state--history=*'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_cancelActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_cancelActions', ['button_cancelActions_id': button_cancelActions_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 27-Click on button cancelActions cancel4 - Navigate to page sapbcui2flpRetention-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-statesap-iapp-state--history.png')

"Step 28: Click on span yearsExperience"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_yearsExperience'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 28-Click on span yearsExperience.png')

"Step 29: Click on div analyticalTable"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 29-Click on div analyticalTable.png')

"Step 30: Click on td retainedYesNo"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/td_retainedYesNo'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 30-Click on td retainedYesNo.png')

"Step 31: Click on button sortAscending"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_sortAscending'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 31-Click on button sortAscending.png')

"Step 32: Click on button settings3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_settings3'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 32-Click on button settings3.png')

"Step 33: Click on button cancel5 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_cancel5'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 33-Click on button cancel5 - Navigate to page .png')

"Step 34: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Navigate Human Capital Management Charts and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}