import java.util.*;
public class Main{
	public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if((score % 4)==0 && ((score % 100) != 0)) {
			System.out.println(1);
		}else if( (score % 4)==0 && ((score % 400) == 0)) {
			System.out.println(1);
		} else System.out.println("0");
    
    
    }
}