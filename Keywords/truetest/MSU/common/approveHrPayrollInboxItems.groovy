package truetest.MSU.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class approveHrPayrollInboxItems {
    
    private static def execute(String link_hrFormsReports_id, String link_hrFormsReports_internalLabel, String link_hrPayrollInbox_id, String link_hrPayrollInbox_internalLabel, String span_effectiveDates_id) {
        
        "Step 1: Click on link hrFormsReports -> Navigate to page '/sap/bc/ui2/flp#HRFormsWorkflowReport-read&/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrFormsReports"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrFormsReports', ['link_hrFormsReports_id': link_hrFormsReports_id, 'link_hrFormsReports_internalLabel': link_hrFormsReports_internalLabel]))
        
        "Step 2: Click on link navigateHome -> Navigate to page '/sap/bc/ui2/flp#Shell-home'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_navigateHome'))
        
        "Step 3: Click on link hrPayrollInbox -> Navigate to page '/sap/bc/ui2/flp#HRPayrollInbox-update&/detail/LOCAL BWF/*/TaskCollection(*)'"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/link_hrPayrollInbox', ['link_hrPayrollInbox_id': link_hrPayrollInbox_id, 'link_hrPayrollInbox_internalLabel': link_hrPayrollInbox_internalLabel]))
        
        "Step 4: Click on span effectiveDates"
        
        // Bind values to the variables in the locators of "AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_effectiveDates"
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Dynamic Objects/Page_sap_bc_ui2_flp/span_effectiveDates', ['span_effectiveDates_id': span_effectiveDates_id]))
        
        "Step 5: Click on button approve"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/MSU/Page_sap_bc_ui2_flp/button_approve'))
    }
}

