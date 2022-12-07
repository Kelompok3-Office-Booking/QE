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
import org.openqa.selenium.Keys as Keys

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Login/TC01_login'))
WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Login/TC02_login'))
WS.verifyResponseStatusCode(response, 400)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Login/TC03_login'))
WS.verifyResponseStatusCode(response, 400)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Login/TC04_login'))
WS.verifyResponseStatusCode(response, 405)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Login/TC05_login'))
WS.verifyResponseStatusCode(response, 405)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Login/TC06_login'))
WS.verifyResponseStatusCode(response, 405)

response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Login/TC07_login'))
WS.verifyResponseStatusCode(response, 400)

//response = WS.sendRequest(findTestObject('Object Repository/User/Auth/Login/TC08_login'))
//WS.verifyResponseStatusCode(response, 400)

//WS.verifyElementPropertyValue(response, 'access_token', "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjUiLCJleHAiOjE2Njk5MTE1MzEsInJvbGVzIjoidXNlciJ9.fhWzEId6r9UcXOcn5JC34cXFqgkt51icOWQUwcsDE_k")
//WS.verifyElementPropertyValue(response, 'refresh_token', "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2Njk5OTQzMzEsImlkIjoiNSJ9.H8lnwiPnggpkQiocetgPb3TxreXGsM4y6B9noGQ8x-A")
