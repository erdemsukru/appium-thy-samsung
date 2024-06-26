package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.homePage;
import utils.driverFactory;

public class homePageDefinitions {

    homePage login = new homePage(driverFactory.getDriver());


    @Given("Start the Application")
    public void startTheApplication() {
        //It starts automatically by the hooks
    }

    @When("konum izni verilir")
    public void konumIzniVerilir(String arrival) {
        login.konumIzniVer();
    }

    @When("bildirimler kabul edilir")
    public void bildirimlerKabulEdilir() {
    }

    @When("ucus rezervasyonu secilir")
    public void ucusRezervasyonuSecilir() {
        login.ucusRezervasyonuSecilir();
    }

    @When("tek yon secilir")
    public void tekYonSecilir() {
        login.tekYonSecilir();
    }

    @When("inis havalimani secilir")
    public void inisHavalimaniSecilir() {
        login.inisHavalimaniSecilir();
    }

    @When("tarih secilir")
    public void tarihSecilir() {
    }

    @When("search butonuna basilir")
    public void searchButonunaBasilir() {
        login.searchButonunaBasilir();
    }

    @When("ucuslar ucuzdan pahaliya siralanir")
    public void ucuslarUcuzdanPahaliyaSiralanir() {
        login.ucuslarUcuzdanPahaliyaSiralanir();
    }

    @When("en ucuzu secilir")
    public void enUcuzuSecilir() {
        login.enUcuzuSecilir();
    }

    @When("ecofly sinifi secilir")
    public void ecoflySinifiSecilir() {
        login.ecoflySinifiSecilir();
    }

    @When("ekstra hizmetler secilmeden devam edilir")
    public void ekstraHizmetlerSecilmedenDevamEdilir() {
    }

    @When("kisi bilgileri doldurulur")
    public void kisiBilgileriDoldurulur() {
    }

    @When("yolcunun iletisim izinleri verilir")
    public void yolcununIletisimIzinleriVerilir() {
        login.yolcununIletisimIzinleriVerilir();
    }

    @When("ucus ozeti onaylanir")
    public void ucusOzetiOnaylanir() {
        login.ucusOzetiOnaylanir();
    }

    @When("tek yon ucus secilir: {string}")
    public void tekYonUcusSecilir(String city) {
        login.selectArrivalTicket(city);
    }

    @When("servisleri kabul et")
    public void servisleriKabulEt() {
        login.konumIzniVer();
        login.bildirimleriGec();

    }

    @When("isim:{string} ve soyisim:{string} gir")
    public void isimVeSoyisimGir(String isim, String soyisim) {
        login.isimSoyisimGir(isim,soyisim);
    }



    @When("cinsiyet secilir")
    public void cinsiyetSecilir() {
        login.cinsiyetSecilir();
    }

    @When("popup kapatilir")
    public void popupKapatilir() {
        login.popupKapatilir();
    }

    @When("ecofly sinifina devam edilir")
    public void ecoflySinifinaDevamEdilir() {
        login.ecoflySinifinaDevamEdilir();
    }

    @When("ecofly son olarak secilir")
    public void ecoflySonOlarakSecilir() {
        login.ecoflySonOlarakSecilir();
    }

    @When("dogum tarihi girilir: {string}")
    public void dogumTarihiGirilir(String birthday) {
        login.dogumTarihiGirilir(birthday);
    }


    @When("TCKN girilir: {string}")
    public void tcknGirilir(String tckn) {
        login.tcknGirilir(tckn);
    }

    @When("yolcunun mail adresi girilir:{string}")
    public void yolcununMailAdresiGirilir(String mail) {
        login.yolcununMailAdresiGirilir(mail);
    }

    @When("yolcu bilgileri kayit edilir")
    public void yolcuBilgileriKayitEdilir() {
        login.yolcuBilgileriKayitEdilir();
        ;
    }
    @When("yolcunun telefonu girilir: {string}")
    public void yolcununTelefonuGirilir(String cepTel) {
        login.yolcununTelefonuGirilir(cepTel);
    }

    @When("yolcunun telefonunun ulke kodu secilir")
    public void yolcununTelefonununUlkeKoduSecilir() {
        login.yolcununTelefonununUlkeKoduSecilir();
    }
}
