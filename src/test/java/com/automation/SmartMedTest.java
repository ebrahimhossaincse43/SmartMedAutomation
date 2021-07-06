package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SmartMedTest extends DriverSetup {

	public static String baseURL = "https://nmed-c.zssbd.com/auth/user/login/?next=/alerts/list/";

	@Test
	public static void TestSmartMed() throws InterruptedException {
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// Login Section
		WebElement username = driver.findElement(By.xpath("//input[contains(@id,'id_username')]"));
		username.sendKeys("testdoc");
		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'id_password')]"));
		password.sendKeys("Test123456");
		WebElement loginButton = driver.findElement(By.xpath("//button[starts-with(text(),'Log in')]"));
		loginButton.click();
		Thread.sleep(1000);

		// Select Patients from menu
		WebElement patientsButton = driver.findElement(By.xpath("//a[normalize-space()='Patients']"));
		patientsButton.click();

		// Click add button to add a new patient
		WebElement addButton = driver.findElement(By.xpath("//button[starts-with(text(),'Add')]"));
		addButton.click();

		// Check patient id existing or new
		WebElement checkPatientId = driver.findElement(By.xpath("//input[contains(@name,'clinic_patient_ref')]"));
		checkPatientId.sendKeys("161158810077");

		WebElement checkPatientButton = driver.findElement(By.xpath("//input[contains(@class,'btn btn-success')]"));
		checkPatientButton.click();

		// Click add patient button to add a new patient
		WebElement addPatientButton = driver.findElement(By.xpath("//a[starts-with(text(),'ADD PATIENT')]"));
		addPatientButton.click();

		WebElement patientUsername = driver.findElement(By.xpath("//input[contains(@id,'id_username')]"));
		patientUsername.sendKeys("ebrahim222");

		WebElement doctor = driver.findElement(By.xpath("//button[contains(.,'Mr. Test Doc')]"));
		doctor.click();

		WebElement doctorOption1 = driver.findElement(By.xpath("//input[contains(@value,'336-1002')]"));
		doctorOption1.click();

		WebElement doctorOption2 = driver.findElement(By.xpath("//input[contains(@value,'336-1005')]"));
		doctorOption2.click();
		
		WebElement salutation = driver.findElement(By.id("id_salutation_new"));
		Select selectSalutation = new Select(salutation);
		selectSalutation.selectByIndex(1);
		
		WebElement firstName = driver.findElement(By.xpath("//input[contains(@id,'id_first_name')]"));
		firstName.sendKeys("Md. ");
		WebElement middleName = driver.findElement(By.xpath("//input[contains(@id,'id_middle_name')]"));
		middleName.sendKeys("Ebrahim");
		WebElement lastName = driver.findElement(By.xpath("//input[contains(@id,'id_surname')]"));
		lastName.sendKeys("Hossain");
		
		WebElement dateOfBirth = driver.findElement(By.id("id_Dob_formate"));
		Select selectDateOfBirth = new Select(dateOfBirth);
		selectDateOfBirth.selectByIndex(0);
		
		WebElement date = driver.findElement(By.xpath("//input[contains(@id,'datepicker')]"));
		date.click();
		
		WebElement selectDate = driver.findElement(By.xpath("//a[starts-with(text(),'6')]"));
		selectDate.click();
		
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'id_email')]"));
		email.sendKeys("ebrahimhossaincse222@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[contains(@id,'id_mobile')]"));
		phone.sendKeys("01886644261");
		
		WebElement revealOption = driver.findElement(By.xpath("//button[contains(@id,'revealButton')]"));
		revealOption.click();
		
		WebElement address_1 = driver.findElement(By.xpath("//input[contains(@id,'id_address_1')]"));
		address_1.sendKeys("Mirpur");
		WebElement address_2 = driver.findElement(By.xpath("//input[contains(@id,'id_address_2')]"));
		address_2.sendKeys("Eastern Housing");
		WebElement address_3 = driver.findElement(By.xpath("//input[contains(@id,'id_address_3')]"));
		address_3.sendKeys("Dhaka");
		
		WebElement gender = driver.findElement(By.id("id_sex"));
		Select selectGender = new Select(gender);
		selectGender.selectByIndex(0);
		
		WebElement ethnicity = driver.findElement(By.id("id_ethnicity"));
		Select selectEthnicity = new Select(ethnicity);
		selectEthnicity.selectByIndex(6); 
		
		WebElement religion = driver.findElement(By.id("id_religion"));
		Select selectReligion= new Select(religion);
		selectReligion.selectByIndex(0); 
		
		WebElement preferedName = driver.findElement(By.xpath("//input[contains(@id,'id_prefered_name')]"));
		preferedName.sendKeys("Mr.X");
		
		WebElement note = driver.findElement(By.xpath("//textarea[contains(@id,'id_notes')]"));
		note.sendKeys("Nothing to write now.");
			
		WebElement preferedLanguage = driver.findElement(By.id("id_prefered_language"));
		Select selectPreferedLanguage= new Select(preferedLanguage);
		selectPreferedLanguage.selectByIndex(6); 
		
		WebElement language = driver.findElement(By.xpath("//input[@id='other_language']"));
		language.sendKeys("Bangla");
		
		WebElement secondaryLanguage = driver.findElement(By.id("id_secondary_language"));
		Select selectSecondaryLanguage= new Select(secondaryLanguage);
		selectSecondaryLanguage.selectByIndex(2); 
		
		WebElement blood = driver.findElement(By.id("id_blood_type"));
		Select selectBlood= new Select(blood);
		selectBlood.selectByIndex(3); 
		
		WebElement city = driver.findElement(By.xpath("//input[contains(@id,'id_city')]"));
		city.sendKeys("Dhaka");
		
		WebElement postCode = driver.findElement(By.xpath("//input[contains(@id,'id_post_code')]"));
		postCode.sendKeys("1216");

		WebElement state = driver.findElement(By.id("id_state"));
		Select selectState= new Select(state);
		selectState.selectByIndex(7); 
		
		WebElement alternativePhoneNumber = driver.findElement(By.xpath("//input[contains(@id,'id_alternative_mobile')]"));
		alternativePhoneNumber.sendKeys("01710899336");
		
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		driver.switchTo().activeElement();

		WebElement isDisplayed = driver.findElement(By.xpath("//button[contains(@id,'proceedCreatePatient')]"));
		isDisplayed.click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert Summary']")).click();
		
		String expectedId = "161158810077";
		String actualId= driver.findElement(By.xpath("//td[starts-with(text(),'161158810077')]")).getText();
		
		if (actualId.equalsIgnoreCase(expectedId)) {
			System.out.println("Patient create successfully");
		}
		
		Thread.sleep(10000);

		driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle')]")).click();
		
		WebElement logout = driver.findElement(By.xpath("//a[starts-with(text(),'Logout')]"));
		logout.click();
		
		Thread.sleep(10000);
	}

}
