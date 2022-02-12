@Editor
Feature: TC14 kullanici yeni kayit ekleyebilmeli

Scenario Outline: TC14 kullanici yeni kayit ekleyebilmeli

  When kullanici https://editor.datatables.net adresine gider
  When kullanici editor anasayfaya gider
  Then new butonuna basar
  And firstname olarak "<firstname>" yazar
  And lastname olarak "<lastname>" yazar
  And Position olarak "<position>" yazar
  And Office olarak "<office>" yazar
  And Extension olarak "<extension>" yazar
  And Start date olarak "<startDate>" yazar
  And 1 saniye bekler
  And Salary olarak "<salary>" yazar
  And Create tusuna basar
  And 1 saniye bekler
  When kullanici "<firstname>" ile arama yapar
  Then isim bolumunde "<firstname>" oldugunu dogrular

  Examples:
    | firstname | lastname | position | office | extension | startDate | salary |
    | Elif | Akar | QA | Ankara | QA | 2020-10-23 | 1500 |
    | Derya | Soylu | PO | İstanbul | Po | 2022-02-24 | 18000 |




