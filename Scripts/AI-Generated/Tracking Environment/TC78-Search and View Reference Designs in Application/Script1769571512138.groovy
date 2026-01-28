import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 911)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /reference-designs/index with params (DCM, ds k, gad campaignid, gad source, gbraid, gclid, gclsrc, utm campaign, utm content, utm medium, utm source)"

TrueTestScripts.navigate("reference-designs/index", ["DCM": index_DCM, "ds_k": index_ds_k, "gad_campaignid": index_gad_campaignid, "gad_source": index_gad_source, "gbraid": index_gbraid, "gclid": index_gclid, "gclsrc": index_gclsrc, "utm_campaign": index_utm_campaign, "utm_content": index_utm_content, "utm_medium": index_utm_medium, "utm_source": index_utm_source])

"Step 2: Click on input keywordSearch"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_reference_designs_index/input_keywordSearch'))

"Step 3: Enter input value in input keywordSearch"

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_reference_designs_index/input_keywordSearch'), input_keywordSearch)

"Step 4: Click on td referenceDesign"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_reference_designs_index/td_referenceDesign'))

"Step 5: Click on td referenceDesign2"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_reference_designs_index/td_referenceDesign2'))

"Step 6: Click on link viewDesign"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_reference_designs_index/link_viewDesign'))

"Step 7: Click on raw powerArchitecture"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_reference_designs_index/raw_powerArchitecture'))

"Step 8: Click on button loadMore (loadMore)"

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_reference_designs_index/button_loadMore"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_reference_designs_index/button_loadMore', ['button_loadMore_ButtonInternalText_1': button_loadMore_ButtonInternalText_1, 'button_loadMore_css_value_1': button_loadMore_css_value_1]))

"Step 9: Click on td referenceDesign3 -> Navigate to page ''"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_reference_designs_index/td_referenceDesign3'))

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC78-Search and View Reference Designs in Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}