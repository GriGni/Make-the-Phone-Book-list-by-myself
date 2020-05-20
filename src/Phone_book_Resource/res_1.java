package Phone_book_Resource;

import java.util.Hashtable;

import Phone_book_View.Delete;
import Phone_book_View.End;
import Phone_book_View.Input;
import Phone_book_View.Menu;
import Phone_book_View.Modify;
import Phone_book_View.Output;
import Phone_book_View.PhoneBookView;
import Phone_book_View.Search;

public interface res_1 {
	// 메뉴 상수화
	int MENU = 0, INPUT = 1, OUTPUT = 2, SEARCH = 3, MODIFY = 4, DELETE = 5, END = 6;
	// 해쉬테이블을 만든 이유 -> 데이터 삽입할 때 키값과 벨류값을 넣어준다. 여기서 request는 요청?
	Hashtable<String, Object> request = new Hashtable<String, Object>();
	// 폰북 배열에 뷰스를 생성 뷰스의 역할은 내가 1을 누르면 input 객체로 들어가는것 전부 참조변수 선언이라고 생각하면 된다.
	PhoneBookView[] Views = { new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete(),
			new End() };

}
