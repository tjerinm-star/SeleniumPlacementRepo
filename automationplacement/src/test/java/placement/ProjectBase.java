package placement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectBase 
{

	public WebDriver driver;
	
	public void Initialization()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProjectBase projectbase = new ProjectBase();
		projectbase.Initialization();
		

	}

}
