import java.util.Scanner;
public class Main2asterisk {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�>>");
		do {
			int num = s.nextInt();
			if (num<=0) {
				System.out.print("�߸� �Է��߽��ϴ�. ������ �Է��Ͻÿ�>>");
				continue;}
			for(int i=num;i>0;i--) {
				for(int j=0;j<i;j++) System.out.print('*'); 
		    System.out.println();}
		    break;//break�� �� ���� ���ѷ����� �������� �� ���� while�� �� �ڵ尡 �ƹ� �ǹ� ������.
		} while(true);
		s.close();
	}
}
