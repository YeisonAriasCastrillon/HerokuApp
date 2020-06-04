package co.com.choucair.reto1.questions;

import co.com.choucair.reto1.userinterface.FormularioAgregarDoctor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean>{
	
	private String question;
	
	public Answer(String question) {
		this.question = question;
	}

	public static Answer toThe(String question) {
		return new Answer(question);
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		boolean result;
		String guardadoDoc= Text.of(FormularioAgregarDoctor.LABEL_DOC_CREADO).viewedBy(actor).asString();
		if(question.equals(guardadoDoc)) {
			result=true;
		}else {
			result=false;
		}
		return result;
	}

}
