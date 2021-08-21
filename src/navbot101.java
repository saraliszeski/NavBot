import time;
from selenium import webdriver

options = webdriver.ChromeOptions()
        driver = webdriver.Chrome(executable_path='C:/Users/14403/Downloads/chromedriver_win32/chromedriver.exe', options=options)
        driver.maximize_window()
        driver.get('https://myrec.recreation.duke.edu/');
        time.sleep(3)
        WebElement myreclink = driver.findElement(By.className("nav navbar-right hidden-xs"));
        myreclink.click()
public class navbot101 {
}

