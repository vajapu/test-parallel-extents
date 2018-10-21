//package com.comcast.ucAppAutomation.mobile.pages.android;
//
//import static org.testng.Assert.assertTrue;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import com.comcast.ucAppAutomation.businessDrivenTesting.stepDefinitions.ServiceHooks;
//import com.comcast.ucAppAutomation.utils.DriverFactory;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSFindBy;
// 
//public class HomePage extends DriverFactory{
//	
//	public HomePage() {
//		try{
//		//PageFactory.initElements(new AppiumFieldDecorator(driver), HomePage.class);
//		}catch(Exception e){
//			System.out.println("hdgsjgdh");
//		}
//	}
// 
//    // All the locators for Home page will be defined here
//    //By homePageImage = By.id("com.xebia.eventsapp:id/home_banner_imageView");
//    @AndroidFindBy(id="com.xebia.eventsapp:id/home_banner_imageView")
//    @iOSFindBy(id="ios element")
//    private MobileElement homePageImage;
//    
//    By agendaButton = By.id("com.xebia.eventsapp:id/home_agenda_title");
//    By speakersButton = By.id("com.xebia.eventsapp:id/home_speakers_title");
//    By myScheduleButton = By.id("com.xebia.eventsapp:id/home_mySchedule_title");
//    By locationButton = By.id("com.xebia.eventsapp:id/home_location_title");
// 
//    By backButton = By.id("android:id/home");
//
//	// All the behavior of home page will be defined here in functions
//    public void verifyHomePage()
//    {
////        try{
////    	waitVar.until(ExpectedConditions.visibilityOf(homePageImage));
////        }catch(Exception e){
////        	System.out.println("acsbjdcjh");
////        }
////        if(homePageImage.isDisplayed()){
////        	//ServiceHooks.scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"hgfhfhgfghf");
////        	ServiceHooks.scenario.write("homepage zkjdgcjhc");
////        	assertTrue(true,"DISPLAYED");
////        }
////        else
////        	assertTrue(false,"NOT DISPLAYED");
//    	System.err.println(driver+"  "+Thread.currentThread().getId());
//    }
// 
//    public void verifyHomePageOptions()
//    {
////         waitVar.until(ExpectedConditions.visibilityOf(homePageImage));
////         waitVar.until(ExpectedConditions.elementToBeClickable(agendaButton));
//// 
////         assertTrue(driver.findElement(agendaButton).isDisplayed());
////         assertTrue(driver.findElement(speakersButton).isDisplayed());
////         assertTrue(driver.findElement(locationButton).isDisplayed());
////         assertTrue(driver.findElement(myScheduleButton).isDisplayed());
//// 
////         //print all the options on HomePage
////         System.out.println(driver.findElement(agendaButton).getText());
////         System.out.println(driver.findElement(speakersButton).getText());
////         System.out.println(driver.findElement(myScheduleButton).getText());
////         System.out.println(driver.findElement(locationButton).getText());
//    	System.err.println(driver+"   "+Thread.currentThread().getId());
//    }
// 
//    public void clickAgenda(){
//        //driver.findElement(agendaButton).click();
//    }
// 
//    public void clickSpeakers() {
//        //driver.findElement(speakersButton).click();
//    }
// 
//    public void clickBack() {
////        driver.findElement(backButton).click();
////        waitVar.until(ExpectedConditions.elementToBeClickable(agendaButton));
//// 
////        if (driver.findElement(agendaButton).isDisplayed()){
////            System.out.println("Successfully reach to home page");
////        }
////        else{
////            System.out.println("Did Not reach to home page");
////        }
//    }
//}
