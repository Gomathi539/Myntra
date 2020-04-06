package com.tyss.myntraTestScript;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.tyss.genericlib.Base;

public class ClearFilter extends Base {
	@Test
	public void clearFilter() {
		home.getSearchBar().sendKeys("kids wear", Keys.ENTER);
		kidswr.getBoysRadioBtn().click();
		kidswr.getageDD().click();
		kidswr.getageFilter().click();
		kidswr.getageCollapse().click();
		kidswr.getRemoveFilter().click();
		kidswr.getClearFilter().click();

	}
}
