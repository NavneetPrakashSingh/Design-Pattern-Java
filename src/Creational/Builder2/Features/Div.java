package Creational.Builder2.Features;

import Creational.Builder2.Product.ButtonDiv;
import Creational.Builder2.Product.DivDiv;

public class Div {
    public String generateToastDiv(DivDiv divProperties){
        return "<div role=\""+divProperties.role+"\" aria-live=\""+divProperties.ariaLive+"\" aria-atomic=\""+divProperties.ariaAtomic+"\" class=\""+divProperties.classes+"\" data-autohide=\""+divProperties.dataAutoHide+"\" style=\""+divProperties.style+"\">";
    }
    public String generateGenericDiv(DivDiv divProperty) {
        StringBuilder str = new StringBuilder();
//        return str.append("")
        return "<div class=\""+divProperty.classes+"\" id=\""+divProperty.id+"\"style=\""+divProperty.style+"\">";
    }

    public String generateClosingDiv() {
        return "</div>";
    }

}
