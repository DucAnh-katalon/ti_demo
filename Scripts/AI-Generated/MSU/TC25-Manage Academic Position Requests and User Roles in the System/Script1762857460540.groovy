import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.MSU.common.addNewRowAndInputNetId
import truetest.MSU.common.inputNetIdAndAddNewRows
import truetest.MSU.common.inputRoomSuiteAndEmploymentDetails
import truetest.MSU.common.manageAcademicPositionRequests
import truetest.MSU.common.manageUserRolesAndInputNetId
import truetest.MSU.common.searchAndPostDetailsWithZipCode
import truetest.MSU.common.setMaximumSalaryAndAddRows
import truetest.MSU.common.viewRequestDetailsAndSelectItem
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

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 2-Click on button moreGroups2.png')

"Step 3: Click on item reportActions (actions)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_reportActions"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_reportActions', ['item_reportActions_id': item_reportActions_id]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 3-Click on item reportActions actions.png')

"Step 4: Access academic position requests and input job details."

manageAcademicPositionRequests.execute(input_jobDetails, input_jobDetails_1, input_jobDetails_internalLabel, input_jobDetails_internalLabel_1, input_jobDetails_internalLabel_2, input_jobDetails_internalLabel_3, link_academicPositionRequests_id)

"Step 5: Click on span requestDetails (isOpenRankPosition)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_requestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_requestDetails', ['span_requestDetails_id': span_requestDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 5-Click on span requestDetails isOpenRankPosition.png')

"Step 6: Click on item dynamicObject (availableValues3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 6-Click on item dynamicObject availableValues3.png')

"Step 7: Click on span requestDetails (reasonForRequest)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_requestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_requestDetails', ['span_requestDetails_id': span_requestDetails_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 7-Click on span requestDetails reasonForRequest.png')

"Step 8: Click on span requestDetails (reasonForRequest)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_requestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_requestDetails', ['span_requestDetails_id': span_requestDetails_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 8-Click on span requestDetails reasonForRequest.png')

"Step 9: Click on span requestDetails (reasonForRequest)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_requestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_requestDetails', ['span_requestDetails_id': span_requestDetails_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 9-Click on span requestDetails reasonForRequest.png')

"Step 10: Click on item dynamicObject (newPosition)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 10-Click on item dynamicObject newPosition.png')

"Step 11: Click on span requestDetails (unionPosition)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_requestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_requestDetails', ['span_requestDetails_id': span_requestDetails_id_4]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 11-Click on span requestDetails unionPosition.png')

"Step 12: Click on item dynamicObject (yesOption)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 12-Click on item dynamicObject yesOption.png')

"Step 13: View request details and select dynamic items for processing."

viewRequestDetailsAndSelectItem.execute(item_dynamicObject_id_3, item_dynamicObject_id_1, span_requestDetails_id_5, span_requestDetails_id_1)

"Step 14: Click on span showValueHelp10"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_showValueHelp10'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 14-Click on span showValueHelp10.png')

"Step 15: Click on input locationName"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_locationName'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 15-Click on input locationName.png')

"Step 16: Enter input value in input locationName"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_locationName'), input_locationName)

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 16-Enter input value in input locationName.png')

"Step 17: Press key Enter on input locationName"

WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_locationName'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 17-Press key Enter on input locationName.png')

"Step 18: Click on bdi professionalFields (chemistry)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/bdi_professionalFields"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/bdi_professionalFields', ['bdi_professionalFields_id': bdi_professionalFields_id]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 18-Click on bdi professionalFields chemistry.png')

"Step 19: Input room suite and employment percentage details."

inputRoomSuiteAndEmploymentDetails.execute(input_employmentPercent2, input_roomSuite, span_salaryFormatDetails_id)

"Step 20: Set maximum salary and add new rows for fund chart account."

setMaximumSalaryAndAddRows.execute(input_maximumFtesalary, item_dynamicObject_id_4)

"Step 21: Enter input value in input fundChartAccount"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_fundChartAccount'), input_fundChartAccount)

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 21-Enter input value in input fundChartAccount.png')

"Step 22: Click on input percentage"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_percentage'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 22-Click on input percentage.png')

"Step 23: Enter input value in input percentage"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_percentage'), input_percentage)

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 23-Enter input value in input percentage.png')

"Step 24: Click on button ok33"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_ok33'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 24-Click on button ok33.png')

"Step 25: Click on span searchAndPostingDetails (internalPosting)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_searchAndPostingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_searchAndPostingDetails', ['span_searchAndPostingDetails_id': span_searchAndPostingDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 25-Click on span searchAndPostingDetails internalPosting.png')

"Step 26: Click on item dynamicObject (no)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_5]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 26-Click on item dynamicObject no.png')

"Step 27: Click on input postingBeginDate"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_postingBeginDate'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 27-Click on input postingBeginDate.png')

"Step 28: Click on span searchAndPostingDetails (openUntilFilled)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_searchAndPostingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_searchAndPostingDetails', ['span_searchAndPostingDetails_id': span_searchAndPostingDetails_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 28-Click on span searchAndPostingDetails openUntilFilled.png')

"Step 29: Click on item dynamicObject (noOption)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_6]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 29-Click on item dynamicObject noOption.png')

"Step 30: Click on input closeDate"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_closeDate'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 30-Click on input closeDate.png')

"Step 31: Enter input value in input closeDate"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_closeDate'), input_closeDate)

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 31-Enter input value in input closeDate.png')

"Step 32: Click on span requestDetails (postSalaryPrompt)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_requestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_requestDetails', ['span_requestDetails_id': span_requestDetails_id_6]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 32-Click on span requestDetails postSalaryPrompt.png')

"Step 33: Click on item dynamicObject (yesOption2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_7]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 33-Click on item dynamicObject yesOption2.png')

"Step 34: Click on textarea postingDetails (postingSnapshot)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/textarea_postingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/textarea_postingDetails', ['textarea_postingDetails_id': textarea_postingDetails_id, 'textarea_postingDetails_internalLabel': textarea_postingDetails_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 34-Click on textarea postingDetails postingSnapshot.png')

"Step 35: Enter input value in textarea postingDetails (postingSnapshot)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/textarea_postingDetails"
WebUI.setText(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/textarea_postingDetails', ['textarea_postingDetails_id': textarea_postingDetails_id_1, 'textarea_postingDetails_internalLabel': textarea_postingDetails_internalLabel_1]), textarea_postingDetails)

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 35-Enter input value in textarea postingDetails postingSnapshot.png')

"Step 36: Click on textarea postingDetails (requiredDegreeAreaOfStudy)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/textarea_postingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/textarea_postingDetails', ['textarea_postingDetails_id': textarea_postingDetails_id_2, 'textarea_postingDetails_internalLabel': textarea_postingDetails_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 36-Click on textarea postingDetails requiredDegreeAreaOfStudy.png')

"Step 37: Click on span healthRiskIndicators (physicalDemands)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_healthRiskIndicators"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_healthRiskIndicators', ['span_healthRiskIndicators_id': span_healthRiskIndicators_id]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 37-Click on span healthRiskIndicators physicalDemands.png')

"Step 38: Click on item dynamicObject (noOption2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_8]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 38-Click on item dynamicObject noOption2.png')

"Step 39: Click on span healthRiskIndicators (healthRisks)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_healthRiskIndicators"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_healthRiskIndicators', ['span_healthRiskIndicators_id': span_healthRiskIndicators_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 39-Click on span healthRiskIndicators healthRisks.png')

"Step 40: Click on item dynamicObject (noOption3)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_9]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 40-Click on item dynamicObject noOption3.png')

"Step 41: Click on span remoteFriendly"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_remoteFriendly'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 41-Click on span remoteFriendly.png')

"Step 42: Click on span remoteFriendly"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_remoteFriendly'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 42-Click on span remoteFriendly.png')

"Step 43: Click on span remoteFriendly"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_remoteFriendly'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 43-Click on span remoteFriendly.png')

"Step 44: Click on item dynamicObject (no2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_10]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 44-Click on item dynamicObject no2.png')

"Step 45: Click on div richTextEditor"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_richTextEditor'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 45-Click on div richTextEditor.png')

"Step 46: Click on button addNewRows (addNewRow2)"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_addNewRows'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 46-Click on button addNewRows addNewRow2.png')

"Step 47: Click on span userRoles (userType)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_userRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_userRoles', ['span_userRoles_id': span_userRoles_id]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 47-Click on span userRoles userType.png')

"Step 48: Click on item dynamicObject (msuEmployee)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_11]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 48-Click on item dynamicObject msuEmployee.png')

"Step 49: Input net ID and add new rows for processing."

inputNetIdAndAddNewRows.execute(input_netId)

"Step 50: Manage user roles and input Net ID for user access."

manageUserRolesAndInputNetId.execute(input_netId_1, item_dynamicObject_id_12, span_userRoles_id_1)

"Step 51: Add a new row and input Net ID for data entry."

addNewRowAndInputNetId.execute(input_netId2)

"Step 52: Click on span role"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_role'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 52-Click on span role.png')

"Step 53: Search and post details using the provided zip code."

searchAndPostDetailsWithZipCode.execute(item_dynamicObject_id_13, item_dynamicObject_id_1_1, span_searchAndPostingDetails_id_2)

"Step 54: Enter input value in input zipCode"

WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_zipCode'), input_zipCode)

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 54-Enter input value in input zipCode.png')

"Step 55: Click on span workTypeDetails (workType)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_workTypeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_workTypeDetails', ['span_workTypeDetails_id': span_workTypeDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 55-Click on span workTypeDetails workType.png')

"Step 56: Click on item dynamicObject (notApplicable)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_14]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 56-Click on item dynamicObject notApplicable.png')

"Step 57: Click on span salaryFormatDetails (workType2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_salaryFormatDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_salaryFormatDetails', ['span_salaryFormatDetails_id': span_salaryFormatDetails_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 57-Click on span salaryFormatDetails workType2.png')

"Step 58: Click on item dynamicObject (applicationDetail)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_15]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 58-Click on item dynamicObject applicationDetail.png')

"Step 59: Click on span workTypeDetails (workType)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_workTypeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_workTypeDetails', ['span_workTypeDetails_id': span_workTypeDetails_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 59-Click on span workTypeDetails workType.png')

"Step 60: Click on item dynamicObject (tenuredTrack)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_16]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 60-Click on item dynamicObject tenuredTrack.png')

"Step 61: Click on span workTypeDetails (category2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_workTypeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_workTypeDetails', ['span_workTypeDetails_id': span_workTypeDetails_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 61-Click on span workTypeDetails category2.png')

"Step 62: Click on item dynamicObject (object)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_17]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 62-Click on item dynamicObject object.png')

"Step 63: Click on span workTypeDetails (category2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_workTypeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_workTypeDetails', ['span_workTypeDetails_id': span_workTypeDetails_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 63-Click on span workTypeDetails category2.png')

"Step 64: Click on item dynamicObject (academicAffairs)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_18]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 64-Click on item dynamicObject academicAffairs.png')

"Step 65: Click on span workTypeDetails (subCategory)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_workTypeDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_workTypeDetails', ['span_workTypeDetails_id': span_workTypeDetails_id_4]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 65-Click on span workTypeDetails subCategory.png')

"Step 66: Click on item dynamicObject (instructionalDesign)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_19]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 66-Click on item dynamicObject instructionalDesign.png')

"Step 67: Click on span subCategoryDetails (category3)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_subCategoryDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_subCategoryDetails', ['span_subCategoryDetails_id': span_subCategoryDetails_id]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 67-Click on span subCategoryDetails category3.png')

"Step 68: Click on item dynamicObject (academicFaculty)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_20]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 68-Click on item dynamicObject academicFaculty.png')

"Step 69: Click on span subCategoryDetails (subCategory2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_subCategoryDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_subCategoryDetails', ['span_subCategoryDetails_id': span_subCategoryDetails_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 69-Click on span subCategoryDetails subCategory2.png')

"Step 70: Click on item dynamicObject (academicFaculty2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_21]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 70-Click on item dynamicObject academicFaculty2.png')

"Step 71: Click on button addNewRows (addNewRow3)"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_addNewRows'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 71-Click on button addNewRows addNewRow3.png')

"Step 72: Click on span showValueHelp11"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_showValueHelp11'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 72-Click on span showValueHelp11.png')

"Step 73: Click on button go13"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_go13'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 73-Click on button go13.png')

"Step 74: Click on bdi professionalFields (administrativeBusinessProfessional)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/bdi_professionalFields"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/bdi_professionalFields', ['bdi_professionalFields_id': bdi_professionalFields_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 74-Click on bdi professionalFields administrativeBusinessProfessional.png')

"Step 75: Click on button ok33"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_ok33'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 75-Click on button ok33.png')

"Step 76: Click on button send3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_send3'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 76-Click on button send3.png')

"Step 77: Click on span formMessages (successMessage)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_formMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_formMessages', ['span_formMessages_id': span_formMessages_id]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 77-Click on span formMessages successMessage.png')

"Step 78: Click on button goToInbox -> Navigate to page '/sap/bc/ui2/flp#HRPayrollInbox-update&/detail/LOCAL BWF/*/TaskCollection(*)'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_goToInbox'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 78-Click on button goToInbox - Navigate to page sapbcui2flpHRPayrollInbox-updatedetailLOCAL BWFTaskCollection.png')

"Step 79: Click on div hrPayrollInbox"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_hrPayrollInbox'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 79-Click on div hrPayrollInbox.png')

"Step 80: Click on item listItemActiveHome -> Navigate to page '/sap/bc/ui2/flp#Shell-home'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/item_listItemActiveHome'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 80-Click on item listItemActiveHome - Navigate to page sapbcui2flpShell-home.png')

"Step 81: Click on item workflowTabs (myApprovalsWorkflow4)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 81-Click on item workflowTabs myApprovalsWorkflow4.png')

"Step 82: Click on link hrFormsReports (hrFormsReport) -> Navigate to page '/sap/bc/ui2/flp#HRFormsWorkflowReport-read&/*'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrFormsReports"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrFormsReports', ['link_hrFormsReports_id': link_hrFormsReports_id, 'link_hrFormsReports_internalLabel': link_hrFormsReports_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 82-Click on link hrFormsReports hrFormsReport - Navigate to page sapbcui2flpHRFormsWorkflowReport-read.png')

"Step 83: Click on link back16 -> Navigate to page '/sap/bc/ui2/flp#Shell-home'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 83-Click on link back16 - Navigate to page sapbcui2flpShell-home.png')

"Step 84: Click on list holidayCalendar"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/list_holidayCalendar'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 84-Click on list holidayCalendar.png')

"Step 85: Click on div dashboardGroups2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_dashboardGroups'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 85-Click on div dashboardGroups2.png')

"Step 86: Click on link hrFormsReports (hrFormsWorkflowReport3) -> Navigate to page '/sap/bc/ui2/flp#HRFormsWorkflowReport-read&/*'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrFormsReports"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrFormsReports', ['link_hrFormsReports_id': link_hrFormsReports_id_1, 'link_hrFormsReports_internalLabel': link_hrFormsReports_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 86-Click on link hrFormsReports hrFormsWorkflowReport3 - Navigate to page sapbcui2flpHRFormsWorkflowReport-read.png')

"Step 87: Click on link back16 -> Navigate to page '/sap/bc/ui2/flp#Shell-home'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_back'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 87-Click on link back16 - Navigate to page sapbcui2flpShell-home.png')

"Step 88: Click on list holidayCalendar"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/list_holidayCalendar'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 88-Click on list holidayCalendar.png')

"Step 89: Click on list holidayCalendar"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/list_holidayCalendar'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 89-Click on list holidayCalendar.png')

"Step 90: Click on button ok34"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_ok34'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 90-Click on button ok34.png')

"Step 91: Click on item workflowTabs (actions2)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 91-Click on item workflowTabs actions2.png')

"Step 92: Click on link academicPositionRequests (academicPositionRequest) -> Navigate to page '/sap/bc/ui2/flp#AcademicPosition-Fiori?ObjectKey=*&sap-app-origin-hint=*&sap-ushell-navmode=*&/ObjectId/*/RoleId/HRASRA'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_academicPositionRequests"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_academicPositionRequests', ['link_academicPositionRequests_id': link_academicPositionRequests_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 92-Click on link academicPositionRequests academicPositionRequest - Navigate to page sapbcui2flpAcademicPosition-FioriObjectKeysap-app-origin-hintsap-ushell-navmodeObjectIdRoleIdHRASRA.png')

"Step 93: Click on button send3"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_send3'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 93-Click on button send3.png')

"Step 94: Click on span position"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_position'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 94-Click on span position.png')

"Step 95: Click on span formMessages (successMessage2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_formMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_formMessages', ['span_formMessages_id': span_formMessages_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 95-Click on span formMessages successMessage2.png')

"Step 96: Click on span formMessages (successMessage2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_formMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_formMessages', ['span_formMessages_id': span_formMessages_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 96-Click on span formMessages successMessage2.png')

"Step 97: Click on span formMessages (successMessage2)"

// // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_formMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_formMessages', ['span_formMessages_id': span_formMessages_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 97-Click on span formMessages successMessage2.png')

"Step 98: Click on button goToInbox -> Navigate to page '/sap/bc/ui2/flp#HRPayrollInbox-update&/detail/LOCAL BWF/*/TaskCollection(*)'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_goToInbox'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 98-Click on button goToInbox - Navigate to page sapbcui2flpHRPayrollInbox-updatedetailLOCAL BWFTaskCollection.png')

"Step 99: Click on div search2"

// WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_search2'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 99-Click on div search2.png')

"Step 100: Click on div hrPayrollInbox"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_hrPayrollInbox'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 100-Click on div hrPayrollInbox.png')

"Step 101: Click on item listItemActiveHome2 -> Navigate to page '/sap/bc/ui2/flp#Shell-home'"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/item_listItemActiveHome2'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 101-Click on item listItemActiveHome2 - Navigate to page sapbcui2flpShell-home.png')

"Step 102: Click on item workflowTabs (myApprovalsWorkflow4)"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_workflowTabs', ['item_workflowTabs_id': item_workflowTabs_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 102-Click on item workflowTabs myApprovalsWorkflow4.png')

"Step 103: Click on link hrFormsReports (hrFormsWorkflowReport3) -> Navigate to page '/sap/bc/ui2/flp#HRFormsWorkflowReport-read&/*'"

// Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrFormsReports"
WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrFormsReports', ['link_hrFormsReports_id': link_hrFormsReports_id_2, 'link_hrFormsReports_internalLabel': link_hrFormsReports_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 103-Click on link hrFormsReports hrFormsWorkflowReport3 - Navigate to page sapbcui2flpHRFormsWorkflowReport-read.png')

"Step 104: Click on span profile -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_profile'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 104-Click on span profile - Navigate to page .png')

"Step 105: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC25-Manage Academic Position Requests and User Roles in the System_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}