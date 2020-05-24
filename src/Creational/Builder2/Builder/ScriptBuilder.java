package Creational.Builder2.Builder;

import Creational.Builder2.Features.Button;
import Creational.Builder2.Product.ButtonDiv;

public class ScriptBuilder implements IBuilder {
    @Override
    public String appendDivOpeningTag() {
        return null;
    }

    @Override
    public String appendStrongTag() {
        return null;
    }

    @Override
    public String appendButtonTag(ButtonDiv button) {
        Button createdButton = new Button();
        return createdButton.generateButtonOpeningTags(button);
    }

    @Override
    public String appendSpanTag() {
        return null;
    }

    @Override
    public String appendDivClosingTag() {
        return null;
    }

    @Override
    public String appendStrongClosingTag() {
        return null;
    }

    @Override
    public String appendButtonClosingTag(ButtonDiv button) {
        return new Button().generateButtonClosignTag();
    }

    @Override
    public String appendSpanClosingTag() {
        return null;
    }
}
