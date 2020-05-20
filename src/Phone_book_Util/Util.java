package Phone_book_Util;

import java.io.IOException;
import java.util.Scanner;

public class Util {

	public static final Scanner scan = new Scanner(System.in);

	// 스캐너 부분인데 스캐너와의 차이점은 입력할 때 문자열을 쓰면 알아서 예외처리한다. 스캐너는 오류 발생.
	public static int getNum() {

		int num = 0;
		try {
			int ch = 0; // 정수형이어도 아스키값으로 받기 때문에.
			while ((ch = System.in.read()) != '\n') {
				if (ch >= '0' && ch <= '9') {
					num = num * 10 + ch - '0';
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

}
