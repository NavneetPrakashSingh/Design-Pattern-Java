package Structural.Decorator;

import Structural.Decorator.Decorators.CompressionDecorator;
import Structural.Decorator.Decorators.DataSourceDecorator;
import Structural.Decorator.Decorators.EncryptionDecorator;
import Structural.Decorator.NonDecorators.DataSource;
import Structural.Decorator.NonDecorators.FileDataSource;

public class Client {
    public static void main(String[] args) {
        String data = "Data To be encrypted";
        DataSourceDecorator encode = new EncryptionDecorator(new CompressionDecorator(new FileDataSource("Path of the file")));
        encode.writeData(data);
        DataSource dataSource = new FileDataSource("name of the file");
        System.out.println(encode.readData());
        System.out.println("-------------------");
        System.out.println(dataSource.readData());
    }
}
