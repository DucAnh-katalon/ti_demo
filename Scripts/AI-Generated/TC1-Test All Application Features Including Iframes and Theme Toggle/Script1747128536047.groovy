import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link aboutLearnMore -> Navigate to page '/about'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_aboutLearnMore'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link aboutLearnMore - Navigate to page about.png')

"Step 3: Click on link iframes -> Navigate to page '/iframes'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_about/link_iframes'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link iframes - Navigate to page iframes.png')

"Step 4: Click on button iframeSameDomain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iframes/button_iframeSameDomain'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button iframeSameDomain.png')

"Step 5: Click on header iframeSameDomain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iframes/header_iframeSameDomain'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on header iframeSameDomain.png')

"Step 6: Click on link iframeOptions (notifications)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iframes/link_iframeOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iframes/link_iframeOptions', ['link_iframeOptions_dataTest': link_iframeOptions_dataTest, 'link_iframeOptions_divNthOfType': link_iframeOptions_divNthOfType, 'link_iframeOptions_liNthOfType': link_iframeOptions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link iframeOptions notifications.png')

"Step 7: Hover over button infoMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_iframes/button_infoMessage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Hover over button infoMessage.png')

"Step 8: Click on button toggleTheme"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iframes/button_toggleTheme'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button toggleTheme.png')

"Step 9: Click on button successMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iframes/button_successMessage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button successMessage.png')

"Step 10: Click on link iframeOptions (fileDownload)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iframes/link_iframeOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iframes/link_iframeOptions', ['link_iframeOptions_dataTest': link_iframeOptions_dataTest_1, 'link_iframeOptions_divNthOfType': link_iframeOptions_divNthOfType_1, 'link_iframeOptions_liNthOfType': link_iframeOptions_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on link iframeOptions fileDownload.png')

"Step 11: Click on link iframeOptions (iframes)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iframes/link_iframeOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iframes/link_iframeOptions', ['link_iframeOptions_dataTest': link_iframeOptions_dataTest_2, 'link_iframeOptions_divNthOfType': link_iframeOptions_divNthOfType_2, 'link_iframeOptions_liNthOfType': link_iframeOptions_liNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on link iframeOptions iframes.png')

"Step 12: Hover over button iframeSameDomainForms"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_iframes/button_iframeSameDomainForms'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Hover over button iframeSameDomainForms.png')

"Step 13: Click on link iframeOptions (dynamicElements)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iframes/link_iframeOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iframes/link_iframeOptions', ['link_iframeOptions_dataTest': link_iframeOptions_dataTest_3, 'link_iframeOptions_divNthOfType': link_iframeOptions_divNthOfType_3, 'link_iframeOptions_liNthOfType': link_iframeOptions_liNthOfType_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on link iframeOptions dynamicElements.png')

"Step 14: Click on link iframeOptions (forms)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iframes/link_iframeOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iframes/link_iframeOptions', ['link_iframeOptions_dataTest': link_iframeOptions_dataTest_4, 'link_iframeOptions_divNthOfType': link_iframeOptions_divNthOfType_4, 'link_iframeOptions_liNthOfType': link_iframeOptions_liNthOfType_4]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on link iframeOptions forms.png')

"Step 15: Login into Application"

TrueTestScripts.login()

"Step 16: Click on p practiceFormInteractions -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iframes/p_practiceFormInteractions'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on p practiceFormInteractions - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Test All Application Features Including Iframes and Theme Toggle_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}