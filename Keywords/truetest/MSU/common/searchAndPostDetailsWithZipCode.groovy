package truetest.MSU.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class searchAndPostDetailsWithZipCode {
    
    private static def execute(String item_dynamicObject_id, String item_dynamicObject_id_1, String span_searchAndPostingDetails_id) {
        
        "Step 1: Click on item dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id]))
        
        "Step 2: Click on button ok33"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_ok33'))
        
        "Step 3: Click on span searchAndPostingDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_searchAndPostingDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_searchAndPostingDetails', ['span_searchAndPostingDetails_id': span_searchAndPostingDetails_id]))
        
        "Step 4: Click on item dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id_1]))
        
        "Step 5: Click on input zipCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_zipCode'))
    }
}

