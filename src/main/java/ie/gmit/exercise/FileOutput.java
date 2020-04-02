package ie.gmit.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOutput implements Printable {

    @Override
    public void writeFormat(String fileName, Formatter formatter, Message msg) throws IOException {
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName)))
        { //creates print writer
            writer.println(formatter.format(msg)); //formats and writes message
            writer.flush();
        }
    }
}
