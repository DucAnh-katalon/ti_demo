package truetest.MSU.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class addNewRowAndInputNetId {
    
    private static def execute(String input_netId2) {
        
        "Step 1: Click on button ok33"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_ok33'))
        
        "Step 2: Click on button addNewRow7"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_addNewRow7'))
        
        "Step 3: Click on input netId2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_netId2'))
        
        "Step 4: Enter input value in input netId2"
        
        WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_netId2'), input_netId2)
        
        "Step 5: Press key Enter on input netId2"
        
        WebUI.sendKeys(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_netId2'), Keys.chord(Keys.ENTER))
    }
}

