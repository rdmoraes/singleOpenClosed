package ie.gmit.exercise;

import java.io.IOException;

public interface Printable {
  void writeFormat(String fileName, Formatter formatter, Message msg) throws IOException;
}
