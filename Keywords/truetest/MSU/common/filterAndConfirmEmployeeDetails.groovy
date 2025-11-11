package truetest.MSU.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class filterAndConfirmEmployeeDetails {
    
    private static def execute(String button_confirmationActions_id, String div_sortAndFilterOptions_id, String input_employeeName, String td_nameDetails_id) {
        
        "Step 1: Click on div sortAndFilterOptions"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortAndFilterOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_sortAndFilterOptions', ['div_sortAndFilterOptions_id': div_sortAndFilterOptions_id]))
        
        "Step 2: Click on input employeeName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName'))
        
        "Step 3: Enter input value in input employeeName"
        
        WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName'), input_employeeName)
        
        "Step 4: Click on td nameDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/td_nameDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/td_nameDetails', ['td_nameDetails_id': td_nameDetails_id]))
        
        "Step 5: Click on button confirmationActions"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id]))
    }
}

