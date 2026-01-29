import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 945)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /tool/*"

TrueTestScripts.navigate("tool/${tool_id}")

"Step 2: Click on input search"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_tool/input_search'))

"Step 3: Enter input value in input search2"

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_tool/input_search2'), input_search2)

"Step 4: Press key Enter on input search3 -> Navigate to page '/sitesearch/en-us/docs/universalsearch.tsp'"

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_tool/input_search3'), Keys.chord(Keys.ENTER))

"Step 5: Click on link eFuseDescription -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_sitesearch_en_us_docs_universalsearch_tsp/link_eFuseDescription'))

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Search for Product Information Using Search Functionality_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}