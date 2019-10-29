package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC_Com {
	String path;
	public void acc()
	{
		path=System.getProperty("user.dir")+"\\Browsers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver drv=new ChromeDriver();
		drv.get("https://www.bbc.com");
		List<WebElement> al= drv.findElements(By.className("media__link"));
		int x=al.size();
		System.out.println("Count of Headlines:"+x);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).getText());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBC_Com oo=new BBC_Com();
		oo.acc();
	}

}
