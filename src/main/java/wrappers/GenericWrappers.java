package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporting;

public class GenericWrappers extends Reporting  implements Wrappers{

	
	public  RemoteWebDriver driver;

	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			
			if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				
			
			 driver = new ChromeDriver();
			 
				
			} else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
			}
		
	    driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //System.out.println("The browser "+browser+"is launched with given url "+url+" succesfully");
        reportStep("The browser "+browser+"is launched with given url "+url+" succesfully","pass");
		}catch(SessionNotCreatedException e) {
			//TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched due to session not create error");
			reportStep("The browser "+browser+" is not launched due to session not create error","fail");
		}catch(InvalidArgumentException e) {
			//TODO Auto-generated handle exception
			//System.err.println("The browser "+browser+" is not launched as url doesnt contain http/https" );
			reportStep("The browser "+browser+" is not launched as url doesnt contain http/https","fail");
		}catch(WebDriverException e) {
			//TODO Auto-generated handle exception
			
			//System.err.println("The browser "+browser+" is not launched due to unknown error");
			reportStep("The browser "+browser+" is not launched due to unknown error","fail");
		}
				
		}
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is entered with data " +data);
			reportStep("The element with id "+idValue+" is entered with data " +data,"pass");
		}catch(NoSuchElementException e) {
			//TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM","fail");
		}catch(ElementNotVisibleException e) {
			//TODO handle exception
			//System.err.println("The element with id "+idValue+"is not visible in the application");
			reportStep("The element with id "+idValue+"is not visible in the application","fail");
		}catch(ElementNotInteractableException e) {
			//TODO handle exception
			//System.err.println("The element with id "+idValue+" is not interactable in the application");
			reportStep("The element with id "+idValue+" is not interactable in the application","fail");
		}catch(StaleElementReferenceException e) {
			//TODO handle exception
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue+" is not stable in the application","fail");
		}catch(UnhandledAlertException e) {
			//TODO handle exception
			//System.err.println("The element with id "+idValue+"is not entered with data "+data+"due to unexpected alert opened");
			reportStep("The element with id "+idValue+"is not entered with data "+data+"due to unexpected alert opened","fail");
			
		}catch(WebDriverException e) {
			//TODO handle exception
			//System.err.println("The element with id "+idValue+"is not entered with data "+data+"due to unknown error");
			reportStep("The element with id "+idValue+"is not entered with data "+data+"due to unknown error","fail");
		}
	}

	
	
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
	try {
		driver.findElementByName(nameValue).sendKeys(data);
		//System.out.println("The element with name "+nameValue+" is entered with data "+data);
		reportStep("The element with name "+nameValue+" is entered with data "+data,"pass");
	}catch(NoSuchElementException e) {
		//TODO Auto-generated catch block
		//System.err.println("The element with name "+nameValue+" is not found in the DOM");
		reportStep("The element with name "+nameValue+" is not found in the DOM","fail");
	}catch(ElementNotVisibleException e) {
		//TODO handle exception
		//System.err.println("The element with name  "+nameValue+" is not visible in the application");
		reportStep("The element with name  "+nameValue+" is not visible in the application","fail");
	}catch(ElementNotInteractableException e) {
		//TODO handle exception
		//System.err.println("The element with name "+nameValue+" is not interactable in the application");
		reportStep("The element with name "+nameValue+" is not interactable in the application","fail");
	}catch(StaleElementReferenceException e) {
		//TODO handle exception
		//System.err.println("The element with name "+nameValue+" is not stable in the application");
		reportStep("The element with name "+nameValue+" is not stable in the application","fail");
	}catch(UnhandledAlertException e) {
		//TODO handle exception
		//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to unexpected alert opened");
		reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to unexpected alert opened","fail");
	}catch(WebDriverException e) {
		//TODO handle exception
		//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error");
		reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error","fail");
	}
			
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		
	try {
		driver.findElementByXPath(xpathValue).sendKeys(data);
		//System.out.println("The element with Xpath "+xpathValue+" is entered with data "+data);
		reportStep("The element with Xpath \"+xpathValue+\" is entered with data  "+""+data,"pass");
	}catch(NoSuchElementException e) {
		//TODO Auto-generated catch block
		//System.err.println("The element with Xpath "+xpathValue+" is not found in the DOM");
		reportStep("The element with Xpath "+xpathValue+" is not found in the DOM","fail");
	}catch(ElementNotVisibleException e) {
		//TODO handle exception
		//System.err.println("The element with Xpath "+xpathValue+"is not visible in the application");
		reportStep("The element with Xpath "+xpathValue+"is not visible in the application","fail");
	}catch(ElementNotInteractableException e) {
		//TODO handle exception
		//System.err.println("The element with Xpath "+xpathValue+" is not interactable in the application");
		reportStep("The element with Xpath "+xpathValue+" is not interactable in the application","fail");
	}catch(StaleElementReferenceException e) {
		//TODO handle exception
		//System.err.println("The element with Xpath "+xpathValue+" is not stable in the application");
		reportStep("The element with Xpath "+xpathValue+" is not stable in the application","fail");
	}catch(UnhandledAlertException e) {
		//TODO handle-exception
		//System.err.println("The element with Xpath "+xpathValue+" is not entered with data "+data+" due to unexpected alert opened");
		reportStep("The element with Xpath "+xpathValue+" is not entered with data "+data+" due to unexpected alert opened","fail");
	}catch(WebDriverException e) {
		//TODO handle exception
		//System.err.println("The element with Xpath "+xpathValue+" is not entered with data "+data+ "due to unknown error");
		reportStep("The element with Xpath "+xpathValue+" is not entered with data "+data+ "due to unknown error","fail");
	}			
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title))
			{
				System.out.println("The title of the page "+actualTitle+ "is matched with the expected title "+title);
				reportStep("The title of the page "+actualTitle+ "is matched with the expected title "+title,"pass");
			}else {
				System.err.println("The title of the page "+actualTitle+ "is not matched with the expected title "+title);
				reportStep("The title of the page "+actualTitle+ "is not matched with the expected title "+title,"pass");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("The title of the page "+title+ "is not verified due to unknown error");
			reportStep("The title of the page "+title+ "is not verified due to unknown error","fail");
					
		}
		
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
		String actualText = driver.findElementById(id).getText();
			if(actualText.equals(text)) {
				//System.out.println("The element with id "+id+" holding the text "+actualText+" is matched with the expected text "+text);
				reportStep("The element with id "+id+" holding the text "+actualText+" is matched with the expected text "+text,"pass");
			}else {
				//System.err.println("The element with id "+id+" holding the text "+actualText+" is not matched with the expected text "+text);
				reportStep("The element with id "+id+" holding the text "+actualText+" is not matched with the expected text "+text,"pass");
			}
		} catch(NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+ "holding the text "+text+ "is not found in the DOM");
			reportStep("The element with id "+id+ "holding the text "+text+ "is not found in the DOM","fail");
		}catch(ElementNotVisibleException e) {
			//TODO handle-exception
			//System.err.println("The element with id "+id+" holding the text "+text+" is not visible in the application");
			reportStep("The element with id "+id+" holding the text "+text+" is not visible in the application","fail");
		}catch(ElementNotInteractableException e) {
			//TODO handle-exception
			//System.err.println("The element with id "+id+" holding the text "+text+" is not interactable in the application");
			reportStep("The element with id "+id+" holding the text "+text+" is not interactable in the application","fail");
		}catch(StaleElementReferenceException e){
			//TODO handle-exception
			//System.err.println("The element with id "+id+" holding the text "+text+" is not stable in the application");
			reportStep("The element with id "+id+" holding the text "+text+" is not stable in the application","fail");
		}catch(UnhandledAlertException e)
		{
			//TODO handle-exception
			//System.err.println("The element with id "+id+" holding the text :actualText is not matched with the expected text "+text+ "due to unexpected alert opened");
			reportStep("The element with id "+id+" holding the text :actualText is not matched with the expected text "+text+ "due to unexpected alert opened","fail");
		}catch(WebDriverException e) {
			//TODO handle-exception
			//System.err.println("The element with id "+id+" holding the text :actualText is not matched with the expected text "+text+ "due to unknown error");
			reportStep("The element with id "+id+" holding the text :actualText is not matched with the expected text "+text+ "due to unknown error","fail");
		}
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
		String actualtext = driver.findElementByXPath(xpath).getText();
		
			if(actualtext.equals(text))
			{
				
				//System.out.println("The element with xpath "+xpath+" holding the text "+actualtext+" is perfectly matched with the expected text "+text);
				reportStep("The element with xpath "+xpath+" holding the text "+actualtext+" is perfectly matched with the expected text "+text,"pass");
			}else {
				//System.err.println("The element with xpath "+xpath+" holding the text "+actualtext+" is not perfectly matched with the expected text "+text);
				reportStep("The element with xpath "+xpath+" holding the text "+actualtext+" is not perfectly matched with the expected text "+text,"pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" holding the text "+text+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" holding the text "+text+" is not found in the DOM","fail");
		}catch(ElementNotVisibleException e) {
			//TODO handle-exception
			//System.err.println("The element with xpath "+xpath+" holding the text "+text+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" holding the text "+text+" is not visible in the application","fail");
		}catch(ElementNotInteractableException e) {
			//TODO handle-exception
			//System.err.println("The element with xpath "+xpath+" holding the text "+text+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" holding the text "+text+" is not interactable in the application","fail");
		}catch(StaleElementReferenceException e){
			//TODO handle-exception
			//System.err.println("The elemenet with xpath "+xpath+" holding the text "+text+" is not stable in the application");
			reportStep("The elemenet with xpath "+xpath+" holding the text "+text+" is not stable in the application","fail");
		}catch(UnhandledAlertException e)
		{
			//TODO handle-exception
			//System.err.println("The element with xpath "+xpath+" holding the text is not perfectly matched with the expected text "+text+" due to unexpected alert opened");
			reportStep("The element with xpath "+xpath+" holding the text is not perfectly matched with the expected text "+text+" due to unexpected alert opened","fail");
		}catch(WebDriverException e) {
			//TODO handle-exception
			//System.err.println("The element with xpath "+xpath+" holding the text is not perfectly matched with the expected text "+text+" due to unknown error");
			reportStep("The element with xpath "+xpath+" holding the text is not perfectly matched with the expected text "+text+" due to unknown error","fail");
		}
		
	}
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext = driver.findElementByXPath(xpath).getText();
			
				if(actualtext.contains(text))
				{
					//System.out.println("The element with xpath "+xpath+" holding the text "+actualtext+" contained the expected text "+text);
					reportStep("The element with xpath "+xpath+" holding the text "+actualtext+" contained the expected text "+text,"pass");
				}else {
					//System.err.println("The element with x path "+xpath+" holding the text "+actualtext+" didnot contain the expected text "+text);
					reportStep("The element with x path "+xpath+" holding the text "+actualtext+" didnot contain the expected text "+text,"pass");
				}
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with xpath "+xpath+" holding the text "+text+ "is not found in the DOM");
				reportStep("The element with xpath "+xpath+" holding the text "+text+ "is not found in the DOM","fail");
			}catch(ElementNotVisibleException e) {
				//TODO handle-exception
				//System.err.println("The element with xpath "+xpath+" holding the text "+text+ "is not visible in the application");
				reportStep("The element with xpath "+xpath+" holding the text "+text+ "is not visible in the application","fail");
			}catch(ElementNotInteractableException e) {
				//TODO handle-exception
				//System.err.println("The element with xpath "+xpath+" holding the text "+text+" is not interactable in the application");
				reportStep("The element with xpath "+xpath+" holding the text "+text+" is not interactable in the application","fail");
			}catch(StaleElementReferenceException e) {
				//TODO handle-exception
				//System.err.println("The element with xpath "+xpath+" holding the text "+text+" is not stable in the application");
				reportStep("The element with xpath "+xpath+" holding the text "+text+" is not stable in the application","fail");
			}catch(UnhandledAlertException e) {
				//TODO handle-exception
				//System.err.println("The element with xpath "+xpath+" holding the text doesnot contain the expected text "+text+" due to unexpected alert opened"); 
				reportStep("The element with xpath "+xpath+" holding the text doesnot contain the expected text "+text+" due to unexpected alert opened","fail");
			}catch(WebDriverException e) {
				//TODO handle-exception
				//System.err.println("The element with xpath "+xpath+" holding the text doesnot contain the expected text "+text+" due to unknown error");
				reportStep("The element with xpath "+xpath+" holding the text doesnot contain the expected text "+text+" due to unknown error","fail");
			}	
		
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+" is clicked succesfully.");
			reportStep("The element with id "+id+" is clicked succesfully.","pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM","fail");
		}catch(ElementNotVisibleException e)      {
			//TODO handle-exception
		//System.err.println("The element with id "+id+" is not visible in the application");	
		reportStep("The element with id "+id+" is not visible in the application","fail");
		}catch(ElementClickInterceptedException e) {
			//TODO handle-exception
			//System.err.println("The element with id "+id+" is not clicked in the application");	
			reportStep("The element with id "+id+" is not clicked in the application","fail");
		}
			catch(ElementNotInteractableException e) {
		
			//TODO handle-exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application","fail");
		}catch(UnhandledAlertException e){
			//TODO handle-exception
			//System.err.println("The element with id "+id+" is not clicked due to unexpected alert opened");
			reportStep("The element with id "+id+" is not clicked due to unexpected alert opened","fail");
		}catch(WebDriverException e) {
			//TODO handle-exception
			//System.err.println("The element with id "+id+" is not clicked due to unknown error");
			reportStep("The element with id "+id+" is not clicked due to unknown error","fail");
		}
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with Class Name "+classVal+" is clicked succesfully.");
			reportStep("The element with Class Name "+classVal+" is clicked succesfully.","pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with ClassName "+classVal+" is not found in the DOM");
			reportStep("The element with ClassName "+classVal+" is not found in the DOM","fail");
		}catch(ElementNotVisibleException e) {
			//TODO handle-exception
			//System.err.println("The element with ClassName "+classVal+" is not visible in the application");
			reportStep("The element with ClassName "+classVal+" is not visible in the application","fail");
		}catch(ElementClickInterceptedException e) {
			//TODO handle-exception
			//System.err.println("The element with ClassName "+classVal+" is not clicked in the application");
			reportStep("The element with ClassName "+classVal+" is not clicked in the application","fail");
		}
		catch(ElementNotInteractableException e) {
			//TODO handle-exception
			//System.err.println("The element with ClassName "+classVal+" is not interactable in the application");
			reportStep("The element with ClassName "+classVal+" is not interactable in the application","fail");
		}catch(StaleElementReferenceException e) {
			//TODO handle-exception
			//System.err.println("The element with ClassName "+classVal+" is not stable in the application");
			reportStep("The element with ClassName "+classVal+" is not stable in the application","fail");
		}catch(UnhandledAlertException e) {
			//TODO handle-exception
			//System.err.println("The element with ClassName "+classVal+" is not clicked due to unexpected alert opened");
			reportStep("The element with ClassName "+classVal+" is not clicked due to unexpected alert opened","fail");
		}catch(WebDriverException e) {
			//TODO handle-exception
			//System.err.println("The element with ClassName "+classVal+" is not clicked due to unknown error");
			reportStep("The element with ClassName "+classVal+" is not clicked due to unknown error","fail");
		}
				
	}

	
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with Name "+name+ " is clicked succesfully.");
			reportStep("The element with Name "+name+ " is clicked succesfully.","pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Name "+name+ "is not found in DOM");
			reportStep("The element with Name "+name+ "is not found in DOM","fail");
		}catch(ElementNotVisibleException e) {
			//TODO handle-exception
			//System.err.println("The element with Name "+name+ "is not visible in the application");
			reportStep("The element with Name "+name+ "is not visible in the application","fail");
		}catch(ElementClickInterceptedException e) {
			//TODO handle-exception
			//System.err.println("The element with Name "+name+" is not clicked in the application");
			reportStep("The element with Name "+name+" is not clicked in the application","fail");
		}catch(ElementNotInteractableException e) {
			//TODO handle-exception
			//System.err.println("The element with Name "+name+ "is not interactable in the application");
			reportStep("The element with Name \"+name+ \"is not interactable in the application","fail");
		}catch(StaleElementReferenceException e) {
			//TODO handle-exception
			//System.err.println("The eleement with Name "+name+" is not stable in the application");
			reportStep("The eleement with Name "+name+" is not stable in the application","fail");
			
		}catch(UnhandledAlertException e)
		{
			//TODO handle-exception
			//System.err.println("The element with Name "+name+" is not clicked in the application due to unexpected alert opened");
			reportStep("The element with Name "+name+" is not clicked in the application due to unexpected alert opened","fail");
		}catch(WebDriverException e) {
			//TODO handle-exception
			//System.err.println("The element with Name "+name+" is not clicked in the application due to unknown error");
			reportStep("The element with Name "+name+" is not clicked in the application due to unknown error","fail");
		}	
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with link text "+name+" is clicked successfully.");
			reportStep("The element with link text "+name+" is clicked succesfully.","pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link text "+name+" is not found in the DOM");
			reportStep("The element with link text "+name+" is not found in the DOM","fail");
		}catch(ElementNotVisibleException e) {
			//TODO handle-exception
			//System.err.println("The element with link text "+name+" is not visible in the application");
			reportStep("The element with link text \"+name+\" is not visible in the application","fail");
		}catch(ElementClickInterceptedException e) {
			//TODO handle-exception
			//System.err.println("The element with link text "+name+" is not clicked in the application");
			reportStep("The element with link text "+name+" is not clicked in the application","fail");
		}catch(ElementNotInteractableException e) {
			//TODO handle-exception
			//System.err.println("The element with link text "+name+" is not interactable in the application");
			reportStep("The element with link text "+name+" is not interactable in the application","fail");
		}catch(StaleElementReferenceException e) {
			//TODO handle-exception
			//System.err.println("The element with link text "+name+" is not stable in the application");
			reportStep("The element with link text "+name+" is not stable in the application","fail");
		}
		catch(UnhandledAlertException e) {
			//TODO handle-exception
			//System.err.println("The element with link text "+name+" is not clicked due to unexpected alert opened");
			reportStep("The element with link text "+name+" is not clicked due to unexpected alert opened","fail");
		}catch(WebDriverException e) {
			//TODO handle-exception
			//System.err.println("The element with link text "+name+" is not clicked due to unknown error");
			reportStep("The element with link text "+name+" is not clicked due to unknown error","fail");
		}

		
	}

	public void clickByLinkNoSnap(String name) {
		
		// TODO Auto-generated method stub
				try {
					driver.findElementByLinkText(name).click();
					//System.out.println("The element with link text "+name+" is clicked succesfully.");
					reportStep("The element with link text "+name+" is clicked succesfully.","pass");
				} catch(NoSuchElementException e) {
					// TODO Auto-generated catch block
					//System.out.println("The element with link text "+name+" is not found in the DOM");
					reportStep("The element with link text "+name+" is not found in the DOM","fail");
				}catch(ElementClickInterceptedException e) {
					//TODO handle-exception
					//System.err.println("The element with link name "+name+" is not clicked in the application");
					reportStep("The element with link name "+name+" is not clicked in the application","fail");
				}catch(ElementNotInteractableException e) {
					//TODO handle-exception
					//System.out.println("The element with link text "+name+" is not interactable in the application");
					reportStep("The element with link text "+name+" is not interactable in the application","fail");
				}catch(StaleElementReferenceException e) {
					//TODO handle-exception
					//System.err.println("The element with link text "+name+" is not stable in the application");	
					reportStep("The element with link text "+name+" is not stable in the application","fail");
				}catch(UnhandledAlertException e) {
					//TODO handle-exception
					//System.err.println("The element with link text "+name+" is not clicked due to unexpected alert opened");
					reportStep("The element with link text "+name+" is not clicked due to unexpected alert opened","fail");
				}catch(WebDriverException e) {
					//TODO handle-exception
					//System.err.println("The element with link text "+name+" is not clicked due to unknown error");
					reportStep("The element with link text "+name+" is not clicked due to unknown error","fail");
				}
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with Xpath "+xpathVal+" is clicked succesfully.");
			reportStep("The element with Xpath "+xpathVal+" is clicked succesfully.","pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+xpathVal+" is not found in DOM");
			reportStep("The element with Xpath "+xpathVal+" is not found in DOM","fail");
		}catch(ElementClickInterceptedException e) {
			//TODO handle-exception
			//System.err.println("The element with Xpath "+xpathVal+" is not clickable in the application");
			reportStep("The element with Xpath "+xpathVal+" is not clickable in the application","fail");
		}catch(ElementNotInteractableException e) {
			//TODO handle-exception
			//System.err.println("The element with Xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with Xpath "+xpathVal+" is not interactable in the application","fail");
		}catch(StaleElementReferenceException e) {
			//TODO handle-exception;
			//System.err.println("The element with Xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with Xpath "+xpathVal+" is not stable in the application","fail");
		}catch(UnhandledAlertException e) {
			//TODO handle-exception
			//System.err.println("The element with Xpath "+xpathVal+" is not clicked due to unxpected alert opened");
			reportStep("The element with Xpath "+xpathVal+" is not clicked due to unxpected alert opened","fail");
		}catch(WebDriverException e) {
			//TODO handle-exception;
			//System.err.println("The element with Xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with Xpath "+xpathVal+" is not clicked due to unknown error","fail");
		}
		}
		
	
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with Xpath "+xpathVal+ "is clicked succesfully.");
			reportStep("The element with Xpath "+xpathVal+ "is clicked succesfully.","pass",false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+xpathVal+ "is not found in the DOM");
			reportStep("The element with Xpath "+xpathVal+ "is not found in the DOM","fail");
		}catch(ElementNotVisibleException e) {
			//TODO handle-exception
			//System.err.println("The element with Xpath "+xpathVal+ "is not visible in the application");
			reportStep("The element with Xpath "+xpathVal+ "is not visible in the application","fail");
		}catch(ElementClickInterceptedException e) {
			//TODO handle-exception
			//System.err.println("The element with Xpath "+xpathVal+ "is not clickable in the application");
			reportStep("The element with Xpath "+xpathVal+ "is not clickable in the application","fail");
		}catch(ElementNotInteractableException e) {
			//TODO handle-exception
			//System.err.println("The element with Xpath "+xpathVal+ "is not interactable in the application");
			reportStep("The element with Xpath "+xpathVal+ "is not interactable in the application","fail");
		}catch(StaleElementReferenceException e) {
			//TODO handle-exception
			//System.err.println("The element with Xpath "+xpathVal+ "is not stable in the application");
			reportStep("The element with Xpath "+xpathVal+ "is not stable in the application","fail");
			
		}catch(UnhandledAlertException e)
		{
			//TODO handle-exception
			//System.err.println("The element with Xpath "+xpathVal+ "is not clicked due to unexpected error opened");
			reportStep("The element with Xpath "+xpathVal+ "is not clicked due to unexpected error opened","fail");
			}
		catch(WebDriverException e) {
			//TODO handle-exception
			//System.err.println("The element with Xpath "+xpathVal+ "is not clicked due to unknown error");
			reportStep("The element with Xpath "+xpathVal+ "is not clicked due to unknown error","fail");
		}	
		}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
	
		String text=null;
		try {
			 text = driver.findElementById(idVal).getText();
			//System.out.println("The element with Id "+idVal+" holding the text "+text+" is being returned");
			reportStep("The element with Id "+idVal+" holding the text "+text+" is being returned","pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The elemenet with id "+idVal+" is not found in the DOM");
			reportStep("The element with id "+idVal+" is not found in the DOM","fail");
		}catch(ElementNotVisibleException e) {
			//TODO handle-exception
			//System.err.println("The element with id "+idVal+" is not visible in the application");
			reportStep("The element with id "+idVal+" is not visible in the application","fail");
		}catch(ElementNotInteractableException e) {
			//TODO handle-exception
			//System.err.println("The element with id "+idVal+" is not interactable in the application");
			reportStep("The element with id "+idVal+" is not interactable in the application","fail");
		}catch(StaleElementReferenceException e) {
			//TODO handle-exception
			//System.err.println("The element with id "+idVal+" is not stable in the application");
			reportStep("The element with id "+idVal+" is not stable in the application","fail");
		}catch(UnhandledAlertException e) {
			//TODO handle-exception
			//System.err.println("The element with id "+idVal+" holding the text is not returned  due to unexpected alert opened");
			reportStep("The element with id "+idVal+" holding the text is not returned  due to unexpected alert opened","fail");
		}catch(WebDriverException e) {
			//TODO handle-exception
			//System.err.println("The element with id "+idVal+" holding the text is not returned  due to unknown error");
			reportStep("The element with id "+idVal+" holding the text is not returned  due to unknown error","fail");
		}
		return text;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String text = null;
		try {
			 text = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with Xpath "+xpathVal+" holding the text "+text+" is being returned");
			reportStep("The element with Xpath "+xpathVal+" holding the text "+text+" is being returned","pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//System.err.println("The element with Xpath "+xpathVal+" is not found in the DOM");
		reportStep("The element with Xpath "+xpathVal+" is not found in the DOM","fail");
		}catch(ElementNotVisibleException e) {
			//TODO handle-exception
			//System.err.println("The element with Xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with Xpath "+xpathVal+" is not visible in the application","fail");
			
		}catch(ElementNotInteractableException e) {
			//TODO handle-exception
			//System.err.println("The element with Xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with Xpath "+xpathVal+" is not interactable in the application","fail");
			
		}catch(StaleElementReferenceException e) {
			//TODO handle-exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application","fail");
			
		}catch(UnhandledAlertException e) {
		//TODO handle-exception
			//System.err.println("The element with Xpath "+xpathVal+" didnot return the text  due to unexpected alert opened");
			reportStep("The element with Xpath "+xpathVal+" didnot return the text  due to unexpected alert opened","fail");
			
		}catch(WebDriverException e) {
			//TODO handle-exception
			//System.err.println("The element with Xpath "+xpathVal+" didnot return the text due to unknown error");
			reportStep("The element with Xpath "+xpathVal+" didnot return the text due to unknown error","fail");
		}
		return text;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement title = driver.findElementById(id);
			Select sel =new Select(title);
			sel.selectByVisibleText(value);
			//System.out.println("The element with Id "+id+" selected the text matching the argument "+value);
			reportStep("The element with Id "+id+" selected the text matching the argument "+value,"pass");
		} catch(ElementNotSelectableException e) {
			//TODO handle-exception
			//System.err.println("The element is not selected in the application");
			reportStep("The element is not selected in the application","fail");
		}catch(ElementNotInteractableException e) {
			//TODO handle-exception
			//System.err.println("The element with Id "+id+" is not interactable in the application");
			reportStep("The element with Id "+id+" is not interactable in the application","fail");
			
		}catch(StaleElementReferenceException e) {
			//TODO handle-exception
			//System.err.println("The element with Id "+id+" is not stable in the application");
			reportStep("The element with Id "+id+" is not stable in the application","fail");
		}catch(WebDriverException e) {
			//TODO handle-exception
			
			//System.err.println("The element with Id "+id+" didnot select the text matching the argument "+value+" due to unknown error");
			reportStep("The element with Id "+id+" didnot select the text matching the argument "+value+" due to unknown error","fail");
		}	
		
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement title = driver.findElementById(id);
			Select sel =new Select(title);
			sel.selectByIndex(value);
			//System.out.println("The element with id "+id+" selected the value matching the argument "+value);
			reportStep("The element with id "+id+" selected the value matching the argument "+value,"pass");
		} catch(ElementNotVisibleException e) {
			//TODO handle-exception
			//System.err.println("The element with Id "+id+" is not visible in the application");
			reportStep("The element with Id "+id+" is not visible in the application","fail");
		}catch(ElementNotSelectableException e) {
			//TODO handle-exception
			//System.err.println("The element with id "+id+" matching the argument "+value+" is not selectable");
			reportStep("The element with id "+id+" matching the argument "+value+" is not selectable","fail");
			
		}catch(ElementNotInteractableException e) {
			//TODO handle-exception
			//System.err.println("The element with Id "+id+" is not interactable in the application");
			reportStep("The element with Id "+id+" is not interactable in the application","fail");
		}catch(StaleElementReferenceException e) {
			//TODO handle-exception
			//System.err.println("The element with Id "+id+" is not stable in the application");
			reportStep("The element with Id "+id+" is not stable in the application","fail");
		}
		catch(WebDriverException e) {
		
			//TODO handle-exception
			//System.err.println("The element with Id "+id+" didnot select the value matching the argument "+value+" due to uknown error");
			reportStep("The element with Id "+id+" didnot select the value matching the argument "+value+" due to uknown error","fail");
		}
			
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
	
		try {
			Set<String> parentwind = driver.getWindowHandles();
			for(String eachID:parentwind)
			{
				driver.switchTo().window(eachID);
				break;
			}
					
			//System.out.println("The window is switched to parent window "+parentwind+" succesfully");
			reportStep("The window is switched to parent window "+parentwind+" succesfully","pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The window is not switched to parent window due to the reason that window doesn't exist.");
			reportStep("The window is not switched to parent window due to the reason that window doesn't exist.","fail");
		}catch( WebDriverException e) {
			//TODO handle-exception
			//System.err.println("The window is not switched to parent window due to unknown error");
			reportStep("The window is not switched to parent window due to unknown error","fail");
		}
	}

	
	
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> winid = driver.getWindowHandles();
			for(String eachID:winid)
			{
				System.out.println("The winids are "+winid);
				driver.switchTo().window(eachID);
			}
       //System.out.println("The control is switched to the last window succesfully");
       reportStep("The control is switched to the last window succesfully","pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
		//System.err.println("The control is not switched to the last window due to the unavailability of that winid");
		reportStep("The control is not switched to the last window due to the unavailability of that winid","fail");
		}catch(WebDriverException e) {
			//TODO handle-exception
			//System.err.println("The control is not moved to the current window due to unknown error");
			reportStep("The control is not moved to the current window due to unknown error","fail");
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The alert is accepted succesfully ");
			reportStep("The alert is accepted succesfully ","pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not accepted due to the absence of the alert notification in the application");
			reportStep("The alert is not accepted due to the absence of the alert notification in the application","fail");
		}catch(WebDriverException e) {
			//TODO handle exception
			//System.err.println("The alert is not accepted due to unknown error");
			reportStep("The alert is not accepted due to unknown error","fail");
		}
		
	}

	public void dismissAlert() {
		
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert is cancelled succesfully");
			reportStep("The alert is cancelled succesfully","pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not dismissed due to the absence of alert notification in the application");
			reportStep("The alert is not dismissed due to the absence of alert notification in the application","fail");
		}catch(WebDriverException e){
			//TODO handle-exception
			//System.err.println("The alert is not dismissed due to unknown error ");
			reportStep("The alert is not dismissed due to unknown error ","fail");
		}
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String text = null;
		try {
			
			 text = driver.switchTo().alert().getText();
			
			//System.out.println("The alert holding the text "+text+" is being returned");
			reportStep("The alert holding the text "+text+" is being returned","pass",false);
				
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The text couldnot be returned due to the absence of alert in the application");
			reportStep("The text couldnot be returned due to the absence of alert in the application","pass");
		}catch(UnhandledAlertException e) {
			//TODO handle-exception
			//System.err.println("The text could not be returned due to unexpected alert opened");
			reportStep("The text could not be returned due to unexpected alert opened","fail");
		}catch(WebDriverException e) {
			//TODO handle-exception
			//System.err.println("The text couldnot be returned due to unknown error");
			reportStep("The text couldnot be returned due to unknown error","fail");
		}
		return text;
		
			
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		long number = 0;
		try {
			 number = (long) (Math.floor(Math.random()*100000000)+100000);
			
			
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./report/screenshots/"+number+".png");
			FileUtils.copyFile(tmp, dest);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Snapshot of the browser was not captured due to unknown error");
			reportStep("Snapshot of the browser was not captured due to unknown error","fail");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.err.println("Snapshot of the browser was not captured  due to invalid file");
			reportStep("Snapshot of the browser was not captured  due to invalid file","fail");
		}
		return number;
	}
	

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The active browser is closed succesfully");
			reportStep("The active browser is closed succesfully","pass",false);
		} catch(NoSuchWindowException e) {
			//TODO Auto-generated catch block
			//System.err.println("The active browser was not closed due to the absence of detecting the specific window id in the application ");
			reportStep("The active browser was not closed due to the absence of detecting the specific window id in the application.","fail",false);
		}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The active browser was not closed due to unknown error");
			reportStep("The active browser was not closed due to unknown error","fail",false);
		}
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("The browsers are closed succesfully");
			reportStep("The browsers are closed succesfully","pass",false);
		}catch(NoSuchWindowException e) {
			//TODO Auto-generated catch block
			//System.err.println("The  browsers are not closed due to absence of detecting the  window ids in the application");
			reportStep("The  browsers are not closed due to absence of detecting the  window ids in the application","fail",false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browsers are not closed  due to unknown error");
			reportStep("The browsers are not closed  due to unknown error","fail",false);
		}
	
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			reportStep("The action didnot wait for the mentioned timeperiod","fail");
		}
	}

	

	public void selectVisibleTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
				try {
					WebElement title = driver.findElementByXPath(xpath);
					Select sel =new Select(title);
					sel.selectByVisibleText(value);
					//System.out.println("The element with Id "+xpath+" selected the text matching the argument "+value);
					reportStep("The element with Id "+xpath+" selected the text matching the argument "+value,"pass");
				} catch(ElementNotSelectableException e) {
					//TODO handle-exception
					//System.err.println("The element is not selected in the application");
					reportStep("The element is not selected in the application","fail");
				}catch(ElementNotInteractableException e) {
					//TODO handle-exception
					//System.err.println("The element with Id "+xpath+" is not interactable in the application");
					reportStep("The element with Id "+xpath+" is not interactable in the application","fail");
					
				}catch(StaleElementReferenceException e) {
					//TODO handle-exception
					//System.err.println("The element with Id "+xpath+" is not stable in the application");
					reportStep("The element with Id "+xpath+" is not stable in the application","fail");
				}catch(WebDriverException e) {
					//TODO handle-exception
					
					//System.err.println("The element with Id "+xpath+" didnot select the text matching the argument "+value+" due to unknown error");
					reportStep("The element with Id "+xpath+" didnot select the text matching the argument "+value+" due to unknown error","fail");
				}
		
	}

	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement title = driver.findElementById(id);
			Select sel =new Select(title);
			sel.selectByValue(value);
			//System.out.println("The element with id "+id+" selected the value matching the argument "+value);
			reportStep("The element with id "+id+" selected the value matching the argument "+value,"pass");
		} catch(ElementNotVisibleException e) {
			//TODO handle-exception
			//System.err.println("The element with Id "+id+" is not visible in the application");
			reportStep("The element with Id "+id+" is not visible in the application","fail");
		}catch(ElementNotSelectableException e) {
			//TODO handle-exception
			//System.err.println("The element with id "+id+" matching the argument "+value+" is not selectable");
			reportStep("The element with id "+id+" matching the argument "+value+" is not selectable","fail");
			
		}catch(ElementNotInteractableException e) {
			//TODO handle-exception
			//System.err.println("The element with Id "+id+" is not interactable in the application");
			reportStep("The element with Id "+id+" is not interactable in the application","fail");
		}catch(StaleElementReferenceException e) {
			//TODO handle-exception
			//System.err.println("The element with Id "+id+" is not stable in the application");
			reportStep("The element with Id "+id+" is not stable in the application","fail");
		}
		catch(WebDriverException e) {
		
			//TODO handle-exception
			//System.err.println("The element with Id "+id+" didnot select the value matching the argument "+value+" due to uknown error");
			reportStep("The element with Id "+id+" didnot select the value matching the argument "+value+" due to uknown error","fail");
		}
		
		
	}

	

	public void selectValueByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement title = driver.findElementByName(name);
			Select sel =new Select(title);
			sel.selectByValue(value);
			//System.out.println("The element with Name "+name+" selected the value matching the argument "+value);
			reportStep("The element with Name "+name+" selected the value matching the argument "+value,"pass");
		} catch(ElementNotVisibleException e) {
			//TODO handle-exception
			//System.err.println("The element with Name "+name+" is not visible in the application");
			reportStep("The element with Name "+name+" is not visible in the application","fail");
		}catch(ElementNotSelectableException e) {
			//TODO handle-exception
			//System.err.println("The element with Name "+name+" matching the argument "+value+" is not selectable");
			reportStep("The element with Name "+name+" matching the argument "+value+" is not selectable","fail");
			
		}catch(ElementNotInteractableException e) {
			//TODO handle-exception
			//System.err.println("The element with Name "+name+" is not interactable in the application");
			reportStep("The element with Name "+name+" is not interactable in the application","fail");
		}catch(StaleElementReferenceException e) {
			//TODO handle-exception
			//System.err.println("The element with Name "+name+" is not stable in the application");
			reportStep("The element with Name "+name+" is not stable in the application","fail");
		}
		catch(WebDriverException e) {
		
			//TODO handle-exception
			//System.err.println("The element with Name "+name+" didnot select the value matching the argument "+value+" due to uknown error");
			reportStep("The element with Name "+name+" didnot select the value matching the argument "+value+" due to uknown error","fail");
		}
		
		
	}

	public void switchToframeid(String nameOrId) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(nameOrId);
			System.out.println("The frame with id "+nameOrId+ " is switched succesfully");
			reportStep("The frame with id "+nameOrId+ " is switched succesfully","pass");
			} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
		System.err.println("The frame with id "+nameOrId+ " is not visible in the application");
		reportStep("The frame with id "+nameOrId+ " is not visible in the application","fail");
		}catch(WebDriverException e) {
			System.err.println("The frame with id "+nameOrId+ "is not switched due to unknown error");
			reportStep("The frame with id "+nameOrId+ "is not switched due to unknown error","fail");
		}
		
	}

	public String getAlertTextNoSnap() {
		// TODO Auto-generated method stub
		String text = null;
		try {
			
			 text = driver.switchTo().alert().getText();
			
			//System.out.println("The alert holding the text "+text+" is being returned");
			reportStep("The alert holding the text "+text+" is being returned","pass",false);
				
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The text couldnot be returned due to the absence of alert in the application");
			reportStep("The text couldnot be returned due to the absence of alert in the application","fail");
		}catch(UnhandledAlertException e) {
			//TODO handle-exception
			//System.err.println("The text could not be returned due to unexpected alert opened");
			reportStep("The text could not be returned due to unexpected alert opened","fail");
		}catch(WebDriverException e) {
			//TODO handle-exception
			//System.err.println("The text couldnot be returned due to unknown error");
			reportStep("The text couldnot be returned due to unknown error","fail");
		}
		return text;
	}

	public void defaultContent() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().defaultContent();
			//System.out.println("The control is switched to default window successfully");
			reportStep("The control is switched to default window succesfully","pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The control is not switched to default window successfully");
			reportStep("The control is not switched to default window succesfully","fail");
		}
		
		
	}

	public void refresh() {
		// TODO Auto-generated method stub
		try {
			driver.navigate().refresh();
			//System.out.println("The page is refreshed successfully");
			reportStep("The page is refreshed succesfully","pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The page is not refreshed due to unknown error");
			reportStep("The page is not refreshed due to unknown error","fail");
		}
		
	}

	public void alertsend(String data) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().sendKeys(data);
			//System.out.println("The name "+data+ " passed through the alert");
			reportStep("The name "+data+ " passed through the alert","pass",false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not send with the data  "+data+" due to unknown error");
			reportStep("The alert is not send with the data  "+data+" due to unknown error","fail");
		}


	
}

	public void verifyNoTextById(String id,String text ) {
	
		// TODO Auto-generated method stub
				try {
				String actualText = driver.findElementById(id).getText();
					if(!actualText.equals(text)) {
						//System.out.println("The element with id "+id+" holding the text "+actualText+" didnot contain the text "+text+"  in the  application");
						reportStep("The element with id "+id+" holding the text "+actualText+" didnot contain the text "+text+"  in the  application","pass");
					}else {
						//System.err.println("The element with id "+id+" holding the text "+actualText+" contained the text "+text+ "  in the  application");
						reportStep("The element with id "+id+" holding the text "+actualText+" contained the text "+text+ "  in the  application","fail");
					}
				} catch(NoSuchElementException e) {
					// TODO Auto-generated catch block
					//System.err.println("The element with id "+id+ "holding the text "+text+ "is not found in the DOM");
					reportStep("The element with id "+id+ "holding the text "+text+ "is not found in the DOM","fail");
				}catch(ElementNotVisibleException e) {
					//TODO handle-exception
					//System.err.println("The element with id "+id+" holding the text "+text+" is not visible in the application");
					reportStep("The element with id "+id+" holding the text "+text+" is not visible in the application","fail");
				}catch(ElementNotInteractableException e) {
					//TODO handle-exception
				//	System.err.println("The element with id "+id+" holding the text "+text+" is not interactable in the application");
					reportStep("The element with id "+id+" holding the text "+text+" is not interactable in the application","fail");
				}catch(StaleElementReferenceException e){
					//TODO handle-exception
					//System.err.println("The element with id "+id+" holding the text "+text+" is not stable in the application");
					reportStep("The element with id "+id+" holding the text "+text+" is not stable in the application","fail");
				}catch(UnhandledAlertException e)
				{
					//TODO handle-exception
					//System.err.println("The element with id "+id+" holding the text :actualText is not matched with the expected text "+text+ "due to unexpected alert opened");
					reportStep("The element with id "+id+" holding the text :actualText is not matched with the expected text "+text+ "due to unexpected alert opened","fail");
				}catch(WebDriverException e) {
					//TODO handle-exception
					//System.err.println("The element with id "+id+" holding the text :actualText is not matched with the expected text "+text+ "due to unknown error");
					reportStep("The element with id "+id+" holding the text :actualText is not matched with the expected text "+text+ "due to unknown error","fail");
				}
		
	}

	public void verifyTextContainsById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext = driver.findElementById(id).getText();
			
				if(actualtext.contains(text))
				{
					//System.out.println("The element with Id "+id+" holding the text "+actualtext+" contained the expected text "+text);
					reportStep("The element with Id "+id+" holding the text "+actualtext+" contained the expected text "+text,"pass");
				}else {
					//System.err.println("The element with Id "+id+" holding the text "+actualtext+" didnot contain the expected text "+text);
					reportStep("The element with Id "+id+" holding the text "+actualtext+" didnot contain the expected text "+text,"fail");
				}
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with Id "+id+" holding the text "+text+ "is not found in the DOM");
				reportStep("The element with Id "+id+" holding the text "+text+ "is not found in the DOM","fail");
			}catch(ElementNotVisibleException e) {
				//TODO handle-exception
				//System.err.println("The element with Id "+id+" holding the text "+text+ "is not visible in the application");
				reportStep("The element with Id "+id+" holding the text "+text+ "is not visible in the application","fail");
			}catch(ElementNotInteractableException e) {
				//TODO handle-exception
				//System.err.println("The element with Id "+id+" holding the text "+text+" is not interactable in the application");
				reportStep("The element with Id "+id+" holding the text "+text+" is not interactable in the application","fail");
			}catch(StaleElementReferenceException e) {
				//TODO handle-exception
				//System.err.println("The element with Id "+id+" holding the text "+text+" is not stable in the application");
				reportStep("The element with Id "+id+" holding the text "+text+" is not stable in the application","fail");
			}catch(UnhandledAlertException e) {
				//TODO handle-exception
				//System.err.println("The element with Id "+id+" holding the text doesnot contain the expected text "+text+" due to unexpected alert opened");
				reportStep("The element with Id "+id+" holding the text doesnot contain the expected text "+text+" due to unexpected alert opened","fail");
			}catch(WebDriverException e) {
				//TODO handle-exception
				//System.err.println("The element with Id "+id+" holding the text doesnot contain the expected text "+text+" due to unknown error");
				reportStep("The element with Id "+id+" holding the text doesnot contain the expected text "+text+" due to unknown error","fail");
			}
		
		
	
	}
	
		
	
	
	public void mouseHoverByXPath(String xpath) {
		// TODO Auto-generated method stub
		
		try {
			Actions builder =new Actions(driver);
			
			WebElement element=driver.findElementByXPath(xpath);
			
			builder.moveToElement(element).build().perform();
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("ELement with xpath "+xpath+" is not present in the DOM");
			reportStep("ELement with xpath "+xpath+" is not present in the DOM","fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("Element with xpath "+xpath+"  is not visible in the application");
			reportStep("Element with xpath "+xpath+"  is not visible in the application","fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("Element with xpath "+xpath+" is not interactable though it is present in the DOM ");
			reportStep("Element with xpath "+xpath+" is not interactable though it is present in the DOM ","fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("Element with xpath "+xpath+" is not stable in the application");
			reportStep("Element with xpath "+xpath+" is not stable in the application","fail");
			
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("Element with xpath "+xpath+" is not verified due to an unhandled alert opened");
			reportStep("Element with xpath "+xpath+" is not verified due to an unhandled alert opened","fail");
		}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Element with xpath "+xpath+" is not verified due to an unknown error");
		   reportStep("Element with xpath \"+xpath+\" is not verified due to an unknown error","fail");
		} 

		
		

}
	public void selectValueByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement title = driver.findElementByXPath(xpath);
			Select sel =new Select(title);
			sel.selectByValue(value);
			//System.out.println("The element with Name "+value+" selected the value matching the argument "+value);
			reportStep("The element with Xpath "+xpath+" selected the value matching the argument "+value,"pass");
		} catch(ElementNotVisibleException e) {
			//TODO handle-exception
			//System.err.println("The element with Name "+name+" is not visible in the application");
			reportStep("The element with Name "+xpath+" is not visible in the application","fail");
		}catch(ElementNotSelectableException e) {
			//TODO handle-exception
			//System.err.println("The element with Name "+name+" matching the argument "+value+" is not selectable");
			reportStep("The element with Name "+xpath+" matching the argument "+value+" is not selectable","fail");
			
		}catch(ElementNotInteractableException e) {
			//TODO handle-exception
			//System.err.println("The element with Name "+name+" is not interactable in the application");
			reportStep("The element with Name "+xpath+" is not interactable in the application","fail");
		}catch(StaleElementReferenceException e) {
			//TODO handle-exception
			//System.err.println("The element with Name "+name+" is not stable in the application");
			reportStep("The element with Name "+xpath+" is not stable in the application","fail");
		}
		catch(WebDriverException e) {
		
			//TODO handle-exception
			//System.err.println("The element with Name "+name+" didnot select the value matching the argument "+value+" due to uknown error");
			reportStep("The element with Name "+xpath+" didnot select the value matching the argument "+value+" due to uknown error","fail");
		
		
		
	}

	
	}
	public void enterByXpath(String xpath, Keys key) {
		// TODO Auto-generated method stub
		try {
		driver.findElementByXPath(xpath).sendKeys(key);
		//System.out.println("The element with Xpath "+xpathValue+" is entered with Keys "+key);
				reportStep("The element with Xpath \"+xpathValue+\" is entered with data  "+""+key,"pass");
			}catch(NoSuchElementException e) {
				//TODO Auto-generated catch block
				//System.err.println("The element with Xpath "+xpathValue+" is not found in the DOM");
				reportStep("The element with Xpath is not found in the DOM","fail");
			}catch(ElementNotVisibleException e) {
				//TODO handle exception
				//System.err.println("The element with Xpath "+xpathValue+"is not visible in the application");
				reportStep("The element with Xpath is not visible in the application","fail");
			}catch(ElementNotInteractableException e) {
				//TODO handle exception
				//System.err.println("The element with Xpath "+xpathValue+" is not interactable in the application");
				reportStep("The element with Xpath  is not interactable in the application","fail");
			}catch(StaleElementReferenceException e) {
				//TODO handle exception
				//System.err.println("The element with Xpath "+xpathValue+" is not stable in the application");
				reportStep("The element with Xpath  is not stable in the application","fail");
			}catch(UnhandledAlertException e) {
				//TODO handle-exception
				//System.err.println("The element with Xpath "+xpathValue+" is not entered with data "+data+" due to unexpected alert opened");
				reportStep("The element with Xpath  is not entered with key due to unexpected alert opened","fail");
			}catch(WebDriverException e) {
				//TODO handle exception
				//System.err.println("The element with Xpath "+xpathValue+" is not entered with data "+data+ "due to unknown error");
				reportStep("The element with Xpath is not entered with key due to unknown error","fail");
			}			
		
	}
}

	


