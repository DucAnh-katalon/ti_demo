package truetest.MSU.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class processHrPayrollFormsCostRedistributions {
    
    private static def execute(String item_dynamicObject_id, String item_dynamicObject_id_1, String span_processInstructions_id) {
        
        "Step 1: Click on link hrPayrollFormsCostRedistributions2 -> Navigate to page '/sap/bc/ui2/flp#HRPayrollFormsCostRedistribute-update'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/link_hrPayrollFormsCostRedistributions2'))
        
        "Step 2: Click on span processInstructions"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_processInstructions"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_processInstructions', ['span_processInstructions_id': span_processInstructions_id]))
        
        "Step 3: Click on item dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id]))
        
        "Step 4: Click on span employeeType4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/span_employeeType4'))
        
        "Step 5: Click on item dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_1]))
    }
}

