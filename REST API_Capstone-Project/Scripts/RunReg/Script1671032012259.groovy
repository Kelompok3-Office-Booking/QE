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

// login
response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

// logout 
response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Logout/TC01_Logout'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

// get all types offices
response = WS.sendRequest(findTestObject('Object Repository/Admin/Offices/GET - all types of offices/TCGet_All_Offices_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

// create offices
response = WS.sendRequest(findTestObject('Object Repository/Admin/Offices/POST - Create Offies/TCCreate_Offices_01'))
WS.verifyResponseStatusCode(response, 201)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

// edit offices
response = WS.sendRequest(findTestObject('Object Repository/Admin/Offices/PUT - Update Offices/TCPut_Offices_01'))
WS.verifyResponseStatusCode(response, 200)

//response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)
//
//JsonSlurper slurper = new JsonSlurper()
//Map parsedJson = slurper.parseText(response.getResponseText())
//String Token = parsedJson.access_token
//GlobalVariable.globalAdminToken = Token

// delete offices
//response = WS.sendRequest(findTestObject('Object Repository/Admin/Offices/DELETE - Delete Offices/TCDelete_Offices_01'))
//WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

// get facilities
response = WS.sendRequest(findTestObject('Object Repository/Admin/Facilities/GET - All Facilities/TCGet_All_Facilities_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

// get facilities by id
response = WS.sendRequest(findTestObject('Object Repository/Admin/Facilities/GET - All Facilities By ID/TCGet_All_Facilities_By_ID_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

// create facilities
response = WS.sendRequest(findTestObject('Object Repository/Admin/Facilities/POST - Create Facilities/TCCreate_Facility_01'))
WS.verifyResponseStatusCode(response, 201)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

// edit facilities
response = WS.sendRequest(findTestObject('Object Repository/Admin/Facilities/PUT - Update Facilities/TCUpdate_Facilities_01'))
WS.verifyResponseStatusCode(response, 200)

//response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)
//
//JsonSlurper slurper = new JsonSlurper()
//Map parsedJson = slurper.parseText(response.getResponseText())
//String Token = parsedJson.access_token
//GlobalVariable.globalAdminToken = Token

// delete offices
//response = WS.sendRequest(findTestObject('Object Repository/Admin/Facilities/DELETE - Delete Facilities/TCDelete_Facilities_01'))
//WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

response = WS.sendRequest(findTestObject('Object Repository/Admin/Transaction/GET - All Transaction/TCGet_All_Transaction_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

response = WS.sendRequest(findTestObject('Object Repository/Admin/Transaction/GET - All Transaction By ID/TCGet_All_Transaction_By_ID_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

response = WS.sendRequest(findTestObject('Object Repository/Admin/Transaction/GET - All Transaction By Offices ID/TCGet_All_Transaction_By_Offices_ID_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

response = WS.sendRequest(findTestObject('Object Repository/Admin/Transaction/GET - All Transaction By User ID/TCGet_All_Transaction_By_User_ID_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

response = WS.sendRequest(findTestObject('Object Repository/Admin/Transaction/POST - Create Transaction/TCCreate_Transaction_01'))
WS.verifyResponseStatusCode(response, 201)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

response = WS.sendRequest(findTestObject('Object Repository/Admin/Transaction/PUT - Update Transaction/TCUpdate_Transaction_01'))
WS.verifyResponseStatusCode(response, 200)

//response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)
//
//JsonSlurper slurper = new JsonSlurper()
//Map parsedJson = slurper.parseText(response.getResponseText())
//String Token = parsedJson.access_token
//GlobalVariable.globalAdminToken = Token

//response = WS.sendRequest(findTestObject('Object Repository/Admin/Transaction/DELETE - Delete Transaction/TCDelete_Transaction_01'))
//WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

response = WS.sendRequest(findTestObject('Object Repository/Admin/User/GET - All Users/TCGet_All_Users_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

response = WS.sendRequest(findTestObject('Object Repository/Admin/User/GET - All User By ID/TCGet_All_User_By_ID_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

response = WS.sendRequest(findTestObject('Object Repository/Admin/User/GET - Search By Email/TCSearch_By_Email_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

response = WS.sendRequest(findTestObject('Object Repository/Admin/User/PUT - Update Profile Data By ID/TCUpdate_Profile_Data_By_ID_01'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

response = WS.sendRequest(findTestObject('Object Repository/Admin/User/PUT - Update Profile Photo By ID/TCUpdate_Profile_Photo_By_ID_01'))
WS.verifyResponseStatusCode(response, 200)

//response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)
//
//JsonSlurper slurper = new JsonSlurper()
//Map parsedJson = slurper.parseText(response.getResponseText())
//String Token = parsedJson.access_token
//GlobalVariable.globalAdminToken = Token
//response = WS.sendRequest(findTestObject('Object Repository/Admin/User/DELETE - User Account/TCDelete_User_Account_01'))
//WS.verifyResponseStatusCode(response, 200)