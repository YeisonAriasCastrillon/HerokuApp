package co.com.choucair.reto1.tasks;

import co.com.choucair.reto1.userinterface.FormularioAgregarPaciente;
import co.com.choucair.reto1.userinterface.HerokuAppPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LlenarFormularioPaciente implements Task {

	public static LlenarFormularioPaciente llenar() {
		return Tasks.instrumented(LlenarFormularioPaciente.class);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HerokuAppPage.AGREGAR_PACIENTE),
				Enter.theValue("Carlos").into(FormularioAgregarPaciente.NOMBRE_PAC),
				Enter.theValue("Ramirez").into(FormularioAgregarPaciente.APELLIDO_PAC),
				Enter.theValue("2222222").into(FormularioAgregarPaciente.TELEFONO_PAC),
				Click.on(FormularioAgregarPaciente.TIPO_DOCUMENTO_PAC),
				Click.on(FormularioAgregarPaciente.TIPO_DOC_CEDULA_PAC),
				Enter.theValue("11111111").into(FormularioAgregarPaciente.NUMERO_DOCUMENTO_PAC),
				Click.on(FormularioAgregarPaciente.SALUD_PREPAGADA_PAC),
				Click.on(FormularioAgregarPaciente.GUARDAR)
				);
	}
}
