import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChangeFromUnicode {

   public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(new FileInputStream(args[0])).useDelimiter("\\Z");

      String[] lines = scanner.next().split("\r\n");

      scanner.close();

      Pattern pattern = Pattern.compile("\\\\u(\\d\\d\\d\\d)");

      for (String line : lines) {
         String temp = "";

         Matcher matcher = pattern.matcher(line);

         while (matcher.find()) {
            System.out.println(matcher.group(0) + " " + Integer.valueOf(matcher.group(1),16) + (char)(Integer.parseInt(matcher.group(1),16)));

            temp += (char)(Integer.valueOf(matcher.group(1),16).intValue());
         }

         System.out.println(temp);
      }






   }

}