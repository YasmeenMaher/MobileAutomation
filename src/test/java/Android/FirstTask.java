package Android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class FirstTask {

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("platformName","Android");
        caps.setCapability("app","/Users/admin/Desktop/Breadfast2/Breadfast_2.17.0_apkcombo.com.apk");
        caps.setCapability("deviceName","Pixel 3 API 27_test");
        caps.setCapability("platformVersion","8.1");
        caps.setCapability("udid","emulator-5554");
        caps.setCapability("autoGrantPermissions", "true");



        driver =new AppiumDriver(new URL("http://localhost:4723/wd/hub"),caps);


    }
    AppiumDriver driver;
    @Test
    public void Add_item_in_the_cart(){

        //code
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("ar");
        el1.click();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"متابعة\"]/android.view.ViewGroup/android.widget.TextView");
        el2.click();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        MobileElement el3 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"التالي\"]/android.view.ViewGroup");
        el3.click();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        MobileElement el4 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"التالي\"]/android.view.ViewGroup");
        el4.click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        MobileElement el5 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"تسوق الآن!\"]/android.view.ViewGroup");
        el5.click();

        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

        MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("اضغط للتآكيد");
        el7.click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("start_btn");
        el8.click();
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        MobileElement el9 = (MobileElement) driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"collection_imgview\"])[1]/android.view.ViewGroup/android.widget.ImageView");
        el9.click();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        MobileElement el10 = (MobileElement) driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"AddToCart_btn\"])[2]/android.widget.TextView");
        el10.click();



    }


//if you want the app close after the execution please remove "//"
//    @AfterTest
//    public void tearDown() {
//        if (null !=driver){
//            driver.quit();
//        }
//}
}


