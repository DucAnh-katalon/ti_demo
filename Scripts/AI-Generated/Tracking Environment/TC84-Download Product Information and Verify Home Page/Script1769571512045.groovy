import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(2133, 1012)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /product/*"

TrueTestScripts.navigate("product/${product_id}")

"Step 2: Click on link download3"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product/link_download3'))

"Step 3: Click on button showMore"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product/button_showMore'))

"Step 4: Click on span productIdentifier"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product/span_productIdentifier'))

"Step 5: Click on span productIdentifier2"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product/span_productIdentifier2'))

"Step 6: Click on div dynamicObject (aiRecommendations)"

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_product/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_product/div_dynamicObject', ['div_dynamicObject_css_value_1': div_dynamicObject_css_value]))

"Step 7: Click on div dynamicObject (object4)"

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_product/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_product/div_dynamicObject', ['div_dynamicObject_css_value_1': div_dynamicObject_css_value_1]))

"Step 8: Click on div more"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product/div_more'))

"Step 9: Click on button batteryManagementIcs"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product/button_batteryManagementIcs'))

"Step 10: Click on div dynamicObject (aiRecommendations)"

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_product/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_product/div_dynamicObject', ['div_dynamicObject_css_value_1': div_dynamicObject_css_value_2]))

"Step 11: Click on div dynamicObject (object5)"

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_product/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_product/div_dynamicObject', ['div_dynamicObject_css_value_1': div_dynamicObject_css_value_3]))

"Step 12: Click on main object -> Navigate to page ''"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product/main_object'))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC84-Download Product Information and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}