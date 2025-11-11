package truetest.MSU.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class manageUserRolesAndInputNetId {
    
    private static def execute(String input_netId, String item_dynamicObject_id, String span_userRoles_id) {
        
        "Step 1: Click on span userRoles"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_userRoles"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_userRoles', ['span_userRoles_id': span_userRoles_id]))
        
        "Step 2: Click on item dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/item_dynamicObject', ['item_dynamicObject_id': item_dynamicObject_id]))
        
        "Step 3: Click on input netId"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_netId'))
        
        "Step 4: Enter input value in input netId"
        
        WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_netId'), input_netId)
        
        "Step 5: Press key Enter on input netId"
        
        WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_netId'), Keys.chord(Keys.ENTER))
    }
}

