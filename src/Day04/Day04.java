package Day04;
import java.util.Scanner;
public class Day04 {
	public static void main(String[] args){
		//?????????????while??do-while??for
		int  age = 1;
		while (age<=100) {
			System.out.println("??"+age+"?????");
			age++;
		}
		
		int x=1;
		while (x<=100) {
			if(5==x){
				break;
			}
			System.out.println("??"+x+"?????");
			x++;
		}
		//while??do-while????????????????????????????????????????????????????????while??do-while?????????
		Scanner console=new Scanner(System.in);
		int  pwd ;
		do{
		    System.out.print("??????????:");
		    pwd = console.nextInt();
		} while ( 123 != pwd) ;
		System.out.println("???????");
		
		int p=0;
		for(int n=1;n<=100;n++){
			p=p+n;
		}
		System.out.println("1??100????"+p);
		//continue??????????????????????????????????????????????????????
		int sum = 0;
		for(int i=1; i<=100; i++){
		if( i % 10 == 3 ){   
			continue;
		}
		sum += i;
		}
		System.out.println(sum);
	}
}
