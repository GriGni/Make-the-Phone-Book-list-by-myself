package Phone_book_View;

import Phone_book_Util.Util;
import Phone_book_Util.Util.*;

import java.util.Scanner;

import Phone_book_Resource.res_1;

public abstract class PhoneBookView implements res_1 {// ���� �߻�Ŭ���� ���������ν� �߻�display �޼ҵ带 �����ϰ� �����.
	
	protected static Scanner scan = Util.scan;
	protected abstract void display();

	public void show() {
		System.out.println("---------------------------------------------------------");
		display();
		// �ܼ� ȭ�� ���� 
	}
	
	
}
