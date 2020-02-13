import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 50; int y1 = 50;
		int x2 = 100; int y2 = 100;
		System.out.println("점(x,y)의 좌표를 하나씩 입력하시오 >>> ");
		Scanner sc = new Scanner(System.in);
		int nx = sc.nextInt();
		int ny = sc.nextInt();
		
		//사각형 안에 점이 있을때 아닐때 두 가지 부류로 나뉨
		if(nx >= x1 & nx <= x2 & ny >= y1 & ny <= y2)
		{
			System.out.println("사각형 안에 점이 있습니다.");
		}else{
			System.out.println("사각형 밖에 점이 있습니다.");
		}
	}

}
