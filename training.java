import java.io.*;
import java.util.*;

public class training {
	public static void main(String[] argv) throws IOException {
		String check;
		String[] tempArray;
		Scanner fr = new Scanner(new FileReader("path/Training_Data.csv"));
		PrintWriter pw = new PrintWriter("path/Training_Data_Finished.csv");
		while((fr.nextLine()) != null) {
			check = fr.next();
			tempArray = check.split(",");
			for(int i=0; i<tempArray.length; i++)
				pw.write(tempArray[i] + "@");
			pw.write("\n");
			
		}				
		fr.close();
		pw.close();
	}
}