
public class Firsttest {
    @Test
	public void TestGoogle() throws InterruptedException {
    	WebDriver driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com/");
    	driver.findElement(By.name("q")).sendKeys("Laptop",Keys.ENTER);
    	System.out.println(driver.getTitle());
    	Thread.sleep(1000);
    	driver.quit();
}

    @Test
   	public void TestFacebook() throws InterruptedException {
       	WebDriver driver= new ChromeDriver();
       	driver.manage().window().maximize();
       	driver.get("https://www.facebook.com/");
       	driver.findElement(By.name("email")).sendKeys("Laptop",Keys.ENTER);
       	System.out.println(driver.getTitle());
       	Thread.sleep(1000);
       	driver.quit();
}
}
