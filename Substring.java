import java.util.Scanner;

public class Substring {

	public static int noOfStr(int s, String str) {
		int e=str.length()-1;
		if(s == e) {
			return 1;
		}
		int num = 1;
		while(s < e) {
			if(str.charAt(s) == str.charAt(e--)) {
				num++;
			}
		}
		return num + noOfStr(s+1, str);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		int count = noOfStr(0,str);
		System.out.println(count);
		
		in.close();

	}

}
