package Day02;

import java.util.Scanner;

public class Ex16_DoWhile {
	
	public static void main(String[] args) {
		//변수 선언: 메뉴 번호, 메뉴 이름
		int menuNo =0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		
		// do~while문
		// : 무저건 1회는 시행 후, 조건을 검사하여 반복하는 문장
		do {
			System.out.println("##### 점심 메뉴판 #####");
			System.out.println("1. 서브웨이(에그마이)");
			System.out.println("2. 신라명");
			System.out.println("3. 삼양라명 & 주먹밥");
			System.out.println("4. ㅏㅎ러아ㅣ;어ㅘㅣ");
			System.out.println("5. ㅏㅓ;ㅐㅏㅣ적새ㅑ");
			System.out.println("6. ㅏㅓ;ㅐㅏㅣ적새ㅑ");
			System.out.println("7. ㅏㅓ;ㅐㅏㅣ적새ㅑ");
			System.out.println("8. ㅏㅓ;ㅐㅏㅣ적새ㅑ");
			System.out.println("9. ㅏㅓ;ㅐㅏㅣ적새ㅑ");
			System.out.println("10. ㅏㅓ;ㅐㅏㅣ적새ㅑ");
			System.out.println("메뉴번호");
			
			menuNo = sc.nextInt();    // 메뉴번호 입력
			
			switch (menuNo) {
				case 1: menuName = "서브웨이(에그마이)"; break;
				case 2: menuName = "신라명"; break;
				case 3: menuName = "삼양라명 & 주먹밥"; break;
				case 4: menuName = "ㅏㅎ러아ㅣ;어ㅘㅣ"; break;
				case 5: menuName = "ㅏㅓ;ㅐㅏㅣ적새ㅑ"; break;
				case 6: menuName = "ㅏㅓ;ㅐㅏㅣ적새ㅑ"; break;
				case 7: menuName = "ㅏㅓ;ㅐㅏㅣ적새ㅑ"; break;
				case 8: menuName = "ㅏㅓ;ㅐㅏㅣ적새ㅑ"; break;
				case 9: menuName = "ㅏㅓ;ㅐㅏㅣ적새ㅑ"; break;
				case 10: menuName = "ㅏㅓ;ㅐㅏㅣ적새ㅑ"; break;
				default: menuName = "(굶음)";break;
				
			}
			// 메뉴번호가 0이 아니면,
			System.out.println(menuName + "을/를 먹었습니다");
			
		} while (menuNo != 0);
		//
		//
	    System.out.println("메뉴판을 종료합니다." );
		sc.close();
		
	}

}
