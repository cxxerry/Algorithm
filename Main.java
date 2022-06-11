import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 잡화점이 갖고 있는 동전의 종류 
		int[] changes = {500,100,50,10,5,1};
		
		//거스름돈 동전의 개수 
		int number =0;
		
		//1000엔을 내는 것은 정해져있다. 
		int money = 1000; 
		
		//물건의 가격을 입력받는다. 
		int price = scan.nextInt() ; 
		
		//주어야할 거스름돈을 계산한다. 
		int change = money - price ; 
		
		
		for (int i =0; i <changes.length; i++) {
			if(change<changes[i]) {
				continue; 
			}
			//몫 
			int quotient = change / changes[i];
			//나머지 
			int remainder = change % changes[i]; 
			
			//주어야할 거스름돈에 나머지의 값을 넣는다.
			change = remainder; 
			
			number += quotient; 
		}
		
		System.out.println(number);
		System.exit(0); 
	}
}
