package Structural.Decorator.Decorators;

import Structural.Decorator.NonDecorators.DataSource;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public String readData() {
        System.out.println("Read data successfully from data source decorator");
        return decompressData(super.readData());
    }

    @Override
    public void writeData(String dataSource) {
        System.out.println("Inside write data for datasource decorator");
        super.writeData(compressData(dataSource));
    }

    public String compressData(String dataSource) {
//        System.out.println("Compress Data");
        return "Compress Data";
    }

    public String decompressData(String dataSource) {
        return "Decompress Data";
    }
}
