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

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 2-Click on item workflowTabs reportsTab3.png')

"Step 3: Click on link humanCapitalManagement (humanCapitalManagementAnalytics5) -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 3-Click on link humanCapitalManagement humanCapitalManagementAnalytics5 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 4: Click on div interactiveLineChart4 -> Navigate to page '/sap/bc/ui2/flp#Headcount-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart4'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 4-Click on div interactiveLineChart4 - Navigate to page sapbcui2flpHeadcount-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 5: Click on button menuActions (excelAttachment)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_menuActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_menuActions', ['button_menuActions_internalLabel': button_menuActions_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 5-Click on button menuActions excelAttachment.png')

"Step 6: Click on button settings14"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_settings14'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 6-Click on button settings14.png')

"Step 7: Click on div selectionOptions (itemSelection21)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions', ['div_selectionOptions_id': div_selectionOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 7-Click on div selectionOptions itemSelection21.png')

"Step 8: Click on bdi collegeMau2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/bdi_collegeMau2'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 8-Click on bdi collegeMau2.png')

"Step 9: Click on button confirmationActions (confirm8)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 9-Click on button confirmationActions confirm8.png')

"Step 10: Click on item viewOptions (tableView5)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions', ['item_viewOptions_internalLabel': item_viewOptions_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 10-Click on item viewOptions tableView5.png')

"Step 11: Click on link back4 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 11-Click on link back4 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 12: Click on div interactiveChart3 -> Navigate to page '/sap/bc/ui2/flp#Retention-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 12-Click on div interactiveChart3 - Navigate to page sapbcui2flpRetention-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 13: Click on button collapseHeader"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_collapseHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 13-Click on button collapseHeader.png')

"Step 14: Click on item viewOptions (tableView6)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions', ['item_viewOptions_internalLabel': item_viewOptions_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 14-Click on item viewOptions tableView6.png')

"Step 15: Click on td employeeGroup2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/td_employeeGroup2'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 15-Click on td employeeGroup2.png')

"Step 16: Click on div analyticalTable10"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable10'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 16-Click on div analyticalTable10.png')

"Step 17: Click on div employeeDetails6"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 17-Click on div employeeDetails6.png')

"Step 18: Click on div analyticalTable10"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable10'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 18-Click on div analyticalTable10.png')

"Step 19: Click on link back5 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 19-Click on link back5 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 20: Click on div interactiveLineChart4 -> Navigate to page '/sap/bc/ui2/flp#Headcount-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart4'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 20-Click on div interactiveLineChart4 - Navigate to page sapbcui2flpHeadcount-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 21: Click on button settings15"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_settings15'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 21-Click on button settings15.png')

"Step 22: Click on span selectOptions (selectOptions15)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions', ['span_selectOptions_id': span_selectOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 22-Click on span selectOptions selectOptions15.png')

"Step 23: Click on item organizationalDetails (organizationalUnit)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails', ['item_organizationalDetails_id': item_organizationalDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 23-Click on item organizationalDetails organizationalUnit.png')

"Step 24: Click on button confirmationActions (confirm9)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 24-Click on button confirmationActions confirm9.png')

"Step 25: Click on div interactiveColumnChart5"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 25-Click on div interactiveColumnChart5.png')

"Step 26: Click on div interactiveColumnChart5"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 26-Click on div interactiveColumnChart5.png')

"Step 27: Click on div interactiveColumnChart5"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 27-Click on div interactiveColumnChart5.png')

"Step 28: Click on div interactiveColumnChart5"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 28-Click on div interactiveColumnChart5.png')

"Step 29: Click on div interactiveColumnChart5"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 29-Click on div interactiveColumnChart5.png')

"Step 30: Click on div interactiveColumnChart5"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 30-Click on div interactiveColumnChart5.png')

"Step 31: Click on div interactiveColumnChart5"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 31-Click on div interactiveColumnChart5.png')

"Step 32: Click on div interactiveColumnChart5"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 32-Click on div interactiveColumnChart5.png')

"Step 33: Click on div interactiveColumnChart5"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 33-Click on div interactiveColumnChart5.png')

"Step 34: Click on div interactiveColumnChart5"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 34-Click on div interactiveColumnChart5.png')

"Step 35: Click on div interactiveColumnChart5"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 35-Click on div interactiveColumnChart5.png')

"Step 36: Click on item viewOptions (tableView7)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions', ['item_viewOptions_internalLabel': item_viewOptions_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 36-Click on item viewOptions tableView7.png')

"Step 37: Click on span employeeDetails (contactInfo)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails', ['span_employeeDetails_id': span_employeeDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 37-Click on span employeeDetails contactInfo.png')

"Step 38: Click on div employeeDetails7"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeDetails7'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 38-Click on div employeeDetails7.png')

"Step 39: Click on item viewOptions (chartView3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions', ['item_viewOptions_internalLabel': item_viewOptions_internalLabel_3]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 39-Click on item viewOptions chartView3.png')

"Step 40: Click on link back4 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 40-Click on link back4 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 41: Click on span valueHelpIndicators (showValueHelp8)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_valueHelpIndicators"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_valueHelpIndicators', ['span_valueHelpIndicators_divTitle': span_valueHelpIndicators_divTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 41-Click on span valueHelpIndicators showValueHelp8.png')

"Step 42: Click on div clickToSelect"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_clickToSelect'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 42-Click on div clickToSelect.png')

"Step 43: Click on button confirm10 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics&/?sap-iapp-state=*'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_confirm10'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 43-Click on button confirm10 - Navigate to page sapbcui2flpHcmanalyticreport-analyticssap-iapp-state.png')

"Step 44: Click on div humanResourcesSections (canrExternalRelations)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_humanResourcesSections"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_humanResourcesSections', ['div_humanResourcesSections_divTitle': div_humanResourcesSections_divTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 44-Click on div humanResourcesSections canrExternalRelations.png')

"Step 45: Click on span employeeTypeFilters (employeeTypeFilter2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeTypeFilters"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeTypeFilters', ['span_employeeTypeFilters_divTitle': span_employeeTypeFilters_divTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 45-Click on span employeeTypeFilters employeeTypeFilter2.png')

"Step 46: Click on div itemSelections (itemSelection22)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections', ['div_itemSelections_id': div_itemSelections_id]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 46-Click on div itemSelections itemSelection22.png')

"Step 47: Click on div cards"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_cards'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 47-Click on div cards.png')

"Step 48: Click on div employeeType"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeType'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 48-Click on div employeeType.png')

"Step 49: Click on div interactiveStackedColumnChart8 -> Navigate to page '/sap/bc/ui2/flp#Turnover-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveStackedColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 49-Click on div interactiveStackedColumnChart8 - Navigate to page sapbcui2flpTurnover-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 50: Click on button settingsMaximize (settings16)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 50-Click on button settingsMaximize settings16.png')

"Step 51: Click on span layoutOption"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_layoutOption'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 51-Click on span layoutOption.png')

"Step 52: Click on item dynamicObject (category2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 52-Click on item dynamicObject category2.png')

"Step 53: Click on button confirmationActions (ok27)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 53-Click on button confirmationActions ok27.png')

"Step 54: Click on item viewOptions (chartView4)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions', ['item_viewOptions_internalLabel': item_viewOptions_internalLabel_4]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 54-Click on item viewOptions chartView4.png')

"Step 55: Click on button chartTypeSelection (selectedChartType2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_chartTypeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_chartTypeSelection', ['button_chartTypeSelection_internalLabel': button_chartTypeSelection_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 55-Click on button chartTypeSelection selectedChartType2.png')

"Step 56: Click on div employeeDetails8"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeDetails8'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 56-Click on div employeeDetails8.png')

"Step 57: Click on button settingsMaximize (settings16)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 57-Click on button settingsMaximize settings16.png')

"Step 58: Click on span selectOptions (selectOptions16)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions', ['span_selectOptions_id': span_selectOptions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 58-Click on span selectOptions selectOptions16.png')

"Step 59: Click on item organizationalDetails (collegeMau3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails', ['item_organizationalDetails_id': item_organizationalDetails_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 59-Click on item organizationalDetails collegeMau3.png')

"Step 60: Click on span selectOptions (selectOptions16)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions', ['span_selectOptions_id': span_selectOptions_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 60-Click on span selectOptions selectOptions16.png')

"Step 61: Click on div chartContainers (chartContainer3)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_chartContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_chartContainers', ['div_chartContainers_id': div_chartContainers_id]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 61-Click on div chartContainers chartContainer3.png')

"Step 62: Click on button confirmationActions (ok28)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 62-Click on button confirmationActions ok28.png')

"Step 63: Click on button settingsMaximize (settings16)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 63-Click on button settingsMaximize settings16.png')

"Step 64: Click on span selectOptions (selectOptions16)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions', ['span_selectOptions_id': span_selectOptions_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 64-Click on span selectOptions selectOptions16.png')

"Step 65: Click on item organizationalDetails (personnelSubarea)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails', ['item_organizationalDetails_id': item_organizationalDetails_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 65-Click on item organizationalDetails personnelSubarea.png')

"Step 66: Click on button confirmationActions (ok29)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_4]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 66-Click on button confirmationActions ok29.png')

"Step 67: Click on button settingsMaximize (settings16)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_3]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 67-Click on button settingsMaximize settings16.png')

"Step 68: Click on span selectOptions (selectOptions16)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions', ['span_selectOptions_id': span_selectOptions_id_4]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 68-Click on span selectOptions selectOptions16.png')

"Step 69: Click on item organizationalDetails (organizationalUnit2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails', ['item_organizationalDetails_id': item_organizationalDetails_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 69-Click on item organizationalDetails organizationalUnit2.png')

"Step 70: Click on button confirmationActions (confirm11)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_5]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 70-Click on button confirmationActions confirm11.png')

"Step 71: Click on item viewOptions (tableView8)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions', ['item_viewOptions_internalLabel': item_viewOptions_internalLabel_5]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 71-Click on item viewOptions tableView8.png')

"Step 72: Click on div analyticalTable3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 72-Click on div analyticalTable3.png')

"Step 73: Click on div analyticalTable3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 73-Click on div analyticalTable3.png')

"Step 74: Click on div analyticalTable3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 74-Click on div analyticalTable3.png')

"Step 75: Click on span employeeDetails (nameWithId3)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails', ['span_employeeDetails_id': span_employeeDetails_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 75-Click on span employeeDetails nameWithId3.png')

"Step 76: Click on button settings17"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_settings17'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 76-Click on button settings17.png')

"Step 77: Click on div selectionOptions (selectAll8)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions', ['div_selectionOptions_id': div_selectionOptions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 77-Click on div selectionOptions selectAll8.png')

"Step 78: Click on button confirmationActions (confirm12)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_6]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 78-Click on button confirmationActions confirm12.png')

"Step 79: Click on div analyticalTable3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 79-Click on div analyticalTable3.png')

"Step 80: Click on div analyticalTable3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 80-Click on div analyticalTable3.png')

"Step 81: Click on div analyticalTable3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 81-Click on div analyticalTable3.png')

"Step 82: Click on div analyticalTable3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 82-Click on div analyticalTable3.png')

"Step 83: Click on button settings17"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_settings17'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 83-Click on button settings17.png')

"Step 84: Click on div selectionOptions (itemSelection23)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions', ['div_selectionOptions_id': div_selectionOptions_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 84-Click on div selectionOptions itemSelection23.png')

"Step 85: Click on button confirmationActions (confirm13)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_7]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 85-Click on button confirmationActions confirm13.png')

"Step 86: Click on div analyticalTable3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 86-Click on div analyticalTable3.png')

"Step 87: Click on link back15 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics&/?sap-iapp-state=*'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 87-Click on link back15 - Navigate to page sapbcui2flpHcmanalyticreport-analyticssap-iapp-state.png')

"Step 88: Click on span showValueHelp9"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_showValueHelp9'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 88-Click on span showValueHelp9.png')

"Step 89: Click on div dateTime"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_dateTime'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 89-Click on div dateTime.png')

"Step 90: Click on span userProfile"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_userProfile'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 90-Click on span userProfile.png')

"Step 91: Click on div settings"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_settings'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 91-Click on div settings.png')

"Step 92: Click on span userId"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_userId'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 92-Click on span userId.png')

"Step 93: Click on span userEmail"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_userEmail'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 93-Click on span userEmail.png')

"Step 94: Click on span userEmail"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_userEmail'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 94-Click on span userEmail.png')

"Step 95: Click on button cancel11"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_cancel11'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 95-Click on button cancel11.png')

"Step 96: Click on div interactiveLineChart7 -> Navigate to page '/sap/bc/ui2/flp#Retirementage-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart7'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 96-Click on div interactiveLineChart7 - Navigate to page sapbcui2flpRetirementage-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 97: Click on button settingsMaximize (settings18)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_4]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 97-Click on button settingsMaximize settings18.png')

"Step 98: Click on button confirmationActions (cancel12)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_8]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 98-Click on button confirmationActions cancel12.png')

"Step 99: Click on button chartTypeSelection (selectedChartType3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_chartTypeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_chartTypeSelection', ['button_chartTypeSelection_internalLabel': button_chartTypeSelection_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 99-Click on button chartTypeSelection selectedChartType3.png')

"Step 100: Click on div stackedColumnCharts (stackedColumnChart)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_stackedColumnCharts"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_stackedColumnCharts', ['div_stackedColumnCharts_id': div_stackedColumnCharts_id]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 100-Click on div stackedColumnCharts stackedColumnChart.png')

"Step 101: Click on item chartView5"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/item_chartView5'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 101-Click on item chartView5.png')

"Step 102: Click on button chartTypeSelection (selectedChartType4)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_chartTypeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_chartTypeSelection', ['button_chartTypeSelection_internalLabel': button_chartTypeSelection_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 102-Click on button chartTypeSelection selectedChartType4.png')

"Step 103: Click on button settingsMaximize (settings18)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_5]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 103-Click on button settingsMaximize settings18.png')

"Step 104: Click on span layoutOptions (layoutOption2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_layoutOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_layoutOptions', ['span_layoutOptions_id': span_layoutOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 104-Click on span layoutOptions layoutOption2.png')

"Step 105: Click on item availableValues (availableValues)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_availableValues"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_availableValues', ['item_availableValues_id': item_availableValues_id]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 105-Click on item availableValues availableValues.png')

"Step 106: Click on button confirmationActions (confirmOk2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_9]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 106-Click on button confirmationActions confirmOk2.png')

"Step 107: Click on button settingsMaximize (settings18)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_6]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 107-Click on button settingsMaximize settings18.png')

"Step 108: Click on button confirmationActions (cancel13)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_10]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 108-Click on button confirmationActions cancel13.png')

"Step 109: Click on button settingsMaximize (settings18)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_7]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 109-Click on button settingsMaximize settings18.png')

"Step 110: Click on span layoutOptions (layoutOption3)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_layoutOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_layoutOptions', ['span_layoutOptions_id': span_layoutOptions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 110-Click on span layoutOptions layoutOption3.png')

"Step 111: Click on item availableValues (availableValues2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_availableValues"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_availableValues', ['item_availableValues_id': item_availableValues_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 111-Click on item availableValues availableValues2.png')

"Step 112: Click on button confirmationActions (ok30)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_11]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 112-Click on button confirmationActions ok30.png')

"Step 113: Click on span standard"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_standard'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 113-Click on span standard.png')

"Step 114: Click on item standard"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/item_standard'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 114-Click on item standard.png')

"Step 115: Click on button chartTypeSelection (selectedChartType3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_chartTypeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_chartTypeSelection', ['button_chartTypeSelection_internalLabel': button_chartTypeSelection_internalLabel_3]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 115-Click on button chartTypeSelection selectedChartType3.png')

"Step 116: Click on div stackedColumnCharts (stackedColumnChart2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_stackedColumnCharts"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_stackedColumnCharts', ['div_stackedColumnCharts_id': div_stackedColumnCharts_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 116-Click on div stackedColumnCharts stackedColumnChart2.png')

"Step 117: Click on button settingsMaximize (settings18)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_8]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 117-Click on button settingsMaximize settings18.png')

"Step 118: Click on span selectOptions17"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_selectOptions17'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 118-Click on span selectOptions17.png')

"Step 119: Click on item organizationalUnits (organizationalUnit3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalUnits"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalUnits', ['item_organizationalUnits_id': item_organizationalUnits_id]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 119-Click on item organizationalUnits organizationalUnit3.png')

"Step 120: Click on button confirmationActions (confirm14)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_12]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 120-Click on button confirmationActions confirm14.png')

"Step 121: Click on button chartTypeSelection (maximize6)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_chartTypeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_chartTypeSelection', ['button_chartTypeSelection_internalLabel': button_chartTypeSelection_internalLabel_4]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 121-Click on button chartTypeSelection maximize6.png')

"Step 122: Click on button minimize6"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_minimize6'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 122-Click on button minimize6.png')

"Step 123: Click on link back6 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics&/?sap-iapp-state=*'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 123-Click on link back6 - Navigate to page sapbcui2flpHcmanalyticreport-analyticssap-iapp-state.png')

"Step 124: Click on div interactiveLineChart17 -> Navigate to page '/sap/bc/ui2/flp#Headcount-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart17'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 124-Click on div interactiveLineChart17 - Navigate to page sapbcui2flpHeadcount-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 125: Click on button settings15"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_settings15'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 125-Click on button settings15.png')

"Step 126: Click on span selectOptions (selectOptions18)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions', ['span_selectOptions_id': span_selectOptions_id_5]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 126-Click on span selectOptions selectOptions18.png')

"Step 127: Click on item organizationalDetails (collegeMau4)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails', ['item_organizationalDetails_id': item_organizationalDetails_id_4]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 127-Click on item organizationalDetails collegeMau4.png')

"Step 128: Click on span selectOptions (selectOptions18)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions', ['span_selectOptions_id': span_selectOptions_id_6]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 128-Click on span selectOptions selectOptions18.png')

"Step 129: Click on item organizationalDetails (organizationalUnit4)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalDetails', ['item_organizationalDetails_id': item_organizationalDetails_id_5]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 129-Click on item organizationalDetails organizationalUnit4.png')

"Step 130: Click on button confirmationActions (ok31)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_13]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 130-Click on button confirmationActions ok31.png')

"Step 131: Click on link back4 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics&/?sap-iapp-state=*'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back4'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 131-Click on link back4 - Navigate to page sapbcui2flpHcmanalyticreport-analyticssap-iapp-state.png')

"Step 132: Click on div interactiveLineChart7 -> Navigate to page '/sap/bc/ui2/flp#Retirementage-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart7'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 132-Click on div interactiveLineChart7 - Navigate to page sapbcui2flpRetirementage-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 133: Click on button settingsMaximize (settings18)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel_9]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 133-Click on button settingsMaximize settings18.png')

"Step 134: Click on td personnelSubarea"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/td_personnelSubarea'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 134-Click on td personnelSubarea.png')

"Step 135: Click on span selectOptions19"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_selectOptions19'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 135-Click on span selectOptions19.png')

"Step 136: Click on item organizationalUnits (organizationalUnit5)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalUnits"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_organizationalUnits', ['item_organizationalUnits_id': item_organizationalUnits_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 136-Click on item organizationalUnits organizationalUnit5.png')

"Step 137: Click on button confirmationActions (ok32)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_14]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 137-Click on button confirmationActions ok32.png')

"Step 138: Click on div interactiveColumnChart6"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 138-Click on div interactiveColumnChart6.png')

"Step 139: Click on div interactiveColumnChart6"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 139-Click on div interactiveColumnChart6.png')

"Step 140: Click on div interactiveColumnChart6 -> Navigate to page ''"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 140-Click on div interactiveColumnChart6 - Navigate to page .png')

"Step 141: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Explore Employee Details and Chart Options in SAP Business Client_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}