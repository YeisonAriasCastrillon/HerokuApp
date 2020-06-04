package co.com.choucair.reto1.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioAgregarDoctor extends PageObject{
	
	public static final Target NOMBRE_DOC = Target.the("Nombre del doctor")
			.located(By.xpath("//*[@id=\'name\']")); 
	
	public static final Target APELLIDO_DOC = Target.the("apellido del doctor")
			.located(By.xpath("//*[@id=\'last_name\']"));
	
	public static final Target TELEFONO_DOC = Target.the("apellido del doctor")
			.located(By.xpath("//*[@id=\'telephone\']"));
	
	public static final Target TIPO_DOCUMENTO_ABRE_DOC = Target.the("apellido del doctor")
			.located(By.xpath("//*[@id=\'identification_type\']"));
	
	public static final Target TIPO_DOCUMENTO_CEDULA_DOC = Target.the("apellido del doctor")
			.located(By.xpath("//*[@id=\'identification_type\']/option[1]"));
		
	public static final Target NUMERO_CEDULA_DOC = Target.the("apellido del doctor")
			.located(By.xpath("//*[@id=\'identification\']"));
		
	public static final Target SUBMIT = Target.the("apellido del doctor")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/a"));

	public static final Target LABEL_DOC_CREADO = Target.the("apellido del doctor")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[2]/div[2]/p"));
	
}
