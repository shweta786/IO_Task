import java.io.*;
public class StringWrite {

   public static void main(String args[])throws IOException {
      File file = new File("Hello1.txt");
      
      file.createNewFile();
      
 
      FileWriter writer = new FileWriter(file); 
      
      writer.write("This is an example"); 
      writer.flush();
      writer.close();
   }
}