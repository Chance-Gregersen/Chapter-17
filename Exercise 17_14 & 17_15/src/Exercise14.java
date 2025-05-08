import java.util.Scanner;
import java.io.*;

public class Exercise14 {
    public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter file to encrypt: ");
		String inFile = input.next();
        
		System.out.print("Output file: ");
		String outFile = input.next();

		try (
			RandomAccessFile encrypted = new RandomAccessFile(inFile, "somewhere");
			RandomAccessFile decrypted = new RandomAccessFile(outFile, "somewhereElse");
		) {

			int r;
			encrypted.seek(0);
			while ((r = encrypted.read()) != -1) {
				decrypted.write(((byte)r) - 5);
			}
		}
	}
}