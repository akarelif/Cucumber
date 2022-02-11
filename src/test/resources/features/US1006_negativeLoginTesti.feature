Feature: US1005 Negative login testi
  @hotel
  Scenario:TC09_Yanlis username, dagru sifre ile giris yapilamaz
    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tiklar
    And kullanici adi olarak "HMCWrongUsername" girer
    And password olarak "HMCValidPassword" girer
    Then login buttonuna basar
    And giris yapilamadigini test eder
    And sayfayi kapatir

  Scenario:TC10_Dogru username, yanlis  sifre ile giris yapilamaz
    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tiklar
    And kullanici adi olarak "HMCValidUsername" girer
    And password olarak "HMCWrongPassword" girer
    Then login buttonuna basar
    And giris yapilamadigini test eder
    And sayfayi kapatir

  Scenario:TC11_Yanlis username, yanlis  sifre ile giris yapilamaz
    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tiklar
    And kullanici adi olarak "HMCWrongUsername" girer
    And password olarak "HMCWrongPassword" girer
    Then login buttonuna basar
    And giris yapilamadigini test eder
    And sayfayi kapatir