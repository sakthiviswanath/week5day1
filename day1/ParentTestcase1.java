package week5.day1;

import org.testng.annotations.Test;

public class ParentTestcase1 extends Parentclass{
	
	@Test
	public void runCreateLead() {
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
		

	}

}
