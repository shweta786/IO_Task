import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample1 {

	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader("Hello1.txt");
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(new FileReader("Hello1.txt"));

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {

			e.printStackTrace();

		}

		br.close();
	   }
	}
          