package com.github.licanhua.test.showcase.amazon.test;

import com.github.licanhua.test.framework.AutomationDriver;
import com.github.licanhua.test.framework.config.Configuration;
import com.github.licanhua.test.showcase.amazon.pages.Pages;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Canhua Li
 */
public class AmazonTest {
    @Rule
    public AutomationDriver driver = new AutomationDriver();

    @Test
    public void testSearchDiaper() {
        Configuration config = driver.getConfiguration();
        String department = config.getString("searchDepartment");
        String searchText = config.getString("searchText");

        Pages.homePage().doSearch(department, searchText);
        Pages.searchResultPage().printSearchResult();
    }
}
