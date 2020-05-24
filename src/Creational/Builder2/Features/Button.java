package Creational.Builder2.Features;

import Creational.Builder2.Product.ButtonDiv;

public class Button {

    public String generateButtonOpeningTags(ButtonDiv button) {
        StringBuilder str = new StringBuilder();
//        return str.append("")
        return "<button type=\"" + button.type + "\" class=\"" + button.className + "\" data-dismiss=\"" + button.dataDismiss + "\" aria-label=\"" + button.ariaLable + "\">";
    }

    public String generateButtonClosignTag() {
        return "</button>";
    }


}
