import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

   public static void main(String[] args) throws IOException {
      FileOutputStream fos = null;

      byte[] b = {65,66,67,68,69};

      try {
      
         fos = new FileOutputStream("C://test.txt");
         
         fos.write(b, 2, 3);
	}

	catch(Exception ex) {
         ex.printStackTrace();
      }
    }
  }