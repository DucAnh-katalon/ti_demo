import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.MSU.common.applyAdditionalFiltersForEmployee
import truetest.MSU.common.filterAndConfirmEmployeeDetails
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

"Step 2: Click on item workflowTabs (myApprovalsWorkflow2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 2-Click on item workflowTabs myApprovalsWorkflow2.png')

"Step 3: Click on link administratorsNavigation -> Navigate to page '/sap/bc/ui2/flp#Hrsecurityorg-Read&/?sap-iapp-state--history=*&sap-iapp-state=*'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_administratorsNavigation'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 3-Click on link administratorsNavigation - Navigate to page sapbcui2flpHrsecurityorg-Readsap-iapp-state--historysap-iapp-state.png')

"Step 4: Click on span roleDescription"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_roleDescription'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Click on span roleDescription.png')

"Step 5: Click on div itemSelection10"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_itemSelection10'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 5-Click on div itemSelection10.png')

"Step 6: Click on button go4"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go4'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Click on button go4.png')

"Step 7: Click on div roleDescription"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_roleDescription'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 7-Click on div roleDescription.png')

"Step 8: Click on link navigateHome5 -> Navigate to page '/sap/bc/ui2/flp#Shell-home'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_navigateHome5'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 8-Click on link navigateHome5 - Navigate to page sapbcui2flpShell-home.png')

"Step 9: Click on item workflowTabs (reports2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 9-Click on item workflowTabs reports2.png')

"Step 10: Click on link humanCapitalManagement (humanCapitalManagementDashboard) -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement', ['link_humanCapitalManagement_id': link_humanCapitalManagement_id]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 10-Click on link humanCapitalManagement humanCapitalManagementDashboard - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 11: Click on input organizationalDetails (organizationalUnit5)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_organizationalDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_organizationalDetails', ['input_organizationalDetails_internalLabel': input_organizationalDetails_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 11-Click on input organizationalDetails organizationalUnit5.png')

"Step 12: Enter input value in input organizationalDetails (organizationalUnit5)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_organizationalDetails"
WebUI.setText(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_organizationalDetails', ['input_organizationalDetails_internalLabel': input_organizationalDetails_internalLabel_1]), input_organizationalDetails)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 12-Enter input value in input organizationalDetails organizationalUnit5.png')

"Step 13: Click on td organizationalUnit -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics&/?sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/td_organizationalUnit'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 13-Click on td organizationalUnit - Navigate to page sapbcui2flpHcmanalyticreport-analyticssap-iapp-state.png')

"Step 14: Click on div object3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 14-Click on div object3.png')

"Step 15: Click on div interactiveStackedColumnChart5 -> Navigate to page '/sap/bc/ui2/flp#Turnover-alp?orgeh=*&p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveStackedColumnChart5'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 15-Click on div interactiveStackedColumnChart5 - Navigate to page sapbcui2flpTurnover-alporgehp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 16: Click on div analyticalTable6"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable6'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 16-Click on div analyticalTable6.png')

"Step 17: Click on div departmentOptions (writingRhetoricCultures)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions', ['div_departmentOptions_divTitle': div_departmentOptions_divTitle, 'div_departmentOptions_id': div_departmentOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 17-Click on div departmentOptions writingRhetoricCultures.png')

"Step 18: Click on input organizationalUnit6"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 18-Click on input organizationalUnit6.png')

"Step 19: Enter input value in input organizationalUnit6"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'), input_organizationalUnit6)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 19-Enter input value in input organizationalUnit6.png')

"Step 20: Click on span departmentName"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_departmentName'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 20-Click on span departmentName.png')

"Step 21: Click on button go5"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go5'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 21-Click on button go5.png')

"Step 22: Click on div departmentOptions (managementOption)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions', ['div_departmentOptions_divTitle': div_departmentOptions_divTitle_1, 'div_departmentOptions_id': div_departmentOptions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 22-Click on div departmentOptions managementOption.png')

"Step 23: Click on input organizationalUnit6"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 23-Click on input organizationalUnit6.png')

"Step 24: Enter input value in input organizationalUnit6"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'), input_organizationalUnit6_1)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 24-Enter input value in input organizationalUnit6.png')

"Step 25: Click on button go5"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go5'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 25-Click on button go5.png')

"Step 26: Click on div analyticalTable6"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable6'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 26-Click on div analyticalTable6.png')

"Step 27: Click on div departmentOptions (advertisingAndPublicRelations)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions', ['div_departmentOptions_divTitle': div_departmentOptions_divTitle_2, 'div_departmentOptions_id': div_departmentOptions_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 27-Click on div departmentOptions advertisingAndPublicRelations.png')

"Step 28: Click on input organizationalUnit6"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 28-Click on input organizationalUnit6.png')

"Step 29: Enter input value in input organizationalUnit6"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'), input_organizationalUnit6_2)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 29-Enter input value in input organizationalUnit6.png')

"Step 30: Click on button go5"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go5'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 30-Click on button go5.png')

"Step 31: Click on link navigateHome6 -> Navigate to page '/sap/bc/ui2/flp#Shell-home'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_navigateHome5'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 31-Click on link navigateHome6 - Navigate to page sapbcui2flpShell-home.png')

"Step 32: Click on link humanCapitalManagement (humanCapitalManagementDashboard) -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement', ['link_humanCapitalManagement_id': link_humanCapitalManagement_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 32-Click on link humanCapitalManagement humanCapitalManagementDashboard - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 33: Click on div interactiveLineChart12 -> Navigate to page '/sap/bc/ui2/flp#Headcount-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart12'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 33-Click on div interactiveLineChart12 - Navigate to page sapbcui2flpHeadcount-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 34: Click on div employeeName"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeName'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 34-Click on div employeeName.png')

"Step 35: Click on div sortFilterOptions (filter2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortFilterOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortFilterOptions', ['div_sortFilterOptions_id': div_sortFilterOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 35-Click on div sortFilterOptions filter2.png')

"Step 36: Click on input employeeName"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 36-Click on input employeeName.png')

"Step 37: Enter input value in input employeeName"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName'), input_employeeName)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 37-Enter input value in input employeeName.png')

"Step 38: Click on td nameDetails (name)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/td_nameDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/td_nameDetails', ['td_nameDetails_id': td_nameDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 38-Click on td nameDetails name.png')

"Step 39: Click on button confirmationActions (ok5)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 39-Click on button confirmationActions ok5.png')

"Step 40: Click on link back10 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 40-Click on link back10 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 41: Click on div interactiveLineChart13 -> Navigate to page '/sap/bc/ui2/flp#Headcount-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart13'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 41-Click on div interactiveLineChart13 - Navigate to page sapbcui2flpHeadcount-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 42: Click on div employeeName"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeName'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 42-Click on div employeeName.png')

"Step 43: Filter employee details and confirm actions for selected employee."

filterAndConfirmEmployeeDetails.execute(button_confirmationActions_id_1, div_sortAndFilterOptions_id, input_employeeName_1, td_nameDetails_id_1)

"Step 44: Click on span showValueHelp3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_showValueHelp3'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 44-Click on span showValueHelp3.png')

"Step 45: Click on span dateTime"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_dateTime'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 45-Click on span dateTime.png')

"Step 46: Click on button go6"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go6'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 46-Click on button go6.png')

"Step 47: Click on link back10 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 47-Click on link back10 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 48: Click on div interactiveLineChart14 -> Navigate to page '/sap/bc/ui2/flp#Retirementage-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 48-Click on div interactiveLineChart14 - Navigate to page sapbcui2flpRetirementage-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 49: Click on div employeeName2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeName2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 49-Click on div employeeName2.png')

"Step 50: Click on div filter3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_filter3'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 50-Click on div filter3.png')

"Step 51: Click on input employeeName2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 51-Click on input employeeName2.png')

"Step 52: Enter input value in input employeeName2"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName2'), input_employeeName2)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 52-Enter input value in input employeeName2.png')

"Step 53: Click on button confirmationActions (ok6)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 53-Click on button confirmationActions ok6.png')

"Step 54: Click on span showValueHelp4"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_showValueHelp4'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 54-Click on span showValueHelp4.png')

"Step 55: Click on span startingFromDateTime"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_startingFromDateTime'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 55-Click on span startingFromDateTime.png')

"Step 56: Click on button go7"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go7'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 56-Click on button go7.png')

"Step 57: Click on span showValueHelp4"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_showValueHelp4'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 57-Click on span showValueHelp4.png')

"Step 58: Click on button confirmationActions (cancel10)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 58-Click on button confirmationActions cancel10.png')

"Step 59: Click on link back3 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 59-Click on link back3 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 60: Click on div interactiveStackedColumnChart6"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveStackedColumnChart6'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 60-Click on div interactiveStackedColumnChart6.png')

"Step 61: Apply additional filters and confirm actions for employee selection."

applyAdditionalFiltersForEmployee.execute(button_confirmationActions_id_4, div_additionalFilters_id, input_employeeName3)

"Step 62: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 62-Click on div analyticalTable2.png')

"Step 63: Click on link back11 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 63-Click on link back11 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 64: Click on div interactiveStackedColumnChart7 -> Navigate to page '/sap/bc/ui2/flp#Turnover-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveStackedColumnChart6'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 64-Click on div interactiveStackedColumnChart7 - Navigate to page sapbcui2flpTurnover-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 65: Click on td employeeName3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/td_employeeName3'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 65-Click on td employeeName3.png')

"Step 66: Click on div filterOptions (filter4)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_filterOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_filterOptions', ['div_filterOptions_id': div_filterOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 66-Click on div filterOptions filter4.png')

"Step 67: Click on input employeeName3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName3'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 67-Click on input employeeName3.png')

"Step 68: Enter input value in input employeeName3"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName3'), input_employeeName3_1)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 68-Enter input value in input employeeName3.png')

"Step 69: Click on button confirmationActions (ok7)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_5]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 69-Click on button confirmationActions ok7.png')

"Step 70: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 70-Click on div analyticalTable2.png')

"Step 71: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 71-Click on div analyticalTable2.png')

"Step 72: Click on div employeeNameHeader"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeNameHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 72-Click on div employeeNameHeader.png')

"Step 73: Click on div filterOptions (filter5)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_filterOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_filterOptions', ['div_filterOptions_id': div_filterOptions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 73-Click on div filterOptions filter5.png')

"Step 74: Click on div optionItems (dynamicName)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_optionItems"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_optionItems', ['div_optionItems_divTitle': div_optionItems_divTitle, 'div_optionItems_id': div_optionItems_id]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 74-Click on div optionItems dynamicName.png')

"Step 75: Enter input value in input employeeName3"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName3'), input_employeeName3_1)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 75-Enter input value in input employeeName3.png')

"Step 76: Click on button confirmationActions (confirm4)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_6]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 76-Click on button confirmationActions confirm4.png')

"Step 77: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 77-Click on div analyticalTable2.png')

"Step 78: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 78-Click on div analyticalTable2.png')

"Step 79: Click on div employeeNameHeader"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeNameHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 79-Click on div employeeNameHeader.png')

"Step 80: Click on div filterOptions (filter6)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_filterOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_filterOptions', ['div_filterOptions_id': div_filterOptions_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 80-Click on div filterOptions filter6.png')

"Step 81: Click on div optionItems (nameOption)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_optionItems"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_optionItems', ['div_optionItems_divTitle': div_optionItems_divTitle_1, 'div_optionItems_id': div_optionItems_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 81-Click on div optionItems nameOption.png')

"Step 82: Enter input value in input employeeName3"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName3'), input_employeeName3_2)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 82-Enter input value in input employeeName3.png')

"Step 83: Click on button confirmationActions (ok8)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_7]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 83-Click on button confirmationActions ok8.png')

"Step 84: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 84-Click on div analyticalTable2.png')

"Step 85: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 85-Click on div analyticalTable2.png')

"Step 86: Click on bdi employeeName"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/bdi_employeeName'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 86-Click on bdi employeeName.png')

"Step 87: Click on div additionalFilters (filter7)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_additionalFilters"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_additionalFilters', ['div_additionalFilters_id': div_additionalFilters_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 87-Click on div additionalFilters filter7.png')

"Step 88: Click on div optionItems (option)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_optionItems"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_optionItems', ['div_optionItems_divTitle': div_optionItems_divTitle_2, 'div_optionItems_id': div_optionItems_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 88-Click on div optionItems option.png')

"Step 89: Enter input value in input employeeName3"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName3'), input_employeeName3_3)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 89-Enter input value in input employeeName3.png')

"Step 90: Click on button confirmationActions (ok9)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_8]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 90-Click on button confirmationActions ok9.png')

"Step 91: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 91-Click on div analyticalTable2.png')

"Step 92: Click on div employeeNameHeader"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeNameHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 92-Click on div employeeNameHeader.png')

"Step 93: Click on div filterOptions (filter8)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_filterOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_filterOptions', ['div_filterOptions_id': div_filterOptions_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 93-Click on div filterOptions filter8.png')

"Step 94: Click on div optionItems (alexaOption)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_optionItems"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_optionItems', ['div_optionItems_divTitle': div_optionItems_divTitle_3, 'div_optionItems_id': div_optionItems_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 94-Click on div optionItems alexaOption.png')

"Step 95: Enter input value in input employeeName3"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName3'), input_employeeName3_4)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 95-Enter input value in input employeeName3.png')

"Step 96: Click on button confirmationActions (okConfirm)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_9]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 96-Click on button confirmationActions okConfirm.png')

"Step 97: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 97-Click on div analyticalTable2.png')

"Step 98: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 98-Click on div analyticalTable2.png')

"Step 99: Click on span valueHelp"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_valueHelp'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 99-Click on span valueHelp.png')

"Step 100: Click on div yearRecords (tableCellYear)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_yearRecords"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_yearRecords', ['div_yearRecords_id': div_yearRecords_id]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 100-Click on div yearRecords tableCellYear.png')

"Step 101: Click on button go3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go3'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 101-Click on button go3.png')

"Step 102: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 102-Click on div analyticalTable2.png')

"Step 103: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 103-Click on div analyticalTable2.png')

"Step 104: Click on span valueHelp"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_valueHelp'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 104-Click on span valueHelp.png')

"Step 105: Click on td fiscalYearData (fiscalYear)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/td_fiscalYearData"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/td_fiscalYearData', ['td_fiscalYearData_id': td_fiscalYearData_id]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 105-Click on td fiscalYearData fiscalYear.png')

"Step 106: Click on button go3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go3'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 106-Click on button go3.png')

"Step 107: Click on span valueHelp"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_valueHelp'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 107-Click on span valueHelp.png')

"Step 108: Click on div yearRecords (recordYear)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_yearRecords"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_yearRecords', ['div_yearRecords_id': div_yearRecords_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 108-Click on div yearRecords recordYear.png')

"Step 109: Click on button go3 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go3'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 109-Click on button go3 - Navigate to page .png')

"Step 110: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Manage Employee Roles and Confirm Actions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}