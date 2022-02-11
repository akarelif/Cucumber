Feature: US1005 Positive login testi
@hotel
  Scenario:TC08_Positive login
    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tiklar
    Then kullanici adi olarak "HMCValidUsername" girer
    And password olarak "HMCValidPassword" girer
    And login buttonuna basar
    Then basarili olarak giris yapildigini test eder
    And sayfayi kapatir