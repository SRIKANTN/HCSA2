package Com_ActiTime_Test;

import org.testng.annotations.Test;

import Com_ActiTime_Generic.BaseTest;
import Com_ActiTime_Generic.ExcelData;
import Com_ActiTime_Page.actiTIMEEnterTimeTrackPage;
import Com_ActiTime_Page.actiTIMELoginPage;

public class ValidLoginLogouTest extends BaseTest
{
	@Test(priority =  1)
	public void ValidLoginLogou()
	{
		String un = ExcelData.getData(file_path, "TC01", 1, 0);
		String pw = ExcelData.getData(file_path, "TC01", 1, 1);
		String lgTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String hpTitle = ExcelData.getData(file_path, "TC01", 1, 3);
		//actiTIME -  Enter Time-Track
		actiTIMELoginPage lp = new actiTIMELoginPage(driver);
		actiTIMEEnterTimeTrackPage hp = new actiTIMEEnterTimeTrackPage(driver);
		//verify the title of login page
		lp.verifyTitle(lgTitle);
		//enter valid user name
		lp.enterUserName(un);
		//enter valid password
		lp.enterPassword(pw);
		//click on login button
		lp.clickOnLoginButton();
		//verify the title of enter time track page
		lp.verifyTitle(hpTitle);
		//click logout button
		hp.clickOnLogoutButton();
		//verify the title of login page
		lp.verifyTitle(lgTitle);
		
	}

}
