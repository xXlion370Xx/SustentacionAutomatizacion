package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MyAccountPage {

    // This locator get the input id user
    public static final Target INPUT_ID_USER = Target.the("Input to enter id user").locatedBy("//input[@id='username']");
    // This locator get the input password user
    public static final Target INPUT_PASSWORD_USER = Target.the("Input to enter password user").locatedBy("//input[@id='password']");
    // This locator get the button to log in the credentials
    public static final Target BTN_LOG_IN = Target.the("Button log in").locatedBy("//button[@name='login']");
    // This locator get the button menu option to go account detail
    public static final Target BTN_DETAIL_ACCOUNT = Target.the("Button option menu").locatedBy("//a[text()='Detalles cuenta']");
    // This locator get the input name
    public static final Target INPUT_NAME_USER = Target.the("Input name user").locatedBy("//input[@id='account_first_name']");
    // This locator get the input last name
    public static final Target INPUT_LAST_NAME_USER = Target.the("Input last name user").locatedBy("//input[@id='account_last_name']");
    // This locator get the input email user
    public static final Target INPUT_EMAIL_USER = Target.the("Input email user").locatedBy("//input[@id='account_email']");
    // This locator get the input current password user
    public static final Target INPUT_CURRENT_PASSWORD = Target.the("Input current password user").locatedBy("//input[@id='password_current']");
    // This locator get the input new password
    public static final Target INPUT_NEW_PASSWORD = Target.the("Input new password").locatedBy("//input[@id='password_1']");
    // This locator get the input confirm new password
    public static final Target INPUT_CONFIRM_NEW_PASSWORD = Target.the("Input new password").locatedBy("//input[@id='password_2']");
    // This locator get the button save changes
    public static final Target BTN_SAVE_CHANGES = Target.the("Button save changes").locatedBy("//button[@name='save_account_details']");
}
