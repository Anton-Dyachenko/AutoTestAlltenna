package Tests;

import AlltennaWebPages.BasePage;
import AlltennaWebPages.BasePageLoggedIn;
import AlltennaWebPages.LoginAWSPage;
import core.BaseAlltennaWebTest;
import org.junit.Assert;
import org.junit.Test;

public class LoginLogout extends BaseAlltennaWebTest {

    @Test
    public void loginLogout() {
        System.out.println("Test #1: Login and logout");
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
        System.out.println("Step 3: click the avatar");

        Assert.assertEquals(true,basePageLoggedIn.dropdownBox.isDisplayed());
        Assert.assertEquals(true,basePageLoggedIn.dropdownBox.isEnabled());
        basePageLoggedIn.signOut();
        System.out.println("Step 4: click Sign out from dropbox");
        System.out.println("Test 1 passed");



    }





}
