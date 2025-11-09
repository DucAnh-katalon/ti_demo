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

"Step 1: Navigate to /sap/bc/ui2/flp/FioriLaunchpad.html#FioriForms-Start&/ObjectId/*/RoleId/HRASRA with params (sap-ui-xx-componentPreload)"

TrueTestScripts.navigate("sap/bc/ui2/flp/FioriLaunchpad.html#FioriForms-Start&/ObjectId/${ObjectId_id}/RoleId/HRASRA?sap-ui-xx-componentPreload=${HRASRA_sap_ui_xx_componentPreload}")

"Step 2: Click on textarea addComment"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/textarea_addComment'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 2-Click on textarea addComment.png')

"Step 3: Click on textarea addComment"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/textarea_addComment'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Click on textarea addComment.png')

"Step 4: Enter input value in textarea addComment"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/textarea_addComment'), textarea_addComment)

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Enter input value in textarea addComment.png')

"Step 5: Click on link navigateHome -> Navigate to page '/sap/bc/ui2/flp/FioriLaunchpad.html#Shell-home'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/link_navigateHome'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on link navigateHome - Navigate to page sapbcui2flpFioriLaunchpadhtmlShell-home.png')

"Step 6: Click on input search"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/input_search'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on input search.png')

"Step 7: Click on input search"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/input_search'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on input search.png')

"Step 8: Click on input search"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/input_search'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Click on input search.png')

"Step 9: Click on body homePage"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/body_homePage'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Click on body homePage.png')

"Step 10: Click on item actionsTab"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/item_actionsTab'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 10-Click on item actionsTab.png')

"Step 11: Click on link hrPayrollForms -> Navigate to page '/sap/bc/ui2/flp/FioriLaunchpad.html#HRPayrollFormsCostRedistribute-update'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/link_hrPayrollForms'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 11-Click on link hrPayrollForms - Navigate to page sapbcui2flpFioriLaunchpadhtmlHRPayrollFormsCostRedistribute-update.png')

"Step 12: Click on span processSelection (chooseProcess)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp_FioriLaunchpad_html/span_processSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp_FioriLaunchpad_html/span_processSelection', ['span_processSelection_id': span_processSelection_id]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 12-Click on span processSelection chooseProcess.png')

"Step 13: Click on item createNewAppointment"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/item_createNewAppointment'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 13-Click on item createNewAppointment.png')

"Step 14: Click on span processSelection (employeeType)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp_FioriLaunchpad_html/span_processSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp_FioriLaunchpad_html/span_processSelection', ['span_processSelection_id': span_processSelection_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 14-Click on span processSelection employeeType.png')

"Step 15: Click on div container"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/div_container'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 15-Click on div container.png')

"Step 16: Click on input search2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/input_search'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 16-Click on input search2.png')

"Step 17: Enter input value in input search2"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/input_search'), input_search2)

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 17-Enter input value in input search2.png')

"Step 18: Click on span remoteWorkAgreement -> Navigate to page '/sap/bc/ui2/flp/FioriLaunchpad.html#remoteworkagreement-create?&/ObjectId/ZHPAP WORK LOCATION/RoleId/HRASRA'"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/span_remoteWorkAgreement'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 18-Click on span remoteWorkAgreement - Navigate to page sapbcui2flpFioriLaunchpadhtmlremoteworkagreement-createObjectIdZHPAP WORK LOCATIONRoleIdHRASRA.png')

"Step 19: Click on button saveDraft"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/button_saveDraft'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 19-Click on button saveDraft.png')

"Step 20: Click on button homepage -> Navigate to page '/sap/bc/ui2/flp#Shell-home'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp_FioriLaunchpad_html/button_homepage'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 20-Click on button homepage - Navigate to page sapbcui2flpShell-home.png')

"Step 21: Click on div dashboardGroups"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_dashboardGroups'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 21-Click on div dashboardGroups.png')

"Step 22: Click on item workflowTabs (myApprovalsWorkflow2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 22-Click on item workflowTabs myApprovalsWorkflow2.png')

"Step 23: Click on link hrPayrollInbox (hrPayrollInbox) -> Navigate to page '/sap/bc/ui2/flp#HRPayrollInbox-update&/detail/LOCAL BWF/*/TaskCollection(*)'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox', ['link_hrPayrollInbox_id': link_hrPayrollInbox_id, 'link_hrPayrollInbox_internalLabel': link_hrPayrollInbox_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 23-Click on link hrPayrollInbox hrPayrollInbox - Navigate to page sapbcui2flpHRPayrollInbox-updatedetailLOCAL BWFTaskCollection.png')

"Step 24: Click on button draftActions (saveDraft)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_draftActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_draftActions', ['button_draftActions_internalLabel': button_draftActions_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 24-Click on button draftActions saveDraft.png')

"Step 25: Click on span effectiveDates (effectiveDate)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_effectiveDates"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_effectiveDates', ['span_effectiveDates_id': span_effectiveDates_id]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 25-Click on span effectiveDates effectiveDate.png')

"Step 26: Click on span draftRemoteWorkAgreements (draftRemoteWorkAgreement)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements', ['span_draftRemoteWorkAgreements_id': span_draftRemoteWorkAgreements_id]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 26-Click on span draftRemoteWorkAgreements draftRemoteWorkAgreement.png')

"Step 27: Click on button draftActions (saveDraft)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_draftActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_draftActions', ['button_draftActions_internalLabel': button_draftActions_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 27-Click on button draftActions saveDraft.png')

"Step 28: Click on div effectiveDate"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_effectiveDate'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 28-Click on div effectiveDate.png')

"Step 29: Click on span draftRemoteWorkAgreements (draftRemoteWorkAgreement2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements', ['span_draftRemoteWorkAgreements_id': span_draftRemoteWorkAgreements_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 29-Click on span draftRemoteWorkAgreements draftRemoteWorkAgreement2.png')

"Step 30: Click on span draftRemoteWorkAgreements (effectiveDate2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements', ['span_draftRemoteWorkAgreements_id': span_draftRemoteWorkAgreements_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 30-Click on span draftRemoteWorkAgreements effectiveDate2.png')

"Step 31: Click on div note"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_note'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 31-Click on div note.png')

"Step 32: Click on span draftRemoteWorkAgreements (draftRemoteWorkAgreement2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements', ['span_draftRemoteWorkAgreements_id': span_draftRemoteWorkAgreements_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 32-Click on span draftRemoteWorkAgreements draftRemoteWorkAgreement2.png')

"Step 33: Click on span draftRemoteWorkAgreements (effectiveDate2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements', ['span_draftRemoteWorkAgreements_id': span_draftRemoteWorkAgreements_id_4]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 33-Click on span draftRemoteWorkAgreements effectiveDate2.png')

"Step 34: Click on span draftRemoteWorkAgreements (draftRemoteWorkAgreement2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements', ['span_draftRemoteWorkAgreements_id': span_draftRemoteWorkAgreements_id_5]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 34-Click on span draftRemoteWorkAgreements draftRemoteWorkAgreement2.png')

"Step 35: Click on div countryAddressForm"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_countryAddressForm'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 35-Click on div countryAddressForm.png')

"Step 36: Click on span draftRemoteWorkAgreements (effectiveDate2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements', ['span_draftRemoteWorkAgreements_id': span_draftRemoteWorkAgreements_id_6]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 36-Click on span draftRemoteWorkAgreements effectiveDate2.png')

"Step 37: Click on span draftRemoteWorkAgreements (draftRemoteWorkAgreement2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements', ['span_draftRemoteWorkAgreements_id': span_draftRemoteWorkAgreements_id_7]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 37-Click on span draftRemoteWorkAgreements draftRemoteWorkAgreement2.png')

"Step 38: Click on button close"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_close'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 38-Click on button close.png')

"Step 39: Click on span effectiveDates (effectiveDate)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_effectiveDates"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_effectiveDates', ['span_effectiveDates_id': span_effectiveDates_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 39-Click on span effectiveDates effectiveDate.png')

"Step 40: Click on span draftRemoteWorkAgreements (draftRemoteWorkAgreement2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_draftRemoteWorkAgreements', ['span_draftRemoteWorkAgreements_id': span_draftRemoteWorkAgreements_id_8]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 40-Click on span draftRemoteWorkAgreements draftRemoteWorkAgreement2.png')

"Step 41: Click on button draftActions (deleteDraft)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_draftActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_draftActions', ['button_draftActions_internalLabel': button_draftActions_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 41-Click on button draftActions deleteDraft.png')

"Step 42: Click on div object2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 42-Click on div object2.png')

"Step 43: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_ok'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 43-Click on button ok.png')

"Step 44: Click on span effectiveDates (effectiveDate3)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_effectiveDates"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_effectiveDates', ['span_effectiveDates_id': span_effectiveDates_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 44-Click on span effectiveDates effectiveDate3.png')

"Step 45: Click on div search"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_search'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 45-Click on div search.png')

"Step 46: Click on section reservedInfo"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/section_reservedInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 46-Click on section reservedInfo.png')

"Step 47: Click on link navigateHome (navigateHome) -> Navigate to page '/sap/bc/ui2/flp#Shell-home'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_navigateHome'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 47-Click on link navigateHome navigateHome - Navigate to page sapbcui2flpShell-home.png')

"Step 48: Click on item workflowTabs (myApprovalsWorkflow3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 48-Click on item workflowTabs myApprovalsWorkflow3.png')

"Step 49: Click on link hrPayrollInbox (hrPayrollInbox2) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox', ['link_hrPayrollInbox_id': link_hrPayrollInbox_id_1, 'link_hrPayrollInbox_internalLabel': link_hrPayrollInbox_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 49-Click on link hrPayrollInbox hrPayrollInbox2 - Navigate to page .png')

"Step 50: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Create and Manage Remote Work Agreements in HR Payroll_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}