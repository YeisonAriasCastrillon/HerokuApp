package co.com.choucair.reto1.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/")
public class HerokuAppPage extends PageObject{
	
	public static final Target AGREGAR_DOCTOR = Target.the("add new doctor")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[2]/div/div/div/div/div[1]/div/a[1]"));

	public static final Target AGREGAR_PACIENTE = Target.the("add new doctor")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[2]/div/div/div/div/div[1]/div/a[2]"));

	public static final Target AGENDAR_CITA = Target.the("add new doctor")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[2]/div/div/div/div/div[1]/div/a[6]"));

}
