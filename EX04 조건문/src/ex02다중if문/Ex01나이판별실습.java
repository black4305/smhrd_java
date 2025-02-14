package ex02다중if문;

import java.util.Scanner;

public class Ex01나이판별실습 {

	public static void main(String[] args) {
		// 제어문 : 컴파일 방향을 바꿀 수 있으며 필요하지 않은 코드를 건너뛸 수 있다.
		// -> 조건문, 반복문

		// * 조건문 : 주어진 조건을 비교하여 조건에 만족하는 경우 지정된 명령문을 실행하고 만족하지 않을 경우, 다음 단계의 명령을 실행
		
		// 나이를 입력받는 실습
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요. ");
		int age = sc.nextInt();

		if (age > 19) {
			System.out.println("성인입니다.");
		}
		else if (age > 14) {
			System.out.println("청소년입니다.");
		}
		else if (age > 7) {
			System.out.println("아동입니다.");
		}
		else {
			System.out.println("유아입니다.");
		}
	}

}
