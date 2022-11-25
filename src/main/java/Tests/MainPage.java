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


        Assert.assertTrue(basePage.loginButton.isDisplayed());
        basePage.openLoginPage();
        System.out.println("Step 1: Open the Base page and click Login button");


        Assert.assertTrue(loginAWSPage.loginField.isDisplayed());
        Assert.assertTrue(loginAWSPage.passwordField.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isEnabled());
        loginAWSPage.auth();
        System.out.println("Step 2: fulfill login and password fields, click Sign in button");

        String Actual_Title = driver.getTitle();
        String Expected_Title = "Alltenna.org - stream online";

        Assert.assertEquals(Expected_Title,Actual_Title);
        Assert.assertFalse(basePage.check_login_button_is_displayed());
        Assert.assertTrue(basePageLoggedIn.avatar.isDisplayed());
        basePageLoggedIn.avatarDropdownBox();
        Assert.assertTrue(basePageLoggedIn.profileName.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.profileID.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.donateButtonDropbox.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.donateButtonDropbox.isEnabled());
        Assert.assertTrue(basePageLoggedIn.myDevices.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.myDevices.isEnabled());
        Assert.assertTrue(basePageLoggedIn.profile.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.profile.isEnabled());
        Assert.assertTrue(basePageLoggedIn.signOutButton.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.signOutButton.isEnabled());

        System.out.println("Step 3: click the avatar. Dropbox opened, all elements in dropbox are displayed and enabled");
    }
    @Test
    public void mainPageElements() {
        System.out.println("Test #11: Main page elements");
        BasePage basePage = new BasePage();
        LoginAWSPage loginAWSPage = new LoginAWSPage();
        BasePageLoggedIn basePageLoggedIn = new BasePageLoggedIn();


        Assert.assertTrue( basePage.loginButton.isDisplayed());
        basePage.openLoginPage();
        System.out.println("Step 1: Open the Base page and click Login button");


        Assert.assertTrue( loginAWSPage.loginField.isDisplayed());
        Assert.assertTrue( loginAWSPage.passwordField.isDisplayed());
        Assert.assertTrue( loginAWSPage.signInButton.isDisplayed());
        Assert.assertTrue( loginAWSPage.signInButton.isEnabled());
        loginAWSPage.auth();
        System.out.println("Step 2: fulfill login and password fields, click Sign in button");

        String Actual_Title = driver.getTitle();
        String Expected_Title = "Alltenna.org - stream online";

        Assert.assertEquals(Expected_Title, Actual_Title);
        Assert.assertFalse( basePage.check_login_button_is_displayed());

        Assert.assertTrue(basePageLoggedIn.alltennaHomeButton.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.alltennaHomeButton.isEnabled());
        Assert.assertTrue(basePageLoggedIn.homeButton.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.homeButton.isEnabled());
        Assert.assertTrue(basePageLoggedIn.aboutUsButton.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.aboutUsButton.isEnabled());
        Assert.assertTrue(basePageLoggedIn.faqButton.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.faqButton.isEnabled());
        Assert.assertTrue(basePageLoggedIn.postsButton.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.postsButton.isEnabled());
        Assert.assertTrue(basePageLoggedIn.facebookButton.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.facebookButton.isEnabled());
        Assert.assertTrue(basePageLoggedIn.twitterButton.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.twitterButton.isEnabled());
        Assert.assertTrue(basePageLoggedIn.instagramButton.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.instagramButton.isEnabled());
        Assert.assertTrue(basePageLoggedIn.donateButtonHeader.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.donateButtonHeader.isEnabled());
        Assert.assertTrue(basePageLoggedIn.donateButtonBody.isDisplayed());
        Assert.assertTrue(basePageLoggedIn.donateButtonBody.isEnabled());

        System.out.println("All main page elements are enabled and displayed");
    }
}
