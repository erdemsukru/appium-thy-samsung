@Turkishairlines
Feature: Thy book a flight

  @SelectCheapestTicket
  Scenario: User selected cheapest ticket successfully
  Given Start the Application
    When servisleri kabul et
    When bildirimler kabul edilir
    When popup kapatilir
    When ucus rezervasyonu secilir
    When tek yon secilir
    When inis havalimani secilir
    When tek yon ucus secilir: "Gaziantep"
    When search butonuna basilir
    When ucuslar ucuzdan pahaliya siralanir
    When en ucuzu secilir
    When ecofly sinifi secilir
    When ecofly sinifina devam edilir
    When ecofly son olarak secilir
    When ekstra hizmetler secilmeden devam edilir
    When isim:"Erdem" ve soyisim:"Demirtas" gir
    When cinsiyet secilir
    When dogum tarihi girilir: "01-04-1994"
    When yolcunun mail adresi girilir:"erdemsukrudemirtas@gmail.com"
    When TCKN girilir: "16084962264"
    When yolcu bilgileri kayit edilir
    When yolcunun telefonunun ulke kodu secilir
    When yolcunun telefonu girilir: "5069358881"
    When yolcunun iletisim izinleri verilir
    When ucus ozeti onaylanir

