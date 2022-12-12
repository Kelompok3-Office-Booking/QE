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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Registrasi/TC01_Registrasi'))
//WS.verifyResponseStatusCode(response, 201)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Registrasi/TC02_Registrasi'))
WS.verifyResponseStatusCode(response, 400)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Registrasi/TC03_Registrasi'))
WS.verifyResponseStatusCode(response, 400)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Registrasi/TC04_Registrasi'))
WS.verifyResponseStatusCode(response, 400)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Registrasi/TC05_Registrasi'))
WS.verifyResponseStatusCode(response, 400)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Registrasi/TC06_Registrasi'))
WS.verifyResponseStatusCode(response, 400)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Registrasi/TC07_Registrasi'))
WS.verifyResponseStatusCode(response, 405)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Registrasi/TC08_Registrasi'))
WS.verifyResponseStatusCode(response, 405)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Registrasi/TC09_Registrasi'))
WS.verifyResponseStatusCode(response, 405)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Registrasi/TC10_Registrasi'))
WS.verifyResponseStatusCode(response, 400)

//WS.verifyElementPropertyValue(response, 'status', "success")
//WS.verifyElementPropertyValue(response, 'message', "account created")
//WS.verifyElementPropertyValue(response, 'data', '')
//WS.verifyElementPropertyValue(response, 'data.id', 8)
//WS.verifyElementPropertyValue(response, 'data.created_at', "2022-12-01T22:20:12.554+07:00")
//WS.verifyElementPropertyValue(response, 'data.updated_at', "2022-12-01T22:20:12.554+07:00")
//WS.verifyElementPropertyValue(response, 'data.deleted_at', null)
//WS.verifyElementPropertyValue(response, 'data.full_name', "Muhammad Bayu 2")
//WS.verifyElementPropertyValue(response, 'data.gender', "male")
//WS.verifyElementPropertyValue(response, 'data.email', "muhammadbayu2@gmail.com")
//WS.verifyElementPropertyValue(response, 'data.photo', "")