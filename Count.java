# COUNTNUM
import java.util.Scanner;


public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num=sc.nextInt();
		String a=String.valueOf(num);
		int len=a.length();
		System.out.println("Count is : "+len);

	}

}
