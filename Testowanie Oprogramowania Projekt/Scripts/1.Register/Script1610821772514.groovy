import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'), GlobalVariable.Email)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Mr._id_gender'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), 'Ale')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), 'Ole')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), 'P22/mDurbpKSPtl3l0tASQ==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-20212020201920182017201620152014201_28b437'), 
    '2018', true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Company_company'), 'Copernicus')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input__address1'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), 'TestAddres')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Address (Line 2)_address2'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Address (Line 2)_address2'), 'TestAddres2')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/p_City'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'Wroclaw')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '2', true)

WebUI.setText(findTestObject('Page_Login - My Store/input__postcode'), '66666')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Home phone_phone'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Home phone_phone'), '666999666')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '666999666')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input__alias'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/div_AuthenticationCreate an accountYour per_e1a76b'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__alias'), 'abba6677')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.closeBrowser()

