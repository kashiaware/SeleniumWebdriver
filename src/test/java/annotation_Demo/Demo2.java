package annotation_Demo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo2 {
  
/*1)login ---@Beforeclass
2)search--@Test
3)adv Search ---@Test
4)logout---@AfterClass
*/
@BeforeClass
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
  @AfterClass
  void logout()
  {
	  System.out.println("This is logout...");  
}
  }