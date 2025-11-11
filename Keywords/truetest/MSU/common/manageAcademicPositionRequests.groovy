package truetest.MSU.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class manageAcademicPositionRequests {
    
    private static def execute(String input_jobDetails, String input_jobDetails_1, String input_jobDetails_internalLabel, String input_jobDetails_internalLabel_1, String input_jobDetails_internalLabel_2, String input_jobDetails_internalLabel_3, String link_academicPositionRequests_id) {
        
        "Step 1: Click on link academicPositionRequests -> Navigate to page '/sap/bc/ui2/flp#AcademicPosition-Fiori?ObjectKey=*&sap-app-origin-hint=*&sap-ushell-navmode=*&/ObjectId/*/RoleId/HRASRA'"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_academicPositionRequests"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_academicPositionRequests', ['link_academicPositionRequests_id': link_academicPositionRequests_id]))
        
        "Step 2: Click on input jobDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_jobDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_jobDetails', ['input_jobDetails_internalLabel': input_jobDetails_internalLabel]))
        
        "Step 3: Enter input value in input jobDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_jobDetails"
        WebUI.setText(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_jobDetails', ['input_jobDetails_internalLabel': input_jobDetails_internalLabel_1]), input_jobDetails)
        
        "Step 4: Click on input jobDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_jobDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_jobDetails', ['input_jobDetails_internalLabel': input_jobDetails_internalLabel_2]))
        
        "Step 5: Enter input value in input jobDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_jobDetails"
        WebUI.setText(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_jobDetails', ['input_jobDetails_internalLabel': input_jobDetails_internalLabel_3]), input_jobDetails_1)
    }
}

