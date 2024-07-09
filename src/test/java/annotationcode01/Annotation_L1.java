package annotationcode01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_L1 {
	
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
	
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("BeforeMethod set up");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("AfterMethod tear down");
	}
	
	
	@Test
	public void testAnnotation1()
	{
		System.out.println("first test annotation m1");
	}
	
	@Test
	public void testAnnotation2()
	{
		System.out.println("first test annotation m2");
	}
	
	
	@Test
	public void testAnnotation3()
	{
		System.out.println("first test annotation m3");
	}

}
