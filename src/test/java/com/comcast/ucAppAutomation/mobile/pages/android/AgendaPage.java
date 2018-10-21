//package com.comcast.ucAppAutomation.mobile.pages.android;
//
//import static org.testng.Assert.assertEquals;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import com.comcast.ucAppAutomation.utils.DriverFactory;
//
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.pagefactory.AndroidFindBy;
// 
//public class AgendaPage extends DriverFactory{
// 
//    // All the locators for Agenda page will be defined here
//	@AndroidFindBy(id="com.xebia.eventsapp:id/action_bar_custom_title")
//	private MobileElement title;
//    By AgendaList = By.id("referenceOfAgendaList");
// 
//    // All the behavior of Agenda page will be defined here in functions
// 
//    public void verifyAgendaPage() {
//        waitVar.until(ExpectedConditions.invisibilityOfElementLocated(AgendaList));
// 
//        assertEquals("Agenda",title.getText());
//    }
// 
//    public void clickonAgenda(){
//        //code goes here
//    }
// 
//}
