package truetest.MSU.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class setMaximumSalaryAndAddRows {
    
    private static def execute(String input_maximumFtesalary, String item_dynamicObject_id) {
        
        "Step 1: Click on item dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id]))
        
        "Step 2: Click on input maximumFtesalary"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_maximumFtesalary'))
        
        "Step 3: Enter input value in input maximumFtesalary"
        
        WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_maximumFtesalary'), input_maximumFtesalary)
        
        "Step 4: Click on button addNewRows"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/button_addNewRows'))
        
        "Step 5: Click on input fundChartAccount"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_fundChartAccount'))
    }
}

