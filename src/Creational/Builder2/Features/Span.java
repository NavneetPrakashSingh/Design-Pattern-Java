package Creational.Builder2.Features;

import Creational.Builder2.Product.SpanDiv;

public class Span {
    public String generateSpanOpeningDiv(SpanDiv spanProperty) {
        StringBuilder str = new StringBuilder();
//        return str.append("")
        return "<span aria-hidden=\"" + spanProperty.ariaHidden + "\">";
    }

    public String generateSpanClosingDiv() {
        return "</span>";
    }

}
