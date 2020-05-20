package Phone_book_AppMain;

import Phone_book_Controller.PhoneBookController;


public class AppMain {
	
	public static void main(String[] args) {
		PhoneBookController controller = new PhoneBookController(); //객체를 만들엊
		controller.service(); // 컨트롤러의 서비스 함수는 뷰에서 넘어 정보를 넘겨주는 역할하는 함수
	}

}
