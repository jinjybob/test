// tap : 다음구역 넘어감( 뛰어쓰기 안먹힐때도 사용가능)
public class Test {

	public static void main(String[] args) {

		System.out.println("*****************");
		System.out.println("* 이름 	: 박영웅	*");
		System.out.println("* 나이 	: 27    *");
		System.out.println("* 사는곳	: 대구 	*");
		System.out.println("*****************\n");
		
		// 줄바꿈, 탭
		// \n   , \t
		
		// 콘솔창 (표준 입출력 공간) 에 출력
		// System.out : 표준 출력공간
		// System.in  : 표준 입력공간

		// println : 출력 후 줄 바꿈
		// print : 출력 (줄 바꾸지 않음)
		// printf : 출력 형식 잡을때 사용
		
		System.out.println(); // 이렇게만 나두고 출력하면 한줄 뛰우기
		
		System.out.println("*****************\n* 이름	: 박영웅 	*\n* 나이 	: 27    *\n* 사는곳	: 대구 	*\n*****************");

	}
}
