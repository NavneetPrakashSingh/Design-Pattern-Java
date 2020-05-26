package Creational.Builder2;

import Creational.Builder2.Director.Director;
import Creational.Builder2.Features.Strong;
import Creational.Builder2.Product.ButtonDiv;
import Creational.Builder2.Product.DivDiv;
import Creational.Builder2.Product.SpanDiv;
import Creational.Builder2.Product.StrongDiv;

public class Client {
    public static void main(String[] args) {
        DivDiv firstDiv = new DivDiv();
        firstDiv.role = "alert";
        firstDiv.ariaLive = "assertive";
        firstDiv.ariaAtomic = "true";
        firstDiv.classes = "toast show m-5";
        firstDiv.dataAutoHide = "false";
        firstDiv.style="float:right;";

        DivDiv secondDiv = new DivDiv();
        secondDiv.classes = "toast-header";
        secondDiv.id = "timeline-toast-Header";
        secondDiv.style = "color: white;background: green;";

        StrongDiv firstStrongDiv = new StrongDiv();
        firstStrongDiv.classes = "mr-auto";

        ButtonDiv buttonDiv = new ButtonDiv();
        buttonDiv.ariaLable = "Close";
        buttonDiv.className = "ml-2 mb-1 close";
        buttonDiv.dataDismiss = "toast";
        buttonDiv.type = "button";

        SpanDiv spanDiv = new SpanDiv();
        spanDiv.ariaHidden = "true";

        DivDiv thirdDiv = new DivDiv();
        thirdDiv.classes = "toast-body";
        thirdDiv.id = "timeline-toast-Body";
        thirdDiv.style = "color: white;background: green;";

        Director director = new Director();
        StringBuilder htmlString = director.generateHtml(firstDiv, secondDiv, firstStrongDiv, buttonDiv, spanDiv, thirdDiv);
        System.out.println(director.convertToScript(htmlString));
    }
}
