import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1660, 886)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("")

"Step 2: Click on link products"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_products'))

"Step 3: Click on link powerManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_powerManagement'))

"Step 4: Click on link homeCategories (powerMuxes) -> Navigate to page '/product-category/power-management/power-protection-switches-controllers/power-muxes/overview'"

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/link_homeCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/link_homeCategories', ['link_homeCategories_AInternalText_1': link_homeCategories_AInternalText_1, 'link_homeCategories_css_value_1': link_homeCategories_css_value_1]))

"Step 5: Click on link parametricFilter2 -> Navigate to page '/product-category/power-management/power-protection-switches-controllers/power-muxes/products'"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product_category_power_management_power_protection_switches/link_parametricFilter2'))

"Step 6: Click on span priceQuantity"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product_category_power_management_power_protection_switches/span_priceQuantity'))

"Step 7: Click on link tps2116 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product_category_power_management_power_protection_switches/link_tps2116'))

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC67-Browse Power Management Products and Apply Filters_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}