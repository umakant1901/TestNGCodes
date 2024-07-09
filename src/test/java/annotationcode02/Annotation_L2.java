package annotationcode02;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_L2 {

	@BeforeSuite
	public void setUpBeforeSuite()
	{
		System.out.println("set Up Before Suite");
	}
	@AfterSuite
	public void tearDownAfterSuite()
	{
		System.out.println("tear Down After Suite");
	}
	
	@BeforeTest
	public void setUpBeforeTest()
	{
		System.out.println("set Up Before Test");
	}
	
	@AfterTest
	public void tearDownAfterTest()
	{
		System.out.println("tear Down After Test");
	}
	
	@BeforeClass
	public void setUpBeforeClass()
	{
		System.out.println("Before class set up");
	}
	@AfterClass
	public void TearDownAfterClass()
	{
		System.out.println("After class tear down");
	}
	
	
	@Test
	public void testMethod01()
	{
	System.out.println("testMethod01 in L2");
	}
	
	@Test
	public void testMethod02()
	{
		System.out.println("testMethod02 in L2");	
	}
}
