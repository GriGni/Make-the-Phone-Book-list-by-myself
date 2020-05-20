package Phone_book_View;

import static Phone_book_Util.Util.*;

public class Menu extends PhoneBookView {
	@Override
	protected void display() {
		System.out.println("::::::::::::::::::::::::: MENU ::::::::::::::::::::::::::");
		System.out.println("1. 입력  2. 출력  3. 검색  4. 수정  5. 삭제  6. 종료");
		System.out.print("Choose>>>");
		int no = getNum(); // 스캐너 대신하는 것. util확인
		
		request.put("no",no); // 데이터 삽입
	}
}
