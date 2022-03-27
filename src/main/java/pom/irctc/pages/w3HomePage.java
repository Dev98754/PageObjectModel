package pom.irctc.pages;

import wrappers.GenericWrappers;

public class w3HomePage extends GenericWrappers {
	
public w3HomePage switchToNext() {
		
		switchToLastWindow();
		return this;
		
		
	}
	
	
	
	
	public w3HomePage clickOnclose() {
		
		closeAllBrowsers();
		return this;
		
		
	}
	

}
