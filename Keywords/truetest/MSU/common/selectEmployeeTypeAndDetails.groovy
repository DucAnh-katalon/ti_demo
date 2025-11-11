package truetest.MSU.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectEmployeeTypeAndDetails {
    
    private static def execute(String div_itemSelections_id, String div_itemSelections_id_1, String input_employmentDetails_id, String span_employeeTypeOptions_id, String span_employeeTypeOptions_id_1) {
        
        "Step 1: Click on span employeeTypeOptions"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeTypeOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeTypeOptions', ['span_employeeTypeOptions_id': span_employeeTypeOptions_id]))
        
        "Step 2: Click on div itemSelections"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections', ['div_itemSelections_id': div_itemSelections_id]))
        
        "Step 3: Click on div itemSelections"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_itemSelections', ['div_itemSelections_id': div_itemSelections_id_1]))
        
        "Step 4: Click on input employmentDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_employmentDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/input_employmentDetails', ['input_employmentDetails_id': input_employmentDetails_id]))
        
        "Step 5: Click on span employeeTypeOptions"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeTypeOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_employeeTypeOptions', ['span_employeeTypeOptions_id': span_employeeTypeOptions_id_1]))
    }
}

