package Tests;

import AlltennaWebPages.BasePage;
import AlltennaWebPages.BasePageLoggedIn;
import AlltennaWebPages.LoginAWSPage;
import core.BaseAlltennaWebTest;
import org.junit.Assert;
import org.junit.Test;

public class MainPage extends BaseAlltennaWebTest {

    @Test
    public void dropdownBoxElements(){
        System.out.println("Test #10: Dropdownbox elements");
        BasePage basePage = new BasePage();
        LoginAWSPage loginAWSPage = new LoginAWSPage();
        BasePageLoggedIn basePageLoggedIn = new BasePageLoggedIn();


        Assert.assertEquals(true,basePage.loginButton.isDisplayed());
        basePage.openLoginPage();
        System.out.println("Step 1: Open the Base page and click Login button");


        Assert.assertEquals(true,loginAWSPage.loginField.isDisplayed());
        Assert.assertEquals(true,loginAWSPage.passwordField.isDisplayed());
        Assert.assertEquals(true,loginAWSPage.signInButton.isDisplayed());
        Assert.assertEquals(true,loginAWSPage.signInButton.isEnabled());
        loginAWSPage.auth();
        System.out.println("Step 2: fulfill login and password fields, click Sign in button");

        String Actual_Title = driver.getTitle();
        String Expected_Title = "Alltenna.org - stream online";

        Assert.assertEquals(Expected_Title,Actual_Title);
        Assert.assertEquals(false,basePage.check_login_button_is_displayed());
        Assert.assertEquals(true,basePageLoggedIn.avatar.isDisplayed());
        basePageLoggedIn.avatarDropdownBox();
        Assert.assertEquals(true,basePageLoggedIn.profileName.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.profileID.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.donateButtonDropbox.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.donateButtonDropbox.isEnabled());
        Assert.assertEquals(true,basePageLoggedIn.myDevices.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.myDevices.isEnabled());
        Assert.assertEquals(true,basePageLoggedIn.profile.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.profile.isEnabled());
        Assert.assertEquals(true,basePageLoggedIn.signOutButton.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.signOutButton.isEnabled());

        System.out.println("Step 3: click the avatar. Dropbox opened, all elements in dropbox are displayed and enabled");
    }
    @Test
    public void mainPageElements() {
        System.out.println("Test #11: Main page elements");
        BasePage basePage = new BasePage();
        LoginAWSPage loginAWSPage = new LoginAWSPage();
        BasePageLoggedIn basePageLoggedIn = new BasePageLoggedIn();


        Assert.assertEquals(true, basePage.loginButton.isDisplayed());
        basePage.openLoginPage();
        System.out.println("Step 1: Open the Base page and click Login button");


        Assert.assertEquals(true, loginAWSPage.loginField.isDisplayed());
        Assert.assertEquals(true, loginAWSPage.passwordField.isDisplayed());
        Assert.assertEquals(true, loginAWSPage.signInButton.isDisplayed());
        Assert.assertEquals(true, loginAWSPage.signInButton.isEnabled());
        loginAWSPage.auth();
        System.out.println("Step 2: fulfill login and password fields, click Sign in button");

        String Actual_Title = driver.getTitle();
        String Expected_Title = "Alltenna.org - stream online";

        Assert.assertEquals(Expected_Title, Actual_Title);
        Assert.assertEquals(false, basePage.check_login_button_is_displayed());

        Assert.assertEquals(true,basePageLoggedIn.alltennaHomeButton.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.alltennaHomeButton.isEnabled());
        Assert.assertEquals(true,basePageLoggedIn.homeButton.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.homeButton.isEnabled());
        Assert.assertEquals(true,basePageLoggedIn.aboutUsButton.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.aboutUsButton.isEnabled());
        Assert.assertEquals(true,basePageLoggedIn.faqButton.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.faqButton.isEnabled());
        Assert.assertEquals(true,basePageLoggedIn.postsButton.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.postsButton.isEnabled());
        Assert.assertEquals(true,basePageLoggedIn.facebookButton.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.facebookButton.isEnabled());
        Assert.assertEquals(true,basePageLoggedIn.twitterButton.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.twitterButton.isEnabled());
        Assert.assertEquals(true,basePageLoggedIn.instagramButton.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.instagramButton.isEnabled());
        Assert.assertEquals(true,basePageLoggedIn.donateButtonHeader.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.donateButtonHeader.isEnabled());
        Assert.assertEquals(true,basePageLoggedIn.donateButtonBody.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.donateButtonBody.isEnabled());

        System.out.println("All main page elements are enabled and displayed");
    }
}
