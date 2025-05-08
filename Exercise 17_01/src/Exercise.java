import java.io.*;

public class Exercise {

	public static void main(String[] args) throws IOException {

        File file = new File("/Users/student/Documents/Exercise17_01.txt");

        boolean append = file.exists();

        try (PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file, append)))) {

            for (int i = 0; i < 100; i++) {
                printWriter.write((int) (Math.random()* 100 ) + " ");
            }
        }
    }
}