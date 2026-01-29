import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1536, 695)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /quality-reliability-packaging-download/report with params (opn)"

TrueTestScripts.navigate("quality-reliability-packaging-download/report", ["opn": report_opn])

"Step 2: Click on label assemblySite"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_quality_reliability_packaging_download_report/label_assemblySite'))

"Step 3: Click on div qualityReliabilityPackaging"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_quality_reliability_packaging_download_report/div_qualityReliabilityPackaging'))

"Step 4: Click on div qualityReliabilityPackaging"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_quality_reliability_packaging_download_report/div_qualityReliabilityPackaging'))

"Step 5: Click on div qualityReliabilityPackaging -> Navigate to page ''"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_quality_reliability_packaging_download_report/div_qualityReliabilityPackaging'))

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Download Quality Reliability Packaging Report_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}