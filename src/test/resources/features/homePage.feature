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
    When tek yon ucus secilir: "Adana"
    When search butonuna basilir
    When ucuslar ucuzdan pahaliya siralanir
    When en ucuzu secilir
    When ecofly sinifi secilir
    When ekstra hizmetler secilmeden devam edilir
    When dogum tarihi girilir "01-04-1994"
    When isim:"Erdem" ve soyisim:"Demirtas" gir
    When cinsiyet secilir
    When TCKN girilir "16084962264"
    When yolcunun iletisim bilgileri doldurulur
    When yolcunun iletisim izinleri verilir
    When koltuk secimi gecilir
    When ucus ozeti onaylanir
