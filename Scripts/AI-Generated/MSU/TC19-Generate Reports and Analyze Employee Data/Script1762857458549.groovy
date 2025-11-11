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

"Step 2: Click on list hrPayrollSystem"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/list_hrPayrollSystem'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 2-Click on list hrPayrollSystem.png')

"Step 3: Click on button moreGroups2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_moreGroups2'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 3-Click on button moreGroups2.png')

"Step 4: Click on div actionsReports (reports2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_actionsReports"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_actionsReports', ['div_actionsReports_id': div_actionsReports_id]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 4-Click on div actionsReports reports2.png')

"Step 5: Click on link humanCapitalManagement (humanCapitalManagementAnalytics4) -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_humanCapitalManagement', ['link_humanCapitalManagement_id': link_humanCapitalManagement_id]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 5-Click on link humanCapitalManagement humanCapitalManagementAnalytics4 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 6: Click on div interactiveChart2 -> Navigate to page '/sap/bc/ui2/flp#Retention-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveChart'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 6-Click on div interactiveChart2 - Navigate to page sapbcui2flpRetention-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 7: Click on input organizationalUnit7"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit7'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 7-Click on input organizationalUnit7.png')

"Step 8: Click on input collegeMau"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_collegeMau'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 8-Click on input collegeMau.png')

"Step 9: Click on input organizationalUnit7"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit7'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 9-Click on input organizationalUnit7.png')

"Step 10: Enter input value in input organizationalUnit7"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit7'), input_organizationalUnit7)

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 10-Enter input value in input organizationalUnit7.png')

"Step 11: Press key Shift + Enter on input organizationalUnit7"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit7'), Keys.chord(Keys.ENTER, Keys.SHIFT))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 11-Press key Shift  Enter on input organizationalUnit7.png')

"Step 12: Press key Enter on input organizationalUnit7"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit7'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 12-Press key Enter on input organizationalUnit7.png')

"Step 13: Click on button go10"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go10'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 13-Click on button go10.png')

"Step 14: Click on button settingsMaximize (settings9)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_id': button_settingsMaximize_id, 'button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 14-Click on button settingsMaximize settings9.png')

"Step 15: Click on input viewSettings"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_viewSettings'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 15-Click on input viewSettings.png')

"Step 16: Click on span selectOptions (selectOptions8)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions', ['span_selectOptions_id': span_selectOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 16-Click on span selectOptions selectOptions8.png')

"Step 17: Click on item retainedOptions (retainedOption)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_retainedOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_retainedOptions', ['item_retainedOptions_id': item_retainedOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 17-Click on item retainedOptions retainedOption.png')

"Step 18: Click on span category"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_category'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 18-Click on span category.png')

"Step 19: Click on span category"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_category'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 19-Click on span category.png')

"Step 20: Click on button confirmationActions (ok12)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 20-Click on button confirmationActions ok12.png')

"Step 21: Click on div interactiveColumnChart4"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 21-Click on div interactiveColumnChart4.png')

"Step 22: Click on div interactiveColumnChart4"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 22-Click on div interactiveColumnChart4.png')

"Step 23: Click on div interactiveColumnChart4"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveColumnChart'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 23-Click on div interactiveColumnChart4.png')

"Step 24: Click on link back2 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 24-Click on link back2 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 25: Click on div interactiveChart5 -> Navigate to page '/sap/bc/ui2/flp#Retention-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveChart'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 25-Click on div interactiveChart5 - Navigate to page sapbcui2flpRetention-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 26: Click on input organizationalUnit7"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit7'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 26-Click on input organizationalUnit7.png')

"Step 27: Enter input value in input organizationalUnit7"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit7'), input_organizationalUnit7_1)

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 27-Enter input value in input organizationalUnit7.png')

"Step 28: Press key Enter on input organizationalUnit7"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit7'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 28-Press key Enter on input organizationalUnit7.png')

"Step 29: Click on item viewOptions (tableView2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions', ['item_viewOptions_id': item_viewOptions_id, 'item_viewOptions_internalLabel': item_viewOptions_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 29-Click on item viewOptions tableView2.png')

"Step 30: Click on div employeeNameHeader2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeNameHeader2'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 30-Click on div employeeNameHeader2.png')

"Step 31: Click on button sortByEmployeeNameDescending"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_sortByEmployeeNameDescending'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 31-Click on button sortByEmployeeNameDescending.png')

"Step 32: Click on div departmentOptions (artArtHistoryAndDesign)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions', ['div_departmentOptions_divTitle': div_departmentOptions_divTitle, 'div_departmentOptions_id': div_departmentOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 32-Click on div departmentOptions artArtHistoryAndDesign.png')

"Step 33: Enter input value in input organizationalUnit7"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit7'), input_organizationalUnit7_2)

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 33-Enter input value in input organizationalUnit7.png')

"Step 34: Press key Enter on input organizationalUnit7"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit7'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 34-Press key Enter on input organizationalUnit7.png')

"Step 35: Click on button go10"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go10'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 35-Click on button go10.png')

"Step 36: Click on item viewOptions (chartView2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions', ['item_viewOptions_id': item_viewOptions_id_1, 'item_viewOptions_internalLabel': item_viewOptions_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 36-Click on item viewOptions chartView2.png')

"Step 37: Click on button settings10"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_settings10'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 37-Click on button settings10.png')

"Step 38: Click on span selectOptions (selectOptions9)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_selectOptions', ['span_selectOptions_id': span_selectOptions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 38-Click on span selectOptions selectOptions9.png')

"Step 39: Click on item retainedOptions (retainedOption2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_retainedOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_retainedOptions', ['item_retainedOptions_id': item_retainedOptions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 39-Click on item retainedOptions retainedOption2.png')

"Step 40: Click on button confirmationActions (confirm5)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 40-Click on button confirmationActions confirm5.png')

"Step 41: Click on item viewOptions (tableView2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions', ['item_viewOptions_id': item_viewOptions_id_2, 'item_viewOptions_internalLabel': item_viewOptions_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 41-Click on item viewOptions tableView2.png')

"Step 42: Click on button adaptFilters3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_adaptFilters3'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 42-Click on button adaptFilters3.png')

"Step 43: Click on div selectionOptions (itemSelection14)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions', ['div_selectionOptions_id': div_selectionOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 43-Click on div selectionOptions itemSelection14.png')

"Step 44: Click on button confirmationActions (ok13)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 44-Click on button confirmationActions ok13.png')

"Step 45: Click on span retainedArrow"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_retainedArrow'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 45-Click on span retainedArrow.png')

"Step 46: Click on div itemSelections (itemSelection15)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections', ['div_itemSelections_id': div_itemSelections_id]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 46-Click on div itemSelections itemSelection15.png')

"Step 47: Click on section expandedHeader"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/section_expandedHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 47-Click on section expandedHeader.png')

"Step 48: Click on button go10"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go10'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 48-Click on button go10.png')

"Step 49: Click on div optionNo"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_optionNo'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 49-Click on div optionNo.png')

"Step 50: Click on span retainedArrow"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_retainedArrow'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 50-Click on span retainedArrow.png')

"Step 51: Click on div itemSelections (itemSelection16)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections', ['div_itemSelections_id': div_itemSelections_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 51-Click on div itemSelections itemSelection16.png')

"Step 52: Click on section expandedHeader"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/section_expandedHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 52-Click on section expandedHeader.png')

"Step 53: Click on button go10"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go10'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 53-Click on button go10.png')

"Step 54: Click on div departmentOptions (jamesMadisonCollegeDean)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions', ['div_departmentOptions_divTitle': div_departmentOptions_divTitle_1, 'div_departmentOptions_id': div_departmentOptions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 54-Click on div departmentOptions jamesMadisonCollegeDean.png')

"Step 55: Click on div departmentOptions (jamesMadisonCollegeDean)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions', ['div_departmentOptions_divTitle': div_departmentOptions_divTitle_2, 'div_departmentOptions_id': div_departmentOptions_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 55-Click on div departmentOptions jamesMadisonCollegeDean.png')

"Step 56: Click on input organizationalUnit7"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit7'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 56-Click on input organizationalUnit7.png')

"Step 57: Enter input value in input organizationalUnit7"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit7'), input_organizationalUnit7_3)

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 57-Enter input value in input organizationalUnit7.png')

"Step 58: Press key Enter on input organizationalUnit7"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit7'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 58-Press key Enter on input organizationalUnit7.png')

"Step 59: Click on button go10"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go10'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 59-Click on button go10.png')

"Step 60: Click on link back2 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 60-Click on link back2 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 61: Click on div interactiveLineChart15 -> Navigate to page '/sap/bc/ui2/flp#Headcount-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart15'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 61-Click on div interactiveLineChart15 - Navigate to page sapbcui2flpHeadcount-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-state.png')

"Step 62: Click on div interactiveLineChart16 -> Navigate to page '/sap/bc/ui2/flp#Headcount-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveLineChart15'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 62-Click on div interactiveLineChart16 - Navigate to page sapbcui2flpHeadcount-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 63: Click on button confirmationActions (close3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 63-Click on button confirmationActions close3.png')

"Step 64: Click on input organizationalUnit8"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit8'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 64-Click on input organizationalUnit8.png')

"Step 65: Enter input value in input organizationalUnit8"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit8'), input_organizationalUnit8)

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 65-Enter input value in input organizationalUnit8.png')

"Step 66: Press key Enter on input organizationalUnit8"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit8'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 66-Press key Enter on input organizationalUnit8.png')

"Step 67: Click on item viewOptions (tableView3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions', ['item_viewOptions_id': item_viewOptions_id_3, 'item_viewOptions_internalLabel': item_viewOptions_internalLabel_3]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 67-Click on item viewOptions tableView3.png')

"Step 68: Click on span employeeDetails (nameWithId2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails', ['span_employeeDetails_id': span_employeeDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 68-Click on span employeeDetails nameWithId2.png')

"Step 69: Click on div analyticalTable7"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable7'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 69-Click on div analyticalTable7.png')

"Step 70: Click on div employeeDataReport"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeDataReport'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 70-Click on div employeeDataReport.png')

"Step 71: Click on section expandedHeader2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/section_expandedHeader2'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 71-Click on section expandedHeader2.png')

"Step 72: Click on link back10 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 72-Click on link back10 - Navigate to page sapbcui2flpHcmanalyticreport-analytics.png')

"Step 73: Click on input organizationalDetails (organizationalUnit5)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_organizationalDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_organizationalDetails', ['input_organizationalDetails_internalLabel': input_organizationalDetails_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 73-Click on input organizationalDetails organizationalUnit5.png')

"Step 74: Enter input value in input organizationalDetails (organizationalUnit5)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_organizationalDetails"
WebUI.setText(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_organizationalDetails', ['input_organizationalDetails_internalLabel': input_organizationalDetails_internalLabel_1]), input_organizationalDetails)

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 74-Enter input value in input organizationalDetails organizationalUnit5.png')

"Step 75: Press key Enter on input organizationalUnit9 -> Navigate to page '/sap/bc/ui2/flp#Hcmanalyticreport-analytics&/?sap-iapp-state=*'"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit9'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 75-Press key Enter on input organizationalUnit9 - Navigate to page sapbcui2flpHcmanalyticreport-analyticssap-iapp-state.png')

"Step 76: Click on div interactiveChart6 -> Navigate to page '/sap/bc/ui2/flp#Retention-alp?orgeh=*&p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveChart6'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 76-Click on div interactiveChart6 - Navigate to page sapbcui2flpRetention-alporgehp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 77: Click on item tableView4"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/item_tableView4'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 77-Click on item tableView4.png')

"Step 78: Click on span nameObject"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_nameObject'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 78-Click on span nameObject.png')

"Step 79: Click on div analyticalTable8"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable8'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 79-Click on div analyticalTable8.png')

"Step 80: Click on button settings11"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_settings11'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 80-Click on button settings11.png')

"Step 81: Click on div selectAllOptions (selectAll3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectAllOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectAllOptions', ['div_selectAllOptions_id': div_selectAllOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 81-Click on div selectAllOptions selectAll3.png')

"Step 82: Click on button confirmationActions (ok14)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_4]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 82-Click on button confirmationActions ok14.png')

"Step 83: Click on div analyticalTable8"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable8'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 83-Click on div analyticalTable8.png')

"Step 84: Click on div noDataIndicators (noValue)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_noDataIndicators"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_noDataIndicators', ['div_noDataIndicators_id': div_noDataIndicators_id]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 84-Click on div noDataIndicators noValue.png')

"Step 85: Click on div analyticalTable8"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable8'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 85-Click on div analyticalTable8.png')

"Step 86: Click on span nameObject"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_nameObject'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 86-Click on span nameObject.png')

"Step 87: Click on div analyticalTable8"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable8'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 87-Click on div analyticalTable8.png')

"Step 88: Click on div noDataIndicators (noData)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_noDataIndicators"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_noDataIndicators', ['div_noDataIndicators_id': div_noDataIndicators_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 88-Click on div noDataIndicators noData.png')

"Step 89: Click on div analyticalTable8"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable8'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 89-Click on div analyticalTable8.png')

"Step 90: Click on button settings11"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_settings11'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 90-Click on button settings11.png')

"Step 91: Click on div selectAllOptions (selectAll4)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectAllOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectAllOptions', ['div_selectAllOptions_id': div_selectAllOptions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 91-Click on div selectAllOptions selectAll4.png')

"Step 92: Click on div selectAllOptions (selectAll5)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectAllOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectAllOptions', ['div_selectAllOptions_id': div_selectAllOptions_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 92-Click on div selectAllOptions selectAll5.png')

"Step 93: Click on div selectAllOptions (selectAll6)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectAllOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectAllOptions', ['div_selectAllOptions_id': div_selectAllOptions_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 93-Click on div selectAllOptions selectAll6.png')

"Step 94: Click on button confirmationActions (confirm6)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_5]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 94-Click on button confirmationActions confirm6.png')

"Step 95: Click on div noDataIndicators (object5)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_noDataIndicators"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_noDataIndicators', ['div_noDataIndicators_id': div_noDataIndicators_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 95-Click on div noDataIndicators object5.png')

"Step 96: Click on table employeeRetention"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/table_employeeRetention'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 96-Click on table employeeRetention.png')

"Step 97: Click on button adaptFilters4"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_adaptFilters3'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 97-Click on button adaptFilters4.png')

"Step 98: Click on div selectAllOptions (itemSelection17)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectAllOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectAllOptions', ['div_selectAllOptions_id': div_selectAllOptions_id_4]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 98-Click on div selectAllOptions itemSelection17.png')

"Step 99: Click on button confirmationActions (ok15)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id_6]))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 99-Click on button confirmationActions ok15.png')

"Step 100: Click on span selectOptions10"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_retainedArrow'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 100-Click on span selectOptions10.png')

"Step 101: Click on div itemSelection18"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_itemSelection18'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 101-Click on div itemSelection18.png')

"Step 102: Click on div fiscalYearFilters"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_fiscalYearFilters'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 102-Click on div fiscalYearFilters.png')

"Step 103: Click on button go11 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go11'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 103-Click on button go11 - Navigate to page .png')

"Step 104: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Generate Reports and Analyze Employee Data_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}