package Creational.Builder2.Director;

import Creational.Builder2.Features.Button;
import Creational.Builder2.Product.ButtonDiv;

public class Director {
    public StringBuilder generateHtml(ButtonDiv button) {
        Button buttonDiv = new Button();

        StringBuilder string = new StringBuilder();
        string.append(buttonDiv.generateButtonOpeningTags(button)).append(buttonDiv.generateButtonClosignTag());
        return string;
    }

    //put convert to script in a different module or search for a different pattern to deal with it, since it doesn't fit here
    public String convertToScript() {
        return null;
    }
}
