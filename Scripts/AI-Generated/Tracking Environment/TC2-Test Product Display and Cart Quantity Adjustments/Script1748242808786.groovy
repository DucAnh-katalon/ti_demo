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

"Step 2: Click on main productDisplay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/main_productDisplay'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on main productDisplay.png')

"Step 3: Click on link previousProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_previousProduct'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link previousProduct.png')

"Step 4: Click on div productSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/div_productSlider'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on div productSlider.png')

"Step 5: Click on button addToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_addToCart2'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on button addToCart2.png')

"Step 6: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button close.png')

"Step 7: Click on link phoneContact"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_phoneContact'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link phoneContact.png')

"Step 8: Click on link about -> Navigate to page '/about'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_about'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on link about - Navigate to page about.png')

"Step 9: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_about/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link goToCart - Navigate to page cart.png')

"Step 10: Click on span goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/span_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on span goToCart.png')

"Step 11: Click on link iPhone15Plus -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/link_iPhone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link iPhone15Plus - Navigate to page product.png')

"Step 12: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on link goToCart - Navigate to page cart.png')

"Step 13: Click on input quantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/input_quantity'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on input quantity.png')

"Step 14: Click on input quantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/input_quantity'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on input quantity.png')

"Step 15: Click on div cartItemQuantityInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/div_cartItemQuantityInput'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on div cartItemQuantityInput.png')

"Step 16: Click on div cartItemQuantityInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/div_cartItemQuantityInput'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on div cartItemQuantityInput.png')

"Step 17: Click on div cartItemQuantityInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/div_cartItemQuantityInput'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on div cartItemQuantityInput.png')

"Step 18: Click on div cartItemQuantityInput -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/div_cartItemQuantityInput'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on div cartItemQuantityInput - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Test Product Display and Cart Quantity Adjustments_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}