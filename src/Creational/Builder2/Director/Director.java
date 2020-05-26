package Creational.Builder2.Director;

import Creational.Builder2.Features.Button;
import Creational.Builder2.Features.Div;
import Creational.Builder2.Features.Span;
import Creational.Builder2.Features.Strong;
import Creational.Builder2.Product.ButtonDiv;
import Creational.Builder2.Product.DivDiv;
import Creational.Builder2.Product.SpanDiv;
import Creational.Builder2.Product.StrongDiv;

public class Director {
    public StringBuilder generateHtml(ButtonDiv button) {
        Button buttonDiv = new Button();

        StringBuilder string = new StringBuilder();
        string.append(buttonDiv.generateButtonOpeningTags(button)).append(buttonDiv.generateButtonClosignTag());
        return string;
    }

    //put convert to script in a different module or search for a different pattern to deal with it, since it doesn't fit here
    public StringBuilder convertToScript(StringBuilder htmlString) {
        StringBuilder string = new StringBuilder();
        string.append("document.write( '<link href=\\\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/css/bootstrap.min.css\\\" rel=\\\"stylesheet\\\">\\n' );");
        string.append("document.write( '<link href=\\\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.18.0/css/mdb.min.css\\\" rel=\\\"stylesheet\\\">' );");
        string.append("document.write('").append(htmlString).append("');");
        string.append("document.write( '<script type=\\\"text/javascript\\\" src=\\\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\\\"></script>\\n' );\n" +
                "document.write( '<script type=\\\"text/javascript\\\" src=\\\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js\\\"></script>\\n' );\n" +
                "document.write( '<script type=\\\"text/javascript\\\" src=\\\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/js/bootstrap.min.js\\\"></script>' );\n");
        return string;
    }

    public StringBuilder generateHtml(DivDiv firstDiv, DivDiv secondDiv, StrongDiv firstStrongDiv, ButtonDiv buttonDiv, SpanDiv spanDiv, DivDiv thirdDiv) {
        Div divClass = new Div();
        Strong strongClass = new Strong();
        Button buttonClass = new Button();
        Span spanClass = new Span();

        StringBuilder string = new StringBuilder();
        string.append(divClass.generateToastDiv(firstDiv))
                .append(divClass.generateGenericDiv(secondDiv))
                .append(strongClass.generateStrongOpeningTag(firstStrongDiv))
                .append("Get heading from user")
                .append(strongClass.generateStrongClosingTag())
                .append(buttonClass.generateButtonOpeningTags(buttonDiv))
                .append(spanClass.generateSpanOpeningDiv(spanDiv))
                .append("&times;")
                .append(spanClass.generateSpanClosingDiv())
                .append(buttonClass.generateButtonClosignTag())
                .append(divClass.generateClosingDiv())
                .append(divClass.generateGenericDiv(thirdDiv))
                .append("Body Message From User")
                .append(divClass.generateClosingDiv())
                .append(divClass.generateClosingDiv())
                .append(divClass.generateClosingDiv());
        return string;
    }
}
