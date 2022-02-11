package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
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


    @Then("scenario outline'dan kullanici adi olarak {string} yazar")
    public void scenarioOutlineDanKullaniciAdiOlarakYazar(String username) {
        hmcpage.usernameTextBox.sendKeys(username);
    }

    @And("scenario outline'dan password olarak {string} yazar")
    public void scenarioOutlineDanPasswordOlarakYazar(String password) {
        hmcpage.passwordTextBox.sendKeys(password);
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        hmcpage.loginButonu.click();
    }
}

