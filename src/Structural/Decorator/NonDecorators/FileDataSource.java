package Structural.Decorator.NonDecorators;

public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(String fileName){
        this.name = fileName;
    }
    @Override
    public String readData() {
        //reads data from the file
        return null;
    }

    @Override
    public void writeData(String data) {
        //writes data to the file
        this.name = data;
    }
}
