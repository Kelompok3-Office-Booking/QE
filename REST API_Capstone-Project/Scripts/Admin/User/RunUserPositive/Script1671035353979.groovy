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

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

response = WS.sendRequest(findTestObject('Object Repository/Admin/User/GET - All Users/TCGet_All_Users_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/User/GET - All User By ID/TCGet_All_User_By_ID_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/User/GET - Search By Email/TCSearch_By_Email_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/User/PUT - Update Profile Data By ID/TCUpdate_Profile_Data_By_ID_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/User/PUT - Update Profile Photo By ID/TCUpdate_Profile_Photo_By_ID_01'))
WS.verifyResponseStatusCode(response, 200)

//response = WS.sendRequest(findTestObject('Object Repository/Admin/User/DELETE - User Account/TCDelete_User_Account_01'))
//WS.verifyResponseStatusCode(response, 200)
