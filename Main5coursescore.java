import java.util.Scanner;

public class Main5coursescore {
	public static void main(String[] args) {
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"}; //�迭 ����, �ʱ�ȭ, ����
		int score[] = {95, 88, 76, 62, 55};//�迭 ����, �ʱ�ȭ, ����
	    int i;
	    Scanner scanner = new Scanner(System.in);
	   
		for( ; ; ) {
			System.out.print("���� �̸�>>");
			String input= scanner.next();
			if (input.equals("�׸�")) break;
			for(i=0;i<5;i++) {
				if (course[i].equals(input)) {
					System.out.println(course[i]+"�� ������ "+score[i]);
					break;}}
			if(i==5) System.out.println("���� �����Դϴ�.");
		}
		scanner.close();
	}
}
