package Creational.Builder2;

import Creational.Builder2.Director.Director;
import Creational.Builder2.Product.ButtonDiv;

public class Client {
    public static void main(String[] args) {
        ButtonDiv buttonDiv = new ButtonDiv();
        buttonDiv.ariaLable = "Close";
        buttonDiv.className = "ml-2 mb-1 close";
        buttonDiv.dataDismiss = "toast";
        buttonDiv.type = "button";
        Director director = new Director();
        System.out.println(director.generateHtml(buttonDiv));
    }
}
