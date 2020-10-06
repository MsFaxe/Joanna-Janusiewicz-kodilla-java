package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_CREATE_ACC = "//div[contains(@class, \"_6ltg\")]/a[contains(@role, \"button\")]";
    public static final String XPATH_NAME = "firstname";
    public static final String XPATH_LASTNAME = "lastname";
    public static final String XPATH_MAIL = "reg_email__";
    public static final String XPATH_PASS = "reg_passwd__";
    public static final String XPATH_BIRTH_DAY = "birhtday_day";
    public static final String XPATH_BIRTH_MONTH = "birhtday_month";
    public static final String XPATH_BIRTH_YEAR = "birhtday_year";
    public static final String XPATH_SEX = "u_2_2";

    public static final String XPATH_WAIT_FOR = "//div[contains(@class, \"_li _31e\")]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement searchField = driver.findElement(By.xpath(XPATH_CREATE_ACC));
        searchField.click();

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement firstnameField = driver.findElement(By.xpath(XPATH_NAME));
        firstnameField.sendKeys("John");

        //while (!driver.findElement(By.name(XPATH_BIRTH_DAY)).isDisplayed());

//        WebElement selectBirthDay = driver.findElement(By.name(XPATH_BIRTH_DAY));
//        Select selectBoard = new Select(selectBirthDay);
//        selectBoard.selectByIndex(1);
    }
}
