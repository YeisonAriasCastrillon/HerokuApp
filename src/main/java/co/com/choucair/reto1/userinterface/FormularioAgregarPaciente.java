package co.com.choucair.reto1.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioAgregarPaciente extends PageObject{
	public static final Target NOMBRE_PAC = Target.the("Nombre del paciente")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[1]/input")); 
	
	public static final Target APELLIDO_PAC = Target.the("Apellido del paciente")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[2]/input")); 
	
	public static final Target TELEFONO_PAC = Target.the("Telefono del paciente")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[3]/input")); 
	
	public static final Target TIPO_DOCUMENTO_PAC = Target.the("abre el menu del tipo de documento")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[4]/select")); 
	
	public static final Target TIPO_DOC_CEDULA_PAC = Target.the("escoje tipo de documento cedula")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[4]/select/option[1]")); 
	
	public static final Target NUMERO_DOCUMENTO_PAC = Target.the("Numero de documento")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[5]/input")); 
	
	public static final Target SALUD_PREPAGADA_PAC = Target.the("Selecciona si tiene salud prepagada o no")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[6]/label/input")); 
	
	public static final Target GUARDAR = Target.the("Guarda los datos ingresados")
			.located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/a")); 
	
	public static final Target LABEL_PAC_CREADO = Target.the("certifica que el cliente se creo")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/p"));
	
}
