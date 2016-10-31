package com.github.licanhua.test.showcase.amazon.pages;

import com.github.licanhua.test.framework.Container;
import com.github.licanhua.test.framework.annotation.RelativeElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * @author Canhua Li
 */
public class SearchResultListContainer extends Container {
    @RelativeElement
    @FindBy(xpath=".//li[starts-with(@id, 'result_')]")
    List<SearchItem> searchItemList;

    public void printAllItems(){
        StringBuilder sb = new StringBuilder();
        sb.append("We found totally " + searchItemList.size() + " items\n");
        int i= 1;
        for (SearchItem searchItem: searchItemList) {
            sb.append(i++);
            sb.append(" ");
            sb.append(searchItem.getItemDisplayString());
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
