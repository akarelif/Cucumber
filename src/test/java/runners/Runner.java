package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@Editor",
        dryRun = false)

public class Runner {

    // Runner class'inin icine hicbir kod yazmiyoruz
    // Bu class icin onemli olan kullanacagimiz 2 adet notasyon

    // dryRun=false yazildiginda belirlenen tag ile etiketlenen tum senoryalari sirasiyla calistirir
    // dryRun=true  dedigimizde kodlari calistirmadan eksik stepler olup olmadigini kontrol eder
    // ve varsa bize eksik stepleri rapor eder

    // Features ve glue olarak spesifik bir class veya feature dosyasini degil
    // tum klasor ve package'i sectik
    // Dolayisiyla stepdefinitions package'i icerisinde hangi class'da olursa olsun
    // isimize yarayan bir stepdefition varsa rahatlikla kullanabiliriz
}
