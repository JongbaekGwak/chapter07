package chapter07;

import java.util.Scanner;

public class AddressBookMain2 {

	private static AddressBook ab[] = new AddressBook[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1.등록 |  2.연락처 | 3.검색 | 4. 종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				add();
			} else if (selectNo == 2) {
				view();
			} else if (selectNo == 3) {
				search();
			} else if (selectNo == 4) {
				run = false;
			}
		}
	}

	static void add() {
		System.out.println("--------------------------------------");
		System.out.println("등록");
		System.out.println("--------------------------------------");
		System.out.print("이름을 입력하세요 : ");
		String newName = scanner.next();
		System.out.print("전화번호 입력하세요: ");
		String newPhone = scanner.next();
		System.out.print("Email 입력하세요: ");
		String newEmail = scanner.next();
		System.out.print("sns 입력하세요 : ");
		String newSns = scanner.next();
		for (int i = 0; i < ab.length; i++) {
			if (ab[i] == null) {
				ab[i] = new AddressBook(newName, newPhone, newEmail, newSns);
				System.out.println("등록 되었습니다.");
				break;
			}
		}
	}

	static void view() {
		System.out.println("--------------------------------------");
		System.out.println("연락처");
		System.out.println("--------------------------------------");
		for (int i = 0; i < ab.length; i++) {
			if (ab[i] != null) {
				System.out.println(i + "." + ab[i].name + " " + ab[i].phone + " " + ab[i].email + " " + ab[i].sns);
				break;
			} else if (ab[0] == null) {
				System.out.println("등록된 연락처가 없습니다.");
				break;
			}
		}
	}

	static void search() {
		System.out.println("--------------------------------------");
		System.out.println("검색");
		System.out.println("--------------------------------------");

		System.out.print("검색할 이름을 입력하세요 : ");
		String searchName = scanner.next();

		for (int i = 0; i < ab.length; i++) {
			if (ab[i] == null) {
				System.out.println("등록된 연락처가 없습니다.");
				break;
			}
			if (ab[i].name.equals(searchName)) {
				System.out.println(i + "." + ab[i].name + " " + ab[i].phone + " " + ab[i].email + " " + ab[i].sns);
				break;
			} else {
				System.out.println("등록된 연락처가 없습니다.");
			}
		}
	}

}
