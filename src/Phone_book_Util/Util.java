package Phone_book_Util;

import java.io.IOException;
import java.util.Scanner;

public class Util {

	public static final Scanner scan = new Scanner(System.in);

	// ��ĳ�� �κ��ε� ��ĳ�ʿ��� �������� �Է��� �� ���ڿ��� ���� �˾Ƽ� ����ó���Ѵ�. ��ĳ�ʴ� ���� �߻�.
	public static int getNum() {

		int num = 0;
		try {
			int ch = 0; // �������̾ �ƽ�Ű������ �ޱ� ������.
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
