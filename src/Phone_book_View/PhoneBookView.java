package Phone_book_View;

import Phone_book_Util.Util;
import Phone_book_Util.Util.*;

import java.util.Scanner;

import Phone_book_Resource.res_1;

public abstract class PhoneBookView implements res_1 {// 상위 추상클래스 구성함으로써 추상display 메소드를 구성하게 만든다.
	
	protected static Scanner scan = Util.scan;
	protected abstract void display();

	public void show() {
		System.out.println("---------------------------------------------------------");
		display();
		// 콘솔 화면 구현 
	}
	
	
}
