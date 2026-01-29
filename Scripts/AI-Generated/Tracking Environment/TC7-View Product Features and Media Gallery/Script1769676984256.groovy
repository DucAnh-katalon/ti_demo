import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1879, 1045)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /product/*"

// TrueTestScripts.navigate("product/${product_id}")

"Step 2: Click on div imageNavigation (navigateImages)"

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_product/div_imageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_product/div_imageNavigation', ['div_imageNavigation_InternalLabel_1': div_imageNavigation_InternalLabel, 'div_imageNavigation_css_value_1': div_imageNavigation_css_value]))

"Step 3: Click on div mediaGallery"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product/div_mediaGallery'))

"Step 4: Click on button productFeatures (mediaGalleryThumbnail)"

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_product/button_productFeatures"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_product/button_productFeatures', ['button_productFeatures_css_value_1': button_productFeatures_css_value]))

"Step 5: Click on button productFeatures (schematic)"

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_product/button_productFeatures"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_product/button_productFeatures', ['button_productFeatures_css_value_1': button_productFeatures_css_value_1]))

"Step 6: Click on div close"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product/div_close'))

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-View Product Features and Media Gallery_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}