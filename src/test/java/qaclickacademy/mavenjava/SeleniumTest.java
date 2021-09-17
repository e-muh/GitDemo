package qaclickacademy.mavenjava;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	 //use maven surefire plugin to run the testcases in maven
	//execute all the tests on the test folder with - comandline mvn test.
	
	//TestNG intergration into maven
	//compile selected test using testng suite xml file. Add xml configuration below to the maven surefire plugin after the version number.
/*<configuration>
    <suiteXmlFiles>
      <suiteXmlFile>testng.xml</suiteXmlFile>
    </suiteXmlFiles>
 </configuration>
 */
	
	//To run only a single test class, use this syntax on the command line: 
	//mvn -Dtest=classNameHere test
	
	//explore maven surefire plugin documentation for more such features above.
	
	// to run specific xml file on pom.xml, create profiles for each xml fine and trigger specific xml file on the command line with:
	// mvn test -PRegression .  P =profile, Regression = profile name you specified. each profile has a different xml file name, 
	
	@Test
	public void browserAutomation() {
		System.out.println("browserAutomation");
	}
	
	@Test
	public void elementUI() {
		System.out.println("elementUI");
	}

}