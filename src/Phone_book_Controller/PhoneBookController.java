package Phone_book_Controller;

import Phone_book_Resource.res_1;


public class PhoneBookController implements res_1 {
	public void service() {// ȣ�� ��� ����
//		Menu menu = new Menu(); // �޴� ��ü �޴��� ����ϰ� �ִ� ���Ϻ信 show�޼��忡 ����.
//		menu.show();// ����Ŭ�������� ����ǹǷ� ---------- �� ��¹��� ���� ���´�.
		// �޴�.show�޼ҵ忡 ���� show�Լ��� ���� ������ �並 ����ϰ� ������� �ű⼭ ������ �ȴ�. �׸��� show���ȿ� �߻�޼ҵ�� �ٸ�
		// ���� �޼ҵ���� �����ϵ��� ����� ����.
		Views[MENU].show(); // MENU�� 0���� ���ȭ �Ǿ� �����Ƿ� 0�� Menu�ν��Ͻ��� �� ����Ŭ������ �信�� show�� �μ�
		// no��� Ű���� ������ �����ϰ� "no"���� �޾ƿ�.
		int no = (int)request.get("no"); // get�� ����

		switch (no) { // �������̽��� ����� �׸��� ���Ϻ��� �迭 �ν��Ͻ���
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
		default : System.out.println("�ٽ� �Է����ּ���.");
		}
		// ����Լ�
		service();

	}
}

//	int no = 0;
//	switch(no) {
//	case 1 : System.out.println("�Է�"); break;
//	case 2 : System.out.println("���"); break;
//	case 3 : System.out.println("�˻�"); break;
//	case 4 : System.out.println("����"); break;
//	case 5 : System.out.println("����"); break;
//	case 6 : System.out.println("����"); break;
//	default : System.out.println("�ƹ��͵� �������� �ʴ�.");
//	}
//	//����Լ�
//	service();
//	
//}