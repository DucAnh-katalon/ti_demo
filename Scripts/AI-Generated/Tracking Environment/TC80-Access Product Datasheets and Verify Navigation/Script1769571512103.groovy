import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1599, 774)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /product/* with params (DCM, ds k, gad campaignid, gad source, gbraid, gclid, gclsrc, utm campaign, utm content, utm medium, utm source)"

TrueTestScripts.navigate("product/${product_id}", ["DCM": product_DCM, "ds_k": product_ds_k, "gad_campaignid": product_gad_campaignid, "gad_source": product_gad_source, "gbraid": product_gbraid, "gclid": product_gclid, "gclsrc": product_gclsrc, "utm_campaign": product_utm_campaign, "utm_content": product_utm_content, "utm_medium": product_utm_medium, "utm_source": product_utm_source])

"Step 2: Click on link productDatasheets (dataSheet)"

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_product/link_productDatasheets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_product/link_productDatasheets', ['link_productDatasheets_css_value_1': link_productDatasheets_css_value, 'link_productDatasheets_href_variable': link_productDatasheets_href_variable]))

"Step 3: Click on link productDatasheets (dataSheet) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_product/link_productDatasheets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_product/link_productDatasheets', ['link_productDatasheets_css_value_1': link_productDatasheets_css_value_1, 'link_productDatasheets_href_variable': link_productDatasheets_href_variable_1]))

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC80-Access Product Datasheets and Verify Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}