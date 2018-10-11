package tasks;

import org.openqa.selenium.WebDriver;

import appObject.SelectProductAppObject;

public class SelectProductTask {
	
	private SelectProductAppObject selectProductAppObject;

	public SelectProductTask(WebDriver driver) {
		this.selectProductAppObject = new SelectProductAppObject(driver);
	}

	public void MakeASearchFor(String product) {
		this.selectProductAppObject.getSearchBar().sendKeys(product);
		this.selectProductAppObject.getSearchButton().click();

	}
	
	public void clickOnFirstProduct()
	{
		this.selectProductAppObject.getFirstProduct().click();
	}
}
