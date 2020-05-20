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
	// �޴� ���ȭ
	int MENU = 0, INPUT = 1, OUTPUT = 2, SEARCH = 3, MODIFY = 4, DELETE = 5, END = 6;
	// �ؽ����̺��� ���� ���� -> ������ ������ �� Ű���� �������� �־��ش�. ���⼭ request�� ��û?
	Hashtable<String, Object> request = new Hashtable<String, Object>();
	// ���� �迭�� �佺�� ���� �佺�� ������ ���� 1�� ������ input ��ü�� ���°� ���� �������� �����̶�� �����ϸ� �ȴ�.
	PhoneBookView[] Views = { new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete(),
			new End() };

}
