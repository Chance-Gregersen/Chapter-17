import java.io.*;

public class Exercise {
	
	public static void main(String[] args) throws IOException {
		
	File datfile = new File("/Users/student/Documents/Exercise17_03.dat");
	
	if (datfile.exists() || true) {
	try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(datfile)))) {

        for (int i = 0; i < 100; i++) {
            out.writeInt((int)(Math.random() * 100));
	}
	}
	
	try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(datfile)))) {
		
		int sum = 0;
        int count = input.available() / 4;
        System.out.println("Total Integers: " + count);
        while (count > 0) {
            sum += input.readInt();
            count--;
        }
        System.out.println("The sum is " + sum);
        
			}
	
		}
		
	
}
}
