import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class ExampleTest {

	public static final String USERNAME = "YOUR_USERNAME";
	public static final String ACCESS_KEY = "YOUR_ACCESS_KEY";
	public static final String URL = "http://" + "nits" + ":" + "1e9d3e5a-c560-4dda-814d-88d698895884" + "@ondemand.saucelabs.com:80/wd/hub";

	
	@Test(groups="functest")
	public static void Testing() throws Exception
	{
		

			DesiredCapabilities caps = DesiredCapabilities.chrome();
		

			WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

			/**
			 * Goes to Sauce Lab's guinea-pig page and prints title
			 */

			driver.get("https://saucelabs.com/test/guinea-pig");
			System.out.println("title of page is: " + driver.getTitle());

			driver.quit();
	}
	
	@Test(groups="functest1")
	public static void Testing1()
	{
		System.out.println("Hello Nitish1");
	}
}
