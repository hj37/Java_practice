import java.util.Scanner;

public class test04 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1-99사이의 정수를 입력 하시오>> ");
		int num = sc.nextInt();
		int cnt = 0;
		//일의 자리 수에 3, 6, 9 있는지 체크하고
		//십의 자리 수에 3, 6, 9 있는지 체크하고
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
			System.out.println("박수짝");
		}else if(cnt == 2)
		{
			System.out.println("박수짝짝");
		}else{
			System.out.println("침묵");
		}
	}
}
