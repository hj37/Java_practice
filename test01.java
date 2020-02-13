import java.util.Scanner;

public class test01 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요>>> ");
		char chr = sc.next().charAt(0);	//캐릭터타입으로 변환시켜주는 함수 
		
		switch(chr){
			case('A'):
			case('B'):
			{
				System.out.println(chr + "등급 참 잘하였습니다.");
				break;
			}
			case('C'):
			case('D'):
			{
				System.out.println(chr + "등급 좀 더 노력하세요");
				break;
			}
			case('F'):
			{
				System.out.println("다음 학기에 다시 수강하세요");
			}
		}
	}
}
