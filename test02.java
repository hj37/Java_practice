import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 50; int y1 = 50;
		int x2 = 100; int y2 = 100;
		System.out.println("��(x,y)�� ��ǥ�� �ϳ��� �Է��Ͻÿ� >>> ");
		Scanner sc = new Scanner(System.in);
		int nx = sc.nextInt();
		int ny = sc.nextInt();
		
		//�簢�� �ȿ� ���� ������ �ƴҶ� �� ���� �η��� ����
		if(nx >= x1 & nx <= x2 & ny >= y1 & ny <= y2)
		{
			System.out.println("�簢�� �ȿ� ���� �ֽ��ϴ�.");
		}else{
			System.out.println("�簢�� �ۿ� ���� �ֽ��ϴ�.");
		}
	}

}
