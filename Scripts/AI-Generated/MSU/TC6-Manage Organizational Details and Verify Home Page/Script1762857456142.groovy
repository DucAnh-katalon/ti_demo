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

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on item workflowTabs reportsTab2.png')

"Step 3: Click on link humanCapitalManagement (hcmAnalyticsDashboard) -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement', ['link_humanCapitalManagement_id': link_humanCapitalManagement_id]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link humanCapitalManagement hcmAnalyticsDashboard - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 4: Click on div interactiveStackedColumnChart -> Navigate to page '/sap/bc/ui2/flp#Turnover-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveStackedColumnChart'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on div interactiveStackedColumnChart - Navigate to page sapbcui2flpTurnover-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 5: Click on button settingsMaximize (settings4)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_id': button_settingsMaximize_id, 'button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on button settingsMaximize settings4.png')

"Step 6: Click on span selectOptions (selectOptions)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions', ['span_selectOptions_id': span_selectOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on span selectOptions selectOptions.png')

"Step 7: Click on button removeActions (remove)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_removeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_removeActions', ['button_removeActions_id': button_removeActions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on button removeActions remove.png')

"Step 8: Click on button removeActions (remove2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_removeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_removeActions', ['button_removeActions_id': button_removeActions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on button removeActions remove2.png')

"Step 9: Click on div sortChartTabs (filter)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs', ['div_sortChartTabs_id': div_sortChartTabs_id, 'div_sortChartTabs_internalLabel': div_sortChartTabs_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on div sortChartTabs filter.png')

"Step 10: Click on div sortChartTabs (chartTab)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs', ['div_sortChartTabs_id': div_sortChartTabs_id_1, 'div_sortChartTabs_internalLabel': div_sortChartTabs_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on div sortChartTabs chartTab.png')

"Step 11: Click on div sortChartTabs (filter)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs', ['div_sortChartTabs_id': div_sortChartTabs_id_2, 'div_sortChartTabs_internalLabel': div_sortChartTabs_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Click on div sortChartTabs filter.png')

"Step 12: Click on input filterBy"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_filterBy'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on input filterBy.png')

"Step 13: Click on span selectOptions2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_selectOptions2'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Click on span selectOptions2.png')

"Step 14: Click on item organizationalDetails (terminatedVsRetired)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails', ['item_organizationalDetails_id': item_organizationalDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on item organizationalDetails terminatedVsRetired.png')

"Step 15: Click on input terminatedVsRetired"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_terminatedVsRetired'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Click on input terminatedVsRetired.png')

"Step 16: Click on span selectOptions3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_selectOptions3'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 16-Click on span selectOptions3.png')

"Step 17: Click on item itemSelectionTerminated"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/item_itemSelectionTerminated'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 17-Click on item itemSelectionTerminated.png')

"Step 18: Click on button confirmationActions (confirm)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 18-Click on button confirmationActions confirm.png')

"Step 19: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 19-Click on div analyticalTable2.png')

"Step 20: Click on div interactiveColumnChart2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart2'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 20-Click on div interactiveColumnChart2.png')

"Step 21: Click on button settingsMaximize (settings4)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_id': button_settingsMaximize_id_1, 'button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 21-Click on button settingsMaximize settings4.png')

"Step 22: Click on div sortChartTabs (chart)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs', ['div_sortChartTabs_id': div_sortChartTabs_id_3, 'div_sortChartTabs_internalLabel': div_sortChartTabs_internalLabel_3]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 22-Click on div sortChartTabs chart.png')

"Step 23: Click on span selectOptions4"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_selectOptions4'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 23-Click on span selectOptions4.png')

"Step 24: Click on item organizationalDetails (voluntaryVsInvoluntary)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails', ['item_organizationalDetails_id': item_organizationalDetails_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 24-Click on item organizationalDetails voluntaryVsInvoluntary.png')

"Step 25: Click on div chartContainers (chartContainer)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_chartContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_chartContainers', ['div_chartContainers_id': div_chartContainers_id]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 25-Click on div chartContainers chartContainer.png')

"Step 26: Click on button confirmationActions (confirm2) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 26-Click on button confirmationActions confirm2 - Navigate to page .png')

"Step 27: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Manage Organizational Details and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}