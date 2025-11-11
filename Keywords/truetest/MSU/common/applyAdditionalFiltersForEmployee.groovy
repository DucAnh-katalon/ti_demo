package truetest.MSU.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class applyAdditionalFiltersForEmployee {
    
    private static def execute(String button_confirmationActions_id, String div_additionalFilters_id, String input_employeeName3) {
        
        "Step 1: Click on div employeeNameHeader"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_employeeNameHeader'))
        
        "Step 2: Click on div additionalFilters"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_additionalFilters"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/div_additionalFilters', ['div_additionalFilters_id': div_additionalFilters_id]))
        
        "Step 3: Click on input employeeName3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName3'))
        
        "Step 4: Enter input value in input employeeName3"
        
        WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employeeName3'), input_employeeName3)
        
        "Step 5: Click on button confirmationActions"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_confirmationActions', ['button_confirmationActions_id': button_confirmationActions_id]))
    }
}

