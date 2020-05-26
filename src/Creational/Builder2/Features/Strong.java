package Creational.Builder2.Features;

import Creational.Builder2.Product.StrongDiv;

public class Strong {
    public String generateStrongOpeningTag(StrongDiv strongProperties) {
        StringBuilder str = new StringBuilder();
        return "<strong class=\"" + strongProperties.classes + "\">";
    }

    public String generateStrongClosingTag() {
        return "</span>";
    }

}
