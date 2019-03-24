package com.divya.automationcucumber;


public class AutomationConstants {

	
	public static final String CHROME_WEB_DRIVER = "webdriver.chrome.driver";
	
	public static final String CHROME_WEB_DRIVER_PATH = "./src/test/resources/webdriver/chromedriver.exe";
	
	// FACEBOOK SIGN UP PAGE DETAILS
	
	public static final String FB_SIGNUP_URL = "https://www.facebook.com/r.php";
	
	public static final String FB_SIGNUP_TITLE = "//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i";

	public static final String FB_SIGNUP_PAGE_HEADER = "//*[@id=\"content\"]/div/div/div[1]/div[1]";

	public static final String FB_SIGNUP_FIRST_NAME = "firstname";

	public static final String FB_SIGNUP_LAST_NAME = "lastname";

	public static final String FB_SIGNUP_EMAIL = "reg_email__";

	public static final String FB_SIGNUP_EMAIL_RE_ENTER = "reg_email_confirmation__";

	public static final String FB_SIGNUP_PASSWORD = "reg_passwd__";

	public static final String FB_SIGNUP_BIRTH_DAY = "birthday_day";

	public static final String FB_SIGNUP_BIRTH_MONTH = "birthday_month";

	public static final String FB_SIGNUP_BIRTH_YEAR = "birthday_year";

	public static final String FB_SIGNUP_SEX = "sex";
	
	public static final int FB_SIGNUP_FEMALE = 0;
	
	public static final int FB_SIGNUP_MALE = 1;

	public static final String FB_SIGNUP_SUBMIT = "websubmit";

}
