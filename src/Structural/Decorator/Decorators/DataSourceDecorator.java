package Structural.Decorator.Decorators;

import Structural.Decorator.NonDecorators.DataSource;

public class DataSourceDecorator implements DataSource {
    private DataSource wraper;

    DataSourceDecorator(DataSource source) {
        this.wraper = source;
    }

    @Override
    public String readData() {
        System.out.println("Read data successfully from data source decorator");
        return wraper.readData();
    }

    @Override
    public void writeData(String dataSource) {
        System.out.println("Inside write data for datasource decorator");
        wraper.writeData(dataSource);
    }
}
