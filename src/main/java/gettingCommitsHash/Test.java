package gettingCommitsHash;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test{
	public static void main(String[] args){
		// TODO Auto-generated method stub

		//setting the driver executable
		//.\\Driver\\
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		//Initiating your chromedriver
		WebDriver driver=new ChromeDriver();
		/*
//Applied wait time
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//maximize window
driver.manage().window().maximize();
		 */
		/*System.out.println("Ingrese usuario");*/


		driver.get("https://gwre-devexp-ci-production-devci.gwre-devops.net/login.html");
		driver.manage().window().setSize(new Dimension(1130, 492));
		driver.findElement(By.id("username")).sendKeys("usuario");
		driver.findElement(By.id("password")).sendKeys("contrasena");
		driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement textDemo = driver.findElement(By.xpath("//*[text()='AU 177']"));
		textDemo.click();
		//Debería hacer un getURL() porque tengo que volver aca
		textDemo = driver.findElement(By.xpath("//*[text()='package-sbt']"));
		textDemo.click();
		WebElement lastBuildPackageSbt=driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div/div[2]/div[2]/div[10]/table/tbody/tr/td[2]/span/span/span/div/a/span/span/span[1]"));
		lastBuildPackageSbt.click();
		
		//closing the browser
		//driver.close();

	}

}
