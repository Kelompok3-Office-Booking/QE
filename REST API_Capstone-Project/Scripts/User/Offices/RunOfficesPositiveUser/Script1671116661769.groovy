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
import groovy.json.JsonSlurper as JsonSlurper

// login dulu, ambil token
response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Login/TC01_login'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalUserToken = Token

// hit endpoint
//response = WS.sendRequest(findTestObject('Object Repository/User/Offices/GET - All Type Of Offices/TCGet_All_Type_Offices_01'))
//WS.verifyResponseStatusCode(response, 200)

//response = WS.sendRequest(findTestObject('Object Repository/User/Offices/GET - All Type Of Offices By ID/TCGet_All_Type_Offices_By_ID_01'))
//WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/User/Offices/GET - Nearest Offices/TCGet_Nearest_Offices_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/User/Offices/GET - Offices/TCGet_Offices_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/User/Offices/GET - Office By City/TCGet_Offices_By_City_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/User/Offices/GET - Office By Rate/TCGet_Offices_By_Rate_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/User/Offices/GET - Office By Title/TCGet_Offices_By_Title_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/User/Offices/GET - Offices Coworking Space/TCGet_Coworking_Space_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/User/Offices/GET - Offices Meeting Room/TCGet_Meeting_Room_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/User/Offices/GET - Offices Recommendation/TCGet_Offices_Rec_01'))
WS.verifyResponseStatusCode(response, 200)
