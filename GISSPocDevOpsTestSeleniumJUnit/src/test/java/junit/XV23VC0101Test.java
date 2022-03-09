package junit;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
public class XV23VC0101Test {
  private WebDriver driver;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	//Cargar el webdriver definido como parametro de entrada en la ejecucion
	  
	if(System.getProperty("webdriver.edge.driver")!=null) {
		driver = new EdgeDriver();
	}else if(System.getProperty("webdriver.chrome.driver")!=null) {
		driver = new ChromeDriver();
	}else {
		System.out.println("No se ha definido un webdriver");
	}
    js = (JavascriptExecutor) driver;
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void XV23VC0101_JUNIT() {
	    //driver.get("http://10.99.104.217:9081/ProsaPortal7/index.jsp");
		driver.get("http://" + System.getProperty("host") +":" + System.getProperty("port") +"/ProsaPortal7/index.jsp");
	    driver.manage().window().setSize(new Dimension(1038, 684));
	    
		driver.findElement(By.id("ui-accordion-accordion-header-1")).click();
		Duration duration = Duration.ofSeconds(10);
	    WebDriverWait wait = new WebDriverWait(driver, duration);
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("configuracionIntranetDSServicio")));
	    driver.findElement(By.id("configuracionIntranetDSServicio")).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("codSilcon")));
	    driver.findElement(By.id("codSilcon")).sendKeys("IDUS7143");
	    driver.findElement(By.id("codSilcon")).sendKeys(Keys.ENTER);
	    
	    try {
	    	driver.findElement(By.id("INTRANETDS_SERVICIO")).click();
	    	
	    }catch (Exception e) {
	    	driver.findElement(By.id("ui-accordion-accordion-header-1")).click();
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("INTRANETDS_SERVICIO")));
	    	driver.findElement(By.id("INTRANETDS_SERVICIO")).click();
		}
	    
	    driver.findElement(By.id("INTRANETDS_SERVICIO")).sendKeys("XV23VC01");
	    driver.findElement(By.id("submitIntranetDSServicio")).click();
	    driver.findElement(By.id("sum1")).sendKeys("1");
	    driver.findElement(By.id("sum2")).click();
	    driver.findElement(By.id("sum2")).sendKeys("2");
	    driver.findElement(By.id("multi")).click();
	    driver.findElement(By.id("multi")).sendKeys("3");
	    driver.findElement(By.id("SPM.ACC.CALCULAR1")).click();
	    driver.findElement(By.id("res1")).click();
	    {
	      String value = driver.findElement(By.id("res1")).getAttribute("value");
	      assertEquals(value, "13");
	    }
}
  
  @Test
  public void XV23VC0101_2_JUNIT() {
	    //driver.get("http://10.99.104.217:9081/ProsaPortal7/index.jsp");
		driver.get("http://" + System.getProperty("host") +":" + System.getProperty("port") +"/ProsaPortal7/index.jsp");
	    driver.manage().window().setSize(new Dimension(1038, 684));
	    
		driver.findElement(By.id("ui-accordion-accordion-header-1")).click();
		Duration duration = Duration.ofSeconds(10);
	    WebDriverWait wait = new WebDriverWait(driver, duration);
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("configuracionIntranetDSServicio")));
	    driver.findElement(By.id("configuracionIntranetDSServicio")).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("codSilcon")));
	    driver.findElement(By.id("codSilcon")).sendKeys("IDUS7143");
	    driver.findElement(By.id("codSilcon")).sendKeys(Keys.ENTER);
	    
	    try {
	    	driver.findElement(By.id("INTRANETDS_SERVICIO")).click();
	    	
	    }catch (Exception e) {
	    	driver.findElement(By.id("ui-accordion-accordion-header-1")).click();
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("INTRANETDS_SERVICIO")));
	    	driver.findElement(By.id("INTRANETDS_SERVICIO")).click();
		}
	    
	    driver.findElement(By.id("INTRANETDS_SERVICIO")).sendKeys("XV23VC01");
	    driver.findElement(By.id("submitIntranetDSServicio")).click();
	    driver.findElement(By.id("sum1")).sendKeys("1");
	    driver.findElement(By.id("sum2")).click();
	    driver.findElement(By.id("sum2")).sendKeys("2");
	    driver.findElement(By.id("multi")).click();
	    driver.findElement(By.id("multi")).sendKeys("3");
	    driver.findElement(By.id("SPM.ACC.CALCULAR1")).click();
	    driver.findElement(By.id("res1")).click();
	    {
	      String value = driver.findElement(By.id("res1")).getAttribute("value");
	      assertEquals(value, "13");
	    }
  }
}
