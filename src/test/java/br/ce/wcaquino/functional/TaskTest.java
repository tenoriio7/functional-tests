package br.ce.wcaquino.functional;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class TaskTest {
	
	@Test
	public void testAmbiente() {
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("http://localhost:8001/tasks/");
		driver.findElement(By.id("addTodo")).click();
		driver.findElement(By.id("task")).sendKeys("vinicin");
		driver.findElement(By.id("dueDate")).sendKeys("10/10/2030");
		driver.findElement(By.id("saveButton")).click();
		Assert.assertEquals("Sucess!", driver.findElement(By.id("message")).getText());
		driver.close();
		driver.quit();
		
		
	}
	
	public void testAmbiente2() {
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("http://localhost:8001/tasks/");
		driver.findElement(By.id("addTodo")).click();
		driver.findElement(By.id("task")).sendKeys("vinicin");
		driver.findElement(By.id("dueDate")).sendKeys("10/10/2030");
		driver.findElement(By.id("saveButton")).click();
		Assert.assertEquals("Sucess!", driver.findElement(By.id("message")).getText());
		driver.close();
		driver.quit();
		
		
	}
	
	public void testAmbiente3() {
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("http://localhost:8001/tasks/");
		driver.findElement(By.id("addTodo")).click();
		driver.findElement(By.id("task")).sendKeys("vinicin");
		driver.findElement(By.id("dueDate")).sendKeys("10/10/2030");
		driver.findElement(By.id("saveButton")).click();
		Assert.assertEquals("Sucess!", driver.findElement(By.id("message")).getText());
		driver.close();
		driver.quit();
		
		
	}

}
