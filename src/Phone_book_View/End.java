package Phone_book_View;

public class End extends PhoneBookView {
	@Override
	protected void display() {
		System.out.println("::::::::::::::::::::::::: END ::::::::::::::::::::::::::");
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}
