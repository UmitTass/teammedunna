package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage (){
        PageFactory.initElements(Driver.getDriver(),this);}
        @FindBy(xpath = "//*[@id='ssn']")
        public WebElement ssnTextBox;
        @FindBy(xpath = "//*[@id='firstName']")
        public WebElement firstNameTextBox;
        @FindBy(xpath = "//*[@id='lastName']")
        public WebElement lastNameTextBox;
        @FindBy(xpath = "//*[@id='username']")
        public WebElement userNameTextBox;
        @FindBy(xpath = "//*[@id='email']" )
        public WebElement emailTextBox;
        @FindBy(xpath = "//*[@id='firstPassword']")
        public WebElement newPasswordTextBox;
        @FindBy(xpath = "//*[@id='secondPassword']")
        public WebElement newPasswordConfirmationTextBox;
        @FindBy(id = "register-submit")
        public WebElement registerButton;
        @FindBy(xpath = "//*[@id=\'root\']/div/div/div[1]/div ") //*[@id="root"]/div/div/div[1]/div //*[contains(text(),'Registration Saved')]
        public WebElement successMessageTextContainer;
        @FindBy(xpath = "//*[@id=\'strengthBar\']/li[1]")
        public WebElement passwordStrength1;
        @FindBy(xpath = "//*[@id=\'strengthBar\']/li[2]")
        public WebElement passwordStrength2;
        @FindBy(xpath = "//*[@id=\'strengthBar\']/li[3]")
        public WebElement passwordStrength3;
    }

