package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("SampleValidator")
public class MyValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		System.out.println("MyValidator.validate()");
		
		String producto = (String)value;
		
		if (producto.equalsIgnoreCase("cafe")) {
			throw new ValidatorException(new FacesMessage("No se admite el producto 'CAFE'"));
		}
	}

}
