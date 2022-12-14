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
response = WS.sendRequest(findTestObject('Object Repository/Admin/Auth/Login/TCLogin_01'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseText())
String Token = parsedJson.access_token
GlobalVariable.globalAdminToken = Token

// hit endpoint
response = WS.sendRequest(findTestObject('Object Repository/Admin/User/GET - All User By ID/TCGet_All_User_By_ID_01'))
WS.verifyResponseStatusCode(response, 200)

// harusnya 405, bukan 404
//response = WS.sendRequest(findTestObject('Object Repository/Admin/User/GET - All User By ID/TCGet_All_User_By_ID_02'))
//WS.verifyResponseStatusCode(response, 404)
//
//response = WS.sendRequest(findTestObject('Object Repository/Admin/User/GET - All User By ID/TCGet_All_User_By_ID_02'))
//WS.verifyResponseStatusCode(response, 404)

//bug
//response = WS.sendRequest(findTestObject('Object Repository/Admin/User/GET - All User By ID/TCGet_All_User_By_ID_03'))
//WS.verifyResponseStatusCode(response, 404)



//WS.verifyElementPropertyValue(response, 'status', "success")
//WS.verifyElementPropertyValue(response, 'message', "user found")
//WS.verifyElementPropertyValue(response, 'data', '')
//WS.verifyElementPropertyValue(response, 'data.id', 8)
//WS.verifyElementPropertyValue(response, 'data.created_at', "02-12-2022 16:07:17")
//WS.verifyElementPropertyValue(response, 'data.updated_at', "02-12-2022 16:07:17")
//WS.verifyElementPropertyValue(response, 'data.deleted_at', "01-01-0001 00:00:00")
//WS.verifyElementPropertyValue(response, 'data.full_name', "Muhammad Bayu 4")
//WS.verifyElementPropertyValue(response, 'data.gender', "male")
//WS.verifyElementPropertyValue(response, 'data.email', "muhammadbayu4@gmail.com")
//WS.verifyElementPropertyValue(response, 'data.photo', "")