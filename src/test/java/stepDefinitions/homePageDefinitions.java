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

    @When("yolcunun iletisim bilgileri doldurulur")
    public void yolcununIletisimBilgileriDoldurulur(String email) {
        login.yolcununIletisimBilgileriDoldurulur(email);
    }

    @When("yolcunun iletisim izinleri verilir")
    public void yolcununIletisimIzinleriVerilir() {
        login.yolcununIletisimIzinleriVerilir();
    }

    @When("koltuk secimi gecilir")
    public void koltukSecimiGecilir() {
    }

    @When("ucus ozeti onaylanir")
    public void ucusOzetiOnaylanir() {
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

    @When("dogum tarihi girilir")
    public void dogumTarihiGirilir(String birthday) {
        login.dogumTarihiGirilir(birthday);
    }

    @When("cinsiyet secilir")
    public void cinsiyetSecilir() {
        login.cinsiyetSecilir();
    }

    @When("TCKN:{string} girilir")
    public void tcknGirilir(String tckn) {
        login.tcknGirilir(tckn);

    }

    @When("popup kapatilir")
    public void popupKapatilir() {
        login.popupKapatilir();
    }
}
