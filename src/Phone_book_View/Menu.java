package Phone_book_View;

import static Phone_book_Util.Util.*;

public class Menu extends PhoneBookView {
	@Override
	protected void display() {
		System.out.println("::::::::::::::::::::::::: MENU ::::::::::::::::::::::::::");
		System.out.println("1. �Է�  2. ���  3. �˻�  4. ����  5. ����  6. ����");
		System.out.print("Choose>>>");
		int no = getNum(); // ��ĳ�� ����ϴ� ��. utilȮ��
		
		request.put("no",no); // ������ ����
	}
}
