package annotation_Demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*1)login ---@BeforeMethod
1)search--@Test
3)logout ---@AfterMethod
4)login
5)adv Search ---@Test
6)logout
*/
public class Demo1 {
  @BeforeMethod
   void login()
  {

  System.out.println("This is login...");
 }
  @Test(priority=1)
  void search()
  {
	  System.out.println("This is search...");  
  }
  @Test(priority=2)
  void advsearch()
  {
	  System.out.println("This is adv Search...");  
  }
  @AfterMethod
  void logout()
  {
	  System.out.println("This is logout...");  
  }
  
}




