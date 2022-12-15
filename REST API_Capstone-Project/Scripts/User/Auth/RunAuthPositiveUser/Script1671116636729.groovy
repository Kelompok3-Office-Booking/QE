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

//response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Registrasi/TC01_Registrasi'))
//WS.verifyResponseStatusCode(response, 201)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Login/TC01_login'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Logout/TC01_Logout'))
WS.verifyResponseStatusCode(response, 200)