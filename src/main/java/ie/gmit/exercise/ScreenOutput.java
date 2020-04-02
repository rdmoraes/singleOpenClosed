package ie.gmit.exercise;

import java.io.IOException;

public class ScreenOutput implements Printable {
    @Override
    public void writeFormat(String fileName,Formatter formatter, Message msg) throws IOException {
        System.out.println("File" + fileName);
        System.out.println(formatter.format(msg));
    }
}
