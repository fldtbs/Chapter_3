package Chapter_3;

import java.util.*;

public class String_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[];
//		arr = new int[10];
//		// int arr[] = new int[10];
//		arr[0] = 10;
		
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("exit을 입력하면 종료합니다.");
		
		while (true) {
			System.out.print(">>");
			String text = scanner.nextLine();
//			String text = scanner.next();
			System.out.println(text);
			if (text.equals("exit")) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다...");

		scanner.close();
	}

}
