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

"Step 2: Click on button moreGroups2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_moreGroups2'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Click on button moreGroups2.png')

"Step 3: Click on div actionsReports (reports)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_actionsReports"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_actionsReports', ['div_actionsReports_id': div_actionsReports_id]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on div actionsReports reports.png')

"Step 4: Click on link humanCapitalManagement (humanCapitalManagementAnalytics3) -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement', ['link_humanCapitalManagement_id': link_humanCapitalManagement_id]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on link humanCapitalManagement humanCapitalManagementAnalytics3 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 5: Click on div interactiveChart2 -> Navigate to page '/sap/bc/ui2/flp#Retention-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveChart'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Click on div interactiveChart2 - Navigate to page sapbcui2flpRetention-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 6: Click on div retainedStatusKpi"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_retainedStatusKpi'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on div retainedStatusKpi.png')

"Step 7: Click on div retainedStatusKpi"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_retainedStatusKpi'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on div retainedStatusKpi.png')

"Step 8: Click on div popover"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_popover'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on div popover.png')

"Step 9: Click on div retentionKpis"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_retentionKpis'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on div retentionKpis.png')

"Step 10: Click on button maximizeSettings (maximize)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_maximizeSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_maximizeSettings', ['button_maximizeSettings_id': button_maximizeSettings_id]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 10-Click on button maximizeSettings maximize.png')

"Step 11: Click on div analyticalTable4"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable4'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 11-Click on div analyticalTable4.png')

"Step 12: Click on div analyticalTable4"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable4'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 12-Click on div analyticalTable4.png')

"Step 13: Click on div retentionYears"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_retentionYears'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 13-Click on div retentionYears.png')

"Step 14: Click on span experienceDetails (ageRange)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_experienceDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_experienceDetails', ['span_experienceDetails_id': span_experienceDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 14-Click on span experienceDetails ageRange.png')

"Step 15: Click on td seniorityGroup"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/td_seniorityGroup'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 15-Click on td seniorityGroup.png')

"Step 16: Click on span experienceDetails (value)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_experienceDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_experienceDetails', ['span_experienceDetails_id': span_experienceDetails_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 16-Click on span experienceDetails value.png')

"Step 17: Click on span experienceDetails (yearsExperience2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_experienceDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_experienceDetails', ['span_experienceDetails_id': span_experienceDetails_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 17-Click on span experienceDetails yearsExperience2.png')

"Step 18: Click on button settings5"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_settings5'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 18-Click on button settings5.png')

"Step 19: Click on div selectionOptions (selectAll)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions', ['div_selectionOptions_id': div_selectionOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 19-Click on div selectionOptions selectAll.png')

"Step 20: Click on button confirmationActions (ok3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 20-Click on button confirmationActions ok3.png')

"Step 21: Click on button minimize"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_minimize'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 21-Click on button minimize.png')

"Step 22: Click on link back2 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 22-Click on link back2 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 23: Click on div interactiveLineCharts (interactiveLineChart8)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_interactiveLineCharts"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_interactiveLineCharts', ['div_interactiveLineCharts_id': div_interactiveLineCharts_id, 'div_interactiveLineCharts_internalLabel': div_interactiveLineCharts_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 23-Click on div interactiveLineCharts interactiveLineChart8.png')

"Step 24: Click on div interactiveLineChart9 -> Navigate to page '/sap/bc/ui2/flp#Retirementage-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart2'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 24-Click on div interactiveLineChart9 - Navigate to page sapbcui2flpRetirementage-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 25: Click on button maximizeSettings (maximize2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_maximizeSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_maximizeSettings', ['button_maximizeSettings_id': button_maximizeSettings_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 25-Click on button maximizeSettings maximize2.png')

"Step 26: Click on button settings6"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_settings6'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 26-Click on button settings6.png')

"Step 27: Click on button confirmationActions (cancel7)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 27-Click on button confirmationActions cancel7.png')

"Step 28: Click on button settings6"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_settings6'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 28-Click on button settings6.png')

"Step 29: Click on div selectionOptions (selectAllCheckbox)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions', ['div_selectionOptions_id': div_selectionOptions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 29-Click on div selectionOptions selectAllCheckbox.png')

"Step 30: Click on div selectionOptions (selectAllCheckbox)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions', ['div_selectionOptions_id': div_selectionOptions_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 30-Click on div selectionOptions selectAllCheckbox.png')

"Step 31: Click on div selectionOptions (selectAll2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions', ['div_selectionOptions_id': div_selectionOptions_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 31-Click on div selectionOptions selectAll2.png')

"Step 32: Click on button confirmationActions (ok4)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 32-Click on button confirmationActions ok4.png')

"Step 33: Click on button minimize2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_minimize2'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 33-Click on button minimize2.png')

"Step 34: Click on button openMenu2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_openMenu2'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 34-Click on button openMenu2.png')

"Step 35: Click on item exportAs2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/item_exportAs2'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 35-Click on item exportAs2.png')

"Step 36: Click on div splitCellsCheckbox2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_splitCellsCheckbox2'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 36-Click on div splitCellsCheckbox2.png')

"Step 37: Click on button export2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_export2'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 37-Click on button export2.png')

"Step 38: Click on div analyticalTable5"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable5'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 38-Click on div analyticalTable5.png')

"Step 39: Click on button maximizeSettings (settings7)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_maximizeSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_maximizeSettings', ['button_maximizeSettings_id': button_maximizeSettings_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 39-Click on button maximizeSettings settings7.png')

"Step 40: Click on button confirmationActions (cancel8)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 40-Click on button confirmationActions cancel8.png')

"Step 41: Click on link back3 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 41-Click on link back3 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 42: Click on div interactiveLineCharts (interactiveLineChart10)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_interactiveLineCharts"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_interactiveLineCharts', ['div_interactiveLineCharts_id': div_interactiveLineCharts_id_1, 'div_interactiveLineCharts_internalLabel': div_interactiveLineCharts_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 42-Click on div interactiveLineCharts interactiveLineChart10.png')

"Step 43: Click on div interactiveLineCharts (interactiveLineChart11) -> Navigate to page ''"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_interactiveLineCharts"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_interactiveLineCharts', ['div_interactiveLineCharts_id': div_interactiveLineCharts_id_2, 'div_interactiveLineCharts_internalLabel': div_interactiveLineCharts_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 43-Click on div interactiveLineCharts interactiveLineChart11 - Navigate to page .png')

"Step 44: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Analyze Retention KPIs and Export Reports in Human Capital Management_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}