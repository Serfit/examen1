package StepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps2 {
 WebDriver driver;
 
@Given("ir a la pagina de registro de hora")
public void abrir_chrome1() {
   //Write code here that turns the phrase above into concrete actions
    System.out.println("En este paso abre el navegador google chrome");
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\sa_fi\\Downloads\\chromedriver.exe");
   driver = new ChromeDriver();
    driver.manage().window().maximize(); 
  driver.get("http://localhost:13152/bancoPlatinum/menu.jsp"); 
    driver.findElement(By.id("tomarhorabtn")).click();
}

@When("ingresar i_opc {string} rut {string} nombreMascota {string} hora {string} fecha {string}")
public void registrar_hora_medica(String string5, String string, String string2, String string3, String string4) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("En este paso ingresa valores a registrar");
	System.out.println("En este paso ingresa el id rut mascota hora fecha");
	driver.findElement(By.id("i_opc")).sendKeys(string5);
	driver.findElement(By.id("rut")).sendKeys(string);
	driver.findElement(By.id("nombreMascota")).sendKeys(string2);
	driver.findElement(By.id("hora")).sendKeys(string3);
	driver.findElement(By.id("fecha")).sendKeys(string4);
}

@Then("Registrar hora medica1")
public void registar(){
    // Write code here that turns the phrase above into concrete actions
	System.out.println("En este paso ingresa secion con los datos ingresados desde nuestro archivo Mytest.feature");
	driver.findElement(By.id("rbtn")).click();
}

}
