import java.util.Scanner;

public class test04 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1-99������ ������ �Է� �Ͻÿ�>> ");
		int num = sc.nextInt();
		int cnt = 0;
		//���� �ڸ� ���� 3, 6, 9 �ִ��� üũ�ϰ�
		//���� �ڸ� ���� 3, 6, 9 �ִ��� üũ�ϰ�
		int tmp = num;
		while(tmp > 0)
		{
			if(tmp % 10 == 3 | tmp % 10  == 6 |
					tmp % 10 == 9){
				cnt++;
			}
			tmp = tmp/10;
		}
		
		if(cnt == 1)
		{
			System.out.println("�ڼ�¦");
		}else if(cnt == 2)
		{
			System.out.println("�ڼ�¦¦");
		}else{
			System.out.println("ħ��");
		}
	}
}
