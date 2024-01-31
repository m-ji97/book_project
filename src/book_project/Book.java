package book_project;

import java.util.Scanner;

public class Book {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {

			System.out.println("***************************");
			System.out.println("1.추가"+'\n'+"2.수정"+'\n'+"3.삭제"+'\n'+"4.리스트"+'\n'+"5.종료");
			System.out.println("***************************");
			System.out.println("번호를 입력헤주세요");
			int num = sc.nextInt();
			System.out.println("***************************");

			sc.nextLine();

			if (num == 5) {
				System.out.println("종료하겠습니다");
				break;
			}else if (num == 1) {
				System.out.println("[책관리:추가]");
				System.out.print(">책제목:");
				String title = sc.nextLine();
				System.out.print(">작가:");
				String author = sc.nextLine();
				System.out.print(">출판사:");
				String pub = sc.nextLine();
				System.out.print(">출판일:");
				String pub_date = sc.nextLine();
				System.out.println("[책이 추가되었습니다]");
				System.out.println("***************************");
			}else if (num == 2 ) {
				System.out.println("[책관리:수정]");
				System.out.print(">책제목:");
				String title = sc.nextLine();
				System.out.print(">작가:");
				String author = sc.nextLine();
				System.out.print(">출판사:");
				String pub = sc.nextLine();
				System.out.print(">작가:");
				String pub_date = sc.nextLine();
				System.out.println("[책이 수정되었습니다]");
				System.out.println("***************************");
			}else if (num == 3) {
				System.out.println("[책관리:삭제]");
				System.out.print(">책 아이디:");
				sc.nextLine();
				System.out.println("[책이 삭제되었습니다]");
				System.out.println("***************************");
			}else if (num == 4) {
				System.out.println("[책관리:리스트]");
				System.out.print(">검색:");
				String fill = sc.nextLine();
				/*if(fill.indexOf()) {
					System.out.println();
				}else if(fill.{
					System.out.println("없는 내용 입니다");
				}*/
			}
		}

		sc.close();
	}
}






