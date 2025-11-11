import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.MSU.common.approveHrPayrollInboxItems
import truetest.MSU.common.navigateHomeFromHrPayrollInbox
import truetest.MSU.common.processHrPayrollFormsCostRedistributions
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

"Step 2: Click on item workflowTabs (actionsTab)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id]))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on item workflowTabs actionsTab.png')

"Step 3: Follow instructions to process HR payroll forms for a specific employee type."

processHrPayrollFormsCostRedistributions.execute(item_dynamicObject_id, item_dynamicObject_id_1, span_processInstructions_id)

"Step 4: Click on button startEmployeeProcess -> Navigate to page '/sap/bc/ui2/flp#GRADProcesses-Fiori?ObjectKey=*&sap-app-origin-hint=*&sap-ushell-navmode=*&/ObjectId/*/RoleId/HRASRA'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_startEmployeeProcess'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on button startEmployeeProcess - Navigate to page sapbcui2flpGRADProcesses-FioriObjectKeysap-app-origin-hintsap-ushell-navmodeObjectIdRoleIdHRASRA.png')

"Step 5: Click on input jobDetails (amount)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_jobDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_jobDetails', ['input_jobDetails_internalLabel': input_jobDetails_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on input jobDetails amount.png')

"Step 6: Enter input value in input jobDetails (amount)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_jobDetails"
WebUI.setText(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_jobDetails', ['input_jobDetails_internalLabel': input_jobDetails_internalLabel_1]), input_jobDetails)

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Enter input value in input jobDetails amount.png')

"Step 7: Click on button addNewRow"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_addNewRow'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on button addNewRow.png')

"Step 8: Click on input startDate"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_startDate'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on input startDate.png')

"Step 9: Enter input value in input startDate"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_startDate'), input_startDate)

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Enter input value in input startDate.png')

"Step 10: Click on input endDate"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_endDate'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Click on input endDate.png')

"Step 11: Enter input value in input endDate"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_endDate'), input_endDate)

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 11-Enter input value in input endDate.png')

"Step 12: Click on span showValueHelp2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_showValueHelp2'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 12-Click on span showValueHelp2.png')

"Step 13: Click on input orgUnitId"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_orgUnitId'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 13-Click on input orgUnitId.png')

"Step 14: Enter input value in input orgUnitId"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_orgUnitId'), input_orgUnitId)

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 14-Enter input value in input orgUnitId.png')

"Step 15: Click on bdi msgA012731"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/bdi_msgA012731'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 15-Click on bdi msgA012731.png')

"Step 16: Click on button ok2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_ok2'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 16-Click on button ok2.png')

"Step 17: Click on button computeCostDistribution"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_computeCostDistribution'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 17-Click on button computeCostDistribution.png')

"Step 18: Click on span relativesInDepartment"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_relativesInDepartment'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 18-Click on span relativesInDepartment.png')

"Step 19: Click on item dynamicObject (availableValuesOptionNo)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 19-Click on item dynamicObject availableValuesOptionNo.png')

"Step 20: Click on div formRequirements (verifyFormCompletion)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_formRequirements"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_formRequirements', ['div_formRequirements_internalLabel': div_formRequirements_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 20-Click on div formRequirements verifyFormCompletion.png')

"Step 21: Click on div formRequirements (formI9Required)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_formRequirements"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_formRequirements', ['div_formRequirements_internalLabel': div_formRequirements_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 21-Click on div formRequirements formI9Required.png')

"Step 22: Click on span attachmentTypeArrow"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_attachmentTypeArrow'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 22-Click on span attachmentTypeArrow.png')

"Step 23: Click on item dynamicObject (disclosureConsentForm)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 23-Click on item dynamicObject disclosureConsentForm.png')

"Step 24: Click on button upload"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_upload'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 24-Click on button upload.png')

"Step 25: Click on div formRequirements (disclosureConsent)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_formRequirements"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_formRequirements', ['div_formRequirements_internalLabel': div_formRequirements_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 25-Click on div formRequirements disclosureConsent.png')

"Step 26: Click on button send"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_send'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 26-Click on button send.png')

"Step 27: Click on button close2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_close2'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 27-Click on button close2.png')

"Step 28: Click on span attachmentTypeArrow"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_attachmentTypeArrow'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 28-Click on span attachmentTypeArrow.png')

"Step 29: Click on item dynamicObject (offerLetter)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 29-Click on item dynamicObject offerLetter.png')

"Step 30: Click on button upload"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_upload'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 30-Click on button upload.png')

"Step 31: Click on button send"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_send'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 31-Click on button send.png')

"Step 32: Click on button homepage"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_homepage'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 32-Click on button homepage.png')

"Step 33: Navigate to HR payroll inbox and approve items based on effective dates."

approveHrPayrollInboxItems.execute(link_hrFormsReports_id, link_hrFormsReports_internalLabel, link_hrPayrollInbox_id, link_hrPayrollInbox_internalLabel, span_effectiveDates_id)

"Step 34: Return to home from HR payroll inbox and repeat navigation."

navigateHomeFromHrPayrollInbox.execute(link_hrPayrollInbox_id_1, link_hrPayrollInbox_id_1, link_hrPayrollInbox_internalLabel_1, link_hrPayrollInbox_internalLabel_1)

"Step 35: Click on button send2"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_send2'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 35-Click on button send2.png')

"Step 36: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_ok'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 36-Click on button ok.png')

"Step 37: Click on link navigateHome (navigateHome2) -> Navigate to page '/sap/bc/ui2/flp#Shell-home'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_navigateHome'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 37-Click on link navigateHome navigateHome2 - Navigate to page sapbcui2flpShell-home.png')

"Step 38: Click on link hrPayrollInbox (hrFormsWorkflowReport) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox', ['link_hrPayrollInbox_id': link_hrPayrollInbox_id_2, 'link_hrPayrollInbox_internalLabel': link_hrPayrollInbox_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 38-Click on link hrPayrollInbox hrFormsWorkflowReport - Navigate to page .png')

"Step 39: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Process HR Payroll Forms and Approve Items in Inbox_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}