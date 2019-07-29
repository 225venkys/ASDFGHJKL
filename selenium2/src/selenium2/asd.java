package selenium2;

import org.openqa.selenium.chrome.ChromeDriver;

public class asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		String url= driver.getCurrentUrl();
		System.out.println(url);
		

	}

}
