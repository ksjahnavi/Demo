package randomnumber;
import java.util.*;
public class randomnumber {

	public static void main(String[] args) {
	    int myNumber =(int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		int userNumber;
	do {
		 userNumber = sc.nextInt();
		if(userNumber == myNumber )
		{
			System.out.println("whooo correct number");
			break;
		}
		else if(userNumber > myNumber){
			System.out.println("your number is too large");
		}
		else{
			System.out.println("your number is too small");
		}
		
	}
	while(userNumber>=0); 
	
		System.out.println("my number is:");
		System.out.println(userNumber);
	
		
		
	}

}
