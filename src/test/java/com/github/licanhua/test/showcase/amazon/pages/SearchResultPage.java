package com.github.licanhua.test.showcase.amazon.pages;

import com.github.licanhua.test.framework.Page;
import org.openqa.selenium.support.FindBy;

/**
 * @author Canhua Li
 */
public class SearchResultPage extends Page {
    @FindBy(id = "nav-search")
    NavSearch navSearch;

    @FindBy(id="atfResults")
    SearchResults searchResults;

    public void printSearchResult() {
        System.out.println("Prepare to print all results");
        searchResults.printAllItems();
    }
}
