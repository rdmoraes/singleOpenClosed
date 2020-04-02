package ie.gmit.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainMessageApp{

	public static void main(String[] args) throws IOException {

		Message msg = new Message("This is a message");
		MessagePrinter printer = new MessagePrinter();

		Formatter JSONFormatter = new JSONFormatter();
		Formatter textFormatter = new TextFormatter();

		Printable fileOutput = new FileOutput();
		Printable screenOutput = new ScreenOutput();

		//Test write to a file in JSON format and Text format
		printer.writeMessage("test_msg.json", JSONFormatter,msg, fileOutput);
		printer.writeMessage("test_msg.txt", textFormatter, msg, fileOutput);

		//Test print in screen
		printer.writeMessage("test_msg.txt", textFormatter, msg, screenOutput);

	}
}
