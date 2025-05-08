import java.io.*;

public class Exercise {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File datfile = new File("/Users/student/Downloads/Exercise17_07.dat");
		java.io.PrintWriter output = new java.io.PrintWriter(datfile);

		try (ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(datfile)))) {

            double totalAmount = 0;
            try {
                Loan loan;
                while ((loan = (Loan)input.readObject()) != null) {

                totalAmount += loan.getLoanAmount();
                }
            } catch (EOFException ex) {

                System.out.println("Total loan amount = " + totalAmount);
            }
        }
    }
}