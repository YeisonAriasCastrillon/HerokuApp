package co.com.choucair.reto1.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioAgregarCita extends PageObject { 

	public static final Target DIA_CITA_ABRE = Target.the("abre el calendario")
			.located(By.xpath("//*[@id=\'datepicker\']")); 
	
	public static final Target DIA_CITA_ELIGE = Target.the("Elige el dia")
			.located(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[3]/td[4]/a"));
	
	public static final Target DOCUMENTO_IDENTIDAD_PACIENTE = Target.the("documento del paciente")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[2]/input")); 
	
	public static final Target DOCUMENTO_IDENTIDAD_DOCTOR = Target.the("documento del doctor")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[3]/input")); 
	
	public static final Target OBSERVACIONES = Target.the("observaciones")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[4]/textarea")); 
	
	public static final Target GUARDAR = Target.the("guarda la informacion")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/a")); 
}
