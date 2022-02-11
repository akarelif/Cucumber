package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.HMCPage;
import utilities.ConfigReader;

public class HotelmaycampStepDefinitions {

    HMCPage hmcpage=new HMCPage();

    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {
        hmcpage.mainPageLoginLinki.click();
    }
    @Then("kullanici adi olarak {string} girer")
    public void kullanici_adi_olarak_girer(String kullaniciTipi) {
        hmcpage.usernameTextBox.sendKeys(ConfigReader.getProperty(kullaniciTipi));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String passwordTuru) {
        hmcpage.passwordTextBox.sendKeys(ConfigReader.getProperty(passwordTuru));
    }
    @Then("login buttonuna basar")
    public void login_buttonuna_basar() {
        hmcpage.loginButonu.click();
    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(hmcpage.basariliGirisYaziElementi.isDisplayed());
    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcpage.girisYapilamadiYaziElementi.isDisplayed());
    }
}
