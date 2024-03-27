package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.elementHelper;

public class homePage {

    AppiumDriver driver;
    elementHelper elementHelper;

    By skipNotifications = AppiumBy.id("com.turkishairlines.mobile:id/itemOnboardingTemplate1_llBtn2");
    By skipButton = AppiumBy.id("com.turkishairlines.mobile:id/frOnboardingTop_ttSkip");
    By continueGuest = AppiumBy.id("com.turkishairlines.mobile:id/frOnboardingTop_ttSkip");
    By popup = AppiumBy.id("com.turkishairlines.mobile:id/dgBase_btnPositive");
    By allowLocation = AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By bookButton = AppiumBy.id("com.turkishairlines.mobile:id/acMain_btnBooking");
    By oneWay = AppiumBy.id("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
    By destination = AppiumBy.id("com.turkishairlines.mobile:id/frDashboard_llTo");
    By searchAnkara = AppiumBy.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
    By searchButton = AppiumBy.id("com.turkishairlines.mobile:id/itemAirport_tvTop");
    By clickDone = AppiumBy.id("com.turkishairlines.mobile:id/frDashboard_btnDone");
    By searchFlight = AppiumBy.id("com.turkishairlines.mobile:id/frDashboard_btnSearch");
    By filterFlight = AppiumBy.id("com.turkishairlines.mobile:id/frFlightSearch_tvSortAndFilter");
    By selectCheapest = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.view.ViewGroup");
    By applyCheapest = AppiumBy.id("com.turkishairlines.mobile:id/frFilterAndSort_btnApply");
    By selectedCheapestFlight = AppiumBy.id("com.turkishairlines.mobile:id/itemFlightSearchParent_imCheapestPrice_Domestic");
    By selectEcoFly = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup");
    By continueEcoFly = AppiumBy.id("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");
    By stayOnEcoFly = AppiumBy.id("com.turkishairlines.mobile:id/bsEcoExtra_btnNegative");
    By addName = AppiumBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddName");
    By addLastName = AppiumBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddLastName");
    By gender = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.CheckBox[1]");
    By addBirthday = AppiumBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddDateOfBirth");
    By addEmail = AppiumBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddEmail");
    By nationality = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.CheckBox[1]");
    By addTCKN = AppiumBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddTCKN");
    By addPassenger = AppiumBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_btnAddPassenger");
    By continueLast = AppiumBy.id("com.turkishairlines.mobile:id/layoutGenericBottom_btnContinue");
    By countryCode = AppiumBy.id("com.turkishairlines.mobile:id/frAddContactInfo_etCountryCode");
    By searchCountryCode = AppiumBy.id("com.turkishairlines.mobile:id/frPhoneCode_etSearch");
    By searchTurkey = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout");
    By telNumber = AppiumBy.id("com.turkishairlines.mobile:id/frAddContactInfo_etPhoneNumber");
    By emailPermission = AppiumBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_cbEmail");
    By smsPermission = AppiumBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_cbSms");
    By extraService = AppiumBy.id("com.turkishairlines.mobile:id/frAddContactInfo_btnContinue");
    By lastContinue = AppiumBy.id("com.turkishairlines.mobile:id/layoutGenericBottom_btnContinue");


    public homePage(AppiumDriver appiumDriver) {
        driver = appiumDriver;
        elementHelper = new elementHelper(appiumDriver);
    }

    // Tek yöne bilet seçme işlemi
    public void selectOneWayTicket() {
        //elementHelper.click(skipNotifications);
        //elementHelper.click(skipButton);
        //elementHelper.click(continueGuest);
        //elementHelper.click(allowLocation);
        //elementHelper.click(bookButton);
        //elementHelper.click(oneWay);
        //elementHelper.click(destination);
        //elementHelper.sendKeys(searchAnkara);
        //elementHelper.click(searchButton);
        //elementHelper.click(clickDone);
        //elementHelper.click(searchFlight);
        //elementHelper.click(filterFlight);
        //elementHelper.click(selectCheapest);
        //elementHelper.click(applyCheapest);
        //elementHelper.click(selectedCheapestFlight);
        ///elementHelper.click(selectEcoFly);
       /// elementHelper.click(continueEcoFly);
        //elementHelper.click(stayOnEcoFly);
        //elementHelper.sendKeys(addName, "Erdem");
        //elementHelper.sendKeys(addLastName, "Demirtas");
        //elementHelper.click(gender);
        //elementHelper.sendKeys(addBirthday, "01-04-1994");
        //elementHelper.sendKeys(addEmail, "erdemsukrudemirtas@gmail.com");
        //elementHelper.click(nationality);
        ////elementHelper.sendKeys(addTCKN, "16084962264");
        //elementHelper.click(addPassenger);
        //elementHelper.click(continueLast);
        //elementHelper.sendKeys(countryCode, "90");// elementHelper.sendKeys(searchCountryCode, "Türkiye");
     //lementHelper.click(searchTurkey);
       //lementHelper.sendKeys(telNumber, "5069358881");
       // //elementHelper.click(emailPermission);
        //elementHelper.click(smsPermission);
        //elementHelper.click(extraService);
        //elementHelper.click(lastContinue);
    }
    public void bildirimleriGec(){
        elementHelper.click(skipNotifications);
        elementHelper.click(skipButton);
        elementHelper.click(continueGuest);
    }
    public void konumIzniVer(){
        elementHelper.click(allowLocation);
    }

    public void isimSoyisimGir(String isim, String soyisim){
        elementHelper.sendKeys(addName,isim);
        elementHelper.sendKeys(addLastName,soyisim);

    }
    public void ucusRezervasyonuSecilir(){
        elementHelper.click(bookButton);
    }

    public void tekYonSecilir(){
        elementHelper.click(oneWay);
    }

    public void inisHavalimaniSecilir(){
        elementHelper.click(destination);
    }

    public void searchButonunaBasilir(){
        elementHelper.click(searchButton);
        elementHelper.click(clickDone);
        elementHelper.click(searchFlight);
    }

    public void ucuslarUcuzdanPahaliyaSiralanir(){
        elementHelper.click(filterFlight);
    }

    public void enUcuzuSecilir(){
        elementHelper.click(selectCheapest);
        elementHelper.click((applyCheapest));
        elementHelper.click(selectedCheapestFlight);
    }

    public void ecoflySinifiSecilir(){
        elementHelper.click(selectEcoFly);
    }
    public void ecoflySinifinaDevamEdilir(){
        elementHelper.click(continueEcoFly);
    }
    public void ecoflySonOlarakSecilir(){
        elementHelper.click(stayOnEcoFly);
    }
    public void selectArrivalTicket(String arrivalAirport) {
        elementHelper.sendKeys(searchAnkara, arrivalAirport);

    }
    public void dogumTarihiGirilir(String birthday){
        elementHelper.sendKeys(addBirthday, birthday);
    }

    public void cinsiyetSecilir(){
        elementHelper.click(gender);
        elementHelper.click(nationality);
    }

    public void tcknGirilir(String tckn){

        elementHelper.sendKeys(addTCKN,tckn);
    }
    public void yolcununIletisimBilgileriDoldurulur(String countryRegion){
        elementHelper.sendKeys(countryCode,countryRegion);
    }
    public void yolcununIletisimIzinleriVerilir(){
        elementHelper.click(emailPermission);
        elementHelper.click(smsPermission);
    }
    public void popupKapatilir(){
        elementHelper.click(popup);
    }

    public void yolcununMailAdresiGirilir(String mail){
        elementHelper.sendKeys(addEmail,mail);
    }

    public void yolcuBilgileriKayitEdilir(){
        elementHelper.click(addPassenger);
        elementHelper.click(continueLast);
    }

    public void yolcununTelefonuGirilir(String cepTel){
        elementHelper.sendKeys(telNumber, cepTel);
    }

    public void yolcununTelefonununUlkeKoduSecilir (){
        elementHelper.click(countryCode);
        elementHelper.click(searchCountryCode);
        elementHelper.click(searchTurkey);
    }
    public void ucusOzetiOnaylanir(){
        elementHelper.click(lastContinue);
    }


}
