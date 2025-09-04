package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class CustomDropdownUtils {
    WebDriver driver;

    public CustomDropdownUtils(WebDriver driver) {
        this.driver = driver;
    }
//
//    // Click to open dropdown
//    public void openDropdown(By toggleLocator) {
//        driver.findElement(toggleLocator).click();
//    }
//
//    // Get values from custom dropdown (after clicking)
//    public List<String> getCustomDropdownValues12(By toggleLocator, By optionsLocator) {
//        openDropdown(toggleLocator);
//        List<WebElement> options = driver.findElements(optionsLocator);
//        return options.stream()
//                .map(e -> e.getText().trim())
//                .collect(Collectors.toList());
//    }
//
//    public List<String> getCustomDropdownValues(By toggleLocator, By optionsLocator) {
//        driver.findElement(toggleLocator).click(); // open dropdown
//        List<WebElement> options = driver.findElements(optionsLocator);
//        return options.stream()
//                .map(e -> e.getText().trim())
//                .collect(Collectors.toList());
//    }

}