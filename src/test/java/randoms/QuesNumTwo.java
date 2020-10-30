package randoms;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author fatemaislam
 *
 */
public class QuesNumTwo {

	static File tempFile;

	public static void main(String[] args) throws IOException {
		
		String dir = "./test.txt";
		Path path = Paths.get(dir);
		File file = new File(dir);
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Apple-a fruit, a tech farm" + "\n" + "Table-an object, contains"
				+ " rows and columns when used in context of computers" + "\n" + "Orange-a fruit");

		if (Files.exists(path)) {
			FileInputStream fInputStream = new FileInputStream(file);
			DataInputStream dInputStream = new DataInputStream(fInputStream);
			String inputData = ((DataInputStream) dInputStream).readUTF();

			String[] wordList = inputData.split("[-,\n]");
			for (String printWord : wordList)
				System.out.println(printWord);
		}

		if (Files.notExists(path)) {
			System.out.println("Does not exists");
		}
	}

}
