import java.util.Scanner;

public class test01 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���>>> ");
		char chr = sc.next().charAt(0);	//ĳ����Ÿ������ ��ȯ�����ִ� �Լ� 
		
		switch(chr){
			case('A'):
			case('B'):
			{
				System.out.println(chr + "��� �� ���Ͽ����ϴ�.");
				break;
			}
			case('C'):
			case('D'):
			{
				System.out.println(chr + "��� �� �� ����ϼ���");
				break;
			}
			case('F'):
			{
				System.out.println("���� �б⿡ �ٽ� �����ϼ���");
			}
		}
	}
}
