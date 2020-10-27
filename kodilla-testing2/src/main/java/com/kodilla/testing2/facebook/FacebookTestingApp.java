package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_ACCEPT_COOKIE = "//*[@id=\"u_0_k\"]";
    public static final String XPATH_CREATE_ACC = "//div[contains(@class, \"_6ltg\")]/a[contains(@role, \"button\")]";
    public static final String XPATH_NAME = "//*[@name=\"firstname\"]";
    public static final String XPATH_LASTNAME = "//*[@name=\"lastname\"]";
    public static final String XPATH_MAIL = "//*[@name=\"reg_email__\"]";
    public static final String XPATH_CONFIRM_MAIL = "//*[@name=\"reg_email_confirmation__\"]";
    public static final String XPATH_PASS = "//*[@name=\"reg_passwd__\"]";
    public static final String XPATH_BIRTH_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_BIRTH_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_BIRTH_YEAR = "//*[@id=\"year\"]";
    public static final String XPATH_SEX = "//span[@data-type=\"radio\"]//input[@value=2]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        while (!driver.findElement(By.xpath(XPATH_ACCEPT_COOKIE)).isDisplayed());
        WebElement searchAcceptCookie = driver.findElement(By.xpath(XPATH_ACCEPT_COOKIE));
        searchAcceptCookie.click();

        WebElement searchField = driver.findElement(By.xpath(XPATH_CREATE_ACC));
        searchField.click();

        Thread.sleep(500);

        driver.findElement(By.xpath(XPATH_NAME)).sendKeys("John");
        driver.findElement(By.xpath(XPATH_LASTNAME)).sendKeys("Kowalski");
        driver.findElement(By.xpath(XPATH_MAIL)).sendKeys("John@xyz.com");

        Thread.sleep(500);

        driver.findElement(By.xpath(XPATH_CONFIRM_MAIL)).sendKeys("John@xyz.com");
        driver.findElement(By.xpath(XPATH_PASS)).sendKeys("password");

        WebElement selectBirthDay = driver.findElement(By.xpath(XPATH_BIRTH_DAY));
        Select selectDay = new Select(selectBirthDay);
        selectDay.selectByIndex(5);
        WebElement selectBirthMonth = driver.findElement(By.xpath(XPATH_BIRTH_MONTH));
        Select selectMonth = new Select(selectBirthMonth);
        selectMonth.selectByIndex(2);
        WebElement selectBirthYear = driver.findElement(By.xpath(XPATH_BIRTH_YEAR));
        Select selectYear = new Select(selectBirthYear);
        selectYear.selectByIndex(20);

        driver.findElement(By.xpath(XPATH_SEX)).click();
    }
}
