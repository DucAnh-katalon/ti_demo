import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
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

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 2-Click on item workflowTabs reportsTab2.png')

"Step 3: Click on link humanCapitalManagement (hcmAnalyticsDashboard) -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement', ['link_humanCapitalManagement_id': link_humanCapitalManagement_id]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 3-Click on link humanCapitalManagement hcmAnalyticsDashboard - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 4: Click on div interactiveStackedColumnChart -> Navigate to page '/sap/bc/ui2/flp#Turnover-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveStackedColumnChart'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 4-Click on div interactiveStackedColumnChart - Navigate to page sapbcui2flpTurnover-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 5: Click on button settingsMaximize (settings8)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_id': button_settingsMaximize_id, 'button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 5-Click on button settingsMaximize settings8.png')

"Step 6: Click on button removeActions (remove3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_removeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_removeActions', ['button_removeActions_id': button_removeActions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 6-Click on button removeActions remove3.png')

"Step 7: Click on button removeActions (remove4)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_removeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_removeActions', ['button_removeActions_id': button_removeActions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 7-Click on button removeActions remove4.png')

"Step 8: Click on div sortChartTabs (filter)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs', ['div_sortChartTabs_id': div_sortChartTabs_id, 'div_sortChartTabs_internalLabel': div_sortChartTabs_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 8-Click on div sortChartTabs filter.png')

"Step 9: Click on span selectOptionsArrow"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_selectOptionsArrow'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 9-Click on span selectOptionsArrow.png')

"Step 10: Click on item organizationalDetails (terminatedVsRetired2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails', ['item_organizationalDetails_id': item_organizationalDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 10-Click on item organizationalDetails terminatedVsRetired2.png')

"Step 11: Click on span selectOptions3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_selectOptions3'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 11-Click on span selectOptions3.png')

"Step 12: Click on div itemSelectionDetails (itemSelection20)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelectionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelectionDetails', ['div_itemSelectionDetails_id': div_itemSelectionDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 12-Click on div itemSelectionDetails itemSelection20.png')

"Step 13: Click on button confirmationActions (ok17)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 13-Click on button confirmationActions ok17.png')

"Step 14: Click on button settingsMaximize (settings8)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_id': button_settingsMaximize_id_1, 'button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 14-Click on button settingsMaximize settings8.png')

"Step 15: Click on span selectOptions11"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_selectOptions11'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 15-Click on span selectOptions11.png')

"Step 16: Click on div sortChartTabs (chart)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs', ['div_sortChartTabs_id': div_sortChartTabs_id_1, 'div_sortChartTabs_internalLabel': div_sortChartTabs_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 16-Click on div sortChartTabs chart.png')

"Step 17: Click on span selectOptions (selectOptions12)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions', ['span_selectOptions_id': span_selectOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 17-Click on span selectOptions selectOptions12.png')

"Step 18: Click on item organizationalDetails (collegeMau)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails', ['item_organizationalDetails_id': item_organizationalDetails_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 18-Click on item organizationalDetails collegeMau.png')

"Step 19: Click on button confirmationActions (ok18)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 19-Click on button confirmationActions ok18.png')

"Step 20: Click on button settingsMaximize (settings8)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_id': button_settingsMaximize_id_2, 'button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 20-Click on button settingsMaximize settings8.png')

"Step 21: Click on span seriesLayoutOption"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_seriesLayoutOption'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 21-Click on span seriesLayoutOption.png')

"Step 22: Click on item dynamicObject (category)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 22-Click on item dynamicObject category.png')

"Step 23: Click on button confirmationActions (ok19)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 23-Click on button confirmationActions ok19.png')

"Step 24: Click on button chartTypeSelection (selectedChartType)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_chartTypeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_chartTypeSelection', ['button_chartTypeSelection_internalLabel': button_chartTypeSelection_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 24-Click on button chartTypeSelection selectedChartType.png')

"Step 25: Click on span selectableItems"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_selectableItems'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 25-Click on span selectableItems.png')

"Step 26: Click on button settingsMaximize (settings8)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_id': button_settingsMaximize_id_3, 'button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_3]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 26-Click on button settingsMaximize settings8.png')

"Step 27: Click on div sortChartTabs (sort)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs', ['div_sortChartTabs_id': div_sortChartTabs_id_2, 'div_sortChartTabs_internalLabel': div_sortChartTabs_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 27-Click on div sortChartTabs sort.png')

"Step 28: Click on span selectOptions13"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_selectOptions13'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 28-Click on span selectOptions13.png')

"Step 29: Click on item organizationalDetails (collegeMau2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails', ['item_organizationalDetails_id': item_organizationalDetails_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 29-Click on item organizationalDetails collegeMau2.png')

"Step 30: Click on div chartContainers (chartContainer2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_chartContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_chartContainers', ['div_chartContainers_id': div_chartContainers_id]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 30-Click on div chartContainers chartContainer2.png')

"Step 31: Click on button confirmationActions (confirmOk)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 31-Click on button confirmationActions confirmOk.png')

"Step 32: Click on button settingsMaximize (maximize4)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_id': button_settingsMaximize_id_4, 'button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_4]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 32-Click on button settingsMaximize maximize4.png')

"Step 33: Click on div interactiveBarChart"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveBarChart'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 33-Click on div interactiveBarChart.png')

"Step 34: Click on div interactiveBarChart"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveBarChart'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 34-Click on div interactiveBarChart.png')

"Step 35: Click on div interactiveBarChart"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveBarChart'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 35-Click on div interactiveBarChart.png')

"Step 36: Click on button minimize4"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_minimize4'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 36-Click on button minimize4.png')

"Step 37: Click on button settingsAndMaximize (maximize5)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsAndMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsAndMaximize', ['button_settingsAndMaximize_id': button_settingsAndMaximize_id]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 37-Click on button settingsAndMaximize maximize5.png')

"Step 38: Click on div employeeNameHeader3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeNameHeader3'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 38-Click on div employeeNameHeader3.png')

"Step 39: Click on button sortOptions (sortByEmployeeNameDescending2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_sortOptions', ['button_sortOptions_id': button_sortOptions_id, 'button_sortOptions_internalLabel': button_sortOptions_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 39-Click on button sortOptions sortByEmployeeNameDescending2.png')

"Step 40: Click on div employeeName3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeName3'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 40-Click on div employeeName3.png')

"Step 41: Click on button sortOptions (sortByEmployeeNameAscending)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_sortOptions', ['button_sortOptions_id': button_sortOptions_id_1, 'button_sortOptions_internalLabel': button_sortOptions_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 41-Click on button sortOptions sortByEmployeeNameAscending.png')

"Step 42: Click on div analyticalTable9"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable9'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 42-Click on div analyticalTable9.png')

"Step 43: Click on button settings12"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_settings12'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 43-Click on button settings12.png')

"Step 44: Click on div selectionOptions (selectAll7)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions', ['div_selectionOptions_id': div_selectionOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 44-Click on div selectionOptions selectAll7.png')

"Step 45: Click on button confirmationActions (ok20)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_4]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 45-Click on button confirmationActions ok20.png')

"Step 46: Click on div analyticalTable9"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable9'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 46-Click on div analyticalTable9.png')

"Step 47: Click on bdi collegeMau"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/bdi_collegeMau'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 47-Click on bdi collegeMau.png')

"Step 48: Click on button sortOptions (groupBy)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_sortOptions', ['button_sortOptions_id': button_sortOptions_id_2, 'button_sortOptions_internalLabel': button_sortOptions_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 48-Click on button sortOptions groupBy.png')

"Step 49: Click on div collegeHeaders (collegeHeader)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_collegeHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_collegeHeaders', ['div_collegeHeaders_id': div_collegeHeaders_id]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 49-Click on div collegeHeaders collegeHeader.png')

"Step 50: Click on div collegeHeaders (collegeHeader)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_collegeHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_collegeHeaders', ['div_collegeHeaders_id': div_collegeHeaders_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 50-Click on div collegeHeaders collegeHeader.png')

"Step 51: Click on div collegeHeaders (collegeHeader2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_collegeHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_collegeHeaders', ['div_collegeHeaders_id': div_collegeHeaders_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 51-Click on div collegeHeaders collegeHeader2.png')

"Step 52: Click on div analyticalTable9"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable9'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 52-Click on div analyticalTable9.png')

"Step 53: Click on button settings12"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_settings12'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 53-Click on button settings12.png')

"Step 54: Click on div sortChartTabs (sortTab)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs', ['div_sortChartTabs_id': div_sortChartTabs_id_3, 'div_sortChartTabs_internalLabel': div_sortChartTabs_internalLabel_3]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 54-Click on div sortChartTabs sortTab.png')

"Step 55: Click on span selectOptions14"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_selectOptions14'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 55-Click on span selectOptions14.png')

"Step 56: Click on item organizationalDetails (employeeName)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails', ['item_organizationalDetails_id': item_organizationalDetails_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 56-Click on item organizationalDetails employeeName.png')

"Step 57: Click on item sortDescending"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/item_sortDescending'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 57-Click on item sortDescending.png')

"Step 58: Click on button confirmationActions (ok21)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_5]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 58-Click on button confirmationActions ok21.png')

"Step 59: Click on div collegeHeaders (collegeHeader2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_collegeHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_collegeHeaders', ['div_collegeHeaders_id': div_collegeHeaders_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 59-Click on div collegeHeaders collegeHeader2.png')

"Step 60: Click on div academicStaffDetails (academicStaff)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_academicStaffDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_academicStaffDetails', ['div_academicStaffDetails_id': div_academicStaffDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 60-Click on div academicStaffDetails academicStaff.png')

"Step 61: Click on div analyticalTable9"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable9'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 61-Click on div analyticalTable9.png')

"Step 62: Click on div analyticalTable9"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable9'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 62-Click on div analyticalTable9.png')

"Step 63: Click on div analyticalTable9"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable9'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 63-Click on div analyticalTable9.png')

"Step 64: Click on div academicStaffDetails (tableCell)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_academicStaffDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_academicStaffDetails', ['div_academicStaffDetails_id': div_academicStaffDetails_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 64-Click on div academicStaffDetails tableCell.png')

"Step 65: Click on div analyticalTable9"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable9'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 65-Click on div analyticalTable9.png')

"Step 66: Click on button minimize5"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_minimize5'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 66-Click on button minimize5.png')

"Step 67: Click on button settingsAndMaximize (settings13)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsAndMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsAndMaximize', ['button_settingsAndMaximize_id': button_settingsAndMaximize_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 67-Click on button settingsAndMaximize settings13.png')

"Step 68: Click on div sortChartTabs (groupTab)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortChartTabs', ['div_sortChartTabs_id': div_sortChartTabs_id_4, 'div_sortChartTabs_internalLabel': div_sortChartTabs_internalLabel_4]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 68-Click on div sortChartTabs groupTab.png')

"Step 69: Click on div showFieldAsColumn"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_showFieldAsColumn'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 69-Click on div showFieldAsColumn.png')

"Step 70: Click on button confirmationActions (ok22)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_6]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 70-Click on button confirmationActions ok22.png')

"Step 71: Click on button settingsAndMaximize (settings13)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsAndMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsAndMaximize', ['button_settingsAndMaximize_id': button_settingsAndMaximize_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 71-Click on button settingsAndMaximize settings13.png')

"Step 72: Click on button removeGroupCriterion"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_removeGroupCriterion'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 72-Click on button removeGroupCriterion.png')

"Step 73: Click on button confirmationActions (ok23)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_7]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 73-Click on button confirmationActions ok23.png')

"Step 74: Click on div employeeName4"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeName4'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 74-Click on div employeeName4.png')

"Step 75: Click on div additionalFilters (filter11)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_additionalFilters"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_additionalFilters', ['div_additionalFilters_id': div_additionalFilters_id]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 75-Click on div additionalFilters filter11.png')

"Step 76: Click on input employeeName4"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName4'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 76-Click on input employeeName4.png')

"Step 77: Enter input value in input employeeName4"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName4'), input_employeeName4)

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 77-Enter input value in input employeeName4.png')

"Step 78: Press key Enter on input employeeName4"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName4'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 78-Press key Enter on input employeeName4.png')

"Step 79: Click on button confirmationActions (ok24)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_8]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 79-Click on button confirmationActions ok24.png')

"Step 80: Click on td employeeName4"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/td_employeeName3'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 80-Click on td employeeName4.png')

"Step 81: Click on div additionalFilters (filter12)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_additionalFilters"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_additionalFilters', ['div_additionalFilters_id': div_additionalFilters_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 81-Click on div additionalFilters filter12.png')

"Step 82: Click on div optionItems (mieko)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_optionItems"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_optionItems', ['div_optionItems_divTitle': div_optionItems_divTitle, 'div_optionItems_id': div_optionItems_id]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 82-Click on div optionItems mieko.png')

"Step 83: Click on span showValueHelp7"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_showValueHelp7'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 83-Click on span showValueHelp7.png')

"Step 84: Click on input value"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_value'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 84-Click on input value.png')

"Step 85: Enter input value in input value"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_value'), input_value)

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 85-Enter input value in input value.png')

"Step 86: Press key Enter on input value"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_value'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 86-Press key Enter on input value.png')

"Step 87: Click on button confirmationActions (ok25)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_9]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 87-Click on button confirmationActions ok25.png')

"Step 88: Click on button confirmationActions (confirm7)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_10]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 88-Click on button confirmationActions confirm7.png')

"Step 89: Click on div employeeName4"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeName4'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 89-Click on div employeeName4.png')

"Step 90: Click on div filterOptions (filter13)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_filterOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_filterOptions', ['div_filterOptions_id': div_filterOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 90-Click on div filterOptions filter13.png')

"Step 91: Click on button removeFilterCriterion"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_removeFilterCriterion'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 91-Click on button removeFilterCriterion.png')

"Step 92: Click on button confirmationActions (ok26)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_11]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 92-Click on button confirmationActions ok26.png')

"Step 93: Click on button openMenu3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_openMenu3'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 93-Click on button openMenu3.png')

"Step 94: Click on item exportAs4"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/item_exportAs4'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 94-Click on item exportAs4.png')

"Step 95: Click on div splitCellsCheckbox3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_splitCellsCheckbox3'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 95-Click on div splitCellsCheckbox3.png')

"Step 96: Click on button export3 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_export3'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 96-Click on button export3 - Navigate to page .png')

"Step 97: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-Manage Human Capital Management Workflows in SAP Business Client_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}