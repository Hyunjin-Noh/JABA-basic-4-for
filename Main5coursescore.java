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
