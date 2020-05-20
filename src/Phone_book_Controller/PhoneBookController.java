package Phone_book_Controller;

import Phone_book_Resource.res_1;


public class PhoneBookController implements res_1 {
	public void service() {// 호출 기능 구현
//		Menu menu = new Menu(); // 메뉴 객체 메뉴가 상속하고 있는 폰북뷰에 show메서드에 접근.
//		menu.show();// 상위클래스부터 출려되므로 ---------- 이 출력문이 먼저 나온다.
		// 메뉴.show메소드에 가도 show함수는 없다 하지만 뷰를 상속하고 있으모로 거기서 실행이 된다. 그리고 show문안에 추상메소드로 다른
		// 하위 메소드들이 구현하도록 만들어 놓음.
		Views[MENU].show(); // MENU가 0으로 상수화 되어 있으므로 0번 Menu인스턴스에 들어가 상위클래스인 뷰에서 show를 인쇄
		// no라는 키값을 변수로 선언하고 "no"값을 받아와.
		int no = (int)request.get("no"); // get은 추출

		switch (no) { // 인터페이스의 상수들 그리고 폰북뷰의 배열 인스턴스들
		case INPUT:
			Views[INPUT].show();
			break;
		case OUTPUT:
			Views[OUTPUT].show();
			break;
		case SEARCH:
			Views[SEARCH].show();
			break;
		case MODIFY:
			Views[MODIFY].show();
			break;
		case DELETE:
			Views[DELETE].show();
			break;
		case END:
			Views[END].show();
			break;
		default : System.out.println("다시 입력해주세요.");
		}
		// 재귀함수
		service();

	}
}

//	int no = 0;
//	switch(no) {
//	case 1 : System.out.println("입력"); break;
//	case 2 : System.out.println("출력"); break;
//	case 3 : System.out.println("검색"); break;
//	case 4 : System.out.println("수정"); break;
//	case 5 : System.out.println("삭제"); break;
//	case 6 : System.out.println("종료"); break;
//	default : System.out.println("아무것도 존재하지 않다.");
//	}
//	//재귀함수
//	service();
//	
//}