import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AuthStep {

	@Given("I open Application")
	def openApplication() {
		println("\n open application")
	}

	@When("I click icon login")
	def clickBtnLogin() {
		println("\n click icon login")
	}

	@And("I fill correct fullname (.*) gender (.*) email (.*) password (.*) and konfirmasipassword (.*)")
	def fillFieldRegister() {
		println("\n fill form register")
	}

	@And("I click register button")
	def clickLoginRegister() {
		println("\n click register button")
	}

	@And("I agree with terms and conditions")
	def clickCheckbox() {
		println("\n click checkbox")
	}

	@And("I fill correct email (.*) and password (.*)")
	def fillFieldLogin() {
		println("\n fill email and password")
	}

	@And("I click login button")
	def clickLoginButton() {
		println("\n click login button")
	}

	@And("I click icon logout")
	def clickIconLogout() {
		println("\n click icon logout")
	}

	@Then("I in homepage")
	def inHomepage() {
		println("\n in homepage")
	}

	@Then("I logout")
	def logout() {
		println("\n logout")
	}
}