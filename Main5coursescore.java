/*p.168 실습문제14
예시 입력 1 
과목 이름>>Jaba
과목 이름>>Java
과목 이름>>안드로이드
과목 이름>>그만
예시 출력 1
없는 과목입니다.
Java의 점수는 95
안드로이드의 점수는 55
힌트
문자열을 비교하기 위해서는String클래스의equals()메소드를이용해야 한다.
*/

import java.util.Scanner;

public class Main5coursescore {
	public static void main(String[] args) {
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"}; //배열 선언, 초기화, 생성
		int score[] = {95, 88, 76, 62, 55};//배열 선언, 초기화, 생성
	    int i;
	    Scanner scanner = new Scanner(System.in);
	   
		for( ; ; ) {
			System.out.print("과목 이름>>");
			String input= scanner.next();
			if (input.equals("그만")) break;
			for(i=0;i<5;i++) {
				if (course[i].equals(input)) {
					System.out.println(course[i]+"의 점수는 "+score[i]);
					break;}}
			if(i==5) System.out.println("없는 과목입니다.");
		}
		scanner.close();
	}
}
