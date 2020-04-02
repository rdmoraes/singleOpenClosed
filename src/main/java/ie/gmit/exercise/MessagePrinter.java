package ie.gmit.exercise;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {
	//Writes message to a file
	public void writeMessage(String fileName, Formatter formatter, Message msg,
							 Printable printable) throws IOException
	{
			printable.writeFormat(fileName, formatter, msg);
	}
}
