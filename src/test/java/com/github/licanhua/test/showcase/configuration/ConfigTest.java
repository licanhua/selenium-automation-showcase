package com.github.licanhua.test.showcase.configuration;

import com.github.licanhua.test.framework.AutomationDriver;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Canhua Li
 */
public class ConfigTest {
    @Rule
    public AutomationDriver driver = new AutomationDriver();
    @Test
    public void firstTest() {
        driver.getWebDriver().navigate().to("https://wwww.expedia.com");
    }
}
