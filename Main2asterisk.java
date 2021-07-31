import java.util.Scanner;
public class Main2asterisk {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		do {
			int num = s.nextInt();
			if (num<=0) {
				System.out.print("잘못 입력했습니다. 정수를 입력하시오>>");
				continue;}
			for(int i=num;i>0;i--) {
				for(int j=0;j<i;j++) System.out.print('*'); 
		    System.out.println();}
		    break;//break문 안 쓰면 무한루프를 빠져나올 수 없어 while문 뒤 코드가 아무 의미 없어짐.
		} while(true);
		s.close();
	}
}
