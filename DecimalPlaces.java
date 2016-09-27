package reserve;
import java.util.*;
public class reserve {
	private static Scanner scanner;
	public static double round(double num, double get){
		return Math.round(num*(Math.pow(10, get)) )/ (Math.pow(10.0, get));
	}
	
	public static void main (String[] args){
		double get, num = 2.0/3;
		System.out.print("要四捨五入到小數點後幾位呢？");
		scanner = new Scanner(System.in);
		get = scanner.nextInt();
		System.out.println("原數字: " + num);
		System.out.println("經處理後: " + round(num, get));
	}
}