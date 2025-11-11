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

"Step 1: Navigate to /sap/bc/ui2/flp#Hcmanalyticreport-analytics"

TrueTestScripts.navigate("sap/bc/ui2/flp#Hcmanalyticreport-analytics")

"Step 2: Click on div headcountData"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_headcountData'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Click on div headcountData.png')

"Step 3: Click on div analyticsContent3"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_headcountData'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on div analyticsContent3.png')

"Step 4: Click on div interactiveStackedColumnChart -> Navigate to page '/sap/bc/ui2/flp#Turnover-alp?p FromYear=*&p ToYear=*&recordYear=*&sap-app-origin-hint=*&sap-ushell-navmode=*&sap-xapp-state=*&/?sap-iapp-state--history=*&sap-iapp-state=*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_interactiveStackedColumnChart'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Click on div interactiveStackedColumnChart - Navigate to page sapbcui2flpTurnover-alpp FromYearp ToYearrecordYearsap-app-origin-hintsap-ushell-navmodesap-xapp-statesap-iapp-state--historysap-iapp-state.png')

"Step 5: Click on button settingsMaximize (settings8)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_settingsMaximize', ['button_settingsMaximize_id': button_settingsMaximize_id, 'button_settingsMaximize_internalLabel': button_settingsMaximize_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on button settingsMaximize settings8.png')

"Step 6: Click on div chartHeader"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_chartHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Click on div chartHeader.png')

"Step 7: Click on div footerActions"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_footerActions'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Click on div footerActions.png')

"Step 8: Click on button cancelActions (cancel9)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_cancelActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_cancelActions', ['button_cancelActions_id': button_cancelActions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Click on button cancelActions cancel9.png')

"Step 9: Click on button adaptFilters2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_adaptFilters2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Click on button adaptFilters2.png')

"Step 10: Click on div selectionOptions (itemSelection7)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions', ['div_selectionOptions_id': div_selectionOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 10-Click on div selectionOptions itemSelection7.png')

"Step 11: Click on div selectionOptions (itemSelection8)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_selectionOptions', ['div_selectionOptions_id': div_selectionOptions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 11-Click on div selectionOptions itemSelection8.png')

"Step 12: Click on button confirmationActions (confirm3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 12-Click on button confirmationActions confirm3.png')

"Step 13: Click on span selectOptions6"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_selectOptions6'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 13-Click on span selectOptions6.png')

"Step 14: Click on div itemSelectionDetails (itemSelection9)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelectionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelectionDetails', ['div_itemSelectionDetails_id': div_itemSelectionDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 14-Click on div itemSelectionDetails itemSelection9.png')

"Step 15: Click on button go3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go3'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 15-Click on button go3.png')

"Step 16: Click on div terminatedVsRetired"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_terminatedVsRetired'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 16-Click on div terminatedVsRetired.png')

"Step 17: Click on div terminatedVsRetired"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_terminatedVsRetired'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 17-Click on div terminatedVsRetired.png')

"Step 18: Click on div employeeDetails5"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeDetails5'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 18-Click on div employeeDetails5.png')

"Step 19: Click on span employeeDetails (namePhone2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails', ['span_employeeDetails_id': span_employeeDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 19-Click on span employeeDetails namePhone2.png')

"Step 20: Click on span employeeDetails (humanResources)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails', ['span_employeeDetails_id': span_employeeDetails_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 20-Click on span employeeDetails humanResources.png')

"Step 21: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 21-Click on div analyticalTable2.png')

"Step 22: Click on button openMenu3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_openMenu3'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 22-Click on button openMenu3.png')

"Step 23: Click on item exportAs3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/item_exportAs3'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 23-Click on item exportAs3.png')

"Step 24: Click on div splitCellsCheckbox3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_splitCellsCheckbox3'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 24-Click on div splitCellsCheckbox3.png')

"Step 25: Click on button export3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_export3'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 25-Click on button export3.png')

"Step 26: Click on input organizationalUnit4"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 26-Click on input organizationalUnit4.png')

"Step 27: Enter input value in input organizationalUnit4"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'), input_organizationalUnit4)

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 27-Enter input value in input organizationalUnit4.png')

"Step 28: Press key Enter on input organizationalUnit4"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 28-Press key Enter on input organizationalUnit4.png')

"Step 29: Click on button go3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go3'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 29-Click on button go3.png')

"Step 30: Click on item viewOptions (tableView)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions', ['item_viewOptions_id': item_viewOptions_id, 'item_viewOptions_internalLabel': item_viewOptions_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 30-Click on item viewOptions tableView.png')

"Step 31: Click on span employeeDetails (nameWithId)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails', ['span_employeeDetails_id': span_employeeDetails_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 31-Click on span employeeDetails nameWithId.png')

"Step 32: Click on span employeeDetails (serviceMaintenance)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails', ['span_employeeDetails_id': span_employeeDetails_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 32-Click on span employeeDetails serviceMaintenance.png')

"Step 33: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 33-Click on div analyticalTable2.png')

"Step 34: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 34-Click on div analyticalTable2.png')

"Step 35: Click on div departmentOptions (culinaryServicesDiningOperations)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions', ['div_departmentOptions_divTitle': div_departmentOptions_divTitle, 'div_departmentOptions_id': div_departmentOptions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 35-Click on div departmentOptions culinaryServicesDiningOperations.png')

"Step 36: Enter input value in input organizationalUnit4"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'), input_organizationalUnit4_1)

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 36-Enter input value in input organizationalUnit4.png')

"Step 37: Press key Enter on input organizationalUnit4"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 37-Press key Enter on input organizationalUnit4.png')

"Step 38: Click on button go3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go3'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 38-Click on button go3.png')

"Step 39: Click on span employeeDetails (employeeName)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeDetails', ['span_employeeDetails_id': span_employeeDetails_id_4]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 39-Click on span employeeDetails employeeName.png')

"Step 40: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 40-Click on div analyticalTable2.png')

"Step 41: Click on div departmentOptions (rehsFacilities)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions', ['div_departmentOptions_divTitle': div_departmentOptions_divTitle_1, 'div_departmentOptions_id': div_departmentOptions_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 41-Click on div departmentOptions rehsFacilities.png')

"Step 42: Enter input value in input organizationalUnit4"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'), input_organizationalUnit4_2)

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 42-Enter input value in input organizationalUnit4.png')

"Step 43: Press key Enter on input organizationalUnit4"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 43-Press key Enter on input organizationalUnit4.png')

"Step 44: Click on button go3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go3'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 44-Click on button go3.png')

"Step 45: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 45-Click on div analyticalTable2.png')

"Step 46: Click on div namePhone"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_namePhone'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 46-Click on div namePhone.png')

"Step 47: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 47-Click on div analyticalTable2.png')

"Step 48: Click on div departmentOptions (culinaryServices)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions', ['div_departmentOptions_divTitle': div_departmentOptions_divTitle_2, 'div_departmentOptions_id': div_departmentOptions_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 48-Click on div departmentOptions culinaryServices.png')

"Step 49: Enter input value in input organizationalUnit4"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'), input_organizationalUnit4_3)

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 49-Enter input value in input organizationalUnit4.png')

"Step 50: Click on button go3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go3'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 50-Click on button go3.png')

"Step 51: Click on td employeeDetails (employeeGroup)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/td_employeeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/td_employeeDetails', ['td_employeeDetails_id': td_employeeDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 51-Click on td employeeDetails employeeGroup.png')

"Step 52: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 52-Click on div analyticalTable2.png')

"Step 53: Click on td employeeDetails (employeeName2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/td_employeeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/td_employeeDetails', ['td_employeeDetails_id': td_employeeDetails_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 53-Click on td employeeDetails employeeName2.png')

"Step 54: Click on div departmentOptions (familyMedicine)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions', ['div_departmentOptions_divTitle': div_departmentOptions_divTitle_3, 'div_departmentOptions_id': div_departmentOptions_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 54-Click on div departmentOptions familyMedicine.png')

"Step 55: Enter input value in input organizationalUnit4"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'), input_organizationalUnit4_4)

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 55-Enter input value in input organizationalUnit4.png')

"Step 56: Press key Enter on input organizationalUnit4"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 56-Press key Enter on input organizationalUnit4.png')

"Step 57: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 57-Click on div analyticalTable2.png')

"Step 58: Click on div departmentOptions (familyAndCommunityMedicine)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_departmentOptions', ['div_departmentOptions_divTitle': div_departmentOptions_divTitle_4, 'div_departmentOptions_id': div_departmentOptions_id_4]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 58-Click on div departmentOptions familyAndCommunityMedicine.png')

"Step 59: Enter input value in input organizationalUnit4"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'), input_organizationalUnit4_5)

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 59-Enter input value in input organizationalUnit4.png')

"Step 60: Press key Enter on input organizationalUnit4"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_organizationalUnit4'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 60-Press key Enter on input organizationalUnit4.png')

"Step 61: Click on div analyticalTable2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_analyticalTable2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 61-Click on div analyticalTable2.png')

"Step 62: Click on item viewOptions (chartView)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions', ['item_viewOptions_id': item_viewOptions_id_1, 'item_viewOptions_internalLabel': item_viewOptions_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 62-Click on item viewOptions chartView.png')

"Step 63: Click on item viewOptions (tableView)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_viewOptions', ['item_viewOptions_id': item_viewOptions_id_2, 'item_viewOptions_internalLabel': item_viewOptions_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 63-Click on item viewOptions tableView.png')

"Step 64: Click on span valueHelp"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_valueHelp'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 64-Click on span valueHelp.png')

"Step 65: Click on span startingFromDate"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_startingFromDate'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 65-Click on span startingFromDate.png')

"Step 66: Click on button go3 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go3'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 66-Click on button go3 - Navigate to page .png')

"Step 67: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Analyze Headcount Data and Export Employee Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}