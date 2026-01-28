import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1662, 992)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /product/*/part-details/*"

TrueTestScripts.navigate("product/${product_id}/part-details/${part_details_id}")

"Step 2: Click on link managePreferences"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product_part_details/link_managePreferences'))

"Step 3: Click on div saveAndClose"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product_part_details/div_saveAndClose'))

"Step 4: Click on button shippingActions (shipToUsd)"

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_product_part_details/button_shippingActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_product_part_details/button_shippingActions', ['button_shippingActions_css_value_1': button_shippingActions_css_value_1]))

"Step 5: Select option with input value from select language"

TrueTestScripts.selectOption(findTestObject('AI-Generated/Tracking Environment/Page_product_part_details/select_language'), select_language, "label", false)

"Step 6: Click on button save -> Navigate to page '/product/de-de/*/part-details/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product_part_details/button_save'))

"Step 7: Click on link unternehmen"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product_de_de_part_details/link_unternehmen'))

"Step 8: Click on link shippingPaymentTaxes -> Navigate to page '/de-de/ordering-resources/shipping-payment-tax-information'"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product_de_de_part_details/link_shippingPaymentTaxes'))

"Step 9: Click on header countryRegion"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_de_de_ordering_resources_shipping_payment_tax_information/header_countryRegion'))

"Step 10: Click on link uberTi"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_de_de_ordering_resources_shipping_payment_tax_information/link_uberTi'))

"Step 11: Click on div sectionIntroduction -> Navigate to page '/product/de-de/*/part-details/*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_de_de_ordering_resources_shipping_payment_tax_information/div_sectionIntroduction'))

"Step 12: Click on span loginRequired -> Navigate to page '/product/*/part-details/*'"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_product_de_de_part_details/span_loginRequired'))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC71-Manage Preferences and Verify Product Part Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}