package allinone;

import org.testng.annotations.Test;

public class testcases {

	@Test(priority = 1, groups = {"smoke","regression","functional"})
	public void login()
	{
		System.out.println("login");
	}
	
	@Test(priority = 2, dependsOnMethods = "login", groups = {"functional"})
	public void openMenu()
	{
		System.out.println("openMenu");
	}
	
	@Test(priority = 2, groups = {"functional"})
	public void navigationCheck()
	{
		System.out.println("navigationCheck");
	}
	
	@Test(priority = 3, groups = {"functional","regression"})
	public void openCheckBalanceOptions()
	{
		System.out.println("openCheckBalanceOptions");
	}
	
	@Test(priority = 3, dependsOnMethods = {"login","openCheckBalanceOptions"}, groups = {"functional","regression"})
	public void checkBalance()
	{
		System.out.println("checkBalance");
	}
	
	@Test(priority = 2, dependsOnMethods = {"login"}, groups = {"functional","regression"})
	public void checkTransactions()
	{
		System.out.println("checkTransactions");
	}
	
	@Test(priority = 6, dependsOnMethods = {"login"}, groups = {"functional"})
	public void checkHistory()
	{
		System.out.println("checkHistory");
	}
	
	@Test(priority = 9, dependsOnMethods = {"login"}, groups = {"functional","regression"})
	public void checkBankManagerDetails()
	{
		System.out.println("checkBankManagerDetails");
	}
	
	@Test(priority = 7, dependsOnMethods = {"login"}, groups = {"functional"})
	public void checkRegisterIssue()
	{
		System.out.println("checkRegisterIssue");
	}
	
	@Test(priority = 6, dependsOnMethods = {"login"}, groups = {"functional"})
	public void createNewIssue()
	{
		System.out.println("createNewIssue");
	}
	
	
	@Test(priority = 9, dependsOnMethods = {"login"}, groups = {"functional"})
	public void updateUserDetails()
	{
		System.out.println("createNewIssue");
	}
	
	@Test(priority = 6, dependsOnMethods = {"login"}, groups = {"functional","smoke"})
	public void addUser()
	{
		System.out.println("add user");
	}
	
	@Test(priority = 7, dependsOnMethods = {"login"}, groups = {"functional"})
	public void addNomini()
	{
		System.out.println("add nomini");
	}
	@Test(priority = 5, dependsOnMethods = {"login"}, groups = {"functional"})
	public void checkFD()
	{
		System.out.println("check FD");
	}
	@Test(priority = 5, dependsOnMethods = {"login"}, groups = {"functional","regression"})
	public void CheckRD()
	{
		System.out.println("check RD");
	}
	@Test(priority = 5, dependsOnMethods = {"login"}, groups = {"functional","regression"})
	public void CheckLoan()
	{
		System.out.println("check Loan");
	}
	@Test(priority = 10, dependsOnMethods = {"login"}, groups = {"functional","regression"})
	public void checkFAQ()
	{
		System.out.println("check FAQ");
	}
	
	@Test(priority =10, dependsOnMethods = {"login"}, groups = {"functional","regression","smoke"})
	public void logout()
	{
		System.out.println("Logout...!");
	}
}
