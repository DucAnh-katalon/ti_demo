package truetest.MSU.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class navigateHomeFromHrPayrollInbox {
    
    private static def execute(String link_hrPayrollInbox_id, String link_hrPayrollInbox_id_1, String link_hrPayrollInbox_internalLabel, String link_hrPayrollInbox_internalLabel_1) {
        
        "Step 1: Click on button ok -> Navigate to page '/sap/bc/ui2/flp#HRPayrollInbox-update?sap-app-origin-hint=*&/detail/LOCAL BWF/*/TaskCollection(*)'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_ok'))
        
        "Step 2: Click on link navigateHome -> Navigate to page '/sap/bc/ui2/flp#Shell-home'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_navigateHome'))
        
        "Step 3: Click on link hrPayrollInbox -> Navigate to page '/sap/bc/ui2/flp#HRFormsWorkflowReport-read&/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox', ['link_hrPayrollInbox_id': link_hrPayrollInbox_id, 'link_hrPayrollInbox_internalLabel': link_hrPayrollInbox_internalLabel]))
        
        "Step 4: Click on link navigateHome -> Navigate to page '/sap/bc/ui2/flp#Shell-home'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_navigateHome'))
        
        "Step 5: Click on link hrPayrollInbox"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox', ['link_hrPayrollInbox_id': link_hrPayrollInbox_id_1, 'link_hrPayrollInbox_internalLabel': link_hrPayrollInbox_internalLabel_1]))
    }
}

