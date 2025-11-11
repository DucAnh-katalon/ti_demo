package truetest.MSU.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class inputNetIdAndAddNewRows {
    
    private static def execute(String input_netId) {
        
        "Step 1: Click on div chairCheckbox"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/div_chairCheckbox'))
        
        "Step 2: Click on input netId"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_netId'))
        
        "Step 3: Enter input value in input netId"
        
        WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_netId'), input_netId)
        
        "Step 4: Click on button ok33"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_ok33'))
        
        "Step 5: Click on button addNewRows"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_addNewRows'))
    }
}

