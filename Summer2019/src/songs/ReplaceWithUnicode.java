import java.io.*;
import java.util.*;

public class ReplaceWithUnicode {

   public static String toUnicode(char input) {
//      return("\\u" + Integer.toHexString(input | 0x10000).substring(1));

      return(String.format("\\u%04x",(int)input));
   }

   public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(new FileInputStream(args[0])).useDelimiter("\\Z");

      String[] lines = scanner.next().split("\r\n");

      scanner.close();

      FileWriter file = new FileWriter(args[1] + ".java");
      PrintWriter output = new PrintWriter(file);

      for (String line : lines) {
         String temp = "";

         for (int counter=0;counter<line.length();counter++)
            temp += toUnicode(line.charAt(counter));

         output.println(temp);
      }

      output.close();
   }

}