import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link previousSlide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_previousSlide'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link previousSlide.png')

"Step 3: Hover over link appleIphone15ProCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_home/link_appleIphone15ProCase'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Hover over link appleIphone15ProCase.png')

"Step 4: Click on link nextSlide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_nextSlide'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on link nextSlide.png')

"Step 5: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button addToCart.png')

"Step 6: Hover over button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Hover over button addToCart.png')

"Step 7: Click on label colorAndStorageOption (colorPink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/label_colorAndStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/label_colorAndStorageOption', ['label_colorAndStorageOption_internalText': label_colorAndStorageOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on label colorAndStorageOption colorPink.png')

"Step 8: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button buy.png')

"Step 9: Click on label colorAndStorageOption (storage256Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/label_colorAndStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/label_colorAndStorageOption', ['label_colorAndStorageOption_internalText': label_colorAndStorageOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on label colorAndStorageOption storage256Gb.png')

"Step 10: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button buy.png')

"Step 11: Hover over button addToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_home/button_addToCart2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Hover over button addToCart2.png')

"Step 12: Click on link placeOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_placeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on link placeOrder - Navigate to page cart.png')

"Step 13: Click on button proceedToCheckout -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button proceedToCheckout - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Test All Features for Adding and Buying Apple iPhone 15 Pro Case_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}