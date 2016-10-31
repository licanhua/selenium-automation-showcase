package com.github.licanhua.test.showcase.amazon.pages;

import com.github.licanhua.test.framework.util.PageHelper;

/**
 * @author Canhua Li
 */
public class Pages {
    public static HomePage homePage() {
        return PageHelper.toPage(HomePage.class);
    }

    public static SearchResultPage searchResultPage() {
        return PageHelper.toPage(SearchResultPage.class);
    }
}
