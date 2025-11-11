package truetest.MSU.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class inputRoomSuiteAndEmploymentDetails {
    
    private static def execute(String input_employmentPercent2, String input_roomSuite, String span_salaryFormatDetails_id) {
        
        "Step 1: Click on input roomSuite"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_roomSuite'))
        
        "Step 2: Enter input value in input roomSuite"
        
        WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_roomSuite'), input_roomSuite)
        
        "Step 3: Click on input employmentPercent2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employmentPercent2'))
        
        "Step 4: Enter input value in input employmentPercent2"
        
        WebUI.setText(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/input_employmentPercent2'), input_employmentPercent2)
        
        "Step 5: Click on span salaryFormatDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_salaryFormatDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_salaryFormatDetails', ['span_salaryFormatDetails_id': span_salaryFormatDetails_id]))
    }
}

