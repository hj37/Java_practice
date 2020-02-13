import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int num1 = 400; final int num2 = 100;
		final int num3 = 4;
		
		System.out.println("년도를 입력하세요 >>> ");
		int year = sc.nextInt();
		String str = "";
		
		if(year % num1 == 0){
			str = "윤년";
		}else if(year % num3 == 0)
		{
			str = "윤년";
			if(year % num2 == 0)
			{
				str = "평년";
			}
		}
		
		System.out.println(str + "입니다.");
	}

}
