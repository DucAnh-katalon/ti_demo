import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over link tablesWorkWithSortableTables"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/link_tablesWorkWithSortableTables'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Hover over link tablesWorkWithSortableTables.png')

"Step 3: Click on link forms -> Navigate to page '/forms'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_forms'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link forms - Navigate to page forms.png')

"Step 4: Login into Application"

TrueTestScripts.login()

"Step 5: Click on link tables -> Navigate to page '/tables'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/forms?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_forms/link_tables'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link tables - Navigate to page tables.png')

"Step 7: Enter input value in input nameField (name)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tables?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_tables/input_nameField"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_tables/input_nameField', ['input_nameField_nth': input_nameField_nth_1]), input_nameField)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Enter input value in input nameField name.png')

"Step 8: Click on button tableActions (delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tables?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_tables/button_tableActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_tables/button_tableActions', ['button_tableActions_dataTest': button_tableActions_dataTest]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button tableActions delete.png')

"Step 9: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_tables/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button close.png')

"Step 11: Enter input value in input nameField (name2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tables?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_tables/input_nameField"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_tables/input_nameField', ['input_nameField_nth': input_nameField_nth_3]), input_nameField_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Enter input value in input nameField name2.png')

"Step 12: Click on button tableActions (add)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tables?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_tables/button_tableActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_tables/button_tableActions', ['button_tableActions_dataTest': button_tableActions_dataTest_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on button tableActions add.png')

"Step 13: Click on button close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_tables/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button close - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Test Form Functionality with Sortable Tables and Home Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}