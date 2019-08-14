import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChangeFromUnicode {

   public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(new FileInputStream(args[0])).useDelimiter("\\Z");

      String[] lines = scanner.next().split("\r\n");

      scanner.close();

      Pattern pattern = Pattern.compile("\\\\u([0-9a-zA-Z]{4})");

      for (String line : lines) {
         String temp = "";

         Matcher matcher = pattern.matcher(line);

         while (matcher.find()) {
            temp += (char)(Integer.valueOf(matcher.group(1),16).intValue());
         }

         System.out.println(temp);
      }
   }

}