package Structural.Decorator.Decorators;

import Structural.Decorator.NonDecorators.DataSource;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public String readData() {
        System.out.println("Read data successfully from encryption decorator");
        return decode(super.readData());
    }

    @Override
    public void writeData(String dataSource) {
        System.out.println("Inside write data for datasource decorator");
        super.writeData(this.encode(dataSource));
    }

    private String encode(String data) {
        System.out.println("Within encoding process");
        return "Encoded";
    }

    private String decode(String data) {
        System.out.println("Within decoded process");
        return "Decoded";
    }
}
